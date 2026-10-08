package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.android.rs4;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.h02;
import com.google.inputmethod.jd3;
import com.google.inputmethod.jtb;
import com.google.inputmethod.k4b;
import com.google.inputmethod.k58;
import com.google.inputmethod.kce;
import com.google.inputmethod.kd3;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kx1;
import com.google.inputmethod.lr;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q16;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.sq;
import com.google.inputmethod.t04;
import com.google.inputmethod.tc;
import com.google.inputmethod.vn3;
import com.google.inputmethod.w2c;
import com.google.inputmethod.xa4;
import com.google.inputmethod.xq;
import com.google.inputmethod.yq;
import com.google.inputmethod.zn6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0089\u0001\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u00142 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\u000e¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\b\u001f\u0010 \u001a\u0081\u0001\u0010\"\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\"\u0010#\"\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$¨\u0006&"}, d2 = {"S", "targetState", "Landroidx/compose/ui/b;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Lcom/google/android/h02;", "transitionSpec", "Lcom/google/android/tc;", "contentAlignment", "", "label", "", "contentKey", "Lkotlin/Function2;", "Lcom/google/android/sq;", "", "content", "b", "(Ljava/lang/Object;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Lcom/google/android/tc;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;Landroidx/compose/runtime/d;II)V", "", "clip", "Lcom/google/android/q16;", "Lcom/google/android/xa4;", "sizeAnimationSpec", "Lcom/google/android/jtb;", "c", "(ZLkotlin/jvm/functions/Function2;)Lcom/google/android/jtb;", "Landroidx/compose/animation/d;", "Landroidx/compose/animation/f;", "exit", "f", "(Landroidx/compose/animation/d;Landroidx/compose/animation/f;)Lcom/google/android/h02;", "Landroidx/compose/animation/core/Transition;", "a", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function1;Lcom/google/android/tc;Lkotlin/jvm/functions/Function1;Lcom/google/android/rs4;Landroidx/compose/runtime/d;II)V", "J", "UnspecifiedSize", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnimatedContentKt {
    private static final long a;

    static {
        long j = t04.INVALID_ID;
        a = q16.c((j & 4294967295L) | (j << 32));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x015b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0163  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0195  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01be  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x0201 A[LOOP:0: B:135:0x01e4->B:140:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0208  */
    /* JADX WARN: Code duplicated, block: B:144:0x0210  */
    /* JADX WARN: Code duplicated, block: B:147:0x0221  */
    /* JADX WARN: Code duplicated, block: B:151:0x0239  */
    /* JADX WARN: Code duplicated, block: B:153:0x0249 A[LOOP:2: B:152:0x0247->B:153:0x0249, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0294  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02da  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:172:0x0325  */
    /* JADX WARN: Code duplicated, block: B:174:0x033b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0345  */
    /* JADX WARN: Code duplicated, block: B:180:0x0365  */
    /* JADX WARN: Code duplicated, block: B:183:0x036c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0378  */
    /* JADX WARN: Code duplicated, block: B:188:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0206 A[EDGE_INSN: B:189:0x0206->B:142:0x0206 BREAK  A[LOOP:0: B:135:0x01e4->B:140:0x0201], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static final <S> void a(final Transition<S> transition, b bVar, Function1<? super AnimatedContentTransitionScope<S>, h02> function1, tc tcVar, Function1<? super S, ? extends Object> function2, final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var, d dVar, final int i, final int i2) {
        b bVar2;
        int i3;
        Function1<? super AnimatedContentTransitionScope<S>, h02> function3;
        int i4;
        int i5;
        tc tcVarO;
        int i6;
        int i7;
        Function1<? super S, ? extends Object> function4;
        int i8;
        rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var2;
        boolean z;
        final b bVar3;
        final Function1<? super AnimatedContentTransitionScope<S>, h02> function5;
        final tc tcVar2;
        final Function1<? super S, ? extends Object> function6;
        s6b s6bVarH;
        b bVar4;
        LayoutDirection layoutDirection;
        int i9;
        boolean z2;
        Object objR;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        boolean z3;
        Object objR2;
        SnapshotStateList snapshotStateList;
        boolean z4;
        Object objR3;
        k58 k58Var;
        int size;
        int i10;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2;
        SnapshotStateList snapshotStateList2;
        int i11;
        boolean zX;
        Object objR4;
        Object objR5;
        Function0<ComposeUiNode> function0B;
        int size2;
        int i12;
        Function2 function7;
        Iterator<T> it;
        int i13;
        Object objR6;
        Object objR7;
        int i14;
        final Transition<S> transition2 = transition;
        d dVarF = dVar.F(511725103);
        int i15 = (i & 6) == 0 ? (dVarF.x(transition2) ? 4 : 2) | i : i;
        int i16 = i2 & 1;
        if (i16 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i15 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i3 = i2 & 2;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    function3 = function1;
                    if (dVarF.T(function3)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i15 |= i4;
                }
                i5 = i2 & 4;
                if (i5 != 0) {
                    if ((i & 3072) == 0) {
                        tcVarO = tcVar;
                        if (dVarF.x(tcVarO)) {
                            i6 = 2048;
                        } else {
                            i6 = 1024;
                        }
                        i15 |= i6;
                    }
                    i7 = i2 & 8;
                    if (i7 != 0) {
                        if ((i & 24576) == 0) {
                            function4 = function2;
                            if (dVarF.T(function4)) {
                                i8 = 16384;
                            } else {
                                i8 = 8192;
                            }
                            i15 |= i8;
                        }
                        if ((196608 & i) == 0) {
                            rs4Var2 = rs4Var;
                            if (dVarF.T(rs4Var2)) {
                                i14 = 131072;
                            } else {
                                i14 = 65536;
                            }
                            i15 |= i14;
                        } else {
                            rs4Var2 = rs4Var;
                        }
                        if ((74899 & i15) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i15 & 1)) {
                            if (i16 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i3 != 0) {
                                objR7 = dVarF.R();
                                if (objR7 == d.INSTANCE.a()) {
                                    objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                    dVarF.L(objR7);
                                }
                                function5 = (Function1) objR7;
                            } else {
                                function5 = function3;
                            }
                            if (i5 != 0) {
                                tcVarO = tc.INSTANCE.o();
                            }
                            if (i7 != 0) {
                                objR6 = dVarF.R();
                                if (objR6 == d.INSTANCE.a()) {
                                    objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                        public final S invoke(S s) {
                                            return s;
                                        }
                                    };
                                    dVarF.L(objR6);
                                }
                                function4 = (Function1) objR6;
                            }
                            if (e.k()) {
                                e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                            i9 = i15 & 14;
                            if (i9 == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR = dVarF.R();
                            if (z2 || objR == d.INSTANCE.a()) {
                                objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                                dVarF.L(objR);
                            }
                            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                            if (i9 == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objR2 = dVarF.R();
                            if (z3 || objR2 == d.INSTANCE.a()) {
                                objR2 = p0.g(transition2.p());
                                dVarF.L(objR2);
                            }
                            snapshotStateList = (SnapshotStateList) objR2;
                            if (i9 == 4) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objR3 = dVarF.R();
                            if (z4 || objR3 == d.INSTANCE.a()) {
                                objR3 = k4b.c();
                                dVarF.L(objR3);
                            }
                            k58Var = (k58) objR3;
                            if (!snapshotStateList.contains(transition2.p())) {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            }
                            if (Intrinsics.e(transition2.p(), transition2.w())) {
                                if (snapshotStateList.size() == 1 || !Intrinsics.e(snapshotStateList.get(0), transition2.p())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(transition2.p());
                                }
                                if (k58Var.get_size() == 1 || k58Var.c(transition2.p())) {
                                    k58Var.k();
                                }
                                animatedContentTransitionScopeImpl.w(tcVarO);
                                animatedContentTransitionScopeImpl.x(layoutDirection);
                            }
                            if (!Intrinsics.e(transition2.p(), transition2.w()) && !snapshotStateList.contains(transition2.w())) {
                                it = snapshotStateList.iterator();
                                i13 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        i13 = -1;
                                        break;
                                    } else if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                        break;
                                    } else {
                                        i13++;
                                    }
                                }
                                if (i13 == -1) {
                                    snapshotStateList.add(transition2.w());
                                } else {
                                    snapshotStateList.set(i13, transition2.w());
                                }
                            }
                            if (k58Var.c(transition2.w()) || !k58Var.c(transition2.p())) {
                                dVarF.y(1966410449);
                                k58Var.k();
                                size = snapshotStateList.size();
                                i10 = 0;
                                while (i10 < size) {
                                    int i17 = i10;
                                    final T t = snapshotStateList.get(i17);
                                    final SnapshotStateList snapshotStateList3 = snapshotStateList;
                                    final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var3 = rs4Var2;
                                    k58Var.x(t, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((d) obj, ((Number) obj2).intValue());
                                            return Unit.a;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        public final void invoke(d dVar2, int i18) {
                                            if (!dVar2.g((i18 & 3) != 2, i18 & 1)) {
                                                dVar2.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-23915175, i18, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                            }
                                            Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                            Object obj = animatedContentTransitionScopeImpl3;
                                            Object objR8 = dVar2.R();
                                            d.Companion companion = d.INSTANCE;
                                            if (objR8 == companion.a()) {
                                                objR8 = (h02) function8.invoke(obj);
                                                dVar2.L(objR8);
                                            }
                                            final h02 h02Var = (h02) objR8;
                                            boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t));
                                            Transition<S> transition3 = transition2;
                                            S s = t;
                                            Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                            Object obj2 = animatedContentTransitionScopeImpl3;
                                            Object objR9 = dVar2.R();
                                            if (zA || objR9 == companion.a()) {
                                                objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                                dVar2.L(objR9);
                                            }
                                            final f fVar = (f) objR9;
                                            S s2 = t;
                                            Transition<S> transition4 = transition2;
                                            Object objR10 = dVar2.R();
                                            if (objR10 == companion.a()) {
                                                objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                                dVar2.L(objR10);
                                            }
                                            AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                            d targetContentEnter = h02Var.getTargetContentEnter();
                                            b.Companion companion2 = b.INSTANCE;
                                            boolean zT = dVar2.T(h02Var);
                                            Object objR11 = dVar2.R();
                                            if (zT || objR11 == companion.a()) {
                                                objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                    {
                                                        super(3);
                                                    }

                                                    public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                        final o oVarR0 = dj7Var.r0(j);
                                                        int width = oVarR0.getWidth();
                                                        int height = oVarR0.getHeight();
                                                        final h02 h02Var2 = h02Var;
                                                        return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                                invoke((o.a) obj3);
                                                                return Unit.a;
                                                            }

                                                            public final void invoke(o.a aVar2) {
                                                                aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                            }
                                                        }, 4, null);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                        return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                    }
                                                };
                                                dVar2.L(objR11);
                                            }
                                            b bVarA = zn6.a(companion2, (ps4) objR11);
                                            aVar.c(Intrinsics.e(t, transition2.w()));
                                            b bVarThen = bVarA.then(aVar);
                                            Transition<S> transition5 = transition2;
                                            boolean zT2 = dVar2.T(t);
                                            final S s3 = t;
                                            Object objR12 = dVar2.R();
                                            if (zT2 || objR12 == companion.a()) {
                                                objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                    public final Boolean invoke(S s4) {
                                                        return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                    }
                                                };
                                                dVar2.L(objR12);
                                            }
                                            Function1 function10 = (Function1) objR12;
                                            boolean zX2 = dVar2.x(fVar);
                                            Object objR13 = dVar2.R();
                                            if (zX2 || objR13 == companion.a()) {
                                                objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                    {
                                                        super(2);
                                                    }

                                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                        EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                    }
                                                };
                                                dVar2.L(objR13);
                                            }
                                            Function2 function11 = (Function2) objR13;
                                            final SnapshotStateList<S> snapshotStateList4 = snapshotStateList3;
                                            final S s4 = t;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                            final rs4<sq, S, d, Integer, Unit> rs4Var4 = rs4Var3;
                                            AnimatedVisibilityKt.a(transition5, function10, bVarThen, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                public final void a(xq xqVar, d dVar3, int i19) {
                                                    if ((i19 & 6) == 0) {
                                                        i19 |= (i19 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                    }
                                                    if (!dVar3.g((i19 & 19) != 18, i19 & 1)) {
                                                        dVar3.q();
                                                        return;
                                                    }
                                                    if (e.k()) {
                                                        e.o(-143346359, i19, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                    }
                                                    boolean zX3 = dVar3.x(snapshotStateList4) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl4);
                                                    final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                    final S s5 = s4;
                                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl4;
                                                    Object objR14 = dVar3.R();
                                                    if (zX3 || objR14 == d.INSTANCE.a()) {
                                                        objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                            public static final class a implements jd3 {
                                                                final /* synthetic */ SnapshotStateList a;
                                                                final /* synthetic */ Object b;
                                                                final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                                public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                    this.a = snapshotStateList;
                                                                    this.b = obj;
                                                                    this.c = animatedContentTransitionScopeImpl;
                                                                }

                                                                @Override // com.google.inputmethod.jd3
                                                                public void dispose() {
                                                                    this.a.remove(this.b);
                                                                    this.c.r().u(this.b);
                                                                }
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            public final jd3 invoke(kd3 kd3Var) {
                                                                return new a(snapshotStateList5, s5, animatedContentTransitionScopeImpl5);
                                                            }
                                                        };
                                                        dVar3.L(objR14);
                                                    }
                                                    vn3.c(xqVar, (Function1) objR14, dVar3, i19 & 14);
                                                    k58 k58VarR = animatedContentTransitionScopeImpl4.r();
                                                    S s6 = s4;
                                                    Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                    k58VarR.x(s6, ((yq) xqVar).b());
                                                    Object objR15 = dVar3.R();
                                                    if (objR15 == d.INSTANCE.a()) {
                                                        objR15 = new a(xqVar);
                                                        dVar3.L(objR15);
                                                    }
                                                    rs4Var4.invoke((a) objR15, s4, dVar3, 0);
                                                    if (e.k()) {
                                                        e.n();
                                                    }
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                    return Unit.a;
                                                }
                                            }, dVar2, 54), dVar2, 12582912, 64);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }
                                    }, dVarF, 54));
                                    i10 = i17 + 1;
                                    transition2 = transition;
                                    rs4Var2 = rs4Var;
                                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
                                    size = size;
                                    snapshotStateList = snapshotStateList3;
                                }
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i11 = 0;
                                dVarF.u();
                            } else {
                                dVarF.y(1968995539);
                                dVarF.u();
                                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                snapshotStateList2 = snapshotStateList;
                                i11 = 0;
                            }
                            zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                            objR4 = dVarF.R();
                            if (zX || objR4 == d.INSTANCE.a()) {
                                objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                                dVarF.L(objR4);
                            }
                            b bVarThen = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                            objR5 = dVarF.R();
                            if (objR5 == d.INSTANCE.a()) {
                                objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                                dVarF.L(objR5);
                            }
                            AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) objR5;
                            int iHashCode = Long.hashCode(pp1.b(dVarF, i11));
                            gs1 gs1VarJ = dVarF.j();
                            b bVarE = ComposedModifierKt.e(dVarF, bVarThen);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            function0B = companion.b();
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
                            dud.i(dVarC, animatedContentMeasurePolicy, companion.d());
                            dud.i(dVarC, gs1VarJ, companion.f());
                            dud.d(dVarC, Integer.valueOf(iHashCode), companion.c());
                            dud.g(dVarC, companion.a());
                            dud.i(dVarC, bVarE, companion.e());
                            dVarF.y(-860173498);
                            size2 = snapshotStateList2.size();
                            for (i12 = i11; i12 < size2; i12++) {
                                T t2 = snapshotStateList2.get(i12);
                                dVarF.V(-2026002954, function4.invoke(t2));
                                function7 = (Function2) k58Var.e(t2);
                                if (function7 == null) {
                                    dVarF.y(1618454323);
                                } else {
                                    dVarF.y(-2026001778);
                                    function7.invoke(dVarF, Integer.valueOf(i11));
                                }
                                dVarF.u();
                                dVarF.Z();
                            }
                            dVarF.u();
                            dVarF.m();
                            if (e.k()) {
                                e.n();
                            }
                            bVar3 = bVar4;
                        } else {
                            dVarF.q();
                            bVar3 = bVar2;
                            function5 = function3;
                        }
                        tcVar2 = tcVarO;
                        function6 = function4;
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar2, int i18) {
                                    AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i15 |= 24576;
                    function4 = function2;
                    if ((196608 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i15 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((74899 & i15) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i15 & 1)) {
                        if (i16 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i3 != 0) {
                            objR7 = dVarF.R();
                            if (objR7 == d.INSTANCE.a()) {
                                objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR7);
                            }
                            function5 = (Function1) objR7;
                        } else {
                            function5 = function3;
                        }
                        if (i5 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        }
                        if (i7 != 0) {
                            objR6 = dVarF.R();
                            if (objR6 == d.INSTANCE.a()) {
                                objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                    public final S invoke(S s) {
                                        return s;
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            function4 = (Function1) objR6;
                        }
                        if (e.k()) {
                            e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                        i9 = i15 & 14;
                        if (i9 == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                            dVarF.L(objR);
                        } else {
                            objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                            dVarF.L(objR);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                        if (i9 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR2 = dVarF.R();
                        if (z3) {
                            objR2 = p0.g(transition2.p());
                            dVarF.L(objR2);
                        } else {
                            objR2 = p0.g(transition2.p());
                            dVarF.L(objR2);
                        }
                        snapshotStateList = (SnapshotStateList) objR2;
                        if (i9 == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = k4b.c();
                            dVarF.L(objR3);
                        } else {
                            objR3 = k4b.c();
                            dVarF.L(objR3);
                        }
                        k58Var = (k58) objR3;
                        if (!snapshotStateList.contains(transition2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (Intrinsics.e(transition2.p(), transition2.w())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            }
                            if (k58Var.get_size() == 1) {
                                k58Var.k();
                            } else {
                                k58Var.k();
                            }
                            animatedContentTransitionScopeImpl.w(tcVarO);
                            animatedContentTransitionScopeImpl.x(layoutDirection);
                        }
                        if (!Intrinsics.e(transition2.p(), transition2.w())) {
                            it = snapshotStateList.iterator();
                            i13 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i13 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            if (i13 == -1) {
                                snapshotStateList.add(transition2.w());
                            } else {
                                snapshotStateList.set(i13, transition2.w());
                            }
                        }
                        if (k58Var.c(transition2.w())) {
                            dVarF.y(1966410449);
                            k58Var.k();
                            size = snapshotStateList.size();
                            i10 = 0;
                            while (i10 < size) {
                                int i18 = i10;
                                final S t3 = snapshotStateList.get(i18);
                                final SnapshotStateList<S> snapshotStateList4 = snapshotStateList;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var4 = rs4Var2;
                                k58Var.x(t3, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(d dVar2, int i19) {
                                        if (!dVar2.g((i19 & 3) != 2, i19 & 1)) {
                                            dVar2.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-23915175, i19, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                        }
                                        Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                        Object obj = animatedContentTransitionScopeImpl4;
                                        Object objR8 = dVar2.R();
                                        d.Companion companion2 = d.INSTANCE;
                                        if (objR8 == companion2.a()) {
                                            objR8 = (h02) function8.invoke(obj);
                                            dVar2.L(objR8);
                                        }
                                        final h02 h02Var = (h02) objR8;
                                        boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t3));
                                        Transition<S> transition3 = transition2;
                                        S s = t3;
                                        Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                        Object obj2 = animatedContentTransitionScopeImpl4;
                                        Object objR9 = dVar2.R();
                                        if (zA || objR9 == companion2.a()) {
                                            objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                            dVar2.L(objR9);
                                        }
                                        final f fVar = (f) objR9;
                                        S s2 = t3;
                                        Transition<S> transition4 = transition2;
                                        Object objR10 = dVar2.R();
                                        if (objR10 == companion2.a()) {
                                            objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                            dVar2.L(objR10);
                                        }
                                        AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                        d targetContentEnter = h02Var.getTargetContentEnter();
                                        b.Companion companion3 = b.INSTANCE;
                                        boolean zT = dVar2.T(h02Var);
                                        Object objR11 = dVar2.R();
                                        if (zT || objR11 == companion2.a()) {
                                            objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                {
                                                    super(3);
                                                }

                                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                    final o oVarR0 = dj7Var.r0(j);
                                                    int width = oVarR0.getWidth();
                                                    int height = oVarR0.getHeight();
                                                    final h02 h02Var2 = h02Var;
                                                    return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                            invoke((o.a) obj3);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                        }
                                                    }, 4, null);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                }
                                            };
                                            dVar2.L(objR11);
                                        }
                                        b bVarA = zn6.a(companion3, (ps4) objR11);
                                        aVar.c(Intrinsics.e(t3, transition2.w()));
                                        b bVarThen2 = bVarA.then(aVar);
                                        Transition<S> transition5 = transition2;
                                        boolean zT2 = dVar2.T(t3);
                                        final S s3 = t3;
                                        Object objR12 = dVar2.R();
                                        if (zT2 || objR12 == companion2.a()) {
                                            objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(S s4) {
                                                    return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                }
                                            };
                                            dVar2.L(objR12);
                                        }
                                        Function1 function10 = (Function1) objR12;
                                        boolean zX2 = dVar2.x(fVar);
                                        Object objR13 = dVar2.R();
                                        if (zX2 || objR13 == companion2.a()) {
                                            objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                {
                                                    super(2);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                    EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                }
                                            };
                                            dVar2.L(objR13);
                                        }
                                        Function2 function11 = (Function2) objR13;
                                        final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                        final S s4 = t3;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl4;
                                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var5 = rs4Var4;
                                        AnimatedVisibilityKt.a(transition5, function10, bVarThen2, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            public final void a(xq xqVar, d dVar3, int i110) {
                                                if ((i110 & 6) == 0) {
                                                    i110 |= (i110 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                }
                                                if (!dVar3.g((i110 & 19) != 18, i110 & 1)) {
                                                    dVar3.q();
                                                    return;
                                                }
                                                if (e.k()) {
                                                    e.o(-143346359, i110, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                }
                                                boolean zX3 = dVar3.x(snapshotStateList5) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl5);
                                                final SnapshotStateList<S> snapshotStateList6 = snapshotStateList5;
                                                final S s5 = s4;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl5;
                                                Object objR14 = dVar3.R();
                                                if (zX3 || objR14 == d.INSTANCE.a()) {
                                                    objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                        public static final class a implements jd3 {
                                                            final /* synthetic */ SnapshotStateList a;
                                                            final /* synthetic */ Object b;
                                                            final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                            public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                this.a = snapshotStateList;
                                                                this.b = obj;
                                                                this.c = animatedContentTransitionScopeImpl;
                                                            }

                                                            @Override // com.google.inputmethod.jd3
                                                            public void dispose() {
                                                                this.a.remove(this.b);
                                                                this.c.r().u(this.b);
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public final jd3 invoke(kd3 kd3Var) {
                                                            return new a(snapshotStateList6, s5, animatedContentTransitionScopeImpl6);
                                                        }
                                                    };
                                                    dVar3.L(objR14);
                                                }
                                                vn3.c(xqVar, (Function1) objR14, dVar3, i110 & 14);
                                                k58 k58VarR = animatedContentTransitionScopeImpl5.r();
                                                S s6 = s4;
                                                Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                k58VarR.x(s6, ((yq) xqVar).b());
                                                Object objR15 = dVar3.R();
                                                if (objR15 == d.INSTANCE.a()) {
                                                    objR15 = new a(xqVar);
                                                    dVar3.L(objR15);
                                                }
                                                rs4Var5.invoke((a) objR15, s4, dVar3, 0);
                                                if (e.k()) {
                                                    e.n();
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                return Unit.a;
                                            }
                                        }, dVar2, 54), dVar2, 12582912, 64);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }
                                }, dVarF, 54));
                                i10 = i18 + 1;
                                transition2 = transition;
                                rs4Var2 = rs4Var;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl4;
                                size = size;
                                snapshotStateList = snapshotStateList4;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i11 = 0;
                            dVarF.u();
                        } else {
                            dVarF.y(1966410449);
                            k58Var.k();
                            size = snapshotStateList.size();
                            i10 = 0;
                            while (i10 < size) {
                                int i19 = i10;
                                final S t4 = snapshotStateList.get(i19);
                                final SnapshotStateList<S> snapshotStateList5 = snapshotStateList;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var5 = rs4Var2;
                                k58Var.x(t4, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(d dVar2, int i110) {
                                        if (!dVar2.g((i110 & 3) != 2, i110 & 1)) {
                                            dVar2.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-23915175, i110, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                        }
                                        Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                        Object obj = animatedContentTransitionScopeImpl5;
                                        Object objR8 = dVar2.R();
                                        d.Companion companion2 = d.INSTANCE;
                                        if (objR8 == companion2.a()) {
                                            objR8 = (h02) function8.invoke(obj);
                                            dVar2.L(objR8);
                                        }
                                        final h02 h02Var = (h02) objR8;
                                        boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t4));
                                        Transition<S> transition3 = transition2;
                                        S s = t4;
                                        Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                        Object obj2 = animatedContentTransitionScopeImpl5;
                                        Object objR9 = dVar2.R();
                                        if (zA || objR9 == companion2.a()) {
                                            objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                            dVar2.L(objR9);
                                        }
                                        final f fVar = (f) objR9;
                                        S s2 = t4;
                                        Transition<S> transition4 = transition2;
                                        Object objR10 = dVar2.R();
                                        if (objR10 == companion2.a()) {
                                            objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                            dVar2.L(objR10);
                                        }
                                        AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                        d targetContentEnter = h02Var.getTargetContentEnter();
                                        b.Companion companion3 = b.INSTANCE;
                                        boolean zT = dVar2.T(h02Var);
                                        Object objR11 = dVar2.R();
                                        if (zT || objR11 == companion2.a()) {
                                            objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                {
                                                    super(3);
                                                }

                                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                    final o oVarR0 = dj7Var.r0(j);
                                                    int width = oVarR0.getWidth();
                                                    int height = oVarR0.getHeight();
                                                    final h02 h02Var2 = h02Var;
                                                    return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                            invoke((o.a) obj3);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                        }
                                                    }, 4, null);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                }
                                            };
                                            dVar2.L(objR11);
                                        }
                                        b bVarA = zn6.a(companion3, (ps4) objR11);
                                        aVar.c(Intrinsics.e(t4, transition2.w()));
                                        b bVarThen2 = bVarA.then(aVar);
                                        Transition<S> transition5 = transition2;
                                        boolean zT2 = dVar2.T(t4);
                                        final S s3 = t4;
                                        Object objR12 = dVar2.R();
                                        if (zT2 || objR12 == companion2.a()) {
                                            objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(S s4) {
                                                    return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                }
                                            };
                                            dVar2.L(objR12);
                                        }
                                        Function1 function10 = (Function1) objR12;
                                        boolean zX2 = dVar2.x(fVar);
                                        Object objR13 = dVar2.R();
                                        if (zX2 || objR13 == companion2.a()) {
                                            objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                {
                                                    super(2);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                    EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                }
                                            };
                                            dVar2.L(objR13);
                                        }
                                        Function2 function11 = (Function2) objR13;
                                        final SnapshotStateList<S> snapshotStateList6 = snapshotStateList5;
                                        final S s4 = t4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl5;
                                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var6 = rs4Var5;
                                        AnimatedVisibilityKt.a(transition5, function10, bVarThen2, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            public final void a(xq xqVar, d dVar3, int i111) {
                                                if ((i111 & 6) == 0) {
                                                    i111 |= (i111 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                }
                                                if (!dVar3.g((i111 & 19) != 18, i111 & 1)) {
                                                    dVar3.q();
                                                    return;
                                                }
                                                if (e.k()) {
                                                    e.o(-143346359, i111, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                }
                                                boolean zX3 = dVar3.x(snapshotStateList6) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl6);
                                                final SnapshotStateList<S> snapshotStateList7 = snapshotStateList6;
                                                final S s5 = s4;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl7 = animatedContentTransitionScopeImpl6;
                                                Object objR14 = dVar3.R();
                                                if (zX3 || objR14 == d.INSTANCE.a()) {
                                                    objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                        public static final class a implements jd3 {
                                                            final /* synthetic */ SnapshotStateList a;
                                                            final /* synthetic */ Object b;
                                                            final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                            public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                this.a = snapshotStateList;
                                                                this.b = obj;
                                                                this.c = animatedContentTransitionScopeImpl;
                                                            }

                                                            @Override // com.google.inputmethod.jd3
                                                            public void dispose() {
                                                                this.a.remove(this.b);
                                                                this.c.r().u(this.b);
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public final jd3 invoke(kd3 kd3Var) {
                                                            return new a(snapshotStateList7, s5, animatedContentTransitionScopeImpl7);
                                                        }
                                                    };
                                                    dVar3.L(objR14);
                                                }
                                                vn3.c(xqVar, (Function1) objR14, dVar3, i111 & 14);
                                                k58 k58VarR = animatedContentTransitionScopeImpl6.r();
                                                S s6 = s4;
                                                Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                k58VarR.x(s6, ((yq) xqVar).b());
                                                Object objR15 = dVar3.R();
                                                if (objR15 == d.INSTANCE.a()) {
                                                    objR15 = new a(xqVar);
                                                    dVar3.L(objR15);
                                                }
                                                rs4Var6.invoke((a) objR15, s4, dVar3, 0);
                                                if (e.k()) {
                                                    e.n();
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                return Unit.a;
                                            }
                                        }, dVar2, 54), dVar2, 12582912, 64);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }
                                }, dVarF, 54));
                                i10 = i19 + 1;
                                transition2 = transition;
                                rs4Var2 = rs4Var;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl5;
                                size = size;
                                snapshotStateList = snapshotStateList5;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i11 = 0;
                            dVarF.u();
                        }
                        zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR4);
                        } else {
                            objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR4);
                        }
                        b bVarThen2 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                        objR5 = dVarF.R();
                        if (objR5 == d.INSTANCE.a()) {
                            objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR5);
                        }
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (AnimatedContentMeasurePolicy) objR5;
                        int iHashCode2 = Long.hashCode(pp1.b(dVarF, i11));
                        gs1 gs1VarJ2 = dVarF.j();
                        b bVarE2 = ComposedModifierKt.e(dVarF, bVarThen2);
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
                        d dVarC2 = dud.c(dVarF);
                        dud.i(dVarC2, animatedContentMeasurePolicy2, companion2.d());
                        dud.i(dVarC2, gs1VarJ2, companion2.f());
                        dud.d(dVarC2, Integer.valueOf(iHashCode2), companion2.c());
                        dud.g(dVarC2, companion2.a());
                        dud.i(dVarC2, bVarE2, companion2.e());
                        dVarF.y(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i12 < size2) {
                            T t5 = snapshotStateList2.get(i12);
                            dVarF.V(-2026002954, function4.invoke(t5));
                            function7 = (Function2) k58Var.e(t5);
                            if (function7 == null) {
                                dVarF.y(1618454323);
                            } else {
                                dVarF.y(-2026001778);
                                function7.invoke(dVarF, Integer.valueOf(i11));
                            }
                            dVarF.u();
                            dVarF.Z();
                        }
                        dVarF.u();
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        function5 = function3;
                    }
                    tcVar2 = tcVarO;
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i110) {
                                AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i15 |= 3072;
                tcVarO = tcVar;
                i7 = i2 & 8;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i15 |= i8;
                    }
                    if ((196608 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i15 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((74899 & i15) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i15 & 1)) {
                        if (i16 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i3 != 0) {
                            objR7 = dVarF.R();
                            if (objR7 == d.INSTANCE.a()) {
                                objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR7);
                            }
                            function5 = (Function1) objR7;
                        } else {
                            function5 = function3;
                        }
                        if (i5 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        }
                        if (i7 != 0) {
                            objR6 = dVarF.R();
                            if (objR6 == d.INSTANCE.a()) {
                                objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                    public final S invoke(S s) {
                                        return s;
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            function4 = (Function1) objR6;
                        }
                        if (e.k()) {
                            e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                        i9 = i15 & 14;
                        if (i9 == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                            dVarF.L(objR);
                        } else {
                            objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                            dVarF.L(objR);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                        if (i9 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR2 = dVarF.R();
                        if (z3) {
                            objR2 = p0.g(transition2.p());
                            dVarF.L(objR2);
                        } else {
                            objR2 = p0.g(transition2.p());
                            dVarF.L(objR2);
                        }
                        snapshotStateList = (SnapshotStateList) objR2;
                        if (i9 == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = k4b.c();
                            dVarF.L(objR3);
                        } else {
                            objR3 = k4b.c();
                            dVarF.L(objR3);
                        }
                        k58Var = (k58) objR3;
                        if (!snapshotStateList.contains(transition2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (Intrinsics.e(transition2.p(), transition2.w())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            }
                            if (k58Var.get_size() == 1) {
                                k58Var.k();
                            } else {
                                k58Var.k();
                            }
                            animatedContentTransitionScopeImpl.w(tcVarO);
                            animatedContentTransitionScopeImpl.x(layoutDirection);
                        }
                        if (!Intrinsics.e(transition2.p(), transition2.w())) {
                            it = snapshotStateList.iterator();
                            i13 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i13 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            if (i13 == -1) {
                                snapshotStateList.add(transition2.w());
                            } else {
                                snapshotStateList.set(i13, transition2.w());
                            }
                        }
                        if (k58Var.c(transition2.w())) {
                            dVarF.y(1966410449);
                            k58Var.k();
                            size = snapshotStateList.size();
                            i10 = 0;
                            while (i10 < size) {
                                int i110 = i10;
                                final S t6 = snapshotStateList.get(i110);
                                final SnapshotStateList<S> snapshotStateList6 = snapshotStateList;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var6 = rs4Var2;
                                k58Var.x(t6, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(d dVar2, int i111) {
                                        if (!dVar2.g((i111 & 3) != 2, i111 & 1)) {
                                            dVar2.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-23915175, i111, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                        }
                                        Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                        Object obj = animatedContentTransitionScopeImpl6;
                                        Object objR8 = dVar2.R();
                                        d.Companion companion3 = d.INSTANCE;
                                        if (objR8 == companion3.a()) {
                                            objR8 = (h02) function8.invoke(obj);
                                            dVar2.L(objR8);
                                        }
                                        final h02 h02Var = (h02) objR8;
                                        boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t6));
                                        Transition<S> transition3 = transition2;
                                        S s = t6;
                                        Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                        Object obj2 = animatedContentTransitionScopeImpl6;
                                        Object objR9 = dVar2.R();
                                        if (zA || objR9 == companion3.a()) {
                                            objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                            dVar2.L(objR9);
                                        }
                                        final f fVar = (f) objR9;
                                        S s2 = t6;
                                        Transition<S> transition4 = transition2;
                                        Object objR10 = dVar2.R();
                                        if (objR10 == companion3.a()) {
                                            objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                            dVar2.L(objR10);
                                        }
                                        AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                        d targetContentEnter = h02Var.getTargetContentEnter();
                                        b.Companion companion4 = b.INSTANCE;
                                        boolean zT = dVar2.T(h02Var);
                                        Object objR11 = dVar2.R();
                                        if (zT || objR11 == companion3.a()) {
                                            objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                {
                                                    super(3);
                                                }

                                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                    final o oVarR0 = dj7Var.r0(j);
                                                    int width = oVarR0.getWidth();
                                                    int height = oVarR0.getHeight();
                                                    final h02 h02Var2 = h02Var;
                                                    return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                            invoke((o.a) obj3);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                        }
                                                    }, 4, null);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                }
                                            };
                                            dVar2.L(objR11);
                                        }
                                        b bVarA = zn6.a(companion4, (ps4) objR11);
                                        aVar.c(Intrinsics.e(t6, transition2.w()));
                                        b bVarThen3 = bVarA.then(aVar);
                                        Transition<S> transition5 = transition2;
                                        boolean zT2 = dVar2.T(t6);
                                        final S s3 = t6;
                                        Object objR12 = dVar2.R();
                                        if (zT2 || objR12 == companion3.a()) {
                                            objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(S s4) {
                                                    return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                }
                                            };
                                            dVar2.L(objR12);
                                        }
                                        Function1 function10 = (Function1) objR12;
                                        boolean zX2 = dVar2.x(fVar);
                                        Object objR13 = dVar2.R();
                                        if (zX2 || objR13 == companion3.a()) {
                                            objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                {
                                                    super(2);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                    EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                }
                                            };
                                            dVar2.L(objR13);
                                        }
                                        Function2 function11 = (Function2) objR13;
                                        final SnapshotStateList<S> snapshotStateList7 = snapshotStateList6;
                                        final S s4 = t6;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl7 = animatedContentTransitionScopeImpl6;
                                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var7 = rs4Var6;
                                        AnimatedVisibilityKt.a(transition5, function10, bVarThen3, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            public final void a(xq xqVar, d dVar3, int i112) {
                                                if ((i112 & 6) == 0) {
                                                    i112 |= (i112 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                }
                                                if (!dVar3.g((i112 & 19) != 18, i112 & 1)) {
                                                    dVar3.q();
                                                    return;
                                                }
                                                if (e.k()) {
                                                    e.o(-143346359, i112, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                }
                                                boolean zX3 = dVar3.x(snapshotStateList7) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl7);
                                                final SnapshotStateList<S> snapshotStateList8 = snapshotStateList7;
                                                final S s5 = s4;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl8 = animatedContentTransitionScopeImpl7;
                                                Object objR14 = dVar3.R();
                                                if (zX3 || objR14 == d.INSTANCE.a()) {
                                                    objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                        public static final class a implements jd3 {
                                                            final /* synthetic */ SnapshotStateList a;
                                                            final /* synthetic */ Object b;
                                                            final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                            public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                this.a = snapshotStateList;
                                                                this.b = obj;
                                                                this.c = animatedContentTransitionScopeImpl;
                                                            }

                                                            @Override // com.google.inputmethod.jd3
                                                            public void dispose() {
                                                                this.a.remove(this.b);
                                                                this.c.r().u(this.b);
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public final jd3 invoke(kd3 kd3Var) {
                                                            return new a(snapshotStateList8, s5, animatedContentTransitionScopeImpl8);
                                                        }
                                                    };
                                                    dVar3.L(objR14);
                                                }
                                                vn3.c(xqVar, (Function1) objR14, dVar3, i112 & 14);
                                                k58 k58VarR = animatedContentTransitionScopeImpl7.r();
                                                S s6 = s4;
                                                Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                k58VarR.x(s6, ((yq) xqVar).b());
                                                Object objR15 = dVar3.R();
                                                if (objR15 == d.INSTANCE.a()) {
                                                    objR15 = new a(xqVar);
                                                    dVar3.L(objR15);
                                                }
                                                rs4Var7.invoke((a) objR15, s4, dVar3, 0);
                                                if (e.k()) {
                                                    e.n();
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                return Unit.a;
                                            }
                                        }, dVar2, 54), dVar2, 12582912, 64);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }
                                }, dVarF, 54));
                                i10 = i110 + 1;
                                transition2 = transition;
                                rs4Var2 = rs4Var;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl6;
                                size = size;
                                snapshotStateList = snapshotStateList6;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i11 = 0;
                            dVarF.u();
                        } else {
                            dVarF.y(1966410449);
                            k58Var.k();
                            size = snapshotStateList.size();
                            i10 = 0;
                            while (i10 < size) {
                                int i111 = i10;
                                final S t7 = snapshotStateList.get(i111);
                                final SnapshotStateList<S> snapshotStateList7 = snapshotStateList;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl7 = animatedContentTransitionScopeImpl;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var7 = rs4Var2;
                                k58Var.x(t7, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(d dVar2, int i112) {
                                        if (!dVar2.g((i112 & 3) != 2, i112 & 1)) {
                                            dVar2.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-23915175, i112, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                        }
                                        Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                        Object obj = animatedContentTransitionScopeImpl7;
                                        Object objR8 = dVar2.R();
                                        d.Companion companion3 = d.INSTANCE;
                                        if (objR8 == companion3.a()) {
                                            objR8 = (h02) function8.invoke(obj);
                                            dVar2.L(objR8);
                                        }
                                        final h02 h02Var = (h02) objR8;
                                        boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t7));
                                        Transition<S> transition3 = transition2;
                                        S s = t7;
                                        Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                        Object obj2 = animatedContentTransitionScopeImpl7;
                                        Object objR9 = dVar2.R();
                                        if (zA || objR9 == companion3.a()) {
                                            objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                            dVar2.L(objR9);
                                        }
                                        final f fVar = (f) objR9;
                                        S s2 = t7;
                                        Transition<S> transition4 = transition2;
                                        Object objR10 = dVar2.R();
                                        if (objR10 == companion3.a()) {
                                            objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                            dVar2.L(objR10);
                                        }
                                        AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                        d targetContentEnter = h02Var.getTargetContentEnter();
                                        b.Companion companion4 = b.INSTANCE;
                                        boolean zT = dVar2.T(h02Var);
                                        Object objR11 = dVar2.R();
                                        if (zT || objR11 == companion3.a()) {
                                            objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                {
                                                    super(3);
                                                }

                                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                    final o oVarR0 = dj7Var.r0(j);
                                                    int width = oVarR0.getWidth();
                                                    int height = oVarR0.getHeight();
                                                    final h02 h02Var2 = h02Var;
                                                    return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                            invoke((o.a) obj3);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                        }
                                                    }, 4, null);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                }
                                            };
                                            dVar2.L(objR11);
                                        }
                                        b bVarA = zn6.a(companion4, (ps4) objR11);
                                        aVar.c(Intrinsics.e(t7, transition2.w()));
                                        b bVarThen3 = bVarA.then(aVar);
                                        Transition<S> transition5 = transition2;
                                        boolean zT2 = dVar2.T(t7);
                                        final S s3 = t7;
                                        Object objR12 = dVar2.R();
                                        if (zT2 || objR12 == companion3.a()) {
                                            objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(S s4) {
                                                    return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                }
                                            };
                                            dVar2.L(objR12);
                                        }
                                        Function1 function10 = (Function1) objR12;
                                        boolean zX2 = dVar2.x(fVar);
                                        Object objR13 = dVar2.R();
                                        if (zX2 || objR13 == companion3.a()) {
                                            objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                {
                                                    super(2);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                    EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                }
                                            };
                                            dVar2.L(objR13);
                                        }
                                        Function2 function11 = (Function2) objR13;
                                        final SnapshotStateList<S> snapshotStateList8 = snapshotStateList7;
                                        final S s4 = t7;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl8 = animatedContentTransitionScopeImpl7;
                                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var8 = rs4Var7;
                                        AnimatedVisibilityKt.a(transition5, function10, bVarThen3, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            public final void a(xq xqVar, d dVar3, int i113) {
                                                if ((i113 & 6) == 0) {
                                                    i113 |= (i113 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                }
                                                if (!dVar3.g((i113 & 19) != 18, i113 & 1)) {
                                                    dVar3.q();
                                                    return;
                                                }
                                                if (e.k()) {
                                                    e.o(-143346359, i113, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                }
                                                boolean zX3 = dVar3.x(snapshotStateList8) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl8);
                                                final SnapshotStateList<S> snapshotStateList9 = snapshotStateList8;
                                                final S s5 = s4;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl9 = animatedContentTransitionScopeImpl8;
                                                Object objR14 = dVar3.R();
                                                if (zX3 || objR14 == d.INSTANCE.a()) {
                                                    objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                        public static final class a implements jd3 {
                                                            final /* synthetic */ SnapshotStateList a;
                                                            final /* synthetic */ Object b;
                                                            final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                            public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                this.a = snapshotStateList;
                                                                this.b = obj;
                                                                this.c = animatedContentTransitionScopeImpl;
                                                            }

                                                            @Override // com.google.inputmethod.jd3
                                                            public void dispose() {
                                                                this.a.remove(this.b);
                                                                this.c.r().u(this.b);
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public final jd3 invoke(kd3 kd3Var) {
                                                            return new a(snapshotStateList9, s5, animatedContentTransitionScopeImpl9);
                                                        }
                                                    };
                                                    dVar3.L(objR14);
                                                }
                                                vn3.c(xqVar, (Function1) objR14, dVar3, i113 & 14);
                                                k58 k58VarR = animatedContentTransitionScopeImpl8.r();
                                                S s6 = s4;
                                                Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                k58VarR.x(s6, ((yq) xqVar).b());
                                                Object objR15 = dVar3.R();
                                                if (objR15 == d.INSTANCE.a()) {
                                                    objR15 = new a(xqVar);
                                                    dVar3.L(objR15);
                                                }
                                                rs4Var8.invoke((a) objR15, s4, dVar3, 0);
                                                if (e.k()) {
                                                    e.n();
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                return Unit.a;
                                            }
                                        }, dVar2, 54), dVar2, 12582912, 64);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }
                                }, dVarF, 54));
                                i10 = i111 + 1;
                                transition2 = transition;
                                rs4Var2 = rs4Var;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl7;
                                size = size;
                                snapshotStateList = snapshotStateList7;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i11 = 0;
                            dVarF.u();
                        }
                        zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR4);
                        } else {
                            objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR4);
                        }
                        b bVarThen3 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                        objR5 = dVarF.R();
                        if (objR5 == d.INSTANCE.a()) {
                            objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR5);
                        }
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy3 = (AnimatedContentMeasurePolicy) objR5;
                        int iHashCode3 = Long.hashCode(pp1.b(dVarF, i11));
                        gs1 gs1VarJ3 = dVarF.j();
                        b bVarE3 = ComposedModifierKt.e(dVarF, bVarThen3);
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
                        d dVarC3 = dud.c(dVarF);
                        dud.i(dVarC3, animatedContentMeasurePolicy3, companion3.d());
                        dud.i(dVarC3, gs1VarJ3, companion3.f());
                        dud.d(dVarC3, Integer.valueOf(iHashCode3), companion3.c());
                        dud.g(dVarC3, companion3.a());
                        dud.i(dVarC3, bVarE3, companion3.e());
                        dVarF.y(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i12 < size2) {
                            T t8 = snapshotStateList2.get(i12);
                            dVarF.V(-2026002954, function4.invoke(t8));
                            function7 = (Function2) k58Var.e(t8);
                            if (function7 == null) {
                                dVarF.y(1618454323);
                            } else {
                                dVarF.y(-2026001778);
                                function7.invoke(dVarF, Integer.valueOf(i11));
                            }
                            dVarF.u();
                            dVarF.Z();
                        }
                        dVarF.u();
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        function5 = function3;
                    }
                    tcVar2 = tcVarO;
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i112) {
                                AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i15 |= 24576;
                function4 = function2;
                if ((196608 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i15 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((74899 & i15) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    if (i16 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i3 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function5 = (Function1) objR7;
                    } else {
                        function5 = function3;
                    }
                    if (i5 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    }
                    if (i7 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                public final S invoke(S s) {
                                    return s;
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function4 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    i9 = i15 & 14;
                    if (i9 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    } else {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                    if (i9 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    } else {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    }
                    snapshotStateList = (SnapshotStateList) objR2;
                    if (i9 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    } else {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    }
                    k58Var = (k58) objR3;
                    if (!snapshotStateList.contains(transition2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (Intrinsics.e(transition2.p(), transition2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (k58Var.get_size() == 1) {
                            k58Var.k();
                        } else {
                            k58Var.k();
                        }
                        animatedContentTransitionScopeImpl.w(tcVarO);
                        animatedContentTransitionScopeImpl.x(layoutDirection);
                    }
                    if (!Intrinsics.e(transition2.p(), transition2.w())) {
                        it = snapshotStateList.iterator();
                        i13 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i13 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (i13 == -1) {
                            snapshotStateList.add(transition2.w());
                        } else {
                            snapshotStateList.set(i13, transition2.w());
                        }
                    }
                    if (k58Var.c(transition2.w())) {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i112 = i10;
                            final S t9 = snapshotStateList.get(i112);
                            final SnapshotStateList<S> snapshotStateList8 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl8 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var8 = rs4Var2;
                            k58Var.x(t9, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i113) {
                                    if (!dVar2.g((i113 & 3) != 2, i113 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i113, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl8;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion4 = d.INSTANCE;
                                    if (objR8 == companion4.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t9));
                                    Transition<S> transition3 = transition2;
                                    S s = t9;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl8;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion4.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t9;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion4.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion5 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion4.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion5, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t9, transition2.w()));
                                    b bVarThen4 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t9);
                                    final S s3 = t9;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion4.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion4.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList9 = snapshotStateList8;
                                    final S s4 = t9;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl9 = animatedContentTransitionScopeImpl8;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var9 = rs4Var8;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen4, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i114) {
                                            if ((i114 & 6) == 0) {
                                                i114 |= (i114 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i114 & 19) != 18, i114 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i114, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList9) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl9);
                                            final SnapshotStateList<S> snapshotStateList10 = snapshotStateList9;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl10 = animatedContentTransitionScopeImpl9;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList10, s5, animatedContentTransitionScopeImpl10);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i114 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl9.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var9.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i112 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl8;
                            size = size;
                            snapshotStateList = snapshotStateList8;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    } else {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i113 = i10;
                            final S t10 = snapshotStateList.get(i113);
                            final SnapshotStateList<S> snapshotStateList9 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl9 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var9 = rs4Var2;
                            k58Var.x(t10, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i114) {
                                    if (!dVar2.g((i114 & 3) != 2, i114 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i114, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl9;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion4 = d.INSTANCE;
                                    if (objR8 == companion4.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t10));
                                    Transition<S> transition3 = transition2;
                                    S s = t10;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl9;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion4.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t10;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion4.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion5 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion4.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion5, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t10, transition2.w()));
                                    b bVarThen4 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t10);
                                    final S s3 = t10;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion4.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion4.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList10 = snapshotStateList9;
                                    final S s4 = t10;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl10 = animatedContentTransitionScopeImpl9;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var10 = rs4Var9;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen4, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i115) {
                                            if ((i115 & 6) == 0) {
                                                i115 |= (i115 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i115 & 19) != 18, i115 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i115, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList10) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl10);
                                            final SnapshotStateList<S> snapshotStateList11 = snapshotStateList10;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl11 = animatedContentTransitionScopeImpl10;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList11, s5, animatedContentTransitionScopeImpl11);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i115 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl10.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var10.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i113 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl9;
                            size = size;
                            snapshotStateList = snapshotStateList9;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    }
                    zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    } else {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    }
                    b bVarThen4 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                    objR5 = dVarF.R();
                    if (objR5 == d.INSTANCE.a()) {
                        objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR5);
                    }
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy4 = (AnimatedContentMeasurePolicy) objR5;
                    int iHashCode4 = Long.hashCode(pp1.b(dVarF, i11));
                    gs1 gs1VarJ4 = dVarF.j();
                    b bVarE4 = ComposedModifierKt.e(dVarF, bVarThen4);
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
                    d dVarC4 = dud.c(dVarF);
                    dud.i(dVarC4, animatedContentMeasurePolicy4, companion4.d());
                    dud.i(dVarC4, gs1VarJ4, companion4.f());
                    dud.d(dVarC4, Integer.valueOf(iHashCode4), companion4.c());
                    dud.g(dVarC4, companion4.a());
                    dud.i(dVarC4, bVarE4, companion4.e());
                    dVarF.y(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i12 < size2) {
                        T t11 = snapshotStateList2.get(i12);
                        dVarF.V(-2026002954, function4.invoke(t11));
                        function7 = (Function2) k58Var.e(t11);
                        if (function7 == null) {
                            dVarF.y(1618454323);
                        } else {
                            dVarF.y(-2026001778);
                            function7.invoke(dVarF, Integer.valueOf(i11));
                        }
                        dVarF.u();
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    function5 = function3;
                }
                tcVar2 = tcVarO;
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i114) {
                            AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i15 |= 384;
            function3 = function1;
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    tcVarO = tcVar;
                    if (dVarF.x(tcVarO)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i15 |= i6;
                }
                i7 = i2 & 8;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i15 |= i8;
                    }
                    if ((196608 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i15 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((74899 & i15) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i15 & 1)) {
                        if (i16 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i3 != 0) {
                            objR7 = dVarF.R();
                            if (objR7 == d.INSTANCE.a()) {
                                objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR7);
                            }
                            function5 = (Function1) objR7;
                        } else {
                            function5 = function3;
                        }
                        if (i5 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        }
                        if (i7 != 0) {
                            objR6 = dVarF.R();
                            if (objR6 == d.INSTANCE.a()) {
                                objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                    public final S invoke(S s) {
                                        return s;
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            function4 = (Function1) objR6;
                        }
                        if (e.k()) {
                            e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                        i9 = i15 & 14;
                        if (i9 == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                            dVarF.L(objR);
                        } else {
                            objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                            dVarF.L(objR);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                        if (i9 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR2 = dVarF.R();
                        if (z3) {
                            objR2 = p0.g(transition2.p());
                            dVarF.L(objR2);
                        } else {
                            objR2 = p0.g(transition2.p());
                            dVarF.L(objR2);
                        }
                        snapshotStateList = (SnapshotStateList) objR2;
                        if (i9 == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = k4b.c();
                            dVarF.L(objR3);
                        } else {
                            objR3 = k4b.c();
                            dVarF.L(objR3);
                        }
                        k58Var = (k58) objR3;
                        if (!snapshotStateList.contains(transition2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (Intrinsics.e(transition2.p(), transition2.w())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            }
                            if (k58Var.get_size() == 1) {
                                k58Var.k();
                            } else {
                                k58Var.k();
                            }
                            animatedContentTransitionScopeImpl.w(tcVarO);
                            animatedContentTransitionScopeImpl.x(layoutDirection);
                        }
                        if (!Intrinsics.e(transition2.p(), transition2.w())) {
                            it = snapshotStateList.iterator();
                            i13 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i13 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            if (i13 == -1) {
                                snapshotStateList.add(transition2.w());
                            } else {
                                snapshotStateList.set(i13, transition2.w());
                            }
                        }
                        if (k58Var.c(transition2.w())) {
                            dVarF.y(1966410449);
                            k58Var.k();
                            size = snapshotStateList.size();
                            i10 = 0;
                            while (i10 < size) {
                                int i114 = i10;
                                final S t12 = snapshotStateList.get(i114);
                                final SnapshotStateList<S> snapshotStateList10 = snapshotStateList;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl10 = animatedContentTransitionScopeImpl;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var10 = rs4Var2;
                                k58Var.x(t12, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(d dVar2, int i115) {
                                        if (!dVar2.g((i115 & 3) != 2, i115 & 1)) {
                                            dVar2.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-23915175, i115, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                        }
                                        Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                        Object obj = animatedContentTransitionScopeImpl10;
                                        Object objR8 = dVar2.R();
                                        d.Companion companion5 = d.INSTANCE;
                                        if (objR8 == companion5.a()) {
                                            objR8 = (h02) function8.invoke(obj);
                                            dVar2.L(objR8);
                                        }
                                        final h02 h02Var = (h02) objR8;
                                        boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t12));
                                        Transition<S> transition3 = transition2;
                                        S s = t12;
                                        Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                        Object obj2 = animatedContentTransitionScopeImpl10;
                                        Object objR9 = dVar2.R();
                                        if (zA || objR9 == companion5.a()) {
                                            objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                            dVar2.L(objR9);
                                        }
                                        final f fVar = (f) objR9;
                                        S s2 = t12;
                                        Transition<S> transition4 = transition2;
                                        Object objR10 = dVar2.R();
                                        if (objR10 == companion5.a()) {
                                            objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                            dVar2.L(objR10);
                                        }
                                        AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                        d targetContentEnter = h02Var.getTargetContentEnter();
                                        b.Companion companion6 = b.INSTANCE;
                                        boolean zT = dVar2.T(h02Var);
                                        Object objR11 = dVar2.R();
                                        if (zT || objR11 == companion5.a()) {
                                            objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                {
                                                    super(3);
                                                }

                                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                    final o oVarR0 = dj7Var.r0(j);
                                                    int width = oVarR0.getWidth();
                                                    int height = oVarR0.getHeight();
                                                    final h02 h02Var2 = h02Var;
                                                    return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                            invoke((o.a) obj3);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                        }
                                                    }, 4, null);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                }
                                            };
                                            dVar2.L(objR11);
                                        }
                                        b bVarA = zn6.a(companion6, (ps4) objR11);
                                        aVar.c(Intrinsics.e(t12, transition2.w()));
                                        b bVarThen5 = bVarA.then(aVar);
                                        Transition<S> transition5 = transition2;
                                        boolean zT2 = dVar2.T(t12);
                                        final S s3 = t12;
                                        Object objR12 = dVar2.R();
                                        if (zT2 || objR12 == companion5.a()) {
                                            objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(S s4) {
                                                    return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                }
                                            };
                                            dVar2.L(objR12);
                                        }
                                        Function1 function10 = (Function1) objR12;
                                        boolean zX2 = dVar2.x(fVar);
                                        Object objR13 = dVar2.R();
                                        if (zX2 || objR13 == companion5.a()) {
                                            objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                {
                                                    super(2);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                    EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                }
                                            };
                                            dVar2.L(objR13);
                                        }
                                        Function2 function11 = (Function2) objR13;
                                        final SnapshotStateList<S> snapshotStateList11 = snapshotStateList10;
                                        final S s4 = t12;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl11 = animatedContentTransitionScopeImpl10;
                                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var11 = rs4Var10;
                                        AnimatedVisibilityKt.a(transition5, function10, bVarThen5, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            public final void a(xq xqVar, d dVar3, int i116) {
                                                if ((i116 & 6) == 0) {
                                                    i116 |= (i116 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                }
                                                if (!dVar3.g((i116 & 19) != 18, i116 & 1)) {
                                                    dVar3.q();
                                                    return;
                                                }
                                                if (e.k()) {
                                                    e.o(-143346359, i116, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                }
                                                boolean zX3 = dVar3.x(snapshotStateList11) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl11);
                                                final SnapshotStateList<S> snapshotStateList12 = snapshotStateList11;
                                                final S s5 = s4;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl12 = animatedContentTransitionScopeImpl11;
                                                Object objR14 = dVar3.R();
                                                if (zX3 || objR14 == d.INSTANCE.a()) {
                                                    objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                        public static final class a implements jd3 {
                                                            final /* synthetic */ SnapshotStateList a;
                                                            final /* synthetic */ Object b;
                                                            final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                            public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                this.a = snapshotStateList;
                                                                this.b = obj;
                                                                this.c = animatedContentTransitionScopeImpl;
                                                            }

                                                            @Override // com.google.inputmethod.jd3
                                                            public void dispose() {
                                                                this.a.remove(this.b);
                                                                this.c.r().u(this.b);
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public final jd3 invoke(kd3 kd3Var) {
                                                            return new a(snapshotStateList12, s5, animatedContentTransitionScopeImpl12);
                                                        }
                                                    };
                                                    dVar3.L(objR14);
                                                }
                                                vn3.c(xqVar, (Function1) objR14, dVar3, i116 & 14);
                                                k58 k58VarR = animatedContentTransitionScopeImpl11.r();
                                                S s6 = s4;
                                                Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                k58VarR.x(s6, ((yq) xqVar).b());
                                                Object objR15 = dVar3.R();
                                                if (objR15 == d.INSTANCE.a()) {
                                                    objR15 = new a(xqVar);
                                                    dVar3.L(objR15);
                                                }
                                                rs4Var11.invoke((a) objR15, s4, dVar3, 0);
                                                if (e.k()) {
                                                    e.n();
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                return Unit.a;
                                            }
                                        }, dVar2, 54), dVar2, 12582912, 64);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }
                                }, dVarF, 54));
                                i10 = i114 + 1;
                                transition2 = transition;
                                rs4Var2 = rs4Var;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl10;
                                size = size;
                                snapshotStateList = snapshotStateList10;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i11 = 0;
                            dVarF.u();
                        } else {
                            dVarF.y(1966410449);
                            k58Var.k();
                            size = snapshotStateList.size();
                            i10 = 0;
                            while (i10 < size) {
                                int i115 = i10;
                                final S t13 = snapshotStateList.get(i115);
                                final SnapshotStateList<S> snapshotStateList11 = snapshotStateList;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl11 = animatedContentTransitionScopeImpl;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var11 = rs4Var2;
                                k58Var.x(t13, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(d dVar2, int i116) {
                                        if (!dVar2.g((i116 & 3) != 2, i116 & 1)) {
                                            dVar2.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-23915175, i116, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                        }
                                        Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                        Object obj = animatedContentTransitionScopeImpl11;
                                        Object objR8 = dVar2.R();
                                        d.Companion companion5 = d.INSTANCE;
                                        if (objR8 == companion5.a()) {
                                            objR8 = (h02) function8.invoke(obj);
                                            dVar2.L(objR8);
                                        }
                                        final h02 h02Var = (h02) objR8;
                                        boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t13));
                                        Transition<S> transition3 = transition2;
                                        S s = t13;
                                        Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                        Object obj2 = animatedContentTransitionScopeImpl11;
                                        Object objR9 = dVar2.R();
                                        if (zA || objR9 == companion5.a()) {
                                            objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                            dVar2.L(objR9);
                                        }
                                        final f fVar = (f) objR9;
                                        S s2 = t13;
                                        Transition<S> transition4 = transition2;
                                        Object objR10 = dVar2.R();
                                        if (objR10 == companion5.a()) {
                                            objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                            dVar2.L(objR10);
                                        }
                                        AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                        d targetContentEnter = h02Var.getTargetContentEnter();
                                        b.Companion companion6 = b.INSTANCE;
                                        boolean zT = dVar2.T(h02Var);
                                        Object objR11 = dVar2.R();
                                        if (zT || objR11 == companion5.a()) {
                                            objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                {
                                                    super(3);
                                                }

                                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                    final o oVarR0 = dj7Var.r0(j);
                                                    int width = oVarR0.getWidth();
                                                    int height = oVarR0.getHeight();
                                                    final h02 h02Var2 = h02Var;
                                                    return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                            invoke((o.a) obj3);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                        }
                                                    }, 4, null);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                }
                                            };
                                            dVar2.L(objR11);
                                        }
                                        b bVarA = zn6.a(companion6, (ps4) objR11);
                                        aVar.c(Intrinsics.e(t13, transition2.w()));
                                        b bVarThen5 = bVarA.then(aVar);
                                        Transition<S> transition5 = transition2;
                                        boolean zT2 = dVar2.T(t13);
                                        final S s3 = t13;
                                        Object objR12 = dVar2.R();
                                        if (zT2 || objR12 == companion5.a()) {
                                            objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(S s4) {
                                                    return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                }
                                            };
                                            dVar2.L(objR12);
                                        }
                                        Function1 function10 = (Function1) objR12;
                                        boolean zX2 = dVar2.x(fVar);
                                        Object objR13 = dVar2.R();
                                        if (zX2 || objR13 == companion5.a()) {
                                            objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                {
                                                    super(2);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                    EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                }
                                            };
                                            dVar2.L(objR13);
                                        }
                                        Function2 function11 = (Function2) objR13;
                                        final SnapshotStateList<S> snapshotStateList12 = snapshotStateList11;
                                        final S s4 = t13;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl12 = animatedContentTransitionScopeImpl11;
                                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var12 = rs4Var11;
                                        AnimatedVisibilityKt.a(transition5, function10, bVarThen5, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            public final void a(xq xqVar, d dVar3, int i117) {
                                                if ((i117 & 6) == 0) {
                                                    i117 |= (i117 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                }
                                                if (!dVar3.g((i117 & 19) != 18, i117 & 1)) {
                                                    dVar3.q();
                                                    return;
                                                }
                                                if (e.k()) {
                                                    e.o(-143346359, i117, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                }
                                                boolean zX3 = dVar3.x(snapshotStateList12) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl12);
                                                final SnapshotStateList<S> snapshotStateList13 = snapshotStateList12;
                                                final S s5 = s4;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl13 = animatedContentTransitionScopeImpl12;
                                                Object objR14 = dVar3.R();
                                                if (zX3 || objR14 == d.INSTANCE.a()) {
                                                    objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                        public static final class a implements jd3 {
                                                            final /* synthetic */ SnapshotStateList a;
                                                            final /* synthetic */ Object b;
                                                            final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                            public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                this.a = snapshotStateList;
                                                                this.b = obj;
                                                                this.c = animatedContentTransitionScopeImpl;
                                                            }

                                                            @Override // com.google.inputmethod.jd3
                                                            public void dispose() {
                                                                this.a.remove(this.b);
                                                                this.c.r().u(this.b);
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public final jd3 invoke(kd3 kd3Var) {
                                                            return new a(snapshotStateList13, s5, animatedContentTransitionScopeImpl13);
                                                        }
                                                    };
                                                    dVar3.L(objR14);
                                                }
                                                vn3.c(xqVar, (Function1) objR14, dVar3, i117 & 14);
                                                k58 k58VarR = animatedContentTransitionScopeImpl12.r();
                                                S s6 = s4;
                                                Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                k58VarR.x(s6, ((yq) xqVar).b());
                                                Object objR15 = dVar3.R();
                                                if (objR15 == d.INSTANCE.a()) {
                                                    objR15 = new a(xqVar);
                                                    dVar3.L(objR15);
                                                }
                                                rs4Var12.invoke((a) objR15, s4, dVar3, 0);
                                                if (e.k()) {
                                                    e.n();
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                return Unit.a;
                                            }
                                        }, dVar2, 54), dVar2, 12582912, 64);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }
                                }, dVarF, 54));
                                i10 = i115 + 1;
                                transition2 = transition;
                                rs4Var2 = rs4Var;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl11;
                                size = size;
                                snapshotStateList = snapshotStateList11;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i11 = 0;
                            dVarF.u();
                        }
                        zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR4);
                        } else {
                            objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR4);
                        }
                        b bVarThen5 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                        objR5 = dVarF.R();
                        if (objR5 == d.INSTANCE.a()) {
                            objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR5);
                        }
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy5 = (AnimatedContentMeasurePolicy) objR5;
                        int iHashCode5 = Long.hashCode(pp1.b(dVarF, i11));
                        gs1 gs1VarJ5 = dVarF.j();
                        b bVarE5 = ComposedModifierKt.e(dVarF, bVarThen5);
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
                        d dVarC5 = dud.c(dVarF);
                        dud.i(dVarC5, animatedContentMeasurePolicy5, companion5.d());
                        dud.i(dVarC5, gs1VarJ5, companion5.f());
                        dud.d(dVarC5, Integer.valueOf(iHashCode5), companion5.c());
                        dud.g(dVarC5, companion5.a());
                        dud.i(dVarC5, bVarE5, companion5.e());
                        dVarF.y(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i12 < size2) {
                            T t14 = snapshotStateList2.get(i12);
                            dVarF.V(-2026002954, function4.invoke(t14));
                            function7 = (Function2) k58Var.e(t14);
                            if (function7 == null) {
                                dVarF.y(1618454323);
                            } else {
                                dVarF.y(-2026001778);
                                function7.invoke(dVarF, Integer.valueOf(i11));
                            }
                            dVarF.u();
                            dVarF.Z();
                        }
                        dVarF.u();
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        function5 = function3;
                    }
                    tcVar2 = tcVarO;
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i116) {
                                AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i15 |= 24576;
                function4 = function2;
                if ((196608 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i15 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((74899 & i15) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    if (i16 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i3 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function5 = (Function1) objR7;
                    } else {
                        function5 = function3;
                    }
                    if (i5 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    }
                    if (i7 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                public final S invoke(S s) {
                                    return s;
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function4 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    i9 = i15 & 14;
                    if (i9 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    } else {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                    if (i9 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    } else {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    }
                    snapshotStateList = (SnapshotStateList) objR2;
                    if (i9 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    } else {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    }
                    k58Var = (k58) objR3;
                    if (!snapshotStateList.contains(transition2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (Intrinsics.e(transition2.p(), transition2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (k58Var.get_size() == 1) {
                            k58Var.k();
                        } else {
                            k58Var.k();
                        }
                        animatedContentTransitionScopeImpl.w(tcVarO);
                        animatedContentTransitionScopeImpl.x(layoutDirection);
                    }
                    if (!Intrinsics.e(transition2.p(), transition2.w())) {
                        it = snapshotStateList.iterator();
                        i13 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i13 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (i13 == -1) {
                            snapshotStateList.add(transition2.w());
                        } else {
                            snapshotStateList.set(i13, transition2.w());
                        }
                    }
                    if (k58Var.c(transition2.w())) {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i116 = i10;
                            final S t15 = snapshotStateList.get(i116);
                            final SnapshotStateList<S> snapshotStateList12 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl12 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var12 = rs4Var2;
                            k58Var.x(t15, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i117) {
                                    if (!dVar2.g((i117 & 3) != 2, i117 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i117, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl12;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion6 = d.INSTANCE;
                                    if (objR8 == companion6.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t15));
                                    Transition<S> transition3 = transition2;
                                    S s = t15;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl12;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion6.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t15;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion6.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion7 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion6.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion7, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t15, transition2.w()));
                                    b bVarThen6 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t15);
                                    final S s3 = t15;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion6.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion6.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList13 = snapshotStateList12;
                                    final S s4 = t15;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl13 = animatedContentTransitionScopeImpl12;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var13 = rs4Var12;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen6, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i118) {
                                            if ((i118 & 6) == 0) {
                                                i118 |= (i118 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i118 & 19) != 18, i118 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i118, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList13) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl13);
                                            final SnapshotStateList<S> snapshotStateList14 = snapshotStateList13;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl14 = animatedContentTransitionScopeImpl13;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList14, s5, animatedContentTransitionScopeImpl14);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i118 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl13.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var13.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i116 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl12;
                            size = size;
                            snapshotStateList = snapshotStateList12;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    } else {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i117 = i10;
                            final S t16 = snapshotStateList.get(i117);
                            final SnapshotStateList<S> snapshotStateList13 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl13 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var13 = rs4Var2;
                            k58Var.x(t16, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i118) {
                                    if (!dVar2.g((i118 & 3) != 2, i118 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i118, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl13;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion6 = d.INSTANCE;
                                    if (objR8 == companion6.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t16));
                                    Transition<S> transition3 = transition2;
                                    S s = t16;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl13;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion6.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t16;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion6.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion7 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion6.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion7, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t16, transition2.w()));
                                    b bVarThen6 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t16);
                                    final S s3 = t16;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion6.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion6.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList14 = snapshotStateList13;
                                    final S s4 = t16;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl14 = animatedContentTransitionScopeImpl13;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var14 = rs4Var13;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen6, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i119) {
                                            if ((i119 & 6) == 0) {
                                                i119 |= (i119 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i119 & 19) != 18, i119 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i119, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList14) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl14);
                                            final SnapshotStateList<S> snapshotStateList15 = snapshotStateList14;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl15 = animatedContentTransitionScopeImpl14;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList15, s5, animatedContentTransitionScopeImpl15);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i119 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl14.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var14.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i117 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl13;
                            size = size;
                            snapshotStateList = snapshotStateList13;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    }
                    zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    } else {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    }
                    b bVarThen6 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                    objR5 = dVarF.R();
                    if (objR5 == d.INSTANCE.a()) {
                        objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR5);
                    }
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy6 = (AnimatedContentMeasurePolicy) objR5;
                    int iHashCode6 = Long.hashCode(pp1.b(dVarF, i11));
                    gs1 gs1VarJ6 = dVarF.j();
                    b bVarE6 = ComposedModifierKt.e(dVarF, bVarThen6);
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
                    d dVarC6 = dud.c(dVarF);
                    dud.i(dVarC6, animatedContentMeasurePolicy6, companion6.d());
                    dud.i(dVarC6, gs1VarJ6, companion6.f());
                    dud.d(dVarC6, Integer.valueOf(iHashCode6), companion6.c());
                    dud.g(dVarC6, companion6.a());
                    dud.i(dVarC6, bVarE6, companion6.e());
                    dVarF.y(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i12 < size2) {
                        T t17 = snapshotStateList2.get(i12);
                        dVarF.V(-2026002954, function4.invoke(t17));
                        function7 = (Function2) k58Var.e(t17);
                        if (function7 == null) {
                            dVarF.y(1618454323);
                        } else {
                            dVarF.y(-2026001778);
                            function7.invoke(dVarF, Integer.valueOf(i11));
                        }
                        dVarF.u();
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    function5 = function3;
                }
                tcVar2 = tcVarO;
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i118) {
                            AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i15 |= 3072;
            tcVarO = tcVar;
            i7 = i2 & 8;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i15 |= i8;
                }
                if ((196608 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i15 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((74899 & i15) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    if (i16 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i3 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function5 = (Function1) objR7;
                    } else {
                        function5 = function3;
                    }
                    if (i5 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    }
                    if (i7 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                public final S invoke(S s) {
                                    return s;
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function4 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    i9 = i15 & 14;
                    if (i9 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    } else {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                    if (i9 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    } else {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    }
                    snapshotStateList = (SnapshotStateList) objR2;
                    if (i9 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    } else {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    }
                    k58Var = (k58) objR3;
                    if (!snapshotStateList.contains(transition2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (Intrinsics.e(transition2.p(), transition2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (k58Var.get_size() == 1) {
                            k58Var.k();
                        } else {
                            k58Var.k();
                        }
                        animatedContentTransitionScopeImpl.w(tcVarO);
                        animatedContentTransitionScopeImpl.x(layoutDirection);
                    }
                    if (!Intrinsics.e(transition2.p(), transition2.w())) {
                        it = snapshotStateList.iterator();
                        i13 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i13 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (i13 == -1) {
                            snapshotStateList.add(transition2.w());
                        } else {
                            snapshotStateList.set(i13, transition2.w());
                        }
                    }
                    if (k58Var.c(transition2.w())) {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i118 = i10;
                            final S t18 = snapshotStateList.get(i118);
                            final SnapshotStateList<S> snapshotStateList14 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl14 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var14 = rs4Var2;
                            k58Var.x(t18, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i119) {
                                    if (!dVar2.g((i119 & 3) != 2, i119 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i119, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl14;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion7 = d.INSTANCE;
                                    if (objR8 == companion7.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t18));
                                    Transition<S> transition3 = transition2;
                                    S s = t18;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl14;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion7.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t18;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion7.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion8 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion7.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion8, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t18, transition2.w()));
                                    b bVarThen7 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t18);
                                    final S s3 = t18;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion7.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion7.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList15 = snapshotStateList14;
                                    final S s4 = t18;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl15 = animatedContentTransitionScopeImpl14;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var15 = rs4Var14;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen7, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i1110) {
                                            if ((i1110 & 6) == 0) {
                                                i1110 |= (i1110 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i1110 & 19) != 18, i1110 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i1110, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList15) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl15);
                                            final SnapshotStateList<S> snapshotStateList16 = snapshotStateList15;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl16 = animatedContentTransitionScopeImpl15;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList16, s5, animatedContentTransitionScopeImpl16);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i1110 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl15.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var15.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i118 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl14;
                            size = size;
                            snapshotStateList = snapshotStateList14;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    } else {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i119 = i10;
                            final S t19 = snapshotStateList.get(i119);
                            final SnapshotStateList<S> snapshotStateList15 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl15 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var15 = rs4Var2;
                            k58Var.x(t19, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i1110) {
                                    if (!dVar2.g((i1110 & 3) != 2, i1110 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i1110, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl15;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion7 = d.INSTANCE;
                                    if (objR8 == companion7.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t19));
                                    Transition<S> transition3 = transition2;
                                    S s = t19;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl15;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion7.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t19;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion7.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion8 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion7.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion8, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t19, transition2.w()));
                                    b bVarThen7 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t19);
                                    final S s3 = t19;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion7.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion7.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList16 = snapshotStateList15;
                                    final S s4 = t19;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl16 = animatedContentTransitionScopeImpl15;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var16 = rs4Var15;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen7, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i1111) {
                                            if ((i1111 & 6) == 0) {
                                                i1111 |= (i1111 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i1111 & 19) != 18, i1111 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i1111, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList16) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl16);
                                            final SnapshotStateList<S> snapshotStateList17 = snapshotStateList16;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl17 = animatedContentTransitionScopeImpl16;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList17, s5, animatedContentTransitionScopeImpl17);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i1111 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl16.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var16.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i119 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl15;
                            size = size;
                            snapshotStateList = snapshotStateList15;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    }
                    zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    } else {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    }
                    b bVarThen7 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                    objR5 = dVarF.R();
                    if (objR5 == d.INSTANCE.a()) {
                        objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR5);
                    }
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy7 = (AnimatedContentMeasurePolicy) objR5;
                    int iHashCode7 = Long.hashCode(pp1.b(dVarF, i11));
                    gs1 gs1VarJ7 = dVarF.j();
                    b bVarE7 = ComposedModifierKt.e(dVarF, bVarThen7);
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
                    d dVarC7 = dud.c(dVarF);
                    dud.i(dVarC7, animatedContentMeasurePolicy7, companion7.d());
                    dud.i(dVarC7, gs1VarJ7, companion7.f());
                    dud.d(dVarC7, Integer.valueOf(iHashCode7), companion7.c());
                    dud.g(dVarC7, companion7.a());
                    dud.i(dVarC7, bVarE7, companion7.e());
                    dVarF.y(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i12 < size2) {
                        T t110 = snapshotStateList2.get(i12);
                        dVarF.V(-2026002954, function4.invoke(t110));
                        function7 = (Function2) k58Var.e(t110);
                        if (function7 == null) {
                            dVarF.y(1618454323);
                        } else {
                            dVarF.y(-2026001778);
                            function7.invoke(dVarF, Integer.valueOf(i11));
                        }
                        dVarF.u();
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    function5 = function3;
                }
                tcVar2 = tcVarO;
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i1110) {
                            AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((196608 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i15 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((74899 & i15) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i15 & 1)) {
                if (i16 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i3 != 0) {
                    objR7 = dVarF.R();
                    if (objR7 == d.INSTANCE.a()) {
                        objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR7);
                    }
                    function5 = (Function1) objR7;
                } else {
                    function5 = function3;
                }
                if (i5 != 0) {
                    tcVarO = tc.INSTANCE.o();
                }
                if (i7 != 0) {
                    objR6 = dVarF.R();
                    if (objR6 == d.INSTANCE.a()) {
                        objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                            public final S invoke(S s) {
                                return s;
                            }
                        };
                        dVarF.L(objR6);
                    }
                    function4 = (Function1) objR6;
                }
                if (e.k()) {
                    e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                i9 = i15 & 14;
                if (i9 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                    dVarF.L(objR);
                } else {
                    objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                    dVarF.L(objR);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = p0.g(transition2.p());
                    dVarF.L(objR2);
                } else {
                    objR2 = p0.g(transition2.p());
                    dVarF.L(objR2);
                }
                snapshotStateList = (SnapshotStateList) objR2;
                if (i9 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objR3 = dVarF.R();
                if (z4) {
                    objR3 = k4b.c();
                    dVarF.L(objR3);
                } else {
                    objR3 = k4b.c();
                    dVarF.L(objR3);
                }
                k58Var = (k58) objR3;
                if (!snapshotStateList.contains(transition2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition2.p());
                }
                if (Intrinsics.e(transition2.p(), transition2.w())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (k58Var.get_size() == 1) {
                        k58Var.k();
                    } else {
                        k58Var.k();
                    }
                    animatedContentTransitionScopeImpl.w(tcVarO);
                    animatedContentTransitionScopeImpl.x(layoutDirection);
                }
                if (!Intrinsics.e(transition2.p(), transition2.w())) {
                    it = snapshotStateList.iterator();
                    i13 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i13 = -1;
                            break;
                        } else {
                            if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                break;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (i13 == -1) {
                        snapshotStateList.add(transition2.w());
                    } else {
                        snapshotStateList.set(i13, transition2.w());
                    }
                }
                if (k58Var.c(transition2.w())) {
                    dVarF.y(1966410449);
                    k58Var.k();
                    size = snapshotStateList.size();
                    i10 = 0;
                    while (i10 < size) {
                        int i1110 = i10;
                        final S t111 = snapshotStateList.get(i1110);
                        final SnapshotStateList<S> snapshotStateList16 = snapshotStateList;
                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl16 = animatedContentTransitionScopeImpl;
                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var16 = rs4Var2;
                        k58Var.x(t111, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(d dVar2, int i1111) {
                                if (!dVar2.g((i1111 & 3) != 2, i1111 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (e.k()) {
                                    e.o(-23915175, i1111, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                }
                                Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                Object obj = animatedContentTransitionScopeImpl16;
                                Object objR8 = dVar2.R();
                                d.Companion companion8 = d.INSTANCE;
                                if (objR8 == companion8.a()) {
                                    objR8 = (h02) function8.invoke(obj);
                                    dVar2.L(objR8);
                                }
                                final h02 h02Var = (h02) objR8;
                                boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t111));
                                Transition<S> transition3 = transition2;
                                S s = t111;
                                Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                Object obj2 = animatedContentTransitionScopeImpl16;
                                Object objR9 = dVar2.R();
                                if (zA || objR9 == companion8.a()) {
                                    objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                    dVar2.L(objR9);
                                }
                                final f fVar = (f) objR9;
                                S s2 = t111;
                                Transition<S> transition4 = transition2;
                                Object objR10 = dVar2.R();
                                if (objR10 == companion8.a()) {
                                    objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                    dVar2.L(objR10);
                                }
                                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                d targetContentEnter = h02Var.getTargetContentEnter();
                                b.Companion companion9 = b.INSTANCE;
                                boolean zT = dVar2.T(h02Var);
                                Object objR11 = dVar2.R();
                                if (zT || objR11 == companion8.a()) {
                                    objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                            final o oVarR0 = dj7Var.r0(j);
                                            int width = oVarR0.getWidth();
                                            int height = oVarR0.getHeight();
                                            final h02 h02Var2 = h02Var;
                                            return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((o.a) obj3);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar2) {
                                                    aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                }
                                            }, 4, null);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                        }
                                    };
                                    dVar2.L(objR11);
                                }
                                b bVarA = zn6.a(companion9, (ps4) objR11);
                                aVar.c(Intrinsics.e(t111, transition2.w()));
                                b bVarThen8 = bVarA.then(aVar);
                                Transition<S> transition5 = transition2;
                                boolean zT2 = dVar2.T(t111);
                                final S s3 = t111;
                                Object objR12 = dVar2.R();
                                if (zT2 || objR12 == companion8.a()) {
                                    objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(S s4) {
                                            return Boolean.valueOf(Intrinsics.e(s4, s3));
                                        }
                                    };
                                    dVar2.L(objR12);
                                }
                                Function1 function10 = (Function1) objR12;
                                boolean zX2 = dVar2.x(fVar);
                                Object objR13 = dVar2.R();
                                if (zX2 || objR13 == companion8.a()) {
                                    objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                        }
                                    };
                                    dVar2.L(objR13);
                                }
                                Function2 function11 = (Function2) objR13;
                                final SnapshotStateList<S> snapshotStateList17 = snapshotStateList16;
                                final S s4 = t111;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl17 = animatedContentTransitionScopeImpl16;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var17 = rs4Var16;
                                AnimatedVisibilityKt.a(transition5, function10, bVarThen8, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    public final void a(xq xqVar, d dVar3, int i1112) {
                                        if ((i1112 & 6) == 0) {
                                            i1112 |= (i1112 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                        }
                                        if (!dVar3.g((i1112 & 19) != 18, i1112 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-143346359, i1112, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                        }
                                        boolean zX3 = dVar3.x(snapshotStateList17) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl17);
                                        final SnapshotStateList<S> snapshotStateList18 = snapshotStateList17;
                                        final S s5 = s4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl18 = animatedContentTransitionScopeImpl17;
                                        Object objR14 = dVar3.R();
                                        if (zX3 || objR14 == d.INSTANCE.a()) {
                                            objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                public static final class a implements jd3 {
                                                    final /* synthetic */ SnapshotStateList a;
                                                    final /* synthetic */ Object b;
                                                    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                    public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                        this.a = snapshotStateList;
                                                        this.b = obj;
                                                        this.c = animatedContentTransitionScopeImpl;
                                                    }

                                                    @Override // com.google.inputmethod.jd3
                                                    public void dispose() {
                                                        this.a.remove(this.b);
                                                        this.c.r().u(this.b);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final jd3 invoke(kd3 kd3Var) {
                                                    return new a(snapshotStateList18, s5, animatedContentTransitionScopeImpl18);
                                                }
                                            };
                                            dVar3.L(objR14);
                                        }
                                        vn3.c(xqVar, (Function1) objR14, dVar3, i1112 & 14);
                                        k58 k58VarR = animatedContentTransitionScopeImpl17.r();
                                        S s6 = s4;
                                        Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                        k58VarR.x(s6, ((yq) xqVar).b());
                                        Object objR15 = dVar3.R();
                                        if (objR15 == d.INSTANCE.a()) {
                                            objR15 = new a(xqVar);
                                            dVar3.L(objR15);
                                        }
                                        rs4Var17.invoke((a) objR15, s4, dVar3, 0);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                        return Unit.a;
                                    }
                                }, dVar2, 54), dVar2, 12582912, 64);
                                if (e.k()) {
                                    e.n();
                                }
                            }
                        }, dVarF, 54));
                        i10 = i1110 + 1;
                        transition2 = transition;
                        rs4Var2 = rs4Var;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl16;
                        size = size;
                        snapshotStateList = snapshotStateList16;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i11 = 0;
                    dVarF.u();
                } else {
                    dVarF.y(1966410449);
                    k58Var.k();
                    size = snapshotStateList.size();
                    i10 = 0;
                    while (i10 < size) {
                        int i1111 = i10;
                        final S t112 = snapshotStateList.get(i1111);
                        final SnapshotStateList<S> snapshotStateList17 = snapshotStateList;
                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl17 = animatedContentTransitionScopeImpl;
                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var17 = rs4Var2;
                        k58Var.x(t112, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(d dVar2, int i1112) {
                                if (!dVar2.g((i1112 & 3) != 2, i1112 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (e.k()) {
                                    e.o(-23915175, i1112, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                }
                                Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                Object obj = animatedContentTransitionScopeImpl17;
                                Object objR8 = dVar2.R();
                                d.Companion companion8 = d.INSTANCE;
                                if (objR8 == companion8.a()) {
                                    objR8 = (h02) function8.invoke(obj);
                                    dVar2.L(objR8);
                                }
                                final h02 h02Var = (h02) objR8;
                                boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t112));
                                Transition<S> transition3 = transition2;
                                S s = t112;
                                Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                Object obj2 = animatedContentTransitionScopeImpl17;
                                Object objR9 = dVar2.R();
                                if (zA || objR9 == companion8.a()) {
                                    objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                    dVar2.L(objR9);
                                }
                                final f fVar = (f) objR9;
                                S s2 = t112;
                                Transition<S> transition4 = transition2;
                                Object objR10 = dVar2.R();
                                if (objR10 == companion8.a()) {
                                    objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                    dVar2.L(objR10);
                                }
                                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                d targetContentEnter = h02Var.getTargetContentEnter();
                                b.Companion companion9 = b.INSTANCE;
                                boolean zT = dVar2.T(h02Var);
                                Object objR11 = dVar2.R();
                                if (zT || objR11 == companion8.a()) {
                                    objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                            final o oVarR0 = dj7Var.r0(j);
                                            int width = oVarR0.getWidth();
                                            int height = oVarR0.getHeight();
                                            final h02 h02Var2 = h02Var;
                                            return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((o.a) obj3);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar2) {
                                                    aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                }
                                            }, 4, null);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                        }
                                    };
                                    dVar2.L(objR11);
                                }
                                b bVarA = zn6.a(companion9, (ps4) objR11);
                                aVar.c(Intrinsics.e(t112, transition2.w()));
                                b bVarThen8 = bVarA.then(aVar);
                                Transition<S> transition5 = transition2;
                                boolean zT2 = dVar2.T(t112);
                                final S s3 = t112;
                                Object objR12 = dVar2.R();
                                if (zT2 || objR12 == companion8.a()) {
                                    objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(S s4) {
                                            return Boolean.valueOf(Intrinsics.e(s4, s3));
                                        }
                                    };
                                    dVar2.L(objR12);
                                }
                                Function1 function10 = (Function1) objR12;
                                boolean zX2 = dVar2.x(fVar);
                                Object objR13 = dVar2.R();
                                if (zX2 || objR13 == companion8.a()) {
                                    objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                        }
                                    };
                                    dVar2.L(objR13);
                                }
                                Function2 function11 = (Function2) objR13;
                                final SnapshotStateList<S> snapshotStateList18 = snapshotStateList17;
                                final S s4 = t112;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl18 = animatedContentTransitionScopeImpl17;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var18 = rs4Var17;
                                AnimatedVisibilityKt.a(transition5, function10, bVarThen8, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    public final void a(xq xqVar, d dVar3, int i1113) {
                                        if ((i1113 & 6) == 0) {
                                            i1113 |= (i1113 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                        }
                                        if (!dVar3.g((i1113 & 19) != 18, i1113 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-143346359, i1113, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                        }
                                        boolean zX3 = dVar3.x(snapshotStateList18) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl18);
                                        final SnapshotStateList<S> snapshotStateList19 = snapshotStateList18;
                                        final S s5 = s4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl19 = animatedContentTransitionScopeImpl18;
                                        Object objR14 = dVar3.R();
                                        if (zX3 || objR14 == d.INSTANCE.a()) {
                                            objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                public static final class a implements jd3 {
                                                    final /* synthetic */ SnapshotStateList a;
                                                    final /* synthetic */ Object b;
                                                    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                    public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                        this.a = snapshotStateList;
                                                        this.b = obj;
                                                        this.c = animatedContentTransitionScopeImpl;
                                                    }

                                                    @Override // com.google.inputmethod.jd3
                                                    public void dispose() {
                                                        this.a.remove(this.b);
                                                        this.c.r().u(this.b);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final jd3 invoke(kd3 kd3Var) {
                                                    return new a(snapshotStateList19, s5, animatedContentTransitionScopeImpl19);
                                                }
                                            };
                                            dVar3.L(objR14);
                                        }
                                        vn3.c(xqVar, (Function1) objR14, dVar3, i1113 & 14);
                                        k58 k58VarR = animatedContentTransitionScopeImpl18.r();
                                        S s6 = s4;
                                        Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                        k58VarR.x(s6, ((yq) xqVar).b());
                                        Object objR15 = dVar3.R();
                                        if (objR15 == d.INSTANCE.a()) {
                                            objR15 = new a(xqVar);
                                            dVar3.L(objR15);
                                        }
                                        rs4Var18.invoke((a) objR15, s4, dVar3, 0);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                        return Unit.a;
                                    }
                                }, dVar2, 54), dVar2, 12582912, 64);
                                if (e.k()) {
                                    e.n();
                                }
                            }
                        }, dVarF, 54));
                        i10 = i1111 + 1;
                        transition2 = transition;
                        rs4Var2 = rs4Var;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl17;
                        size = size;
                        snapshotStateList = snapshotStateList17;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i11 = 0;
                    dVarF.u();
                }
                zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                objR4 = dVarF.R();
                if (zX) {
                    objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR4);
                } else {
                    objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR4);
                }
                b bVarThen8 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                objR5 = dVarF.R();
                if (objR5 == d.INSTANCE.a()) {
                    objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR5);
                }
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy8 = (AnimatedContentMeasurePolicy) objR5;
                int iHashCode8 = Long.hashCode(pp1.b(dVarF, i11));
                gs1 gs1VarJ8 = dVarF.j();
                b bVarE8 = ComposedModifierKt.e(dVarF, bVarThen8);
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
                d dVarC8 = dud.c(dVarF);
                dud.i(dVarC8, animatedContentMeasurePolicy8, companion8.d());
                dud.i(dVarC8, gs1VarJ8, companion8.f());
                dud.d(dVarC8, Integer.valueOf(iHashCode8), companion8.c());
                dud.g(dVarC8, companion8.a());
                dud.i(dVarC8, bVarE8, companion8.e());
                dVarF.y(-860173498);
                size2 = snapshotStateList2.size();
                while (i12 < size2) {
                    T t113 = snapshotStateList2.get(i12);
                    dVarF.V(-2026002954, function4.invoke(t113));
                    function7 = (Function2) k58Var.e(t113);
                    if (function7 == null) {
                        dVarF.y(1618454323);
                    } else {
                        dVarF.y(-2026001778);
                        function7.invoke(dVarF, Integer.valueOf(i11));
                    }
                    dVarF.u();
                    dVarF.Z();
                }
                dVarF.u();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                function5 = function3;
            }
            tcVar2 = tcVarO;
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i1112) {
                        AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i15 |= 48;
        bVar2 = bVar;
        i3 = i2 & 2;
        if (i3 != 0) {
            if ((i & 384) == 0) {
                function3 = function1;
                if (dVarF.T(function3)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i15 |= i4;
            }
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    tcVarO = tcVar;
                    if (dVarF.x(tcVarO)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i15 |= i6;
                }
                i7 = i2 & 8;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i15 |= i8;
                    }
                    if ((196608 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 131072;
                        } else {
                            i14 = 65536;
                        }
                        i15 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((74899 & i15) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i15 & 1)) {
                        if (i16 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i3 != 0) {
                            objR7 = dVarF.R();
                            if (objR7 == d.INSTANCE.a()) {
                                objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR7);
                            }
                            function5 = (Function1) objR7;
                        } else {
                            function5 = function3;
                        }
                        if (i5 != 0) {
                            tcVarO = tc.INSTANCE.o();
                        }
                        if (i7 != 0) {
                            objR6 = dVarF.R();
                            if (objR6 == d.INSTANCE.a()) {
                                objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                    public final S invoke(S s) {
                                        return s;
                                    }
                                };
                                dVarF.L(objR6);
                            }
                            function4 = (Function1) objR6;
                        }
                        if (e.k()) {
                            e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                        i9 = i15 & 14;
                        if (i9 == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR = dVarF.R();
                        if (z2) {
                            objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                            dVarF.L(objR);
                        } else {
                            objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                            dVarF.L(objR);
                        }
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                        if (i9 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objR2 = dVarF.R();
                        if (z3) {
                            objR2 = p0.g(transition2.p());
                            dVarF.L(objR2);
                        } else {
                            objR2 = p0.g(transition2.p());
                            dVarF.L(objR2);
                        }
                        snapshotStateList = (SnapshotStateList) objR2;
                        if (i9 == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objR3 = dVarF.R();
                        if (z4) {
                            objR3 = k4b.c();
                            dVarF.L(objR3);
                        } else {
                            objR3 = k4b.c();
                            dVarF.L(objR3);
                        }
                        k58Var = (k58) objR3;
                        if (!snapshotStateList.contains(transition2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (Intrinsics.e(transition2.p(), transition2.w())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition2.p());
                            }
                            if (k58Var.get_size() == 1) {
                                k58Var.k();
                            } else {
                                k58Var.k();
                            }
                            animatedContentTransitionScopeImpl.w(tcVarO);
                            animatedContentTransitionScopeImpl.x(layoutDirection);
                        }
                        if (!Intrinsics.e(transition2.p(), transition2.w())) {
                            it = snapshotStateList.iterator();
                            i13 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i13 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            if (i13 == -1) {
                                snapshotStateList.add(transition2.w());
                            } else {
                                snapshotStateList.set(i13, transition2.w());
                            }
                        }
                        if (k58Var.c(transition2.w())) {
                            dVarF.y(1966410449);
                            k58Var.k();
                            size = snapshotStateList.size();
                            i10 = 0;
                            while (i10 < size) {
                                int i1112 = i10;
                                final S t114 = snapshotStateList.get(i1112);
                                final SnapshotStateList<S> snapshotStateList18 = snapshotStateList;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl18 = animatedContentTransitionScopeImpl;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var18 = rs4Var2;
                                k58Var.x(t114, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(d dVar2, int i1113) {
                                        if (!dVar2.g((i1113 & 3) != 2, i1113 & 1)) {
                                            dVar2.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-23915175, i1113, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                        }
                                        Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                        Object obj = animatedContentTransitionScopeImpl18;
                                        Object objR8 = dVar2.R();
                                        d.Companion companion9 = d.INSTANCE;
                                        if (objR8 == companion9.a()) {
                                            objR8 = (h02) function8.invoke(obj);
                                            dVar2.L(objR8);
                                        }
                                        final h02 h02Var = (h02) objR8;
                                        boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t114));
                                        Transition<S> transition3 = transition2;
                                        S s = t114;
                                        Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                        Object obj2 = animatedContentTransitionScopeImpl18;
                                        Object objR9 = dVar2.R();
                                        if (zA || objR9 == companion9.a()) {
                                            objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                            dVar2.L(objR9);
                                        }
                                        final f fVar = (f) objR9;
                                        S s2 = t114;
                                        Transition<S> transition4 = transition2;
                                        Object objR10 = dVar2.R();
                                        if (objR10 == companion9.a()) {
                                            objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                            dVar2.L(objR10);
                                        }
                                        AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                        d targetContentEnter = h02Var.getTargetContentEnter();
                                        b.Companion companion10 = b.INSTANCE;
                                        boolean zT = dVar2.T(h02Var);
                                        Object objR11 = dVar2.R();
                                        if (zT || objR11 == companion9.a()) {
                                            objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                {
                                                    super(3);
                                                }

                                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                    final o oVarR0 = dj7Var.r0(j);
                                                    int width = oVarR0.getWidth();
                                                    int height = oVarR0.getHeight();
                                                    final h02 h02Var2 = h02Var;
                                                    return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                            invoke((o.a) obj3);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                        }
                                                    }, 4, null);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                }
                                            };
                                            dVar2.L(objR11);
                                        }
                                        b bVarA = zn6.a(companion10, (ps4) objR11);
                                        aVar.c(Intrinsics.e(t114, transition2.w()));
                                        b bVarThen9 = bVarA.then(aVar);
                                        Transition<S> transition5 = transition2;
                                        boolean zT2 = dVar2.T(t114);
                                        final S s3 = t114;
                                        Object objR12 = dVar2.R();
                                        if (zT2 || objR12 == companion9.a()) {
                                            objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(S s4) {
                                                    return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                }
                                            };
                                            dVar2.L(objR12);
                                        }
                                        Function1 function10 = (Function1) objR12;
                                        boolean zX2 = dVar2.x(fVar);
                                        Object objR13 = dVar2.R();
                                        if (zX2 || objR13 == companion9.a()) {
                                            objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                {
                                                    super(2);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                    EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                }
                                            };
                                            dVar2.L(objR13);
                                        }
                                        Function2 function11 = (Function2) objR13;
                                        final SnapshotStateList<S> snapshotStateList19 = snapshotStateList18;
                                        final S s4 = t114;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl19 = animatedContentTransitionScopeImpl18;
                                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var19 = rs4Var18;
                                        AnimatedVisibilityKt.a(transition5, function10, bVarThen9, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            public final void a(xq xqVar, d dVar3, int i1114) {
                                                if ((i1114 & 6) == 0) {
                                                    i1114 |= (i1114 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                }
                                                if (!dVar3.g((i1114 & 19) != 18, i1114 & 1)) {
                                                    dVar3.q();
                                                    return;
                                                }
                                                if (e.k()) {
                                                    e.o(-143346359, i1114, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                }
                                                boolean zX3 = dVar3.x(snapshotStateList19) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl19);
                                                final SnapshotStateList<S> snapshotStateList110 = snapshotStateList19;
                                                final S s5 = s4;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl110 = animatedContentTransitionScopeImpl19;
                                                Object objR14 = dVar3.R();
                                                if (zX3 || objR14 == d.INSTANCE.a()) {
                                                    objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                        public static final class a implements jd3 {
                                                            final /* synthetic */ SnapshotStateList a;
                                                            final /* synthetic */ Object b;
                                                            final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                            public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                this.a = snapshotStateList;
                                                                this.b = obj;
                                                                this.c = animatedContentTransitionScopeImpl;
                                                            }

                                                            @Override // com.google.inputmethod.jd3
                                                            public void dispose() {
                                                                this.a.remove(this.b);
                                                                this.c.r().u(this.b);
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public final jd3 invoke(kd3 kd3Var) {
                                                            return new a(snapshotStateList110, s5, animatedContentTransitionScopeImpl110);
                                                        }
                                                    };
                                                    dVar3.L(objR14);
                                                }
                                                vn3.c(xqVar, (Function1) objR14, dVar3, i1114 & 14);
                                                k58 k58VarR = animatedContentTransitionScopeImpl19.r();
                                                S s6 = s4;
                                                Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                k58VarR.x(s6, ((yq) xqVar).b());
                                                Object objR15 = dVar3.R();
                                                if (objR15 == d.INSTANCE.a()) {
                                                    objR15 = new a(xqVar);
                                                    dVar3.L(objR15);
                                                }
                                                rs4Var19.invoke((a) objR15, s4, dVar3, 0);
                                                if (e.k()) {
                                                    e.n();
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                return Unit.a;
                                            }
                                        }, dVar2, 54), dVar2, 12582912, 64);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }
                                }, dVarF, 54));
                                i10 = i1112 + 1;
                                transition2 = transition;
                                rs4Var2 = rs4Var;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl18;
                                size = size;
                                snapshotStateList = snapshotStateList18;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i11 = 0;
                            dVarF.u();
                        } else {
                            dVarF.y(1966410449);
                            k58Var.k();
                            size = snapshotStateList.size();
                            i10 = 0;
                            while (i10 < size) {
                                int i1113 = i10;
                                final S t115 = snapshotStateList.get(i1113);
                                final SnapshotStateList<S> snapshotStateList19 = snapshotStateList;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl19 = animatedContentTransitionScopeImpl;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var19 = rs4Var2;
                                k58Var.x(t115, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    public final void invoke(d dVar2, int i1114) {
                                        if (!dVar2.g((i1114 & 3) != 2, i1114 & 1)) {
                                            dVar2.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-23915175, i1114, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                        }
                                        Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                        Object obj = animatedContentTransitionScopeImpl19;
                                        Object objR8 = dVar2.R();
                                        d.Companion companion9 = d.INSTANCE;
                                        if (objR8 == companion9.a()) {
                                            objR8 = (h02) function8.invoke(obj);
                                            dVar2.L(objR8);
                                        }
                                        final h02 h02Var = (h02) objR8;
                                        boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t115));
                                        Transition<S> transition3 = transition2;
                                        S s = t115;
                                        Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                        Object obj2 = animatedContentTransitionScopeImpl19;
                                        Object objR9 = dVar2.R();
                                        if (zA || objR9 == companion9.a()) {
                                            objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                            dVar2.L(objR9);
                                        }
                                        final f fVar = (f) objR9;
                                        S s2 = t115;
                                        Transition<S> transition4 = transition2;
                                        Object objR10 = dVar2.R();
                                        if (objR10 == companion9.a()) {
                                            objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                            dVar2.L(objR10);
                                        }
                                        AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                        d targetContentEnter = h02Var.getTargetContentEnter();
                                        b.Companion companion10 = b.INSTANCE;
                                        boolean zT = dVar2.T(h02Var);
                                        Object objR11 = dVar2.R();
                                        if (zT || objR11 == companion9.a()) {
                                            objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                {
                                                    super(3);
                                                }

                                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                    final o oVarR0 = dj7Var.r0(j);
                                                    int width = oVarR0.getWidth();
                                                    int height = oVarR0.getHeight();
                                                    final h02 h02Var2 = h02Var;
                                                    return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                            invoke((o.a) obj3);
                                                            return Unit.a;
                                                        }

                                                        public final void invoke(o.a aVar2) {
                                                            aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                        }
                                                    }, 4, null);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                    return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                                }
                                            };
                                            dVar2.L(objR11);
                                        }
                                        b bVarA = zn6.a(companion10, (ps4) objR11);
                                        aVar.c(Intrinsics.e(t115, transition2.w()));
                                        b bVarThen9 = bVarA.then(aVar);
                                        Transition<S> transition5 = transition2;
                                        boolean zT2 = dVar2.T(t115);
                                        final S s3 = t115;
                                        Object objR12 = dVar2.R();
                                        if (zT2 || objR12 == companion9.a()) {
                                            objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(S s4) {
                                                    return Boolean.valueOf(Intrinsics.e(s4, s3));
                                                }
                                            };
                                            dVar2.L(objR12);
                                        }
                                        Function1 function10 = (Function1) objR12;
                                        boolean zX2 = dVar2.x(fVar);
                                        Object objR13 = dVar2.R();
                                        if (zX2 || objR13 == companion9.a()) {
                                            objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                {
                                                    super(2);
                                                }

                                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                    EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                    return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                                }
                                            };
                                            dVar2.L(objR13);
                                        }
                                        Function2 function11 = (Function2) objR13;
                                        final SnapshotStateList<S> snapshotStateList110 = snapshotStateList19;
                                        final S s4 = t115;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl110 = animatedContentTransitionScopeImpl19;
                                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var110 = rs4Var19;
                                        AnimatedVisibilityKt.a(transition5, function10, bVarThen9, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            public final void a(xq xqVar, d dVar3, int i1115) {
                                                if ((i1115 & 6) == 0) {
                                                    i1115 |= (i1115 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                                }
                                                if (!dVar3.g((i1115 & 19) != 18, i1115 & 1)) {
                                                    dVar3.q();
                                                    return;
                                                }
                                                if (e.k()) {
                                                    e.o(-143346359, i1115, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                }
                                                boolean zX3 = dVar3.x(snapshotStateList110) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl110);
                                                final SnapshotStateList<S> snapshotStateList111 = snapshotStateList110;
                                                final S s5 = s4;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl111 = animatedContentTransitionScopeImpl110;
                                                Object objR14 = dVar3.R();
                                                if (zX3 || objR14 == d.INSTANCE.a()) {
                                                    objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                        public static final class a implements jd3 {
                                                            final /* synthetic */ SnapshotStateList a;
                                                            final /* synthetic */ Object b;
                                                            final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                            public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                                this.a = snapshotStateList;
                                                                this.b = obj;
                                                                this.c = animatedContentTransitionScopeImpl;
                                                            }

                                                            @Override // com.google.inputmethod.jd3
                                                            public void dispose() {
                                                                this.a.remove(this.b);
                                                                this.c.r().u(this.b);
                                                            }
                                                        }

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        public final jd3 invoke(kd3 kd3Var) {
                                                            return new a(snapshotStateList111, s5, animatedContentTransitionScopeImpl111);
                                                        }
                                                    };
                                                    dVar3.L(objR14);
                                                }
                                                vn3.c(xqVar, (Function1) objR14, dVar3, i1115 & 14);
                                                k58 k58VarR = animatedContentTransitionScopeImpl110.r();
                                                S s6 = s4;
                                                Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                k58VarR.x(s6, ((yq) xqVar).b());
                                                Object objR15 = dVar3.R();
                                                if (objR15 == d.INSTANCE.a()) {
                                                    objR15 = new a(xqVar);
                                                    dVar3.L(objR15);
                                                }
                                                rs4Var110.invoke((a) objR15, s4, dVar3, 0);
                                                if (e.k()) {
                                                    e.n();
                                                }
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                                return Unit.a;
                                            }
                                        }, dVar2, 54), dVar2, 12582912, 64);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }
                                }, dVarF, 54));
                                i10 = i1113 + 1;
                                transition2 = transition;
                                rs4Var2 = rs4Var;
                                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl19;
                                size = size;
                                snapshotStateList = snapshotStateList19;
                            }
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            i11 = 0;
                            dVarF.u();
                        }
                        zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                        objR4 = dVarF.R();
                        if (zX) {
                            objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR4);
                        } else {
                            objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR4);
                        }
                        b bVarThen9 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                        objR5 = dVarF.R();
                        if (objR5 == d.INSTANCE.a()) {
                            objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                            dVarF.L(objR5);
                        }
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy9 = (AnimatedContentMeasurePolicy) objR5;
                        int iHashCode9 = Long.hashCode(pp1.b(dVarF, i11));
                        gs1 gs1VarJ9 = dVarF.j();
                        b bVarE9 = ComposedModifierKt.e(dVarF, bVarThen9);
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
                        d dVarC9 = dud.c(dVarF);
                        dud.i(dVarC9, animatedContentMeasurePolicy9, companion9.d());
                        dud.i(dVarC9, gs1VarJ9, companion9.f());
                        dud.d(dVarC9, Integer.valueOf(iHashCode9), companion9.c());
                        dud.g(dVarC9, companion9.a());
                        dud.i(dVarC9, bVarE9, companion9.e());
                        dVarF.y(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i12 < size2) {
                            T t116 = snapshotStateList2.get(i12);
                            dVarF.V(-2026002954, function4.invoke(t116));
                            function7 = (Function2) k58Var.e(t116);
                            if (function7 == null) {
                                dVarF.y(1618454323);
                            } else {
                                dVarF.y(-2026001778);
                                function7.invoke(dVarF, Integer.valueOf(i11));
                            }
                            dVarF.u();
                            dVarF.Z();
                        }
                        dVarF.u();
                        dVarF.m();
                        if (e.k()) {
                            e.n();
                        }
                        bVar3 = bVar4;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        function5 = function3;
                    }
                    tcVar2 = tcVarO;
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i1114) {
                                AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i15 |= 24576;
                function4 = function2;
                if ((196608 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i15 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((74899 & i15) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    if (i16 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i3 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function5 = (Function1) objR7;
                    } else {
                        function5 = function3;
                    }
                    if (i5 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    }
                    if (i7 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                public final S invoke(S s) {
                                    return s;
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function4 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    i9 = i15 & 14;
                    if (i9 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    } else {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                    if (i9 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    } else {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    }
                    snapshotStateList = (SnapshotStateList) objR2;
                    if (i9 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    } else {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    }
                    k58Var = (k58) objR3;
                    if (!snapshotStateList.contains(transition2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (Intrinsics.e(transition2.p(), transition2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (k58Var.get_size() == 1) {
                            k58Var.k();
                        } else {
                            k58Var.k();
                        }
                        animatedContentTransitionScopeImpl.w(tcVarO);
                        animatedContentTransitionScopeImpl.x(layoutDirection);
                    }
                    if (!Intrinsics.e(transition2.p(), transition2.w())) {
                        it = snapshotStateList.iterator();
                        i13 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i13 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (i13 == -1) {
                            snapshotStateList.add(transition2.w());
                        } else {
                            snapshotStateList.set(i13, transition2.w());
                        }
                    }
                    if (k58Var.c(transition2.w())) {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i1114 = i10;
                            final S t117 = snapshotStateList.get(i1114);
                            final SnapshotStateList<S> snapshotStateList110 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl110 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var110 = rs4Var2;
                            k58Var.x(t117, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i1115) {
                                    if (!dVar2.g((i1115 & 3) != 2, i1115 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i1115, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl110;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion10 = d.INSTANCE;
                                    if (objR8 == companion10.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t117));
                                    Transition<S> transition3 = transition2;
                                    S s = t117;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl110;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion10.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t117;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion10.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion11 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion10.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion11, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t117, transition2.w()));
                                    b bVarThen10 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t117);
                                    final S s3 = t117;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion10.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion10.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList111 = snapshotStateList110;
                                    final S s4 = t117;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl111 = animatedContentTransitionScopeImpl110;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var111 = rs4Var110;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen10, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i1116) {
                                            if ((i1116 & 6) == 0) {
                                                i1116 |= (i1116 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i1116 & 19) != 18, i1116 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i1116, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList111) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl111);
                                            final SnapshotStateList<S> snapshotStateList112 = snapshotStateList111;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl112 = animatedContentTransitionScopeImpl111;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList112, s5, animatedContentTransitionScopeImpl112);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i1116 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl111.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var111.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i1114 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl110;
                            size = size;
                            snapshotStateList = snapshotStateList110;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    } else {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i1115 = i10;
                            final S t118 = snapshotStateList.get(i1115);
                            final SnapshotStateList<S> snapshotStateList111 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl111 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var111 = rs4Var2;
                            k58Var.x(t118, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i1116) {
                                    if (!dVar2.g((i1116 & 3) != 2, i1116 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i1116, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl111;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion10 = d.INSTANCE;
                                    if (objR8 == companion10.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t118));
                                    Transition<S> transition3 = transition2;
                                    S s = t118;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl111;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion10.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t118;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion10.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion11 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion10.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion11, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t118, transition2.w()));
                                    b bVarThen10 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t118);
                                    final S s3 = t118;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion10.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion10.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList112 = snapshotStateList111;
                                    final S s4 = t118;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl112 = animatedContentTransitionScopeImpl111;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var112 = rs4Var111;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen10, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i1117) {
                                            if ((i1117 & 6) == 0) {
                                                i1117 |= (i1117 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i1117 & 19) != 18, i1117 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i1117, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList112) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl112);
                                            final SnapshotStateList<S> snapshotStateList113 = snapshotStateList112;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl113 = animatedContentTransitionScopeImpl112;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList113, s5, animatedContentTransitionScopeImpl113);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i1117 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl112.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var112.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i1115 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl111;
                            size = size;
                            snapshotStateList = snapshotStateList111;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    }
                    zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    } else {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    }
                    b bVarThen10 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                    objR5 = dVarF.R();
                    if (objR5 == d.INSTANCE.a()) {
                        objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR5);
                    }
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy10 = (AnimatedContentMeasurePolicy) objR5;
                    int iHashCode10 = Long.hashCode(pp1.b(dVarF, i11));
                    gs1 gs1VarJ10 = dVarF.j();
                    b bVarE10 = ComposedModifierKt.e(dVarF, bVarThen10);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    function0B = companion10.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC10 = dud.c(dVarF);
                    dud.i(dVarC10, animatedContentMeasurePolicy10, companion10.d());
                    dud.i(dVarC10, gs1VarJ10, companion10.f());
                    dud.d(dVarC10, Integer.valueOf(iHashCode10), companion10.c());
                    dud.g(dVarC10, companion10.a());
                    dud.i(dVarC10, bVarE10, companion10.e());
                    dVarF.y(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i12 < size2) {
                        T t119 = snapshotStateList2.get(i12);
                        dVarF.V(-2026002954, function4.invoke(t119));
                        function7 = (Function2) k58Var.e(t119);
                        if (function7 == null) {
                            dVarF.y(1618454323);
                        } else {
                            dVarF.y(-2026001778);
                            function7.invoke(dVarF, Integer.valueOf(i11));
                        }
                        dVarF.u();
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    function5 = function3;
                }
                tcVar2 = tcVarO;
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i1116) {
                            AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i15 |= 3072;
            tcVarO = tcVar;
            i7 = i2 & 8;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i15 |= i8;
                }
                if ((196608 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i15 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((74899 & i15) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    if (i16 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i3 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function5 = (Function1) objR7;
                    } else {
                        function5 = function3;
                    }
                    if (i5 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    }
                    if (i7 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                public final S invoke(S s) {
                                    return s;
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function4 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    i9 = i15 & 14;
                    if (i9 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    } else {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                    if (i9 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    } else {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    }
                    snapshotStateList = (SnapshotStateList) objR2;
                    if (i9 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    } else {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    }
                    k58Var = (k58) objR3;
                    if (!snapshotStateList.contains(transition2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (Intrinsics.e(transition2.p(), transition2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (k58Var.get_size() == 1) {
                            k58Var.k();
                        } else {
                            k58Var.k();
                        }
                        animatedContentTransitionScopeImpl.w(tcVarO);
                        animatedContentTransitionScopeImpl.x(layoutDirection);
                    }
                    if (!Intrinsics.e(transition2.p(), transition2.w())) {
                        it = snapshotStateList.iterator();
                        i13 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i13 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (i13 == -1) {
                            snapshotStateList.add(transition2.w());
                        } else {
                            snapshotStateList.set(i13, transition2.w());
                        }
                    }
                    if (k58Var.c(transition2.w())) {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i1116 = i10;
                            final S t1110 = snapshotStateList.get(i1116);
                            final SnapshotStateList<S> snapshotStateList112 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl112 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var112 = rs4Var2;
                            k58Var.x(t1110, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i1117) {
                                    if (!dVar2.g((i1117 & 3) != 2, i1117 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i1117, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl112;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion11 = d.INSTANCE;
                                    if (objR8 == companion11.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t1110));
                                    Transition<S> transition3 = transition2;
                                    S s = t1110;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl112;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion11.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t1110;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion11.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion12 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion11.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion12, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t1110, transition2.w()));
                                    b bVarThen11 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t1110);
                                    final S s3 = t1110;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion11.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion11.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList113 = snapshotStateList112;
                                    final S s4 = t1110;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl113 = animatedContentTransitionScopeImpl112;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var113 = rs4Var112;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen11, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i1118) {
                                            if ((i1118 & 6) == 0) {
                                                i1118 |= (i1118 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i1118 & 19) != 18, i1118 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i1118, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList113) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl113);
                                            final SnapshotStateList<S> snapshotStateList114 = snapshotStateList113;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl114 = animatedContentTransitionScopeImpl113;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList114, s5, animatedContentTransitionScopeImpl114);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i1118 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl113.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var113.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i1116 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl112;
                            size = size;
                            snapshotStateList = snapshotStateList112;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    } else {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i1117 = i10;
                            final S t1111 = snapshotStateList.get(i1117);
                            final SnapshotStateList<S> snapshotStateList113 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl113 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var113 = rs4Var2;
                            k58Var.x(t1111, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i1118) {
                                    if (!dVar2.g((i1118 & 3) != 2, i1118 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i1118, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl113;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion11 = d.INSTANCE;
                                    if (objR8 == companion11.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t1111));
                                    Transition<S> transition3 = transition2;
                                    S s = t1111;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl113;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion11.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t1111;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion11.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion12 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion11.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion12, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t1111, transition2.w()));
                                    b bVarThen11 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t1111);
                                    final S s3 = t1111;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion11.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion11.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList114 = snapshotStateList113;
                                    final S s4 = t1111;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl114 = animatedContentTransitionScopeImpl113;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var114 = rs4Var113;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen11, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i1119) {
                                            if ((i1119 & 6) == 0) {
                                                i1119 |= (i1119 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i1119 & 19) != 18, i1119 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i1119, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList114) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl114);
                                            final SnapshotStateList<S> snapshotStateList115 = snapshotStateList114;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl115 = animatedContentTransitionScopeImpl114;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList115, s5, animatedContentTransitionScopeImpl115);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i1119 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl114.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var114.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i1117 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl113;
                            size = size;
                            snapshotStateList = snapshotStateList113;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    }
                    zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    } else {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    }
                    b bVarThen11 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                    objR5 = dVarF.R();
                    if (objR5 == d.INSTANCE.a()) {
                        objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR5);
                    }
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy11 = (AnimatedContentMeasurePolicy) objR5;
                    int iHashCode11 = Long.hashCode(pp1.b(dVarF, i11));
                    gs1 gs1VarJ11 = dVarF.j();
                    b bVarE11 = ComposedModifierKt.e(dVarF, bVarThen11);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    function0B = companion11.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC11 = dud.c(dVarF);
                    dud.i(dVarC11, animatedContentMeasurePolicy11, companion11.d());
                    dud.i(dVarC11, gs1VarJ11, companion11.f());
                    dud.d(dVarC11, Integer.valueOf(iHashCode11), companion11.c());
                    dud.g(dVarC11, companion11.a());
                    dud.i(dVarC11, bVarE11, companion11.e());
                    dVarF.y(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i12 < size2) {
                        T t1112 = snapshotStateList2.get(i12);
                        dVarF.V(-2026002954, function4.invoke(t1112));
                        function7 = (Function2) k58Var.e(t1112);
                        if (function7 == null) {
                            dVarF.y(1618454323);
                        } else {
                            dVarF.y(-2026001778);
                            function7.invoke(dVarF, Integer.valueOf(i11));
                        }
                        dVarF.u();
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    function5 = function3;
                }
                tcVar2 = tcVarO;
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i1118) {
                            AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((196608 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i15 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((74899 & i15) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i15 & 1)) {
                if (i16 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i3 != 0) {
                    objR7 = dVarF.R();
                    if (objR7 == d.INSTANCE.a()) {
                        objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR7);
                    }
                    function5 = (Function1) objR7;
                } else {
                    function5 = function3;
                }
                if (i5 != 0) {
                    tcVarO = tc.INSTANCE.o();
                }
                if (i7 != 0) {
                    objR6 = dVarF.R();
                    if (objR6 == d.INSTANCE.a()) {
                        objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                            public final S invoke(S s) {
                                return s;
                            }
                        };
                        dVarF.L(objR6);
                    }
                    function4 = (Function1) objR6;
                }
                if (e.k()) {
                    e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                i9 = i15 & 14;
                if (i9 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                    dVarF.L(objR);
                } else {
                    objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                    dVarF.L(objR);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = p0.g(transition2.p());
                    dVarF.L(objR2);
                } else {
                    objR2 = p0.g(transition2.p());
                    dVarF.L(objR2);
                }
                snapshotStateList = (SnapshotStateList) objR2;
                if (i9 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objR3 = dVarF.R();
                if (z4) {
                    objR3 = k4b.c();
                    dVarF.L(objR3);
                } else {
                    objR3 = k4b.c();
                    dVarF.L(objR3);
                }
                k58Var = (k58) objR3;
                if (!snapshotStateList.contains(transition2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition2.p());
                }
                if (Intrinsics.e(transition2.p(), transition2.w())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (k58Var.get_size() == 1) {
                        k58Var.k();
                    } else {
                        k58Var.k();
                    }
                    animatedContentTransitionScopeImpl.w(tcVarO);
                    animatedContentTransitionScopeImpl.x(layoutDirection);
                }
                if (!Intrinsics.e(transition2.p(), transition2.w())) {
                    it = snapshotStateList.iterator();
                    i13 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i13 = -1;
                            break;
                        } else {
                            if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                break;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (i13 == -1) {
                        snapshotStateList.add(transition2.w());
                    } else {
                        snapshotStateList.set(i13, transition2.w());
                    }
                }
                if (k58Var.c(transition2.w())) {
                    dVarF.y(1966410449);
                    k58Var.k();
                    size = snapshotStateList.size();
                    i10 = 0;
                    while (i10 < size) {
                        int i1118 = i10;
                        final S t1113 = snapshotStateList.get(i1118);
                        final SnapshotStateList<S> snapshotStateList114 = snapshotStateList;
                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl114 = animatedContentTransitionScopeImpl;
                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var114 = rs4Var2;
                        k58Var.x(t1113, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(d dVar2, int i1119) {
                                if (!dVar2.g((i1119 & 3) != 2, i1119 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (e.k()) {
                                    e.o(-23915175, i1119, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                }
                                Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                Object obj = animatedContentTransitionScopeImpl114;
                                Object objR8 = dVar2.R();
                                d.Companion companion12 = d.INSTANCE;
                                if (objR8 == companion12.a()) {
                                    objR8 = (h02) function8.invoke(obj);
                                    dVar2.L(objR8);
                                }
                                final h02 h02Var = (h02) objR8;
                                boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t1113));
                                Transition<S> transition3 = transition2;
                                S s = t1113;
                                Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                Object obj2 = animatedContentTransitionScopeImpl114;
                                Object objR9 = dVar2.R();
                                if (zA || objR9 == companion12.a()) {
                                    objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                    dVar2.L(objR9);
                                }
                                final f fVar = (f) objR9;
                                S s2 = t1113;
                                Transition<S> transition4 = transition2;
                                Object objR10 = dVar2.R();
                                if (objR10 == companion12.a()) {
                                    objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                    dVar2.L(objR10);
                                }
                                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                d targetContentEnter = h02Var.getTargetContentEnter();
                                b.Companion companion13 = b.INSTANCE;
                                boolean zT = dVar2.T(h02Var);
                                Object objR11 = dVar2.R();
                                if (zT || objR11 == companion12.a()) {
                                    objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                            final o oVarR0 = dj7Var.r0(j);
                                            int width = oVarR0.getWidth();
                                            int height = oVarR0.getHeight();
                                            final h02 h02Var2 = h02Var;
                                            return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((o.a) obj3);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar2) {
                                                    aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                }
                                            }, 4, null);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                        }
                                    };
                                    dVar2.L(objR11);
                                }
                                b bVarA = zn6.a(companion13, (ps4) objR11);
                                aVar.c(Intrinsics.e(t1113, transition2.w()));
                                b bVarThen12 = bVarA.then(aVar);
                                Transition<S> transition5 = transition2;
                                boolean zT2 = dVar2.T(t1113);
                                final S s3 = t1113;
                                Object objR12 = dVar2.R();
                                if (zT2 || objR12 == companion12.a()) {
                                    objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(S s4) {
                                            return Boolean.valueOf(Intrinsics.e(s4, s3));
                                        }
                                    };
                                    dVar2.L(objR12);
                                }
                                Function1 function10 = (Function1) objR12;
                                boolean zX2 = dVar2.x(fVar);
                                Object objR13 = dVar2.R();
                                if (zX2 || objR13 == companion12.a()) {
                                    objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                        }
                                    };
                                    dVar2.L(objR13);
                                }
                                Function2 function11 = (Function2) objR13;
                                final SnapshotStateList<S> snapshotStateList115 = snapshotStateList114;
                                final S s4 = t1113;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl115 = animatedContentTransitionScopeImpl114;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var115 = rs4Var114;
                                AnimatedVisibilityKt.a(transition5, function10, bVarThen12, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    public final void a(xq xqVar, d dVar3, int i11110) {
                                        if ((i11110 & 6) == 0) {
                                            i11110 |= (i11110 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                        }
                                        if (!dVar3.g((i11110 & 19) != 18, i11110 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-143346359, i11110, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                        }
                                        boolean zX3 = dVar3.x(snapshotStateList115) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl115);
                                        final SnapshotStateList<S> snapshotStateList116 = snapshotStateList115;
                                        final S s5 = s4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl116 = animatedContentTransitionScopeImpl115;
                                        Object objR14 = dVar3.R();
                                        if (zX3 || objR14 == d.INSTANCE.a()) {
                                            objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                public static final class a implements jd3 {
                                                    final /* synthetic */ SnapshotStateList a;
                                                    final /* synthetic */ Object b;
                                                    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                    public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                        this.a = snapshotStateList;
                                                        this.b = obj;
                                                        this.c = animatedContentTransitionScopeImpl;
                                                    }

                                                    @Override // com.google.inputmethod.jd3
                                                    public void dispose() {
                                                        this.a.remove(this.b);
                                                        this.c.r().u(this.b);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final jd3 invoke(kd3 kd3Var) {
                                                    return new a(snapshotStateList116, s5, animatedContentTransitionScopeImpl116);
                                                }
                                            };
                                            dVar3.L(objR14);
                                        }
                                        vn3.c(xqVar, (Function1) objR14, dVar3, i11110 & 14);
                                        k58 k58VarR = animatedContentTransitionScopeImpl115.r();
                                        S s6 = s4;
                                        Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                        k58VarR.x(s6, ((yq) xqVar).b());
                                        Object objR15 = dVar3.R();
                                        if (objR15 == d.INSTANCE.a()) {
                                            objR15 = new a(xqVar);
                                            dVar3.L(objR15);
                                        }
                                        rs4Var115.invoke((a) objR15, s4, dVar3, 0);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                        return Unit.a;
                                    }
                                }, dVar2, 54), dVar2, 12582912, 64);
                                if (e.k()) {
                                    e.n();
                                }
                            }
                        }, dVarF, 54));
                        i10 = i1118 + 1;
                        transition2 = transition;
                        rs4Var2 = rs4Var;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl114;
                        size = size;
                        snapshotStateList = snapshotStateList114;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i11 = 0;
                    dVarF.u();
                } else {
                    dVarF.y(1966410449);
                    k58Var.k();
                    size = snapshotStateList.size();
                    i10 = 0;
                    while (i10 < size) {
                        int i1119 = i10;
                        final S t1114 = snapshotStateList.get(i1119);
                        final SnapshotStateList<S> snapshotStateList115 = snapshotStateList;
                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl115 = animatedContentTransitionScopeImpl;
                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var115 = rs4Var2;
                        k58Var.x(t1114, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(d dVar2, int i11110) {
                                if (!dVar2.g((i11110 & 3) != 2, i11110 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (e.k()) {
                                    e.o(-23915175, i11110, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                }
                                Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                Object obj = animatedContentTransitionScopeImpl115;
                                Object objR8 = dVar2.R();
                                d.Companion companion12 = d.INSTANCE;
                                if (objR8 == companion12.a()) {
                                    objR8 = (h02) function8.invoke(obj);
                                    dVar2.L(objR8);
                                }
                                final h02 h02Var = (h02) objR8;
                                boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t1114));
                                Transition<S> transition3 = transition2;
                                S s = t1114;
                                Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                Object obj2 = animatedContentTransitionScopeImpl115;
                                Object objR9 = dVar2.R();
                                if (zA || objR9 == companion12.a()) {
                                    objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                    dVar2.L(objR9);
                                }
                                final f fVar = (f) objR9;
                                S s2 = t1114;
                                Transition<S> transition4 = transition2;
                                Object objR10 = dVar2.R();
                                if (objR10 == companion12.a()) {
                                    objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                    dVar2.L(objR10);
                                }
                                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                d targetContentEnter = h02Var.getTargetContentEnter();
                                b.Companion companion13 = b.INSTANCE;
                                boolean zT = dVar2.T(h02Var);
                                Object objR11 = dVar2.R();
                                if (zT || objR11 == companion12.a()) {
                                    objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                            final o oVarR0 = dj7Var.r0(j);
                                            int width = oVarR0.getWidth();
                                            int height = oVarR0.getHeight();
                                            final h02 h02Var2 = h02Var;
                                            return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((o.a) obj3);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar2) {
                                                    aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                }
                                            }, 4, null);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                        }
                                    };
                                    dVar2.L(objR11);
                                }
                                b bVarA = zn6.a(companion13, (ps4) objR11);
                                aVar.c(Intrinsics.e(t1114, transition2.w()));
                                b bVarThen12 = bVarA.then(aVar);
                                Transition<S> transition5 = transition2;
                                boolean zT2 = dVar2.T(t1114);
                                final S s3 = t1114;
                                Object objR12 = dVar2.R();
                                if (zT2 || objR12 == companion12.a()) {
                                    objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(S s4) {
                                            return Boolean.valueOf(Intrinsics.e(s4, s3));
                                        }
                                    };
                                    dVar2.L(objR12);
                                }
                                Function1 function10 = (Function1) objR12;
                                boolean zX2 = dVar2.x(fVar);
                                Object objR13 = dVar2.R();
                                if (zX2 || objR13 == companion12.a()) {
                                    objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                        }
                                    };
                                    dVar2.L(objR13);
                                }
                                Function2 function11 = (Function2) objR13;
                                final SnapshotStateList<S> snapshotStateList116 = snapshotStateList115;
                                final S s4 = t1114;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl116 = animatedContentTransitionScopeImpl115;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var116 = rs4Var115;
                                AnimatedVisibilityKt.a(transition5, function10, bVarThen12, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    public final void a(xq xqVar, d dVar3, int i11111) {
                                        if ((i11111 & 6) == 0) {
                                            i11111 |= (i11111 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                        }
                                        if (!dVar3.g((i11111 & 19) != 18, i11111 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-143346359, i11111, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                        }
                                        boolean zX3 = dVar3.x(snapshotStateList116) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl116);
                                        final SnapshotStateList<S> snapshotStateList117 = snapshotStateList116;
                                        final S s5 = s4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl117 = animatedContentTransitionScopeImpl116;
                                        Object objR14 = dVar3.R();
                                        if (zX3 || objR14 == d.INSTANCE.a()) {
                                            objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                public static final class a implements jd3 {
                                                    final /* synthetic */ SnapshotStateList a;
                                                    final /* synthetic */ Object b;
                                                    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                    public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                        this.a = snapshotStateList;
                                                        this.b = obj;
                                                        this.c = animatedContentTransitionScopeImpl;
                                                    }

                                                    @Override // com.google.inputmethod.jd3
                                                    public void dispose() {
                                                        this.a.remove(this.b);
                                                        this.c.r().u(this.b);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final jd3 invoke(kd3 kd3Var) {
                                                    return new a(snapshotStateList117, s5, animatedContentTransitionScopeImpl117);
                                                }
                                            };
                                            dVar3.L(objR14);
                                        }
                                        vn3.c(xqVar, (Function1) objR14, dVar3, i11111 & 14);
                                        k58 k58VarR = animatedContentTransitionScopeImpl116.r();
                                        S s6 = s4;
                                        Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                        k58VarR.x(s6, ((yq) xqVar).b());
                                        Object objR15 = dVar3.R();
                                        if (objR15 == d.INSTANCE.a()) {
                                            objR15 = new a(xqVar);
                                            dVar3.L(objR15);
                                        }
                                        rs4Var116.invoke((a) objR15, s4, dVar3, 0);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                        return Unit.a;
                                    }
                                }, dVar2, 54), dVar2, 12582912, 64);
                                if (e.k()) {
                                    e.n();
                                }
                            }
                        }, dVarF, 54));
                        i10 = i1119 + 1;
                        transition2 = transition;
                        rs4Var2 = rs4Var;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl115;
                        size = size;
                        snapshotStateList = snapshotStateList115;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i11 = 0;
                    dVarF.u();
                }
                zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                objR4 = dVarF.R();
                if (zX) {
                    objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR4);
                } else {
                    objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR4);
                }
                b bVarThen12 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                objR5 = dVarF.R();
                if (objR5 == d.INSTANCE.a()) {
                    objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR5);
                }
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy12 = (AnimatedContentMeasurePolicy) objR5;
                int iHashCode12 = Long.hashCode(pp1.b(dVarF, i11));
                gs1 gs1VarJ12 = dVarF.j();
                b bVarE12 = ComposedModifierKt.e(dVarF, bVarThen12);
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                function0B = companion12.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC12 = dud.c(dVarF);
                dud.i(dVarC12, animatedContentMeasurePolicy12, companion12.d());
                dud.i(dVarC12, gs1VarJ12, companion12.f());
                dud.d(dVarC12, Integer.valueOf(iHashCode12), companion12.c());
                dud.g(dVarC12, companion12.a());
                dud.i(dVarC12, bVarE12, companion12.e());
                dVarF.y(-860173498);
                size2 = snapshotStateList2.size();
                while (i12 < size2) {
                    T t1115 = snapshotStateList2.get(i12);
                    dVarF.V(-2026002954, function4.invoke(t1115));
                    function7 = (Function2) k58Var.e(t1115);
                    if (function7 == null) {
                        dVarF.y(1618454323);
                    } else {
                        dVarF.y(-2026001778);
                        function7.invoke(dVarF, Integer.valueOf(i11));
                    }
                    dVarF.u();
                    dVarF.Z();
                }
                dVarF.u();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                function5 = function3;
            }
            tcVar2 = tcVarO;
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11110) {
                        AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i15 |= 384;
        function3 = function1;
        i5 = i2 & 4;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                tcVarO = tcVar;
                if (dVarF.x(tcVarO)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i15 |= i6;
            }
            i7 = i2 & 8;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i15 |= i8;
                }
                if ((196608 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i15 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((74899 & i15) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i15 & 1)) {
                    if (i16 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i3 != 0) {
                        objR7 = dVarF.R();
                        if (objR7 == d.INSTANCE.a()) {
                            objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR7);
                        }
                        function5 = (Function1) objR7;
                    } else {
                        function5 = function3;
                    }
                    if (i5 != 0) {
                        tcVarO = tc.INSTANCE.o();
                    }
                    if (i7 != 0) {
                        objR6 = dVarF.R();
                        if (objR6 == d.INSTANCE.a()) {
                            objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                public final S invoke(S s) {
                                    return s;
                                }
                            };
                            dVarF.L(objR6);
                        }
                        function4 = (Function1) objR6;
                    }
                    if (e.k()) {
                        e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                    i9 = i15 & 14;
                    if (i9 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR = dVarF.R();
                    if (z2) {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    } else {
                        objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                        dVarF.L(objR);
                    }
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                    if (i9 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objR2 = dVarF.R();
                    if (z3) {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    } else {
                        objR2 = p0.g(transition2.p());
                        dVarF.L(objR2);
                    }
                    snapshotStateList = (SnapshotStateList) objR2;
                    if (i9 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objR3 = dVarF.R();
                    if (z4) {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    } else {
                        objR3 = k4b.c();
                        dVarF.L(objR3);
                    }
                    k58Var = (k58) objR3;
                    if (!snapshotStateList.contains(transition2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (Intrinsics.e(transition2.p(), transition2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(transition2.p());
                        }
                        if (k58Var.get_size() == 1) {
                            k58Var.k();
                        } else {
                            k58Var.k();
                        }
                        animatedContentTransitionScopeImpl.w(tcVarO);
                        animatedContentTransitionScopeImpl.x(layoutDirection);
                    }
                    if (!Intrinsics.e(transition2.p(), transition2.w())) {
                        it = snapshotStateList.iterator();
                        i13 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i13 = -1;
                                break;
                            } else {
                                if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                    break;
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (i13 == -1) {
                            snapshotStateList.add(transition2.w());
                        } else {
                            snapshotStateList.set(i13, transition2.w());
                        }
                    }
                    if (k58Var.c(transition2.w())) {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i11110 = i10;
                            final S t1116 = snapshotStateList.get(i11110);
                            final SnapshotStateList<S> snapshotStateList116 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl116 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var116 = rs4Var2;
                            k58Var.x(t1116, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i11111) {
                                    if (!dVar2.g((i11111 & 3) != 2, i11111 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i11111, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl116;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion13 = d.INSTANCE;
                                    if (objR8 == companion13.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t1116));
                                    Transition<S> transition3 = transition2;
                                    S s = t1116;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl116;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion13.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t1116;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion13.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion14 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion13.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion14, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t1116, transition2.w()));
                                    b bVarThen13 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t1116);
                                    final S s3 = t1116;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion13.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion13.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList117 = snapshotStateList116;
                                    final S s4 = t1116;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl117 = animatedContentTransitionScopeImpl116;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var117 = rs4Var116;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen13, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i11112) {
                                            if ((i11112 & 6) == 0) {
                                                i11112 |= (i11112 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i11112 & 19) != 18, i11112 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i11112, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList117) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl117);
                                            final SnapshotStateList<S> snapshotStateList118 = snapshotStateList117;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl118 = animatedContentTransitionScopeImpl117;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList118, s5, animatedContentTransitionScopeImpl118);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i11112 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl117.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var117.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i11110 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl116;
                            size = size;
                            snapshotStateList = snapshotStateList116;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    } else {
                        dVarF.y(1966410449);
                        k58Var.k();
                        size = snapshotStateList.size();
                        i10 = 0;
                        while (i10 < size) {
                            int i11111 = i10;
                            final S t1117 = snapshotStateList.get(i11111);
                            final SnapshotStateList<S> snapshotStateList117 = snapshotStateList;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl117 = animatedContentTransitionScopeImpl;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var117 = rs4Var2;
                            k58Var.x(t1117, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public final void invoke(d dVar2, int i11112) {
                                    if (!dVar2.g((i11112 & 3) != 2, i11112 & 1)) {
                                        dVar2.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-23915175, i11112, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                    }
                                    Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                    Object obj = animatedContentTransitionScopeImpl117;
                                    Object objR8 = dVar2.R();
                                    d.Companion companion13 = d.INSTANCE;
                                    if (objR8 == companion13.a()) {
                                        objR8 = (h02) function8.invoke(obj);
                                        dVar2.L(objR8);
                                    }
                                    final h02 h02Var = (h02) objR8;
                                    boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t1117));
                                    Transition<S> transition3 = transition2;
                                    S s = t1117;
                                    Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                    Object obj2 = animatedContentTransitionScopeImpl117;
                                    Object objR9 = dVar2.R();
                                    if (zA || objR9 == companion13.a()) {
                                        objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                        dVar2.L(objR9);
                                    }
                                    final f fVar = (f) objR9;
                                    S s2 = t1117;
                                    Transition<S> transition4 = transition2;
                                    Object objR10 = dVar2.R();
                                    if (objR10 == companion13.a()) {
                                        objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                        dVar2.L(objR10);
                                    }
                                    AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                    d targetContentEnter = h02Var.getTargetContentEnter();
                                    b.Companion companion14 = b.INSTANCE;
                                    boolean zT = dVar2.T(h02Var);
                                    Object objR11 = dVar2.R();
                                    if (zT || objR11 == companion13.a()) {
                                        objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                            {
                                                super(3);
                                            }

                                            public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                                final o oVarR0 = dj7Var.r0(j);
                                                int width = oVarR0.getWidth();
                                                int height = oVarR0.getHeight();
                                                final h02 h02Var2 = h02Var;
                                                return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                        invoke((o.a) obj3);
                                                        return Unit.a;
                                                    }

                                                    public final void invoke(o.a aVar2) {
                                                        aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                    }
                                                }, 4, null);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                                return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                            }
                                        };
                                        dVar2.L(objR11);
                                    }
                                    b bVarA = zn6.a(companion14, (ps4) objR11);
                                    aVar.c(Intrinsics.e(t1117, transition2.w()));
                                    b bVarThen13 = bVarA.then(aVar);
                                    Transition<S> transition5 = transition2;
                                    boolean zT2 = dVar2.T(t1117);
                                    final S s3 = t1117;
                                    Object objR12 = dVar2.R();
                                    if (zT2 || objR12 == companion13.a()) {
                                        objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(S s4) {
                                                return Boolean.valueOf(Intrinsics.e(s4, s3));
                                            }
                                        };
                                        dVar2.L(objR12);
                                    }
                                    Function1 function10 = (Function1) objR12;
                                    boolean zX2 = dVar2.x(fVar);
                                    Object objR13 = dVar2.R();
                                    if (zX2 || objR13 == companion13.a()) {
                                        objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                            {
                                                super(2);
                                            }

                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                            }
                                        };
                                        dVar2.L(objR13);
                                    }
                                    Function2 function11 = (Function2) objR13;
                                    final SnapshotStateList<S> snapshotStateList118 = snapshotStateList117;
                                    final S s4 = t1117;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl118 = animatedContentTransitionScopeImpl117;
                                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var118 = rs4Var117;
                                    AnimatedVisibilityKt.a(transition5, function10, bVarThen13, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        public final void a(xq xqVar, d dVar3, int i11113) {
                                            if ((i11113 & 6) == 0) {
                                                i11113 |= (i11113 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                            }
                                            if (!dVar3.g((i11113 & 19) != 18, i11113 & 1)) {
                                                dVar3.q();
                                                return;
                                            }
                                            if (e.k()) {
                                                e.o(-143346359, i11113, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                            }
                                            boolean zX3 = dVar3.x(snapshotStateList118) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl118);
                                            final SnapshotStateList<S> snapshotStateList119 = snapshotStateList118;
                                            final S s5 = s4;
                                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl119 = animatedContentTransitionScopeImpl118;
                                            Object objR14 = dVar3.R();
                                            if (zX3 || objR14 == d.INSTANCE.a()) {
                                                objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                    public static final class a implements jd3 {
                                                        final /* synthetic */ SnapshotStateList a;
                                                        final /* synthetic */ Object b;
                                                        final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                        public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                            this.a = snapshotStateList;
                                                            this.b = obj;
                                                            this.c = animatedContentTransitionScopeImpl;
                                                        }

                                                        @Override // com.google.inputmethod.jd3
                                                        public void dispose() {
                                                            this.a.remove(this.b);
                                                            this.c.r().u(this.b);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    public final jd3 invoke(kd3 kd3Var) {
                                                        return new a(snapshotStateList119, s5, animatedContentTransitionScopeImpl119);
                                                    }
                                                };
                                                dVar3.L(objR14);
                                            }
                                            vn3.c(xqVar, (Function1) objR14, dVar3, i11113 & 14);
                                            k58 k58VarR = animatedContentTransitionScopeImpl118.r();
                                            S s6 = s4;
                                            Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            k58VarR.x(s6, ((yq) xqVar).b());
                                            Object objR15 = dVar3.R();
                                            if (objR15 == d.INSTANCE.a()) {
                                                objR15 = new a(xqVar);
                                                dVar3.L(objR15);
                                            }
                                            rs4Var118.invoke((a) objR15, s4, dVar3, 0);
                                            if (e.k()) {
                                                e.n();
                                            }
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                            return Unit.a;
                                        }
                                    }, dVar2, 54), dVar2, 12582912, 64);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }
                            }, dVarF, 54));
                            i10 = i11111 + 1;
                            transition2 = transition;
                            rs4Var2 = rs4Var;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl117;
                            size = size;
                            snapshotStateList = snapshotStateList117;
                        }
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        snapshotStateList2 = snapshotStateList;
                        i11 = 0;
                        dVarF.u();
                    }
                    zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                    objR4 = dVarF.R();
                    if (zX) {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    } else {
                        objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR4);
                    }
                    b bVarThen13 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                    objR5 = dVarF.R();
                    if (objR5 == d.INSTANCE.a()) {
                        objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                        dVarF.L(objR5);
                    }
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy13 = (AnimatedContentMeasurePolicy) objR5;
                    int iHashCode13 = Long.hashCode(pp1.b(dVarF, i11));
                    gs1 gs1VarJ13 = dVarF.j();
                    b bVarE13 = ComposedModifierKt.e(dVarF, bVarThen13);
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    function0B = companion13.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    d dVarC13 = dud.c(dVarF);
                    dud.i(dVarC13, animatedContentMeasurePolicy13, companion13.d());
                    dud.i(dVarC13, gs1VarJ13, companion13.f());
                    dud.d(dVarC13, Integer.valueOf(iHashCode13), companion13.c());
                    dud.g(dVarC13, companion13.a());
                    dud.i(dVarC13, bVarE13, companion13.e());
                    dVarF.y(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i12 < size2) {
                        T t1118 = snapshotStateList2.get(i12);
                        dVarF.V(-2026002954, function4.invoke(t1118));
                        function7 = (Function2) k58Var.e(t1118);
                        if (function7 == null) {
                            dVarF.y(1618454323);
                        } else {
                            dVarF.y(-2026001778);
                            function7.invoke(dVarF, Integer.valueOf(i11));
                        }
                        dVarF.u();
                        dVarF.Z();
                    }
                    dVarF.u();
                    dVarF.m();
                    if (e.k()) {
                        e.n();
                    }
                    bVar3 = bVar4;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    function5 = function3;
                }
                tcVar2 = tcVarO;
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11112) {
                            AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((196608 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i15 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((74899 & i15) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i15 & 1)) {
                if (i16 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i3 != 0) {
                    objR7 = dVarF.R();
                    if (objR7 == d.INSTANCE.a()) {
                        objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR7);
                    }
                    function5 = (Function1) objR7;
                } else {
                    function5 = function3;
                }
                if (i5 != 0) {
                    tcVarO = tc.INSTANCE.o();
                }
                if (i7 != 0) {
                    objR6 = dVarF.R();
                    if (objR6 == d.INSTANCE.a()) {
                        objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                            public final S invoke(S s) {
                                return s;
                            }
                        };
                        dVarF.L(objR6);
                    }
                    function4 = (Function1) objR6;
                }
                if (e.k()) {
                    e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                i9 = i15 & 14;
                if (i9 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                    dVarF.L(objR);
                } else {
                    objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                    dVarF.L(objR);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = p0.g(transition2.p());
                    dVarF.L(objR2);
                } else {
                    objR2 = p0.g(transition2.p());
                    dVarF.L(objR2);
                }
                snapshotStateList = (SnapshotStateList) objR2;
                if (i9 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objR3 = dVarF.R();
                if (z4) {
                    objR3 = k4b.c();
                    dVarF.L(objR3);
                } else {
                    objR3 = k4b.c();
                    dVarF.L(objR3);
                }
                k58Var = (k58) objR3;
                if (!snapshotStateList.contains(transition2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition2.p());
                }
                if (Intrinsics.e(transition2.p(), transition2.w())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (k58Var.get_size() == 1) {
                        k58Var.k();
                    } else {
                        k58Var.k();
                    }
                    animatedContentTransitionScopeImpl.w(tcVarO);
                    animatedContentTransitionScopeImpl.x(layoutDirection);
                }
                if (!Intrinsics.e(transition2.p(), transition2.w())) {
                    it = snapshotStateList.iterator();
                    i13 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i13 = -1;
                            break;
                        } else {
                            if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                break;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (i13 == -1) {
                        snapshotStateList.add(transition2.w());
                    } else {
                        snapshotStateList.set(i13, transition2.w());
                    }
                }
                if (k58Var.c(transition2.w())) {
                    dVarF.y(1966410449);
                    k58Var.k();
                    size = snapshotStateList.size();
                    i10 = 0;
                    while (i10 < size) {
                        int i11112 = i10;
                        final S t1119 = snapshotStateList.get(i11112);
                        final SnapshotStateList<S> snapshotStateList118 = snapshotStateList;
                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl118 = animatedContentTransitionScopeImpl;
                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var118 = rs4Var2;
                        k58Var.x(t1119, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(d dVar2, int i11113) {
                                if (!dVar2.g((i11113 & 3) != 2, i11113 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (e.k()) {
                                    e.o(-23915175, i11113, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                }
                                Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                Object obj = animatedContentTransitionScopeImpl118;
                                Object objR8 = dVar2.R();
                                d.Companion companion14 = d.INSTANCE;
                                if (objR8 == companion14.a()) {
                                    objR8 = (h02) function8.invoke(obj);
                                    dVar2.L(objR8);
                                }
                                final h02 h02Var = (h02) objR8;
                                boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t1119));
                                Transition<S> transition3 = transition2;
                                S s = t1119;
                                Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                Object obj2 = animatedContentTransitionScopeImpl118;
                                Object objR9 = dVar2.R();
                                if (zA || objR9 == companion14.a()) {
                                    objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                    dVar2.L(objR9);
                                }
                                final f fVar = (f) objR9;
                                S s2 = t1119;
                                Transition<S> transition4 = transition2;
                                Object objR10 = dVar2.R();
                                if (objR10 == companion14.a()) {
                                    objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                    dVar2.L(objR10);
                                }
                                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                d targetContentEnter = h02Var.getTargetContentEnter();
                                b.Companion companion15 = b.INSTANCE;
                                boolean zT = dVar2.T(h02Var);
                                Object objR11 = dVar2.R();
                                if (zT || objR11 == companion14.a()) {
                                    objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                            final o oVarR0 = dj7Var.r0(j);
                                            int width = oVarR0.getWidth();
                                            int height = oVarR0.getHeight();
                                            final h02 h02Var2 = h02Var;
                                            return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((o.a) obj3);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar2) {
                                                    aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                }
                                            }, 4, null);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                        }
                                    };
                                    dVar2.L(objR11);
                                }
                                b bVarA = zn6.a(companion15, (ps4) objR11);
                                aVar.c(Intrinsics.e(t1119, transition2.w()));
                                b bVarThen14 = bVarA.then(aVar);
                                Transition<S> transition5 = transition2;
                                boolean zT2 = dVar2.T(t1119);
                                final S s3 = t1119;
                                Object objR12 = dVar2.R();
                                if (zT2 || objR12 == companion14.a()) {
                                    objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(S s4) {
                                            return Boolean.valueOf(Intrinsics.e(s4, s3));
                                        }
                                    };
                                    dVar2.L(objR12);
                                }
                                Function1 function10 = (Function1) objR12;
                                boolean zX2 = dVar2.x(fVar);
                                Object objR13 = dVar2.R();
                                if (zX2 || objR13 == companion14.a()) {
                                    objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                        }
                                    };
                                    dVar2.L(objR13);
                                }
                                Function2 function11 = (Function2) objR13;
                                final SnapshotStateList<S> snapshotStateList119 = snapshotStateList118;
                                final S s4 = t1119;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl119 = animatedContentTransitionScopeImpl118;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var119 = rs4Var118;
                                AnimatedVisibilityKt.a(transition5, function10, bVarThen14, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    public final void a(xq xqVar, d dVar3, int i11114) {
                                        if ((i11114 & 6) == 0) {
                                            i11114 |= (i11114 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                        }
                                        if (!dVar3.g((i11114 & 19) != 18, i11114 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-143346359, i11114, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                        }
                                        boolean zX3 = dVar3.x(snapshotStateList119) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl119);
                                        final SnapshotStateList<S> snapshotStateList1110 = snapshotStateList119;
                                        final S s5 = s4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1110 = animatedContentTransitionScopeImpl119;
                                        Object objR14 = dVar3.R();
                                        if (zX3 || objR14 == d.INSTANCE.a()) {
                                            objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                public static final class a implements jd3 {
                                                    final /* synthetic */ SnapshotStateList a;
                                                    final /* synthetic */ Object b;
                                                    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                    public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                        this.a = snapshotStateList;
                                                        this.b = obj;
                                                        this.c = animatedContentTransitionScopeImpl;
                                                    }

                                                    @Override // com.google.inputmethod.jd3
                                                    public void dispose() {
                                                        this.a.remove(this.b);
                                                        this.c.r().u(this.b);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final jd3 invoke(kd3 kd3Var) {
                                                    return new a(snapshotStateList1110, s5, animatedContentTransitionScopeImpl1110);
                                                }
                                            };
                                            dVar3.L(objR14);
                                        }
                                        vn3.c(xqVar, (Function1) objR14, dVar3, i11114 & 14);
                                        k58 k58VarR = animatedContentTransitionScopeImpl119.r();
                                        S s6 = s4;
                                        Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                        k58VarR.x(s6, ((yq) xqVar).b());
                                        Object objR15 = dVar3.R();
                                        if (objR15 == d.INSTANCE.a()) {
                                            objR15 = new a(xqVar);
                                            dVar3.L(objR15);
                                        }
                                        rs4Var119.invoke((a) objR15, s4, dVar3, 0);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                        return Unit.a;
                                    }
                                }, dVar2, 54), dVar2, 12582912, 64);
                                if (e.k()) {
                                    e.n();
                                }
                            }
                        }, dVarF, 54));
                        i10 = i11112 + 1;
                        transition2 = transition;
                        rs4Var2 = rs4Var;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl118;
                        size = size;
                        snapshotStateList = snapshotStateList118;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i11 = 0;
                    dVarF.u();
                } else {
                    dVarF.y(1966410449);
                    k58Var.k();
                    size = snapshotStateList.size();
                    i10 = 0;
                    while (i10 < size) {
                        int i11113 = i10;
                        final S t11110 = snapshotStateList.get(i11113);
                        final SnapshotStateList<S> snapshotStateList119 = snapshotStateList;
                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl119 = animatedContentTransitionScopeImpl;
                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var119 = rs4Var2;
                        k58Var.x(t11110, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(d dVar2, int i11114) {
                                if (!dVar2.g((i11114 & 3) != 2, i11114 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (e.k()) {
                                    e.o(-23915175, i11114, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                }
                                Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                Object obj = animatedContentTransitionScopeImpl119;
                                Object objR8 = dVar2.R();
                                d.Companion companion14 = d.INSTANCE;
                                if (objR8 == companion14.a()) {
                                    objR8 = (h02) function8.invoke(obj);
                                    dVar2.L(objR8);
                                }
                                final h02 h02Var = (h02) objR8;
                                boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t11110));
                                Transition<S> transition3 = transition2;
                                S s = t11110;
                                Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                Object obj2 = animatedContentTransitionScopeImpl119;
                                Object objR9 = dVar2.R();
                                if (zA || objR9 == companion14.a()) {
                                    objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                    dVar2.L(objR9);
                                }
                                final f fVar = (f) objR9;
                                S s2 = t11110;
                                Transition<S> transition4 = transition2;
                                Object objR10 = dVar2.R();
                                if (objR10 == companion14.a()) {
                                    objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                    dVar2.L(objR10);
                                }
                                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                d targetContentEnter = h02Var.getTargetContentEnter();
                                b.Companion companion15 = b.INSTANCE;
                                boolean zT = dVar2.T(h02Var);
                                Object objR11 = dVar2.R();
                                if (zT || objR11 == companion14.a()) {
                                    objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                            final o oVarR0 = dj7Var.r0(j);
                                            int width = oVarR0.getWidth();
                                            int height = oVarR0.getHeight();
                                            final h02 h02Var2 = h02Var;
                                            return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((o.a) obj3);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar2) {
                                                    aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                }
                                            }, 4, null);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                        }
                                    };
                                    dVar2.L(objR11);
                                }
                                b bVarA = zn6.a(companion15, (ps4) objR11);
                                aVar.c(Intrinsics.e(t11110, transition2.w()));
                                b bVarThen14 = bVarA.then(aVar);
                                Transition<S> transition5 = transition2;
                                boolean zT2 = dVar2.T(t11110);
                                final S s3 = t11110;
                                Object objR12 = dVar2.R();
                                if (zT2 || objR12 == companion14.a()) {
                                    objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(S s4) {
                                            return Boolean.valueOf(Intrinsics.e(s4, s3));
                                        }
                                    };
                                    dVar2.L(objR12);
                                }
                                Function1 function10 = (Function1) objR12;
                                boolean zX2 = dVar2.x(fVar);
                                Object objR13 = dVar2.R();
                                if (zX2 || objR13 == companion14.a()) {
                                    objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                        }
                                    };
                                    dVar2.L(objR13);
                                }
                                Function2 function11 = (Function2) objR13;
                                final SnapshotStateList<S> snapshotStateList1110 = snapshotStateList119;
                                final S s4 = t11110;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1110 = animatedContentTransitionScopeImpl119;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1110 = rs4Var119;
                                AnimatedVisibilityKt.a(transition5, function10, bVarThen14, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    public final void a(xq xqVar, d dVar3, int i11115) {
                                        if ((i11115 & 6) == 0) {
                                            i11115 |= (i11115 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                        }
                                        if (!dVar3.g((i11115 & 19) != 18, i11115 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-143346359, i11115, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                        }
                                        boolean zX3 = dVar3.x(snapshotStateList1110) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl1110);
                                        final SnapshotStateList<S> snapshotStateList1111 = snapshotStateList1110;
                                        final S s5 = s4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1111 = animatedContentTransitionScopeImpl1110;
                                        Object objR14 = dVar3.R();
                                        if (zX3 || objR14 == d.INSTANCE.a()) {
                                            objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                public static final class a implements jd3 {
                                                    final /* synthetic */ SnapshotStateList a;
                                                    final /* synthetic */ Object b;
                                                    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                    public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                        this.a = snapshotStateList;
                                                        this.b = obj;
                                                        this.c = animatedContentTransitionScopeImpl;
                                                    }

                                                    @Override // com.google.inputmethod.jd3
                                                    public void dispose() {
                                                        this.a.remove(this.b);
                                                        this.c.r().u(this.b);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final jd3 invoke(kd3 kd3Var) {
                                                    return new a(snapshotStateList1111, s5, animatedContentTransitionScopeImpl1111);
                                                }
                                            };
                                            dVar3.L(objR14);
                                        }
                                        vn3.c(xqVar, (Function1) objR14, dVar3, i11115 & 14);
                                        k58 k58VarR = animatedContentTransitionScopeImpl1110.r();
                                        S s6 = s4;
                                        Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                        k58VarR.x(s6, ((yq) xqVar).b());
                                        Object objR15 = dVar3.R();
                                        if (objR15 == d.INSTANCE.a()) {
                                            objR15 = new a(xqVar);
                                            dVar3.L(objR15);
                                        }
                                        rs4Var1110.invoke((a) objR15, s4, dVar3, 0);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                        return Unit.a;
                                    }
                                }, dVar2, 54), dVar2, 12582912, 64);
                                if (e.k()) {
                                    e.n();
                                }
                            }
                        }, dVarF, 54));
                        i10 = i11113 + 1;
                        transition2 = transition;
                        rs4Var2 = rs4Var;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl119;
                        size = size;
                        snapshotStateList = snapshotStateList119;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i11 = 0;
                    dVarF.u();
                }
                zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                objR4 = dVarF.R();
                if (zX) {
                    objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR4);
                } else {
                    objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR4);
                }
                b bVarThen14 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                objR5 = dVarF.R();
                if (objR5 == d.INSTANCE.a()) {
                    objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR5);
                }
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy14 = (AnimatedContentMeasurePolicy) objR5;
                int iHashCode14 = Long.hashCode(pp1.b(dVarF, i11));
                gs1 gs1VarJ14 = dVarF.j();
                b bVarE14 = ComposedModifierKt.e(dVarF, bVarThen14);
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                function0B = companion14.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC14 = dud.c(dVarF);
                dud.i(dVarC14, animatedContentMeasurePolicy14, companion14.d());
                dud.i(dVarC14, gs1VarJ14, companion14.f());
                dud.d(dVarC14, Integer.valueOf(iHashCode14), companion14.c());
                dud.g(dVarC14, companion14.a());
                dud.i(dVarC14, bVarE14, companion14.e());
                dVarF.y(-860173498);
                size2 = snapshotStateList2.size();
                while (i12 < size2) {
                    T t11111 = snapshotStateList2.get(i12);
                    dVarF.V(-2026002954, function4.invoke(t11111));
                    function7 = (Function2) k58Var.e(t11111);
                    if (function7 == null) {
                        dVarF.y(1618454323);
                    } else {
                        dVarF.y(-2026001778);
                        function7.invoke(dVarF, Integer.valueOf(i11));
                    }
                    dVarF.u();
                    dVarF.Z();
                }
                dVarF.u();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                function5 = function3;
            }
            tcVar2 = tcVarO;
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11114) {
                        AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i15 |= 3072;
        tcVarO = tcVar;
        i7 = i2 & 8;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                function4 = function2;
                if (dVarF.T(function4)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i15 |= i8;
            }
            if ((196608 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i15 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((74899 & i15) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i15 & 1)) {
                if (i16 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i3 != 0) {
                    objR7 = dVarF.R();
                    if (objR7 == d.INSTANCE.a()) {
                        objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR7);
                    }
                    function5 = (Function1) objR7;
                } else {
                    function5 = function3;
                }
                if (i5 != 0) {
                    tcVarO = tc.INSTANCE.o();
                }
                if (i7 != 0) {
                    objR6 = dVarF.R();
                    if (objR6 == d.INSTANCE.a()) {
                        objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                            public final S invoke(S s) {
                                return s;
                            }
                        };
                        dVarF.L(objR6);
                    }
                    function4 = (Function1) objR6;
                }
                if (e.k()) {
                    e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
                i9 = i15 & 14;
                if (i9 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = dVarF.R();
                if (z2) {
                    objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                    dVarF.L(objR);
                } else {
                    objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                    dVarF.L(objR);
                }
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
                if (i9 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objR2 = dVarF.R();
                if (z3) {
                    objR2 = p0.g(transition2.p());
                    dVarF.L(objR2);
                } else {
                    objR2 = p0.g(transition2.p());
                    dVarF.L(objR2);
                }
                snapshotStateList = (SnapshotStateList) objR2;
                if (i9 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objR3 = dVarF.R();
                if (z4) {
                    objR3 = k4b.c();
                    dVarF.L(objR3);
                } else {
                    objR3 = k4b.c();
                    dVarF.L(objR3);
                }
                k58Var = (k58) objR3;
                if (!snapshotStateList.contains(transition2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition2.p());
                }
                if (Intrinsics.e(transition2.p(), transition2.w())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(transition2.p());
                    }
                    if (k58Var.get_size() == 1) {
                        k58Var.k();
                    } else {
                        k58Var.k();
                    }
                    animatedContentTransitionScopeImpl.w(tcVarO);
                    animatedContentTransitionScopeImpl.x(layoutDirection);
                }
                if (!Intrinsics.e(transition2.p(), transition2.w())) {
                    it = snapshotStateList.iterator();
                    i13 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i13 = -1;
                            break;
                        } else {
                            if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                                break;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (i13 == -1) {
                        snapshotStateList.add(transition2.w());
                    } else {
                        snapshotStateList.set(i13, transition2.w());
                    }
                }
                if (k58Var.c(transition2.w())) {
                    dVarF.y(1966410449);
                    k58Var.k();
                    size = snapshotStateList.size();
                    i10 = 0;
                    while (i10 < size) {
                        int i11114 = i10;
                        final S t11112 = snapshotStateList.get(i11114);
                        final SnapshotStateList<S> snapshotStateList1110 = snapshotStateList;
                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1110 = animatedContentTransitionScopeImpl;
                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1110 = rs4Var2;
                        k58Var.x(t11112, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(d dVar2, int i11115) {
                                if (!dVar2.g((i11115 & 3) != 2, i11115 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (e.k()) {
                                    e.o(-23915175, i11115, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                }
                                Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                Object obj = animatedContentTransitionScopeImpl1110;
                                Object objR8 = dVar2.R();
                                d.Companion companion15 = d.INSTANCE;
                                if (objR8 == companion15.a()) {
                                    objR8 = (h02) function8.invoke(obj);
                                    dVar2.L(objR8);
                                }
                                final h02 h02Var = (h02) objR8;
                                boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t11112));
                                Transition<S> transition3 = transition2;
                                S s = t11112;
                                Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                Object obj2 = animatedContentTransitionScopeImpl1110;
                                Object objR9 = dVar2.R();
                                if (zA || objR9 == companion15.a()) {
                                    objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                    dVar2.L(objR9);
                                }
                                final f fVar = (f) objR9;
                                S s2 = t11112;
                                Transition<S> transition4 = transition2;
                                Object objR10 = dVar2.R();
                                if (objR10 == companion15.a()) {
                                    objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                    dVar2.L(objR10);
                                }
                                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                d targetContentEnter = h02Var.getTargetContentEnter();
                                b.Companion companion16 = b.INSTANCE;
                                boolean zT = dVar2.T(h02Var);
                                Object objR11 = dVar2.R();
                                if (zT || objR11 == companion15.a()) {
                                    objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                            final o oVarR0 = dj7Var.r0(j);
                                            int width = oVarR0.getWidth();
                                            int height = oVarR0.getHeight();
                                            final h02 h02Var2 = h02Var;
                                            return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((o.a) obj3);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar2) {
                                                    aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                }
                                            }, 4, null);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                        }
                                    };
                                    dVar2.L(objR11);
                                }
                                b bVarA = zn6.a(companion16, (ps4) objR11);
                                aVar.c(Intrinsics.e(t11112, transition2.w()));
                                b bVarThen15 = bVarA.then(aVar);
                                Transition<S> transition5 = transition2;
                                boolean zT2 = dVar2.T(t11112);
                                final S s3 = t11112;
                                Object objR12 = dVar2.R();
                                if (zT2 || objR12 == companion15.a()) {
                                    objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(S s4) {
                                            return Boolean.valueOf(Intrinsics.e(s4, s3));
                                        }
                                    };
                                    dVar2.L(objR12);
                                }
                                Function1 function10 = (Function1) objR12;
                                boolean zX2 = dVar2.x(fVar);
                                Object objR13 = dVar2.R();
                                if (zX2 || objR13 == companion15.a()) {
                                    objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                        }
                                    };
                                    dVar2.L(objR13);
                                }
                                Function2 function11 = (Function2) objR13;
                                final SnapshotStateList<S> snapshotStateList1111 = snapshotStateList1110;
                                final S s4 = t11112;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1111 = animatedContentTransitionScopeImpl1110;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1111 = rs4Var1110;
                                AnimatedVisibilityKt.a(transition5, function10, bVarThen15, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    public final void a(xq xqVar, d dVar3, int i11116) {
                                        if ((i11116 & 6) == 0) {
                                            i11116 |= (i11116 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                        }
                                        if (!dVar3.g((i11116 & 19) != 18, i11116 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-143346359, i11116, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                        }
                                        boolean zX3 = dVar3.x(snapshotStateList1111) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl1111);
                                        final SnapshotStateList<S> snapshotStateList1112 = snapshotStateList1111;
                                        final S s5 = s4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1112 = animatedContentTransitionScopeImpl1111;
                                        Object objR14 = dVar3.R();
                                        if (zX3 || objR14 == d.INSTANCE.a()) {
                                            objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                public static final class a implements jd3 {
                                                    final /* synthetic */ SnapshotStateList a;
                                                    final /* synthetic */ Object b;
                                                    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                    public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                        this.a = snapshotStateList;
                                                        this.b = obj;
                                                        this.c = animatedContentTransitionScopeImpl;
                                                    }

                                                    @Override // com.google.inputmethod.jd3
                                                    public void dispose() {
                                                        this.a.remove(this.b);
                                                        this.c.r().u(this.b);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final jd3 invoke(kd3 kd3Var) {
                                                    return new a(snapshotStateList1112, s5, animatedContentTransitionScopeImpl1112);
                                                }
                                            };
                                            dVar3.L(objR14);
                                        }
                                        vn3.c(xqVar, (Function1) objR14, dVar3, i11116 & 14);
                                        k58 k58VarR = animatedContentTransitionScopeImpl1111.r();
                                        S s6 = s4;
                                        Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                        k58VarR.x(s6, ((yq) xqVar).b());
                                        Object objR15 = dVar3.R();
                                        if (objR15 == d.INSTANCE.a()) {
                                            objR15 = new a(xqVar);
                                            dVar3.L(objR15);
                                        }
                                        rs4Var1111.invoke((a) objR15, s4, dVar3, 0);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                        return Unit.a;
                                    }
                                }, dVar2, 54), dVar2, 12582912, 64);
                                if (e.k()) {
                                    e.n();
                                }
                            }
                        }, dVarF, 54));
                        i10 = i11114 + 1;
                        transition2 = transition;
                        rs4Var2 = rs4Var;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1110;
                        size = size;
                        snapshotStateList = snapshotStateList1110;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i11 = 0;
                    dVarF.u();
                } else {
                    dVarF.y(1966410449);
                    k58Var.k();
                    size = snapshotStateList.size();
                    i10 = 0;
                    while (i10 < size) {
                        int i11115 = i10;
                        final S t11113 = snapshotStateList.get(i11115);
                        final SnapshotStateList<S> snapshotStateList1111 = snapshotStateList;
                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1111 = animatedContentTransitionScopeImpl;
                        final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1111 = rs4Var2;
                        k58Var.x(t11113, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(d dVar2, int i11116) {
                                if (!dVar2.g((i11116 & 3) != 2, i11116 & 1)) {
                                    dVar2.q();
                                    return;
                                }
                                if (e.k()) {
                                    e.o(-23915175, i11116, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                }
                                Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                                Object obj = animatedContentTransitionScopeImpl1111;
                                Object objR8 = dVar2.R();
                                d.Companion companion15 = d.INSTANCE;
                                if (objR8 == companion15.a()) {
                                    objR8 = (h02) function8.invoke(obj);
                                    dVar2.L(objR8);
                                }
                                final h02 h02Var = (h02) objR8;
                                boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t11113));
                                Transition<S> transition3 = transition2;
                                S s = t11113;
                                Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                                Object obj2 = animatedContentTransitionScopeImpl1111;
                                Object objR9 = dVar2.R();
                                if (zA || objR9 == companion15.a()) {
                                    objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                    dVar2.L(objR9);
                                }
                                final f fVar = (f) objR9;
                                S s2 = t11113;
                                Transition<S> transition4 = transition2;
                                Object objR10 = dVar2.R();
                                if (objR10 == companion15.a()) {
                                    objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                    dVar2.L(objR10);
                                }
                                AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                                d targetContentEnter = h02Var.getTargetContentEnter();
                                b.Companion companion16 = b.INSTANCE;
                                boolean zT = dVar2.T(h02Var);
                                Object objR11 = dVar2.R();
                                if (zT || objR11 == companion15.a()) {
                                    objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                            final o oVarR0 = dj7Var.r0(j);
                                            int width = oVarR0.getWidth();
                                            int height = oVarR0.getHeight();
                                            final h02 h02Var2 = h02Var;
                                            return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                    invoke((o.a) obj3);
                                                    return Unit.a;
                                                }

                                                public final void invoke(o.a aVar2) {
                                                    aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                                }
                                            }, 4, null);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                            return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                        }
                                    };
                                    dVar2.L(objR11);
                                }
                                b bVarA = zn6.a(companion16, (ps4) objR11);
                                aVar.c(Intrinsics.e(t11113, transition2.w()));
                                b bVarThen15 = bVarA.then(aVar);
                                Transition<S> transition5 = transition2;
                                boolean zT2 = dVar2.T(t11113);
                                final S s3 = t11113;
                                Object objR12 = dVar2.R();
                                if (zT2 || objR12 == companion15.a()) {
                                    objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(S s4) {
                                            return Boolean.valueOf(Intrinsics.e(s4, s3));
                                        }
                                    };
                                    dVar2.L(objR12);
                                }
                                Function1 function10 = (Function1) objR12;
                                boolean zX2 = dVar2.x(fVar);
                                Object objR13 = dVar2.R();
                                if (zX2 || objR13 == companion15.a()) {
                                    objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                        }
                                    };
                                    dVar2.L(objR13);
                                }
                                Function2 function11 = (Function2) objR13;
                                final SnapshotStateList<S> snapshotStateList1112 = snapshotStateList1111;
                                final S s4 = t11113;
                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1112 = animatedContentTransitionScopeImpl1111;
                                final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1112 = rs4Var1111;
                                AnimatedVisibilityKt.a(transition5, function10, bVarThen15, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    public final void a(xq xqVar, d dVar3, int i11117) {
                                        if ((i11117 & 6) == 0) {
                                            i11117 |= (i11117 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                        }
                                        if (!dVar3.g((i11117 & 19) != 18, i11117 & 1)) {
                                            dVar3.q();
                                            return;
                                        }
                                        if (e.k()) {
                                            e.o(-143346359, i11117, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                        }
                                        boolean zX3 = dVar3.x(snapshotStateList1112) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl1112);
                                        final SnapshotStateList<S> snapshotStateList1113 = snapshotStateList1112;
                                        final S s5 = s4;
                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1113 = animatedContentTransitionScopeImpl1112;
                                        Object objR14 = dVar3.R();
                                        if (zX3 || objR14 == d.INSTANCE.a()) {
                                            objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                                public static final class a implements jd3 {
                                                    final /* synthetic */ SnapshotStateList a;
                                                    final /* synthetic */ Object b;
                                                    final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                    public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                        this.a = snapshotStateList;
                                                        this.b = obj;
                                                        this.c = animatedContentTransitionScopeImpl;
                                                    }

                                                    @Override // com.google.inputmethod.jd3
                                                    public void dispose() {
                                                        this.a.remove(this.b);
                                                        this.c.r().u(this.b);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                public final jd3 invoke(kd3 kd3Var) {
                                                    return new a(snapshotStateList1113, s5, animatedContentTransitionScopeImpl1113);
                                                }
                                            };
                                            dVar3.L(objR14);
                                        }
                                        vn3.c(xqVar, (Function1) objR14, dVar3, i11117 & 14);
                                        k58 k58VarR = animatedContentTransitionScopeImpl1112.r();
                                        S s6 = s4;
                                        Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                        k58VarR.x(s6, ((yq) xqVar).b());
                                        Object objR15 = dVar3.R();
                                        if (objR15 == d.INSTANCE.a()) {
                                            objR15 = new a(xqVar);
                                            dVar3.L(objR15);
                                        }
                                        rs4Var1112.invoke((a) objR15, s4, dVar3, 0);
                                        if (e.k()) {
                                            e.n();
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                        return Unit.a;
                                    }
                                }, dVar2, 54), dVar2, 12582912, 64);
                                if (e.k()) {
                                    e.n();
                                }
                            }
                        }, dVarF, 54));
                        i10 = i11115 + 1;
                        transition2 = transition;
                        rs4Var2 = rs4Var;
                        animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1111;
                        size = size;
                        snapshotStateList = snapshotStateList1111;
                    }
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    snapshotStateList2 = snapshotStateList;
                    i11 = 0;
                    dVarF.u();
                }
                zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
                objR4 = dVarF.R();
                if (zX) {
                    objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR4);
                } else {
                    objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR4);
                }
                b bVarThen15 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
                objR5 = dVarF.R();
                if (objR5 == d.INSTANCE.a()) {
                    objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                    dVarF.L(objR5);
                }
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy15 = (AnimatedContentMeasurePolicy) objR5;
                int iHashCode15 = Long.hashCode(pp1.b(dVarF, i11));
                gs1 gs1VarJ15 = dVarF.j();
                b bVarE15 = ComposedModifierKt.e(dVarF, bVarThen15);
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                function0B = companion15.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                d dVarC15 = dud.c(dVarF);
                dud.i(dVarC15, animatedContentMeasurePolicy15, companion15.d());
                dud.i(dVarC15, gs1VarJ15, companion15.f());
                dud.d(dVarC15, Integer.valueOf(iHashCode15), companion15.c());
                dud.g(dVarC15, companion15.a());
                dud.i(dVarC15, bVarE15, companion15.e());
                dVarF.y(-860173498);
                size2 = snapshotStateList2.size();
                while (i12 < size2) {
                    T t11114 = snapshotStateList2.get(i12);
                    dVarF.V(-2026002954, function4.invoke(t11114));
                    function7 = (Function2) k58Var.e(t11114);
                    if (function7 == null) {
                        dVarF.y(1618454323);
                    } else {
                        dVarF.y(-2026001778);
                        function7.invoke(dVarF, Integer.valueOf(i11));
                    }
                    dVarF.u();
                    dVarF.Z();
                }
                dVarF.u();
                dVarF.m();
                if (e.k()) {
                    e.n();
                }
                bVar3 = bVar4;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                function5 = function3;
            }
            tcVar2 = tcVarO;
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11116) {
                        AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i15 |= 24576;
        function4 = function2;
        if ((196608 & i) == 0) {
            rs4Var2 = rs4Var;
            if (dVarF.T(rs4Var2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i15 |= i14;
        } else {
            rs4Var2 = rs4Var;
        }
        if ((74899 & i15) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i15 & 1)) {
            if (i16 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i3 != 0) {
                objR7 = dVarF.R();
                if (objR7 == d.INSTANCE.a()) {
                    objR7 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                            return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                        }
                    };
                    dVarF.L(objR7);
                }
                function5 = (Function1) objR7;
            } else {
                function5 = function3;
            }
            if (i5 != 0) {
                tcVarO = tc.INSTANCE.o();
            }
            if (i7 != 0) {
                objR6 = dVarF.R();
                if (objR6 == d.INSTANCE.a()) {
                    objR6 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                        public final S invoke(S s) {
                            return s;
                        }
                    };
                    dVarF.L(objR6);
                }
                function4 = (Function1) objR6;
            }
            if (e.k()) {
                e.o(511725103, i15, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
            }
            layoutDirection = (LayoutDirection) dVarF.v(CompositionLocalsKt.m());
            i9 = i15 & 14;
            if (i9 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objR = dVarF.R();
            if (z2) {
                objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                dVarF.L(objR);
            } else {
                objR = new AnimatedContentTransitionScopeImpl(transition2, tcVarO, layoutDirection);
                dVarF.L(objR);
            }
            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) objR;
            if (i9 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            objR2 = dVarF.R();
            if (z3) {
                objR2 = p0.g(transition2.p());
                dVarF.L(objR2);
            } else {
                objR2 = p0.g(transition2.p());
                dVarF.L(objR2);
            }
            snapshotStateList = (SnapshotStateList) objR2;
            if (i9 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            objR3 = dVarF.R();
            if (z4) {
                objR3 = k4b.c();
                dVarF.L(objR3);
            } else {
                objR3 = k4b.c();
                dVarF.L(objR3);
            }
            k58Var = (k58) objR3;
            if (!snapshotStateList.contains(transition2.p())) {
                snapshotStateList.clear();
                snapshotStateList.add(transition2.p());
            }
            if (Intrinsics.e(transition2.p(), transition2.w())) {
                if (snapshotStateList.size() == 1) {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition2.p());
                } else {
                    snapshotStateList.clear();
                    snapshotStateList.add(transition2.p());
                }
                if (k58Var.get_size() == 1) {
                    k58Var.k();
                } else {
                    k58Var.k();
                }
                animatedContentTransitionScopeImpl.w(tcVarO);
                animatedContentTransitionScopeImpl.x(layoutDirection);
            }
            if (!Intrinsics.e(transition2.p(), transition2.w())) {
                it = snapshotStateList.iterator();
                i13 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (Intrinsics.e(function4.invoke(it.next()), function4.invoke(transition2.w()))) {
                            break;
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 == -1) {
                    snapshotStateList.add(transition2.w());
                } else {
                    snapshotStateList.set(i13, transition2.w());
                }
            }
            if (k58Var.c(transition2.w())) {
                dVarF.y(1966410449);
                k58Var.k();
                size = snapshotStateList.size();
                i10 = 0;
                while (i10 < size) {
                    int i11116 = i10;
                    final S t11115 = snapshotStateList.get(i11116);
                    final SnapshotStateList<S> snapshotStateList1112 = snapshotStateList;
                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1112 = animatedContentTransitionScopeImpl;
                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1112 = rs4Var2;
                    k58Var.x(t11115, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(d dVar2, int i11117) {
                            if (!dVar2.g((i11117 & 3) != 2, i11117 & 1)) {
                                dVar2.q();
                                return;
                            }
                            if (e.k()) {
                                e.o(-23915175, i11117, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                            }
                            Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                            Object obj = animatedContentTransitionScopeImpl1112;
                            Object objR8 = dVar2.R();
                            d.Companion companion16 = d.INSTANCE;
                            if (objR8 == companion16.a()) {
                                objR8 = (h02) function8.invoke(obj);
                                dVar2.L(objR8);
                            }
                            final h02 h02Var = (h02) objR8;
                            boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t11115));
                            Transition<S> transition3 = transition2;
                            S s = t11115;
                            Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                            Object obj2 = animatedContentTransitionScopeImpl1112;
                            Object objR9 = dVar2.R();
                            if (zA || objR9 == companion16.a()) {
                                objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                dVar2.L(objR9);
                            }
                            final f fVar = (f) objR9;
                            S s2 = t11115;
                            Transition<S> transition4 = transition2;
                            Object objR10 = dVar2.R();
                            if (objR10 == companion16.a()) {
                                objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                dVar2.L(objR10);
                            }
                            AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                            d targetContentEnter = h02Var.getTargetContentEnter();
                            b.Companion companion17 = b.INSTANCE;
                            boolean zT = dVar2.T(h02Var);
                            Object objR11 = dVar2.R();
                            if (zT || objR11 == companion16.a()) {
                                objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                    {
                                        super(3);
                                    }

                                    public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                        final o oVarR0 = dj7Var.r0(j);
                                        int width = oVarR0.getWidth();
                                        int height = oVarR0.getHeight();
                                        final h02 h02Var2 = h02Var;
                                        return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                invoke((o.a) obj3);
                                                return Unit.a;
                                            }

                                            public final void invoke(o.a aVar2) {
                                                aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                            }
                                        }, 4, null);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                    }
                                };
                                dVar2.L(objR11);
                            }
                            b bVarA = zn6.a(companion17, (ps4) objR11);
                            aVar.c(Intrinsics.e(t11115, transition2.w()));
                            b bVarThen16 = bVarA.then(aVar);
                            Transition<S> transition5 = transition2;
                            boolean zT2 = dVar2.T(t11115);
                            final S s3 = t11115;
                            Object objR12 = dVar2.R();
                            if (zT2 || objR12 == companion16.a()) {
                                objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(S s4) {
                                        return Boolean.valueOf(Intrinsics.e(s4, s3));
                                    }
                                };
                                dVar2.L(objR12);
                            }
                            Function1 function10 = (Function1) objR12;
                            boolean zX2 = dVar2.x(fVar);
                            Object objR13 = dVar2.R();
                            if (zX2 || objR13 == companion16.a()) {
                                objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                        EnterExitState enterExitState3 = EnterExitState.PostExit;
                                        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                    }
                                };
                                dVar2.L(objR13);
                            }
                            Function2 function11 = (Function2) objR13;
                            final SnapshotStateList<S> snapshotStateList1113 = snapshotStateList1112;
                            final S s4 = t11115;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1113 = animatedContentTransitionScopeImpl1112;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1113 = rs4Var1112;
                            AnimatedVisibilityKt.a(transition5, function10, bVarThen16, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                public final void a(xq xqVar, d dVar3, int i11118) {
                                    if ((i11118 & 6) == 0) {
                                        i11118 |= (i11118 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                    }
                                    if (!dVar3.g((i11118 & 19) != 18, i11118 & 1)) {
                                        dVar3.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-143346359, i11118, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                    }
                                    boolean zX3 = dVar3.x(snapshotStateList1113) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl1113);
                                    final SnapshotStateList<S> snapshotStateList1114 = snapshotStateList1113;
                                    final S s5 = s4;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1114 = animatedContentTransitionScopeImpl1113;
                                    Object objR14 = dVar3.R();
                                    if (zX3 || objR14 == d.INSTANCE.a()) {
                                        objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                            public static final class a implements jd3 {
                                                final /* synthetic */ SnapshotStateList a;
                                                final /* synthetic */ Object b;
                                                final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                    this.a = snapshotStateList;
                                                    this.b = obj;
                                                    this.c = animatedContentTransitionScopeImpl;
                                                }

                                                @Override // com.google.inputmethod.jd3
                                                public void dispose() {
                                                    this.a.remove(this.b);
                                                    this.c.r().u(this.b);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final jd3 invoke(kd3 kd3Var) {
                                                return new a(snapshotStateList1114, s5, animatedContentTransitionScopeImpl1114);
                                            }
                                        };
                                        dVar3.L(objR14);
                                    }
                                    vn3.c(xqVar, (Function1) objR14, dVar3, i11118 & 14);
                                    k58 k58VarR = animatedContentTransitionScopeImpl1113.r();
                                    S s6 = s4;
                                    Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                    k58VarR.x(s6, ((yq) xqVar).b());
                                    Object objR15 = dVar3.R();
                                    if (objR15 == d.INSTANCE.a()) {
                                        objR15 = new a(xqVar);
                                        dVar3.L(objR15);
                                    }
                                    rs4Var1113.invoke((a) objR15, s4, dVar3, 0);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                    return Unit.a;
                                }
                            }, dVar2, 54), dVar2, 12582912, 64);
                            if (e.k()) {
                                e.n();
                            }
                        }
                    }, dVarF, 54));
                    i10 = i11116 + 1;
                    transition2 = transition;
                    rs4Var2 = rs4Var;
                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1112;
                    size = size;
                    snapshotStateList = snapshotStateList1112;
                }
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                snapshotStateList2 = snapshotStateList;
                i11 = 0;
                dVarF.u();
            } else {
                dVarF.y(1966410449);
                k58Var.k();
                size = snapshotStateList.size();
                i10 = 0;
                while (i10 < size) {
                    int i11117 = i10;
                    final S t11116 = snapshotStateList.get(i11117);
                    final SnapshotStateList<S> snapshotStateList1113 = snapshotStateList;
                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1113 = animatedContentTransitionScopeImpl;
                    final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1113 = rs4Var2;
                    k58Var.x(t11116, ko1.e(-23915175, true, new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(d dVar2, int i11118) {
                            if (!dVar2.g((i11118 & 3) != 2, i11118 & 1)) {
                                dVar2.q();
                                return;
                            }
                            if (e.k()) {
                                e.o(-23915175, i11118, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                            }
                            Function1<AnimatedContentTransitionScope<S>, h02> function8 = function5;
                            Object obj = animatedContentTransitionScopeImpl1113;
                            Object objR8 = dVar2.R();
                            d.Companion companion16 = d.INSTANCE;
                            if (objR8 == companion16.a()) {
                                objR8 = (h02) function8.invoke(obj);
                                dVar2.L(objR8);
                            }
                            final h02 h02Var = (h02) objR8;
                            boolean zA = dVar2.A(Intrinsics.e(transition2.u().d(), t11116));
                            Transition<S> transition3 = transition2;
                            S s = t11116;
                            Function1<AnimatedContentTransitionScope<S>, h02> function9 = function5;
                            Object obj2 = animatedContentTransitionScopeImpl1113;
                            Object objR9 = dVar2.R();
                            if (zA || objR9 == companion16.a()) {
                                objR9 = Intrinsics.e(transition3.u().d(), s) ? f.INSTANCE.a() : ((h02) function9.invoke(obj2)).getInitialContentExit();
                                dVar2.L(objR9);
                            }
                            final f fVar = (f) objR9;
                            S s2 = t11116;
                            Transition<S> transition4 = transition2;
                            Object objR10 = dVar2.R();
                            if (objR10 == companion16.a()) {
                                objR10 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s2, transition4.w()));
                                dVar2.L(objR10);
                            }
                            AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objR10;
                            d targetContentEnter = h02Var.getTargetContentEnter();
                            b.Companion companion17 = b.INSTANCE;
                            boolean zT = dVar2.T(h02Var);
                            Object objR11 = dVar2.R();
                            if (zT || objR11 == companion16.a()) {
                                objR11 = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                    {
                                        super(3);
                                    }

                                    public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                        final o oVarR0 = dj7Var.r0(j);
                                        int width = oVarR0.getWidth();
                                        int height = oVarR0.getHeight();
                                        final h02 h02Var2 = h02Var;
                                        return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                                                invoke((o.a) obj3);
                                                return Unit.a;
                                            }

                                            public final void invoke(o.a aVar2) {
                                                aVar2.w(oVarR0, 0, 0, h02Var2.d());
                                            }
                                        }, 4, null);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                        return a((j) obj3, (dj7) obj4, ((kx1) obj5).getValue());
                                    }
                                };
                                dVar2.L(objR11);
                            }
                            b bVarA = zn6.a(companion17, (ps4) objR11);
                            aVar.c(Intrinsics.e(t11116, transition2.w()));
                            b bVarThen16 = bVarA.then(aVar);
                            Transition<S> transition5 = transition2;
                            boolean zT2 = dVar2.T(t11116);
                            final S s3 = t11116;
                            Object objR12 = dVar2.R();
                            if (zT2 || objR12 == companion16.a()) {
                                objR12 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(S s4) {
                                        return Boolean.valueOf(Intrinsics.e(s4, s3));
                                    }
                                };
                                dVar2.L(objR12);
                            }
                            Function1 function10 = (Function1) objR12;
                            boolean zX2 = dVar2.x(fVar);
                            Object objR13 = dVar2.R();
                            if (zX2 || objR13 == companion16.a()) {
                                objR13 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                    {
                                        super(2);
                                    }

                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                        EnterExitState enterExitState3 = EnterExitState.PostExit;
                                        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !fVar.getData().getHold());
                                    }
                                };
                                dVar2.L(objR13);
                            }
                            Function2 function11 = (Function2) objR13;
                            final SnapshotStateList<S> snapshotStateList1114 = snapshotStateList1113;
                            final S s4 = t11116;
                            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1114 = animatedContentTransitionScopeImpl1113;
                            final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var1114 = rs4Var1113;
                            AnimatedVisibilityKt.a(transition5, function10, bVarThen16, targetContentEnter, fVar, function11, null, ko1.e(-143346359, true, new ps4<xq, d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                public final void a(xq xqVar, d dVar3, int i11119) {
                                    if ((i11119 & 6) == 0) {
                                        i11119 |= (i11119 & 8) == 0 ? dVar3.x(xqVar) : dVar3.T(xqVar) ? 4 : 2;
                                    }
                                    if (!dVar3.g((i11119 & 19) != 18, i11119 & 1)) {
                                        dVar3.q();
                                        return;
                                    }
                                    if (e.k()) {
                                        e.o(-143346359, i11119, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                    }
                                    boolean zX3 = dVar3.x(snapshotStateList1114) | dVar3.T(s4) | dVar3.T(animatedContentTransitionScopeImpl1114);
                                    final SnapshotStateList<S> snapshotStateList1115 = snapshotStateList1114;
                                    final S s5 = s4;
                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl1115 = animatedContentTransitionScopeImpl1114;
                                    Object objR14 = dVar3.R();
                                    if (zX3 || objR14 == d.INSTANCE.a()) {
                                        objR14 = new Function1<kd3, jd3>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1

                                            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5$1$1$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                                            public static final class a implements jd3 {
                                                final /* synthetic */ SnapshotStateList a;
                                                final /* synthetic */ Object b;
                                                final /* synthetic */ AnimatedContentTransitionScopeImpl c;

                                                public a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                                                    this.a = snapshotStateList;
                                                    this.b = obj;
                                                    this.c = animatedContentTransitionScopeImpl;
                                                }

                                                @Override // com.google.inputmethod.jd3
                                                public void dispose() {
                                                    this.a.remove(this.b);
                                                    this.c.r().u(this.b);
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final jd3 invoke(kd3 kd3Var) {
                                                return new a(snapshotStateList1115, s5, animatedContentTransitionScopeImpl1115);
                                            }
                                        };
                                        dVar3.L(objR14);
                                    }
                                    vn3.c(xqVar, (Function1) objR14, dVar3, i11119 & 14);
                                    k58 k58VarR = animatedContentTransitionScopeImpl1114.r();
                                    S s6 = s4;
                                    Intrinsics.h(xqVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                    k58VarR.x(s6, ((yq) xqVar).b());
                                    Object objR15 = dVar3.R();
                                    if (objR15 == d.INSTANCE.a()) {
                                        objR15 = new a(xqVar);
                                        dVar3.L(objR15);
                                    }
                                    rs4Var1114.invoke((a) objR15, s4, dVar3, 0);
                                    if (e.k()) {
                                        e.n();
                                    }
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a((xq) obj3, (d) obj4, ((Number) obj5).intValue());
                                    return Unit.a;
                                }
                            }, dVar2, 54), dVar2, 12582912, 64);
                            if (e.k()) {
                                e.n();
                            }
                        }
                    }, dVarF, 54));
                    i10 = i11117 + 1;
                    transition2 = transition;
                    rs4Var2 = rs4Var;
                    animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl1113;
                    size = size;
                    snapshotStateList = snapshotStateList1113;
                }
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                snapshotStateList2 = snapshotStateList;
                i11 = 0;
                dVarF.u();
            }
            zX = dVarF.x(transition.u()) | dVarF.x(animatedContentTransitionScopeImpl2);
            objR4 = dVarF.R();
            if (zX) {
                objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                dVarF.L(objR4);
            } else {
                objR4 = (h02) function5.invoke(animatedContentTransitionScopeImpl2);
                dVarF.L(objR4);
            }
            b bVarThen16 = bVar4.then(animatedContentTransitionScopeImpl2.l((h02) objR4, dVarF, i11));
            objR5 = dVarF.R();
            if (objR5 == d.INSTANCE.a()) {
                objR5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                dVarF.L(objR5);
            }
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy16 = (AnimatedContentMeasurePolicy) objR5;
            int iHashCode16 = Long.hashCode(pp1.b(dVarF, i11));
            gs1 gs1VarJ16 = dVarF.j();
            b bVarE16 = ComposedModifierKt.e(dVarF, bVarThen16);
            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
            function0B = companion16.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            d dVarC16 = dud.c(dVarF);
            dud.i(dVarC16, animatedContentMeasurePolicy16, companion16.d());
            dud.i(dVarC16, gs1VarJ16, companion16.f());
            dud.d(dVarC16, Integer.valueOf(iHashCode16), companion16.c());
            dud.g(dVarC16, companion16.a());
            dud.i(dVarC16, bVarE16, companion16.e());
            dVarF.y(-860173498);
            size2 = snapshotStateList2.size();
            while (i12 < size2) {
                T t11117 = snapshotStateList2.get(i12);
                dVarF.V(-2026002954, function4.invoke(t11117));
                function7 = (Function2) k58Var.e(t11117);
                if (function7 == null) {
                    dVarF.y(1618454323);
                } else {
                    dVarF.y(-2026001778);
                    function7.invoke(dVarF, Integer.valueOf(i11));
                }
                dVarF.u();
                dVarF.Z();
            }
            dVarF.u();
            dVarF.m();
            if (e.k()) {
                e.n();
            }
            bVar3 = bVar4;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            function5 = function3;
        }
        tcVar2 = tcVarO;
        function6 = function4;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i11118) {
                    AnimatedContentKt.a(transition, bVar3, function5, tcVar2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:113:0x017a  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    public static final <S> void b(final S s, b bVar, Function1<? super AnimatedContentTransitionScope<S>, h02> function1, tc tcVar, String str, Function1<? super S, ? extends Object> function2, final rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var, d dVar, final int i, final int i2) {
        int i3;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, h02> function3;
        int i5;
        int i6;
        tc tcVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        Function1<? super S, ? extends Object> function4;
        int i11;
        rs4<? super sq, ? super S, ? super d, ? super Integer, Unit> rs4Var2;
        boolean z;
        final b bVar2;
        final String str2;
        final Function1<? super AnimatedContentTransitionScope<S>, h02> function5;
        final tc tcVar3;
        final Function1<? super S, ? extends Object> function6;
        s6b s6bVarH;
        int i12;
        b bVar3;
        Function1<? super AnimatedContentTransitionScope<S>, h02> function7;
        int i13;
        tc tcVarO;
        String str3;
        Object objR;
        Object objR2;
        int i14;
        d dVarF = dVar.F(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? dVarF.x(s) : dVarF.T(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                i3 |= dVarF.x(bVar) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function3 = function1;
                    if (dVarF.T(function3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        tcVar2 = tcVar;
                        if (dVarF.x(tcVar2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            if (dVarF.x(str)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            if ((196608 & i) == 0) {
                                function4 = function2;
                                if (dVarF.T(function4)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                            if ((1572864 & i) == 0) {
                                rs4Var2 = rs4Var;
                                if (dVarF.T(rs4Var2)) {
                                    i14 = 1048576;
                                } else {
                                    i14 = 524288;
                                }
                                i3 |= i14;
                            } else {
                                rs4Var2 = rs4Var;
                            }
                            if ((i3 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (dVarF.g(z, i3 & 1)) {
                                if (i15 != 0) {
                                    bVar3 = b.INSTANCE;
                                    i12 = i8;
                                } else {
                                    i12 = i8;
                                    bVar3 = bVar;
                                }
                                if (i4 != 0) {
                                    objR2 = dVarF.R();
                                    if (objR2 == d.INSTANCE.a()) {
                                        objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                            }
                                        };
                                        dVarF.L(objR2);
                                    }
                                    function7 = (Function1) objR2;
                                } else {
                                    function7 = function3;
                                }
                                if (i6 != 0) {
                                    tcVarO = tc.INSTANCE.o();
                                    i13 = i10;
                                } else {
                                    i13 = i10;
                                    tcVarO = tcVar2;
                                }
                                if (i12 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i13 != 0) {
                                    objR = dVarF.R();
                                    if (objR == d.INSTANCE.a()) {
                                        objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                            public final S invoke(S s2) {
                                                return s2;
                                            }
                                        };
                                        dVarF.L(objR);
                                    }
                                    function4 = (Function1) objR;
                                }
                                if (e.k()) {
                                    e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                Transition transitionY = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                                int i16 = i3 & 8176;
                                int i17 = i3 >> 3;
                                a(transitionY, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i16 | (57344 & i17) | (i17 & 458752), 0);
                                if (e.k()) {
                                    e.n();
                                }
                                str2 = str3;
                                bVar2 = bVar3;
                                function5 = function7;
                                tcVar3 = tcVarO;
                            } else {
                                dVarF.q();
                                bVar2 = bVar;
                                str2 = str;
                                function5 = function3;
                                tcVar3 = tcVar2;
                            }
                            function6 = function4;
                            s6bVarH = dVarF.H();
                            if (s6bVarH != null) {
                                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((d) obj, ((Number) obj2).intValue());
                                        return Unit.a;
                                    }

                                    public final void invoke(d dVar2, int i18) {
                                        AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                                    }
                                });
                            }
                        }
                        i3 |= 196608;
                        function4 = function2;
                        if ((1572864 & i) == 0) {
                            rs4Var2 = rs4Var;
                            if (dVarF.T(rs4Var2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i3 |= i14;
                        } else {
                            rs4Var2 = rs4Var;
                        }
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i15 != 0) {
                                bVar3 = b.INSTANCE;
                                i12 = i8;
                            } else {
                                i12 = i8;
                                bVar3 = bVar;
                            }
                            if (i4 != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == d.INSTANCE.a()) {
                                    objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                    dVarF.L(objR2);
                                }
                                function7 = (Function1) objR2;
                            } else {
                                function7 = function3;
                            }
                            if (i6 != 0) {
                                tcVarO = tc.INSTANCE.o();
                                i13 = i10;
                            } else {
                                i13 = i10;
                                tcVarO = tcVar2;
                            }
                            if (i12 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i13 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                        public final S invoke(S s2) {
                                            return s2;
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            }
                            if (e.k()) {
                                e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            Transition transitionY2 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i18 = i3 & 8176;
                            int i19 = i3 >> 3;
                            a(transitionY2, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i18 | (57344 & i19) | (i19 & 458752), 0);
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar2 = bVar3;
                            function5 = function7;
                            tcVar3 = tcVarO;
                        } else {
                            dVarF.q();
                            bVar2 = bVar;
                            str2 = str;
                            function5 = function3;
                            tcVar3 = tcVar2;
                        }
                        function6 = function4;
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar2, int i110) {
                                    AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            function4 = function2;
                            if (dVarF.T(function4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            rs4Var2 = rs4Var;
                            if (dVarF.T(rs4Var2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i3 |= i14;
                        } else {
                            rs4Var2 = rs4Var;
                        }
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i15 != 0) {
                                bVar3 = b.INSTANCE;
                                i12 = i8;
                            } else {
                                i12 = i8;
                                bVar3 = bVar;
                            }
                            if (i4 != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == d.INSTANCE.a()) {
                                    objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                    dVarF.L(objR2);
                                }
                                function7 = (Function1) objR2;
                            } else {
                                function7 = function3;
                            }
                            if (i6 != 0) {
                                tcVarO = tc.INSTANCE.o();
                                i13 = i10;
                            } else {
                                i13 = i10;
                                tcVarO = tcVar2;
                            }
                            if (i12 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i13 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                        public final S invoke(S s2) {
                                            return s2;
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            }
                            if (e.k()) {
                                e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            Transition transitionY3 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i110 = i3 & 8176;
                            int i111 = i3 >> 3;
                            a(transitionY3, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i110 | (57344 & i111) | (i111 & 458752), 0);
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar2 = bVar3;
                            function5 = function7;
                            tcVar3 = tcVarO;
                        } else {
                            dVarF.q();
                            bVar2 = bVar;
                            str2 = str;
                            function5 = function3;
                            tcVar3 = tcVar2;
                        }
                        function6 = function4;
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar2, int i112) {
                                    AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    function4 = function2;
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY4 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i112 = i3 & 8176;
                        int i113 = i3 >> 3;
                        a(transitionY4, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i112 | (57344 & i113) | (i113 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i114) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                tcVar2 = tcVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            function4 = function2;
                            if (dVarF.T(function4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            rs4Var2 = rs4Var;
                            if (dVarF.T(rs4Var2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i3 |= i14;
                        } else {
                            rs4Var2 = rs4Var;
                        }
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i15 != 0) {
                                bVar3 = b.INSTANCE;
                                i12 = i8;
                            } else {
                                i12 = i8;
                                bVar3 = bVar;
                            }
                            if (i4 != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == d.INSTANCE.a()) {
                                    objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                    dVarF.L(objR2);
                                }
                                function7 = (Function1) objR2;
                            } else {
                                function7 = function3;
                            }
                            if (i6 != 0) {
                                tcVarO = tc.INSTANCE.o();
                                i13 = i10;
                            } else {
                                i13 = i10;
                                tcVarO = tcVar2;
                            }
                            if (i12 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i13 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                        public final S invoke(S s2) {
                                            return s2;
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            }
                            if (e.k()) {
                                e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            Transition transitionY5 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i114 = i3 & 8176;
                            int i115 = i3 >> 3;
                            a(transitionY5, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i114 | (57344 & i115) | (i115 & 458752), 0);
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar2 = bVar3;
                            function5 = function7;
                            tcVar3 = tcVarO;
                        } else {
                            dVarF.q();
                            bVar2 = bVar;
                            str2 = str;
                            function5 = function3;
                            tcVar3 = tcVar2;
                        }
                        function6 = function4;
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar2, int i116) {
                                    AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    function4 = function2;
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY6 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i116 = i3 & 8176;
                        int i117 = i3 >> 3;
                        a(transitionY6, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i116 | (57344 & i117) | (i117 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i118) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY7 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i118 = i3 & 8176;
                        int i119 = i3 >> 3;
                        a(transitionY7, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i118 | (57344 & i119) | (i119 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i1110) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                function4 = function2;
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY8 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i1110 = i3 & 8176;
                    int i1111 = i3 >> 3;
                    a(transitionY8, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1110 | (57344 & i1111) | (i1111 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i1112) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            function3 = function1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    tcVar2 = tcVar;
                    if (dVarF.x(tcVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            function4 = function2;
                            if (dVarF.T(function4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            rs4Var2 = rs4Var;
                            if (dVarF.T(rs4Var2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i3 |= i14;
                        } else {
                            rs4Var2 = rs4Var;
                        }
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i15 != 0) {
                                bVar3 = b.INSTANCE;
                                i12 = i8;
                            } else {
                                i12 = i8;
                                bVar3 = bVar;
                            }
                            if (i4 != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == d.INSTANCE.a()) {
                                    objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                    dVarF.L(objR2);
                                }
                                function7 = (Function1) objR2;
                            } else {
                                function7 = function3;
                            }
                            if (i6 != 0) {
                                tcVarO = tc.INSTANCE.o();
                                i13 = i10;
                            } else {
                                i13 = i10;
                                tcVarO = tcVar2;
                            }
                            if (i12 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i13 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                        public final S invoke(S s2) {
                                            return s2;
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            }
                            if (e.k()) {
                                e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            Transition transitionY9 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i1112 = i3 & 8176;
                            int i1113 = i3 >> 3;
                            a(transitionY9, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1112 | (57344 & i1113) | (i1113 & 458752), 0);
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar2 = bVar3;
                            function5 = function7;
                            tcVar3 = tcVarO;
                        } else {
                            dVarF.q();
                            bVar2 = bVar;
                            str2 = str;
                            function5 = function3;
                            tcVar3 = tcVar2;
                        }
                        function6 = function4;
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar2, int i1114) {
                                    AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    function4 = function2;
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY10 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i1114 = i3 & 8176;
                        int i1115 = i3 >> 3;
                        a(transitionY10, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1114 | (57344 & i1115) | (i1115 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i1116) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY11 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i1116 = i3 & 8176;
                        int i1117 = i3 >> 3;
                        a(transitionY11, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1116 | (57344 & i1117) | (i1117 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i1118) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                function4 = function2;
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY12 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i1118 = i3 & 8176;
                    int i1119 = i3 >> 3;
                    a(transitionY12, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1118 | (57344 & i1119) | (i1119 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11110) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            tcVar2 = tcVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY13 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i11110 = i3 & 8176;
                        int i11111 = i3 >> 3;
                        a(transitionY13, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11110 | (57344 & i11111) | (i11111 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i11112) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                function4 = function2;
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY14 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i11112 = i3 & 8176;
                    int i11113 = i3 >> 3;
                    a(transitionY14, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11112 | (57344 & i11113) | (i11113 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11114) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY15 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i11114 = i3 & 8176;
                    int i11115 = i3 >> 3;
                    a(transitionY15, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11114 | (57344 & i11115) | (i11115 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11116) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            function4 = function2;
            if ((1572864 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i3 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i15 != 0) {
                    bVar3 = b.INSTANCE;
                    i12 = i8;
                } else {
                    i12 = i8;
                    bVar3 = bVar;
                }
                if (i4 != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function7 = (Function1) objR2;
                } else {
                    function7 = function3;
                }
                if (i6 != 0) {
                    tcVarO = tc.INSTANCE.o();
                    i13 = i10;
                } else {
                    i13 = i10;
                    tcVarO = tcVar2;
                }
                if (i12 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i13 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                            public final S invoke(S s2) {
                                return s2;
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                }
                if (e.k()) {
                    e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                Transition transitionY16 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i11116 = i3 & 8176;
                int i11117 = i3 >> 3;
                a(transitionY16, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11116 | (57344 & i11117) | (i11117 & 458752), 0);
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar2 = bVar3;
                function5 = function7;
                tcVar3 = tcVarO;
            } else {
                dVarF.q();
                bVar2 = bVar;
                str2 = str;
                function5 = function3;
                tcVar3 = tcVar2;
            }
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11118) {
                        AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function3 = function1;
                if (dVarF.T(function3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    tcVar2 = tcVar;
                    if (dVarF.x(tcVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            function4 = function2;
                            if (dVarF.T(function4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            rs4Var2 = rs4Var;
                            if (dVarF.T(rs4Var2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i3 |= i14;
                        } else {
                            rs4Var2 = rs4Var;
                        }
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i15 != 0) {
                                bVar3 = b.INSTANCE;
                                i12 = i8;
                            } else {
                                i12 = i8;
                                bVar3 = bVar;
                            }
                            if (i4 != 0) {
                                objR2 = dVarF.R();
                                if (objR2 == d.INSTANCE.a()) {
                                    objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                    dVarF.L(objR2);
                                }
                                function7 = (Function1) objR2;
                            } else {
                                function7 = function3;
                            }
                            if (i6 != 0) {
                                tcVarO = tc.INSTANCE.o();
                                i13 = i10;
                            } else {
                                i13 = i10;
                                tcVarO = tcVar2;
                            }
                            if (i12 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i13 != 0) {
                                objR = dVarF.R();
                                if (objR == d.INSTANCE.a()) {
                                    objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                        public final S invoke(S s2) {
                                            return s2;
                                        }
                                    };
                                    dVarF.L(objR);
                                }
                                function4 = (Function1) objR;
                            }
                            if (e.k()) {
                                e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            Transition transitionY17 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i11118 = i3 & 8176;
                            int i11119 = i3 >> 3;
                            a(transitionY17, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11118 | (57344 & i11119) | (i11119 & 458752), 0);
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar2 = bVar3;
                            function5 = function7;
                            tcVar3 = tcVarO;
                        } else {
                            dVarF.q();
                            bVar2 = bVar;
                            str2 = str;
                            function5 = function3;
                            tcVar3 = tcVar2;
                        }
                        function6 = function4;
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar2, int i111110) {
                                    AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    function4 = function2;
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY18 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i111110 = i3 & 8176;
                        int i111111 = i3 >> 3;
                        a(transitionY18, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i111110 | (57344 & i111111) | (i111111 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i111112) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY19 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i111112 = i3 & 8176;
                        int i111113 = i3 >> 3;
                        a(transitionY19, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i111112 | (57344 & i111113) | (i111113 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i111114) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                function4 = function2;
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY110 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i111114 = i3 & 8176;
                    int i111115 = i3 >> 3;
                    a(transitionY110, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i111114 | (57344 & i111115) | (i111115 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i111116) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            tcVar2 = tcVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY111 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i111116 = i3 & 8176;
                        int i111117 = i3 >> 3;
                        a(transitionY111, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i111116 | (57344 & i111117) | (i111117 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i111118) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                function4 = function2;
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY112 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i111118 = i3 & 8176;
                    int i111119 = i3 >> 3;
                    a(transitionY112, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i111118 | (57344 & i111119) | (i111119 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i1111110) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY113 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i1111110 = i3 & 8176;
                    int i1111111 = i3 >> 3;
                    a(transitionY113, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1111110 | (57344 & i1111111) | (i1111111 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i1111112) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            function4 = function2;
            if ((1572864 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i3 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i15 != 0) {
                    bVar3 = b.INSTANCE;
                    i12 = i8;
                } else {
                    i12 = i8;
                    bVar3 = bVar;
                }
                if (i4 != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function7 = (Function1) objR2;
                } else {
                    function7 = function3;
                }
                if (i6 != 0) {
                    tcVarO = tc.INSTANCE.o();
                    i13 = i10;
                } else {
                    i13 = i10;
                    tcVarO = tcVar2;
                }
                if (i12 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i13 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                            public final S invoke(S s2) {
                                return s2;
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                }
                if (e.k()) {
                    e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                Transition transitionY114 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i1111112 = i3 & 8176;
                int i1111113 = i3 >> 3;
                a(transitionY114, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1111112 | (57344 & i1111113) | (i1111113 & 458752), 0);
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar2 = bVar3;
                function5 = function7;
                tcVar3 = tcVarO;
            } else {
                dVarF.q();
                bVar2 = bVar;
                str2 = str;
                function5 = function3;
                tcVar3 = tcVar2;
            }
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i1111114) {
                        AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        function3 = function1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                tcVar2 = tcVar;
                if (dVarF.x(tcVar2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        function4 = function2;
                        if (dVarF.T(function4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        rs4Var2 = rs4Var;
                        if (dVarF.T(rs4Var2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i3 |= i14;
                    } else {
                        rs4Var2 = rs4Var;
                    }
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i15 != 0) {
                            bVar3 = b.INSTANCE;
                            i12 = i8;
                        } else {
                            i12 = i8;
                            bVar3 = bVar;
                        }
                        if (i4 != 0) {
                            objR2 = dVarF.R();
                            if (objR2 == d.INSTANCE.a()) {
                                objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                                dVarF.L(objR2);
                            }
                            function7 = (Function1) objR2;
                        } else {
                            function7 = function3;
                        }
                        if (i6 != 0) {
                            tcVarO = tc.INSTANCE.o();
                            i13 = i10;
                        } else {
                            i13 = i10;
                            tcVarO = tcVar2;
                        }
                        if (i12 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i13 != 0) {
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                    public final S invoke(S s2) {
                                        return s2;
                                    }
                                };
                                dVarF.L(objR);
                            }
                            function4 = (Function1) objR;
                        }
                        if (e.k()) {
                            e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        Transition transitionY115 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i1111114 = i3 & 8176;
                        int i1111115 = i3 >> 3;
                        a(transitionY115, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1111114 | (57344 & i1111115) | (i1111115 & 458752), 0);
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar2 = bVar3;
                        function5 = function7;
                        tcVar3 = tcVarO;
                    } else {
                        dVarF.q();
                        bVar2 = bVar;
                        str2 = str;
                        function5 = function3;
                        tcVar3 = tcVar2;
                    }
                    function6 = function4;
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar2, int i1111116) {
                                AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                function4 = function2;
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY116 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i1111116 = i3 & 8176;
                    int i1111117 = i3 >> 3;
                    a(transitionY116, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1111116 | (57344 & i1111117) | (i1111117 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i1111118) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY117 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i1111118 = i3 & 8176;
                    int i1111119 = i3 >> 3;
                    a(transitionY117, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i1111118 | (57344 & i1111119) | (i1111119 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11111110) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            function4 = function2;
            if ((1572864 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i3 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i15 != 0) {
                    bVar3 = b.INSTANCE;
                    i12 = i8;
                } else {
                    i12 = i8;
                    bVar3 = bVar;
                }
                if (i4 != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function7 = (Function1) objR2;
                } else {
                    function7 = function3;
                }
                if (i6 != 0) {
                    tcVarO = tc.INSTANCE.o();
                    i13 = i10;
                } else {
                    i13 = i10;
                    tcVarO = tcVar2;
                }
                if (i12 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i13 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                            public final S invoke(S s2) {
                                return s2;
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                }
                if (e.k()) {
                    e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                Transition transitionY118 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i11111110 = i3 & 8176;
                int i11111111 = i3 >> 3;
                a(transitionY118, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11111110 | (57344 & i11111111) | (i11111111 & 458752), 0);
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar2 = bVar3;
                function5 = function7;
                tcVar3 = tcVarO;
            } else {
                dVarF.q();
                bVar2 = bVar;
                str2 = str;
                function5 = function3;
                tcVar3 = tcVar2;
            }
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11111112) {
                        AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        tcVar2 = tcVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                if (dVarF.x(str)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    function4 = function2;
                    if (dVarF.T(function4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    rs4Var2 = rs4Var;
                    if (dVarF.T(rs4Var2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i3 |= i14;
                } else {
                    rs4Var2 = rs4Var;
                }
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i15 != 0) {
                        bVar3 = b.INSTANCE;
                        i12 = i8;
                    } else {
                        i12 = i8;
                        bVar3 = bVar;
                    }
                    if (i4 != 0) {
                        objR2 = dVarF.R();
                        if (objR2 == d.INSTANCE.a()) {
                            objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                    return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                                }
                            };
                            dVarF.L(objR2);
                        }
                        function7 = (Function1) objR2;
                    } else {
                        function7 = function3;
                    }
                    if (i6 != 0) {
                        tcVarO = tc.INSTANCE.o();
                        i13 = i10;
                    } else {
                        i13 = i10;
                        tcVarO = tcVar2;
                    }
                    if (i12 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i13 != 0) {
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            };
                            dVarF.L(objR);
                        }
                        function4 = (Function1) objR;
                    }
                    if (e.k()) {
                        e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    Transition transitionY119 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i11111112 = i3 & 8176;
                    int i11111113 = i3 >> 3;
                    a(transitionY119, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11111112 | (57344 & i11111113) | (i11111113 & 458752), 0);
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar2 = bVar3;
                    function5 = function7;
                    tcVar3 = tcVarO;
                } else {
                    dVarF.q();
                    bVar2 = bVar;
                    str2 = str;
                    function5 = function3;
                    tcVar3 = tcVar2;
                }
                function6 = function4;
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar2, int i11111114) {
                            AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            function4 = function2;
            if ((1572864 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i3 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i15 != 0) {
                    bVar3 = b.INSTANCE;
                    i12 = i8;
                } else {
                    i12 = i8;
                    bVar3 = bVar;
                }
                if (i4 != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function7 = (Function1) objR2;
                } else {
                    function7 = function3;
                }
                if (i6 != 0) {
                    tcVarO = tc.INSTANCE.o();
                    i13 = i10;
                } else {
                    i13 = i10;
                    tcVarO = tcVar2;
                }
                if (i12 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i13 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                            public final S invoke(S s2) {
                                return s2;
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                }
                if (e.k()) {
                    e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                Transition transitionY1110 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i11111114 = i3 & 8176;
                int i11111115 = i3 >> 3;
                a(transitionY1110, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11111114 | (57344 & i11111115) | (i11111115 & 458752), 0);
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar2 = bVar3;
                function5 = function7;
                tcVar3 = tcVarO;
            } else {
                dVarF.q();
                bVar2 = bVar;
                str2 = str;
                function5 = function3;
                tcVar3 = tcVar2;
            }
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11111116) {
                        AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        i10 = i2 & 32;
        if (i10 != 0) {
            if ((196608 & i) == 0) {
                function4 = function2;
                if (dVarF.T(function4)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((1572864 & i) == 0) {
                rs4Var2 = rs4Var;
                if (dVarF.T(rs4Var2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i3 |= i14;
            } else {
                rs4Var2 = rs4Var;
            }
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i15 != 0) {
                    bVar3 = b.INSTANCE;
                    i12 = i8;
                } else {
                    i12 = i8;
                    bVar3 = bVar;
                }
                if (i4 != 0) {
                    objR2 = dVarF.R();
                    if (objR2 == d.INSTANCE.a()) {
                        objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        };
                        dVarF.L(objR2);
                    }
                    function7 = (Function1) objR2;
                } else {
                    function7 = function3;
                }
                if (i6 != 0) {
                    tcVarO = tc.INSTANCE.o();
                    i13 = i10;
                } else {
                    i13 = i10;
                    tcVarO = tcVar2;
                }
                if (i12 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i13 != 0) {
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                            public final S invoke(S s2) {
                                return s2;
                            }
                        };
                        dVarF.L(objR);
                    }
                    function4 = (Function1) objR;
                }
                if (e.k()) {
                    e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                Transition transitionY1111 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i11111116 = i3 & 8176;
                int i11111117 = i3 >> 3;
                a(transitionY1111, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11111116 | (57344 & i11111117) | (i11111117 & 458752), 0);
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar2 = bVar3;
                function5 = function7;
                tcVar3 = tcVarO;
            } else {
                dVarF.q();
                bVar2 = bVar;
                str2 = str;
                function5 = function3;
                tcVar3 = tcVar2;
            }
            function6 = function4;
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar2, int i11111118) {
                        AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 196608;
        function4 = function2;
        if ((1572864 & i) == 0) {
            rs4Var2 = rs4Var;
            if (dVarF.T(rs4Var2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i3 |= i14;
        } else {
            rs4Var2 = rs4Var;
        }
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i15 != 0) {
                bVar3 = b.INSTANCE;
                i12 = i8;
            } else {
                i12 = i8;
                bVar3 = bVar;
            }
            if (i4 != 0) {
                objR2 = dVarF.R();
                if (objR2 == d.INSTANCE.a()) {
                    objR2 = new Function1<AnimatedContentTransitionScope<S>, h02>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final h02 invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                            return AnimatedContentKt.f(EnterExitTransitionKt.o(lr.l(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.s(lr.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.q(lr.l(90, 0, null, 6, null), 0.0f, 2, null));
                        }
                    };
                    dVarF.L(objR2);
                }
                function7 = (Function1) objR2;
            } else {
                function7 = function3;
            }
            if (i6 != 0) {
                tcVarO = tc.INSTANCE.o();
                i13 = i10;
            } else {
                i13 = i10;
                tcVarO = tcVar2;
            }
            if (i12 != 0) {
                str3 = "AnimatedContent";
            } else {
                str3 = str;
            }
            if (i13 != 0) {
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                        public final S invoke(S s2) {
                            return s2;
                        }
                    };
                    dVarF.L(objR);
                }
                function4 = (Function1) objR;
            }
            if (e.k()) {
                e.o(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
            }
            Transition transitionY1112 = TransitionKt.y(s, str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
            int i11111118 = i3 & 8176;
            int i11111119 = i3 >> 3;
            a(transitionY1112, bVar3, function7, tcVarO, function4, rs4Var2, dVarF, i11111118 | (57344 & i11111119) | (i11111119 & 458752), 0);
            if (e.k()) {
                e.n();
            }
            str2 = str3;
            bVar2 = bVar3;
            function5 = function7;
            tcVar3 = tcVarO;
        } else {
            dVarF.q();
            bVar2 = bVar;
            str2 = str;
            function5 = function3;
            tcVar3 = tcVar2;
        }
        function6 = function4;
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i111111110) {
                    AnimatedContentKt.b(s, bVar2, function5, tcVar3, str2, function6, rs4Var, dVar2, saa.a(i | 1), i2);
                }
            });
        }
    }

    public static final jtb c(boolean z, Function2<? super q16, ? super q16, ? extends xa4<q16>> function2) {
        return new i(z, function2);
    }

    public static /* synthetic */ jtb d(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new Function2<q16, q16, w2c<q16>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                public final w2c<q16> a(long j, long j2) {
                    return lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return a(((q16) obj2).getPackedValue(), ((q16) obj3).getPackedValue());
                }
            };
        }
        return c(z, function2);
    }

    public static final h02 f(d dVar, f fVar) {
        return new h02(dVar, fVar, 0.0f, null, 12, null);
    }
}
