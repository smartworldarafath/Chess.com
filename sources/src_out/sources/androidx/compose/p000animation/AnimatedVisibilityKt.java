package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.ps4;
import com.google.inputmethod.br8;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.fj7;
import com.google.inputmethod.gs1;
import com.google.inputmethod.hra;
import com.google.inputmethod.kx1;
import com.google.inputmethod.o58;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.xj1;
import com.google.inputmethod.xq;
import com.google.inputmethod.yq;
import com.google.inputmethod.zn6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aS\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0011\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u0014\u001a\u00020\f*\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aY\u0010\u0018\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a]\u0010\u001a\u001a\u00020\f*\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a]\u0010\u001c\u001a\u00020\f*\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ac\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0089\u0001\u0010(\u001a\u00020\f\"\u0004\b\u0000\u0010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00000#2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b(\u0010)\u001a;\u0010+\u001a\u00020$\"\u0004\b\u0000\u0010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010*\u001a\u00028\u0000H\u0003¢\u0006\u0004\b+\u0010,\"\u001e\u0010/\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020$0\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062²\u0006\u001e\u00100\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00000#8\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "visible", "Landroidx/compose/ui/b;", "modifier", "Landroidx/compose/animation/d;", "enter", "Landroidx/compose/animation/f;", "exit", "", "label", "Lkotlin/Function1;", "Lcom/google/android/xq;", "", "content", "i", "(ZLandroidx/compose/ui/b;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Ljava/lang/String;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/hra;", "h", "(Lcom/google/android/hra;ZLandroidx/compose/ui/b;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Ljava/lang/String;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Lcom/google/android/xj1;", "f", "(Lcom/google/android/xj1;ZLandroidx/compose/ui/b;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Ljava/lang/String;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "Landroidx/compose/animation/core/e;", "visibleState", "d", "(Landroidx/compose/animation/core/e;Landroidx/compose/ui/b;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Ljava/lang/String;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "g", "(Lcom/google/android/hra;Landroidx/compose/animation/core/e;Landroidx/compose/ui/b;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Ljava/lang/String;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "e", "(Lcom/google/android/xj1;Landroidx/compose/animation/core/e;Landroidx/compose/ui/b;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Ljava/lang/String;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "T", "Landroidx/compose/animation/core/Transition;", "transition", "j", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Lcom/google/android/ps4;Landroidx/compose/runtime/d;I)V", "Lkotlin/Function2;", "Landroidx/compose/animation/EnterExitState;", "shouldDisposeBlock", "Lcom/google/android/br8;", "onLookaheadMeasured", "a", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/b;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Lkotlin/jvm/functions/Function2;Lcom/google/android/br8;Lcom/google/android/ps4;Landroidx/compose/runtime/d;II)V", "targetState", "n", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/d;I)Landroidx/compose/animation/EnterExitState;", "m", "(Landroidx/compose/animation/core/Transition;)Z", "exitFinished", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnimatedVisibilityKt {
    public static final <T> void a(final Transition<T> transition, final Function1<? super T, Boolean> function1, final b bVar, final d dVar, final f fVar, final Function2<? super EnterExitState, ? super EnterExitState, Boolean> function2, br8 br8Var, final ps4<? super xq, ? super d, ? super Integer, Unit> ps4Var, d dVar2, final int i, final int i2) {
        int i3;
        d dVar3;
        final br8 br8Var2;
        b bVarA;
        br8 br8Var3 = br8Var;
        d dVarF = dVar2.F(1912839215);
        if ((i & 6) == 0) {
            i3 = (dVarF.x(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dVarF.T(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dVarF.x(bVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= dVarF.x(dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dVarF.x(fVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= dVarF.T(function2) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        int i5 = 1572864;
        if (i4 != 0) {
            i3 |= i5;
        } else if ((1572864 & i) == 0) {
            i5 = (i & 2097152) == 0 ? dVarF.x(br8Var3) : dVarF.T(br8Var3) ? 1048576 : 524288;
            i3 |= i5;
        }
        if ((12582912 & i) == 0) {
            i3 |= dVarF.T(ps4Var) ? 8388608 : 4194304;
        }
        int i6 = i3;
        boolean z = true;
        if (dVarF.g((4793491 & i6) != 4793490, i6 & 1)) {
            if (i4 != 0) {
                br8Var3 = null;
            }
            if (e.k()) {
                e.o(1912839215, i6, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:716)");
            }
            if (((Boolean) function1.invoke(transition.w())).booleanValue() || ((Boolean) function1.invoke(transition.p())).booleanValue() || transition.B() || transition.q()) {
                dVarF.y(-232386135);
                int i7 = i6 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                boolean z2 = ((i9 ^ 6) > 4 && dVarF.x(transition)) || (i8 & 6) == 4;
                Object objR = dVarF.R();
                if (z2 || objR == d.INSTANCE.a()) {
                    objR = transition.p();
                    dVarF.L(objR);
                }
                if (transition.B()) {
                    objR = transition.p();
                }
                dVarF.y(1844425648);
                br8 br8Var4 = br8Var3;
                if (e.k()) {
                    e.o(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:725)");
                }
                int i10 = i6 & 126;
                EnterExitState enterExitStateN = n(transition, function1, objR, dVarF, i10);
                if (e.k()) {
                    e.n();
                }
                dVarF.u();
                T tW = transition.w();
                dVarF.y(1844425648);
                if (e.k()) {
                    e.o(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:725)");
                }
                EnterExitState enterExitStateN2 = n(transition, function1, tW, dVarF, i10);
                if (e.k()) {
                    e.n();
                }
                dVarF.u();
                br8Var2 = br8Var4;
                Transition transitionN = TransitionKt.n(transition, enterExitStateN, enterExitStateN2, "EnterExitTransition", dVarF, i9 | 3072);
                d dVarP = EnterExitTransitionKt.P(transitionN, dVar, dVarF, (i6 >> 6) & 112);
                f fVarS = EnterExitTransitionKt.S(transitionN, fVar, dVarF, (i6 >> 9) & 112);
                q6c q6cVarR = p0.r(function2, dVarF, (i6 >> 15) & 14);
                Object objInvoke = function2.invoke(transitionN.p(), transitionN.w());
                boolean zX = dVarF.x(transitionN) | dVarF.x(q6cVarR);
                Object objR2 = dVarF.R();
                if (zX || objR2 == d.INSTANCE.a()) {
                    objR2 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(transitionN, q6cVarR, null);
                    dVarF.L(objR2);
                }
                q6c q6cVarO = p0.o(objInvoke, (Function2) objR2, dVarF, 0);
                if (m(transitionN) && c(q6cVarO)) {
                    dVarF.y(-229368781);
                    dVarF.u();
                    dVar3 = dVarF;
                } else {
                    dVarF.y(-230699766);
                    boolean z3 = i7 == 4;
                    Object objR3 = dVarF.R();
                    if (z3 || objR3 == d.INSTANCE.a()) {
                        objR3 = new yq(transitionN);
                        dVarF.L(objR3);
                    }
                    yq yqVar = (yq) objR3;
                    b bVarG = EnterExitTransitionKt.g(transitionN, dVarP, fVarS, false, null, "Built-in", dVarF, 199680, 8);
                    dVar3 = dVarF;
                    if (br8Var2 != null) {
                        dVar3.y(-230087268);
                        b.Companion companion = b.INSTANCE;
                        if ((3670016 & i6) != 1048576 && ((i6 & 2097152) == 0 || !dVar3.T(br8Var2))) {
                            z = false;
                        }
                        Object objR4 = dVar3.R();
                        if (z || objR4 == d.INSTANCE.a()) {
                            objR4 = new ps4<j, dj7, kx1, fj7>(br8Var2) { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1
                                final /* synthetic */ br8 $onLookaheadMeasured;

                                {
                                    super(3);
                                }

                                public final fj7 a(j jVar, dj7 dj7Var, long j) {
                                    final o oVarR0 = dj7Var.r0(j);
                                    if (!jVar.G1()) {
                                        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
                                            {
                                                super(1);
                                            }

                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((o.a) obj);
                                                return Unit.a;
                                            }

                                            public final void invoke(o.a aVar) {
                                                o.a.z(aVar, oVarR0, 0, 0, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                    q16.c((((long) oVarR0.getHeight()) & 4294967295L) | (((long) oVarR0.getWidth()) << 32));
                                    throw null;
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return a((j) obj, (dj7) obj2, ((kx1) obj3).getValue());
                                }
                            };
                            dVar3.L(objR4);
                        }
                        bVarA = zn6.a(companion, (ps4) objR4);
                        dVar3.u();
                    } else {
                        dVar3.y(-7404393);
                        dVar3.u();
                        bVarA = b.INSTANCE;
                    }
                    b bVarThen = bVar.then(bVarG.then(bVarA));
                    Object objR5 = dVar3.R();
                    if (objR5 == d.INSTANCE.a()) {
                        objR5 = new AnimatedEnterExitMeasurePolicy(yqVar);
                        dVar3.L(objR5);
                    }
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) objR5;
                    int iHashCode = Long.hashCode(pp1.b(dVar3, 0));
                    gs1 gs1VarJ = dVar3.j();
                    b bVarE = ComposedModifierKt.e(dVar3, bVarThen);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> function0B = companion2.b();
                    if (dVar3.G() == null) {
                        pp1.d();
                    }
                    dVar3.o();
                    if (dVar3.getInserting()) {
                        dVar3.W(function0B);
                    } else {
                        dVar3.k();
                    }
                    d dVarC = dud.c(dVar3);
                    dud.i(dVarC, animatedEnterExitMeasurePolicy, companion2.d());
                    dud.i(dVarC, gs1VarJ, companion2.f());
                    dud.d(dVarC, Integer.valueOf(iHashCode), companion2.c());
                    dud.g(dVarC, companion2.a());
                    dud.i(dVarC, bVarE, companion2.e());
                    ps4Var.invoke(yqVar, dVar3, Integer.valueOf((i6 >> 18) & 112));
                    dVar3.m();
                    dVar3.u();
                }
                dVar3.u();
            } else {
                dVarF.y(-229362829);
                dVarF.u();
                br8Var2 = br8Var3;
                dVar3 = dVarF;
            }
            if (e.k()) {
                e.n();
            }
        } else {
            dVar3 = dVarF;
            dVar3.q();
            br8Var2 = br8Var3;
        }
        s6b s6bVarH = dVar3.H();
        if (s6bVarH != null) {
            final br8 br8Var5 = br8Var2;
            s6bVarH.a(new Function2<d, Integer, Unit>(transition, function1, bVar, dVar, fVar, function2, br8Var5, ps4Var, i, i2) { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ ps4<xq, d, Integer, Unit> $content;
                final /* synthetic */ d $enter;
                final /* synthetic */ f $exit;
                final /* synthetic */ b $modifier;
                final /* synthetic */ br8 $onLookaheadMeasured;
                final /* synthetic */ Function2<EnterExitState, EnterExitState, Boolean> $shouldDisposeBlock;
                final /* synthetic */ Transition<T> $transition;
                final /* synthetic */ Function1<T, Boolean> $visible;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                    this.$content = ps4Var;
                    this.$$changed = i;
                    this.$$default = i2;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar4, int i11) {
                    AnimatedVisibilityKt.a(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$shouldDisposeBlock, null, this.$content, dVar4, saa.a(this.$$changed | 1), this.$$default);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Function2<EnterExitState, EnterExitState, Boolean> b(q6c<? extends Function2<? super EnterExitState, ? super EnterExitState, Boolean>> q6cVar) {
        return q6cVar.getValue();
    }

    private static final boolean c(q6c<Boolean> q6cVar) {
        return q6cVar.getValue().booleanValue();
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
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x015f  */
    /* JADX WARN: Code duplicated, block: B:96:0x016d  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void d(final androidx.compose.p000animation.core.e<Boolean> eVar, b bVar, d dVar, f fVar, String str, final ps4<? super xq, ? super d, ? super Integer, Unit> ps4Var, d dVar2, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        d dVar3;
        int i5;
        int i6;
        f fVar2;
        int i7;
        int i8;
        int i9;
        boolean z;
        final String str2;
        final b bVar3;
        final d dVar4;
        final f fVar3;
        s6b s6bVarH;
        int i10;
        b bVar4;
        d dVarC;
        f fVarC;
        String str3;
        Object objR;
        int i11;
        d dVarF = dVar2.F(657024243);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? dVarF.x(eVar) : dVarF.T(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    dVar3 = dVar;
                    if (dVarF.x(dVar3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        fVar2 = fVar;
                        if (dVarF.x(fVar2)) {
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
                        if ((196608 & i) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((74899 & i3) != 74898) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i12 != 0) {
                                bVar4 = b.INSTANCE;
                                i10 = i8;
                            } else {
                                i10 = i8;
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                            } else {
                                dVarC = dVar3;
                            }
                            if (i6 != 0) {
                                fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i10 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (e.k()) {
                                e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                            }
                            Transition transitionT = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                                    public final Boolean a(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return a(((Boolean) obj).booleanValue());
                                    }
                                };
                                dVarF.L(objR);
                            }
                            Function1 function1 = (Function1) objR;
                            int i13 = i3 << 3;
                            j(transitionT, function1, bVar4, dVarC, fVarC, ps4Var, dVarF, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i3 & 458752));
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar3 = bVar4;
                            dVar4 = dVarC;
                            fVar3 = fVarC;
                        } else {
                            dVarF.q();
                            str2 = str;
                            bVar3 = bVar2;
                            dVar4 = dVar3;
                            fVar3 = fVar2;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar5, int i14) {
                                    AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    if ((196608 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                        } else {
                            dVarC = dVar3;
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                        }
                        Transition transitionT2 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function1 function2 = (Function1) objR;
                        int i14 = i3 << 3;
                        j(transitionT2, function2, bVar4, dVarC, fVarC, ps4Var, dVarF, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar4 = dVarC;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        str2 = str;
                        bVar3 = bVar2;
                        dVar4 = dVar3;
                        fVar3 = fVar2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar5, int i15) {
                                AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                fVar2 = fVar;
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
                    if ((196608 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                        } else {
                            dVarC = dVar3;
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                        }
                        Transition transitionT3 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function1 function3 = (Function1) objR;
                        int i15 = i3 << 3;
                        j(transitionT3, function3, bVar4, dVarC, fVarC, ps4Var, dVarF, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i3 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar4 = dVarC;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        str2 = str;
                        bVar3 = bVar2;
                        dVar4 = dVar3;
                        fVar3 = fVar2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar5, int i16) {
                                AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                    }
                    Transition transitionT4 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function4 = (Function1) objR;
                    int i16 = i3 << 3;
                    j(transitionT4, function4, bVar4, dVarC, fVarC, ps4Var, dVarF, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i17) {
                            AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            dVar3 = dVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
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
                    if ((196608 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                        } else {
                            dVarC = dVar3;
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                        }
                        Transition transitionT5 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function1 function5 = (Function1) objR;
                        int i17 = i3 << 3;
                        j(transitionT5, function5, bVar4, dVarC, fVarC, ps4Var, dVarF, (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168) | (i3 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar4 = dVarC;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        str2 = str;
                        bVar3 = bVar2;
                        dVar4 = dVar3;
                        fVar3 = fVar2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar5, int i18) {
                                AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                    }
                    Transition transitionT6 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function6 = (Function1) objR;
                    int i18 = i3 << 3;
                    j(transitionT6, function6, bVar4, dVarC, fVarC, ps4Var, dVarF, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i19) {
                            AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            fVar2 = fVar;
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
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                    }
                    Transition transitionT7 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function7 = (Function1) objR;
                    int i19 = i3 << 3;
                    j(transitionT7, function7, bVar4, dVarC, fVarC, ps4Var, dVarF, (i19 & 57344) | (i19 & 896) | 48 | (i19 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i110) {
                            AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                    i10 = i8;
                } else {
                    i10 = i8;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                } else {
                    dVarC = dVar3;
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                }
                Transition transitionT8 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                Function1 function8 = (Function1) objR;
                int i110 = i3 << 3;
                j(transitionT8, function8, bVar4, dVarC, fVarC, ps4Var, dVarF, (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar4 = dVarC;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                str2 = str;
                bVar3 = bVar2;
                dVar4 = dVar3;
                fVar3 = fVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar5, int i111) {
                        AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                dVar3 = dVar;
                if (dVarF.x(dVar3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
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
                    if ((196608 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                        } else {
                            dVarC = dVar3;
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                        }
                        Transition transitionT9 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function1 function9 = (Function1) objR;
                        int i111 = i3 << 3;
                        j(transitionT9, function9, bVar4, dVarC, fVarC, ps4Var, dVarF, (i111 & 57344) | (i111 & 896) | 48 | (i111 & 7168) | (i3 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar4 = dVarC;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        str2 = str;
                        bVar3 = bVar2;
                        dVar4 = dVar3;
                        fVar3 = fVar2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar5, int i112) {
                                AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                    }
                    Transition transitionT10 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function10 = (Function1) objR;
                    int i112 = i3 << 3;
                    j(transitionT10, function10, bVar4, dVarC, fVarC, ps4Var, dVarF, (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i113) {
                            AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            fVar2 = fVar;
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
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                    }
                    Transition transitionT11 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function11 = (Function1) objR;
                    int i113 = i3 << 3;
                    j(transitionT11, function11, bVar4, dVarC, fVarC, ps4Var, dVarF, (i113 & 57344) | (i113 & 896) | 48 | (i113 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i114) {
                            AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                    i10 = i8;
                } else {
                    i10 = i8;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                } else {
                    dVarC = dVar3;
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                }
                Transition transitionT12 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                Function1 function12 = (Function1) objR;
                int i114 = i3 << 3;
                j(transitionT12, function12, bVar4, dVarC, fVarC, ps4Var, dVarF, (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar4 = dVarC;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                str2 = str;
                bVar3 = bVar2;
                dVar4 = dVar3;
                fVar3 = fVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar5, int i115) {
                        AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        dVar3 = dVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                fVar2 = fVar;
                if (dVarF.x(fVar2)) {
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
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                    }
                    Transition transitionT13 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function13 = (Function1) objR;
                    int i115 = i3 << 3;
                    j(transitionT13, function13, bVar4, dVarC, fVarC, ps4Var, dVarF, (i115 & 57344) | (i115 & 896) | 48 | (i115 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i116) {
                            AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                    i10 = i8;
                } else {
                    i10 = i8;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                } else {
                    dVarC = dVar3;
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                }
                Transition transitionT14 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                Function1 function14 = (Function1) objR;
                int i116 = i3 << 3;
                j(transitionT14, function14, bVar4, dVarC, fVarC, ps4Var, dVarF, (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar4 = dVarC;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                str2 = str;
                bVar3 = bVar2;
                dVar4 = dVar3;
                fVar3 = fVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar5, int i117) {
                        AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        fVar2 = fVar;
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
            if ((196608 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                    i10 = i8;
                } else {
                    i10 = i8;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                } else {
                    dVarC = dVar3;
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
                }
                Transition transitionT15 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                Function1 function15 = (Function1) objR;
                int i117 = i3 << 3;
                j(transitionT15, function15, bVar4, dVarC, fVarC, ps4Var, dVarF, (i117 & 57344) | (i117 & 896) | 48 | (i117 & 7168) | (i3 & 458752));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar4 = dVarC;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                str2 = str;
                bVar3 = bVar2;
                dVar4 = dVar3;
                fVar3 = fVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar5, int i118) {
                        AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        if ((196608 & i) == 0) {
            if (dVarF.T(ps4Var)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i12 != 0) {
                bVar4 = b.INSTANCE;
                i10 = i8;
            } else {
                i10 = i8;
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
            } else {
                dVarC = dVar3;
            }
            if (i6 != 0) {
                fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.y(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i10 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (e.k()) {
                e.o(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:377)");
            }
            Transition transitionT16 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i3 & 14) | ((i3 >> 9) & 112), 0);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                    public final Boolean a(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return a(((Boolean) obj).booleanValue());
                    }
                };
                dVarF.L(objR);
            }
            Function1 function16 = (Function1) objR;
            int i118 = i3 << 3;
            j(transitionT16, function16, bVar4, dVarC, fVarC, ps4Var, dVarF, (i118 & 57344) | (i118 & 896) | 48 | (i118 & 7168) | (i3 & 458752));
            if (e.k()) {
                e.n();
            }
            str2 = str3;
            bVar3 = bVar4;
            dVar4 = dVarC;
            fVar3 = fVarC;
        } else {
            dVarF.q();
            str2 = str;
            bVar3 = bVar2;
            dVar4 = dVar3;
            fVar3 = fVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar5, int i119) {
                    AnimatedVisibilityKt.d(eVar, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0169  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void e(final xj1 xj1Var, final androidx.compose.p000animation.core.e<Boolean> eVar, b bVar, d dVar, f fVar, String str, final ps4<? super xq, ? super d, ? super Integer, Unit> ps4Var, d dVar2, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        d dVarC;
        int i5;
        int i6;
        f fVar2;
        int i7;
        int i8;
        int i9;
        boolean z;
        final b bVar3;
        final d dVar3;
        final f fVar3;
        final String str2;
        s6b s6bVarH;
        b bVar4;
        f fVarC;
        String str3;
        Object objR;
        int i10;
        d dVarF = dVar2.F(-1238803325);
        if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? dVarF.x(eVar) : dVarF.T(eVar) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    dVarC = dVar;
                    if (dVarF.x(dVarC)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        fVar2 = fVar;
                        if (dVarF.x(fVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            if (dVarF.x(str)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i11 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                            }
                            if (i6 != 0) {
                                fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (e.k()) {
                                e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                            }
                            int i12 = i3 >> 3;
                            Transition transitionT = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i12 & 14) | ((i3 >> 12) & 112), 0);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                                    public final Boolean a(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return a(((Boolean) obj).booleanValue());
                                    }
                                };
                                dVarF.L(objR);
                            }
                            d dVar4 = dVarC;
                            j(transitionT, (Function1) objR, bVar4, dVar4, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i12));
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar3 = bVar4;
                            dVar3 = dVar4;
                            fVar3 = fVarC;
                        } else {
                            dVarF.q();
                            bVar3 = bVar2;
                            dVar3 = dVarC;
                            fVar3 = fVar2;
                            str2 = str;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar5, int i13) {
                                    AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                        }
                        int i13 = i3 >> 3;
                        Transition transitionT2 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i13 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar5 = dVarC;
                        j(transitionT2, (Function1) objR, bVar4, dVar5, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i13));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar5;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar6, int i14) {
                                AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar6, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                fVar2 = fVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                        }
                        int i14 = i3 >> 3;
                        Transition transitionT3 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i14 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar6 = dVarC;
                        j(transitionT3, (Function1) objR, bVar4, dVar6, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i14));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar6;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar7, int i15) {
                                AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar7, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i15 = i3 >> 3;
                    Transition transitionT4 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i15 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar7 = dVarC;
                    j(transitionT4, (Function1) objR, bVar4, dVar7, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i15));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar7;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar8, int i16) {
                            AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar8, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            dVarC = dVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                        }
                        int i16 = i3 >> 3;
                        Transition transitionT5 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i16 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar8 = dVarC;
                        j(transitionT5, (Function1) objR, bVar4, dVar8, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i16));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar8;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar9, int i17) {
                                AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar9, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i17 = i3 >> 3;
                    Transition transitionT6 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i17 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar9 = dVarC;
                    j(transitionT6, (Function1) objR, bVar4, dVar9, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i17));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar9;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar10, int i18) {
                            AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar10, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            fVar2 = fVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i18 = i3 >> 3;
                    Transition transitionT7 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i18 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar10 = dVarC;
                    j(transitionT7, (Function1) objR, bVar4, dVar10, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i18));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar10;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar11, int i19) {
                            AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar11, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                }
                int i19 = i3 >> 3;
                Transition transitionT8 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i19 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar11 = dVarC;
                j(transitionT8, (Function1) objR, bVar4, dVar11, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i19));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar11;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar12, int i110) {
                        AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar12, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                dVarC = dVar;
                if (dVarF.x(dVarC)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                        }
                        int i110 = i3 >> 3;
                        Transition transitionT9 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i110 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar12 = dVarC;
                        j(transitionT9, (Function1) objR, bVar4, dVar12, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i110));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar12;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar13, int i111) {
                                AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar13, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i111 = i3 >> 3;
                    Transition transitionT10 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i111 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar13 = dVarC;
                    j(transitionT10, (Function1) objR, bVar4, dVar13, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i111));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar13;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar14, int i112) {
                            AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar14, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            fVar2 = fVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i112 = i3 >> 3;
                    Transition transitionT11 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i112 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar14 = dVarC;
                    j(transitionT11, (Function1) objR, bVar4, dVar14, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i112));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar14;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar15, int i113) {
                            AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar15, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                }
                int i113 = i3 >> 3;
                Transition transitionT12 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i113 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar15 = dVarC;
                j(transitionT12, (Function1) objR, bVar4, dVar15, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i113));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar15;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar16, int i114) {
                        AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar16, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        dVarC = dVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                fVar2 = fVar;
                if (dVarF.x(fVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i114 = i3 >> 3;
                    Transition transitionT13 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i114 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar16 = dVarC;
                    j(transitionT13, (Function1) objR, bVar4, dVar16, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i114));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar16;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar17, int i115) {
                            AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar17, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                }
                int i115 = i3 >> 3;
                Transition transitionT14 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i115 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar17 = dVarC;
                j(transitionT14, (Function1) objR, bVar4, dVar17, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i115));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar17;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar18, int i116) {
                        AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar18, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        fVar2 = fVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                if (dVarF.x(str)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                }
                int i116 = i3 >> 3;
                Transition transitionT15 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i116 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar18 = dVarC;
                j(transitionT15, (Function1) objR, bVar4, dVar18, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i116));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar18;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar19, int i117) {
                        AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar19, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 196608;
        if ((1572864 & i) == 0) {
            if (dVarF.T(ps4Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599185 & i3) != 599184) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i11 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                dVarC = EnterExitTransitionKt.m(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
            }
            if (i6 != 0) {
                fVarC = EnterExitTransitionKt.A(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
            } else {
                fVarC = fVar2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (e.k()) {
                e.o(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
            }
            int i117 = i3 >> 3;
            Transition transitionT16 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i117 & 14) | ((i3 >> 12) & 112), 0);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                    public final Boolean a(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return a(((Boolean) obj).booleanValue());
                    }
                };
                dVarF.L(objR);
            }
            d dVar19 = dVarC;
            j(transitionT16, (Function1) objR, bVar4, dVar19, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i117));
            if (e.k()) {
                e.n();
            }
            str2 = str3;
            bVar3 = bVar4;
            dVar3 = dVar19;
            fVar3 = fVarC;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            dVar3 = dVarC;
            fVar3 = fVar2;
            str2 = str;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar110, int i118) {
                    AnimatedVisibilityKt.e(xj1Var, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar110, saa.a(i | 1), i2);
                }
            });
        }
    }

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
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void f(final xj1 xj1Var, final boolean z, b bVar, d dVar, f fVar, String str, final ps4<? super xq, ? super d, ? super Integer, Unit> ps4Var, d dVar2, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        d dVarC;
        int i5;
        int i6;
        f fVar2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        final b bVar3;
        final d dVar3;
        final f fVar3;
        final String str2;
        s6b s6bVarH;
        b bVar4;
        f fVarC;
        String str3;
        Object objR;
        int i10;
        d dVarF = dVar2.F(1799879339);
        if ((i & 48) == 0) {
            i3 = (dVarF.A(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    dVarC = dVar;
                    if (dVarF.x(dVarC)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        fVar2 = fVar;
                        if (dVarF.x(fVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            if (dVarF.x(str)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (dVarF.g(z2, i3 & 1)) {
                            if (i11 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                            }
                            if (i6 != 0) {
                                fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (e.k()) {
                                e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                            }
                            int i12 = i3 >> 3;
                            Transition transitionY = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i12 & 14) | ((i3 >> 12) & 112), 0);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                                    public final Boolean a(boolean z3) {
                                        return Boolean.valueOf(z3);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return a(((Boolean) obj).booleanValue());
                                    }
                                };
                                dVarF.L(objR);
                            }
                            d dVar4 = dVarC;
                            j(transitionY, (Function1) objR, bVar4, dVar4, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i12));
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar3 = bVar4;
                            dVar3 = dVar4;
                            fVar3 = fVarC;
                        } else {
                            dVarF.q();
                            bVar3 = bVar2;
                            dVar3 = dVarC;
                            fVar3 = fVar2;
                            str2 = str;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar5, int i13) {
                                    AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                        }
                        int i13 = i3 >> 3;
                        Transition transitionY2 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i13 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                                public final Boolean a(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar5 = dVarC;
                        j(transitionY2, (Function1) objR, bVar4, dVar5, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i13));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar5;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar6, int i14) {
                                AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar6, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                fVar2 = fVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                        }
                        int i14 = i3 >> 3;
                        Transition transitionY3 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i14 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                                public final Boolean a(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar6 = dVarC;
                        j(transitionY3, (Function1) objR, bVar4, dVar6, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i14));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar6;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar7, int i15) {
                                AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar7, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i15 = i3 >> 3;
                    Transition transitionY4 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i15 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar7 = dVarC;
                    j(transitionY4, (Function1) objR, bVar4, dVar7, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i15));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar7;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar8, int i16) {
                            AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar8, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            dVarC = dVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                        }
                        int i16 = i3 >> 3;
                        Transition transitionY5 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i16 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                                public final Boolean a(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar8 = dVarC;
                        j(transitionY5, (Function1) objR, bVar4, dVar8, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i16));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar8;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar9, int i17) {
                                AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar9, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i17 = i3 >> 3;
                    Transition transitionY6 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i17 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar9 = dVarC;
                    j(transitionY6, (Function1) objR, bVar4, dVar9, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i17));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar9;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar10, int i18) {
                            AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar10, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            fVar2 = fVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i18 = i3 >> 3;
                    Transition transitionY7 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i18 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar10 = dVarC;
                    j(transitionY7, (Function1) objR, bVar4, dVar10, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i18));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar10;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar11, int i19) {
                            AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar11, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                }
                int i19 = i3 >> 3;
                Transition transitionY8 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i19 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                        public final Boolean a(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar11 = dVarC;
                j(transitionY8, (Function1) objR, bVar4, dVar11, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i19));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar11;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar12, int i110) {
                        AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar12, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                dVarC = dVar;
                if (dVarF.x(dVarC)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                        }
                        int i110 = i3 >> 3;
                        Transition transitionY9 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i110 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                                public final Boolean a(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar12 = dVarC;
                        j(transitionY9, (Function1) objR, bVar4, dVar12, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i110));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar12;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar13, int i111) {
                                AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar13, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i111 = i3 >> 3;
                    Transition transitionY10 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i111 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar13 = dVarC;
                    j(transitionY10, (Function1) objR, bVar4, dVar13, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i111));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar13;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar14, int i112) {
                            AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar14, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            fVar2 = fVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i112 = i3 >> 3;
                    Transition transitionY11 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i112 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar14 = dVarC;
                    j(transitionY11, (Function1) objR, bVar4, dVar14, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i112));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar14;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar15, int i113) {
                            AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar15, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                }
                int i113 = i3 >> 3;
                Transition transitionY12 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i113 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                        public final Boolean a(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar15 = dVarC;
                j(transitionY12, (Function1) objR, bVar4, dVar15, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i113));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar15;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar16, int i114) {
                        AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar16, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        dVarC = dVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                fVar2 = fVar;
                if (dVarF.x(fVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i114 = i3 >> 3;
                    Transition transitionY13 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i114 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar16 = dVarC;
                    j(transitionY13, (Function1) objR, bVar4, dVar16, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i114));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar16;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar17, int i115) {
                            AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar17, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                }
                int i115 = i3 >> 3;
                Transition transitionY14 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i115 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                        public final Boolean a(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar17 = dVarC;
                j(transitionY14, (Function1) objR, bVar4, dVar17, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i115));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar17;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar18, int i116) {
                        AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar18, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        fVar2 = fVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                if (dVarF.x(str)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                }
                int i116 = i3 >> 3;
                Transition transitionY15 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i116 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                        public final Boolean a(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar18 = dVarC;
                j(transitionY15, (Function1) objR, bVar4, dVar18, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i116));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar18;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar19, int i117) {
                        AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar19, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 196608;
        if ((1572864 & i) == 0) {
            if (dVarF.T(ps4Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599185 & i3) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i3 & 1)) {
            if (i11 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.m(null, null, false, null, 15, null));
            }
            if (i6 != 0) {
                fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.A(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (e.k()) {
                e.o(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
            }
            int i117 = i3 >> 3;
            Transition transitionY16 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i117 & 14) | ((i3 >> 12) & 112), 0);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                    public final Boolean a(boolean z3) {
                        return Boolean.valueOf(z3);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return a(((Boolean) obj).booleanValue());
                    }
                };
                dVarF.L(objR);
            }
            d dVar19 = dVarC;
            j(transitionY16, (Function1) objR, bVar4, dVar19, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i117));
            if (e.k()) {
                e.n();
            }
            str2 = str3;
            bVar3 = bVar4;
            dVar3 = dVar19;
            fVar3 = fVarC;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            dVar3 = dVarC;
            fVar3 = fVar2;
            str2 = str;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar110, int i118) {
                    AnimatedVisibilityKt.f(xj1Var, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar110, saa.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0169  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void g(final hra hraVar, final androidx.compose.p000animation.core.e<Boolean> eVar, b bVar, d dVar, f fVar, String str, final ps4<? super xq, ? super d, ? super Integer, Unit> ps4Var, d dVar2, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        d dVarC;
        int i5;
        int i6;
        f fVar2;
        int i7;
        int i8;
        int i9;
        boolean z;
        final b bVar3;
        final d dVar3;
        final f fVar3;
        final String str2;
        s6b s6bVarH;
        b bVar4;
        f fVarC;
        String str3;
        Object objR;
        int i10;
        d dVarF = dVar2.F(1763490971);
        if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? dVarF.x(eVar) : dVarF.T(eVar) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    dVarC = dVar;
                    if (dVarF.x(dVarC)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        fVar2 = fVar;
                        if (dVarF.x(fVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            if (dVarF.x(str)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (dVarF.g(z, i3 & 1)) {
                            if (i11 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                            }
                            if (i6 != 0) {
                                fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (e.k()) {
                                e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                            }
                            int i12 = i3 >> 3;
                            Transition transitionT = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i12 & 14) | ((i3 >> 12) & 112), 0);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                                    public final Boolean a(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return a(((Boolean) obj).booleanValue());
                                    }
                                };
                                dVarF.L(objR);
                            }
                            d dVar4 = dVarC;
                            j(transitionT, (Function1) objR, bVar4, dVar4, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i12));
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar3 = bVar4;
                            dVar3 = dVar4;
                            fVar3 = fVarC;
                        } else {
                            dVarF.q();
                            bVar3 = bVar2;
                            dVar3 = dVarC;
                            fVar3 = fVar2;
                            str2 = str;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar5, int i13) {
                                    AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                        }
                        int i13 = i3 >> 3;
                        Transition transitionT2 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i13 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar5 = dVarC;
                        j(transitionT2, (Function1) objR, bVar4, dVar5, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i13));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar5;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar6, int i14) {
                                AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar6, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                fVar2 = fVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                        }
                        int i14 = i3 >> 3;
                        Transition transitionT3 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i14 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar6 = dVarC;
                        j(transitionT3, (Function1) objR, bVar4, dVar6, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i14));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar6;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar7, int i15) {
                                AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar7, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                    }
                    int i15 = i3 >> 3;
                    Transition transitionT4 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i15 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar7 = dVarC;
                    j(transitionT4, (Function1) objR, bVar4, dVar7, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i15));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar7;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar8, int i16) {
                            AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar8, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            dVarC = dVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                        }
                        int i16 = i3 >> 3;
                        Transition transitionT5 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i16 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar8 = dVarC;
                        j(transitionT5, (Function1) objR, bVar4, dVar8, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i16));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar8;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar9, int i17) {
                                AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar9, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                    }
                    int i17 = i3 >> 3;
                    Transition transitionT6 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i17 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar9 = dVarC;
                    j(transitionT6, (Function1) objR, bVar4, dVar9, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i17));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar9;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar10, int i18) {
                            AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar10, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            fVar2 = fVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                    }
                    int i18 = i3 >> 3;
                    Transition transitionT7 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i18 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar10 = dVarC;
                    j(transitionT7, (Function1) objR, bVar4, dVar10, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i18));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar10;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar11, int i19) {
                            AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar11, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                }
                int i19 = i3 >> 3;
                Transition transitionT8 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i19 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar11 = dVarC;
                j(transitionT8, (Function1) objR, bVar4, dVar11, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i19));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar11;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar12, int i110) {
                        AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar12, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                dVarC = dVar;
                if (dVarF.x(dVarC)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVarF.g(z, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                        }
                        int i110 = i3 >> 3;
                        Transition transitionT9 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i110 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                                public final Boolean a(boolean z2) {
                                    return Boolean.valueOf(z2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar12 = dVarC;
                        j(transitionT9, (Function1) objR, bVar4, dVar12, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i110));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar12;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar13, int i111) {
                                AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar13, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                    }
                    int i111 = i3 >> 3;
                    Transition transitionT10 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i111 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar13 = dVarC;
                    j(transitionT10, (Function1) objR, bVar4, dVar13, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i111));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar13;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar14, int i112) {
                            AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar14, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            fVar2 = fVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                    }
                    int i112 = i3 >> 3;
                    Transition transitionT11 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i112 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar14 = dVarC;
                    j(transitionT11, (Function1) objR, bVar4, dVar14, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i112));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar14;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar15, int i113) {
                            AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar15, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                }
                int i113 = i3 >> 3;
                Transition transitionT12 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i113 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar15 = dVarC;
                j(transitionT12, (Function1) objR, bVar4, dVar15, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i113));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar15;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar16, int i114) {
                        AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar16, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        dVarC = dVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                fVar2 = fVar;
                if (dVarF.x(fVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z = true;
                } else {
                    z = false;
                }
                if (dVarF.g(z, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                    }
                    int i114 = i3 >> 3;
                    Transition transitionT13 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i114 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                            public final Boolean a(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar16 = dVarC;
                    j(transitionT13, (Function1) objR, bVar4, dVar16, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i114));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar16;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar17, int i115) {
                            AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar17, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                }
                int i115 = i3 >> 3;
                Transition transitionT14 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i115 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar17 = dVarC;
                j(transitionT14, (Function1) objR, bVar4, dVar17, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i115));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar17;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar18, int i116) {
                        AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar18, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        fVar2 = fVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                if (dVarF.x(str)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
                }
                int i116 = i3 >> 3;
                Transition transitionT15 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i116 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                        public final Boolean a(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar18 = dVarC;
                j(transitionT15, (Function1) objR, bVar4, dVar18, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i116));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar18;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar19, int i117) {
                        AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar19, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 196608;
        if ((1572864 & i) == 0) {
            if (dVarF.T(ps4Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599185 & i3) != 599184) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i3 & 1)) {
            if (i11 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                dVarC = EnterExitTransitionKt.i(null, null, false, null, 15, null).c(EnterExitTransitionKt.o(null, 0.0f, 3, null));
            }
            if (i6 != 0) {
                fVarC = EnterExitTransitionKt.w(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
            } else {
                fVarC = fVar2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (e.k()) {
                e.o(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:449)");
            }
            int i117 = i3 >> 3;
            Transition transitionT16 = TransitionKt.t(eVar, str3, dVarF, androidx.compose.p000animation.core.e.d | (i117 & 14) | ((i3 >> 12) & 112), 0);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                    public final Boolean a(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return a(((Boolean) obj).booleanValue());
                    }
                };
                dVarF.L(objR);
            }
            d dVar19 = dVarC;
            j(transitionT16, (Function1) objR, bVar4, dVar19, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i117));
            if (e.k()) {
                e.n();
            }
            str2 = str3;
            bVar3 = bVar4;
            dVar3 = dVar19;
            fVar3 = fVarC;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            dVar3 = dVarC;
            fVar3 = fVar2;
            str2 = str;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar110, int i118) {
                    AnimatedVisibilityKt.g(hraVar, eVar, bVar3, dVar3, fVar3, str2, ps4Var, dVar110, saa.a(i | 1), i2);
                }
            });
        }
    }

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
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void h(final hra hraVar, final boolean z, b bVar, d dVar, f fVar, String str, final ps4<? super xq, ? super d, ? super Integer, Unit> ps4Var, d dVar2, final int i, final int i2) {
        int i3;
        b bVar2;
        int i4;
        d dVarC;
        int i5;
        int i6;
        f fVar2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        final b bVar3;
        final d dVar3;
        final f fVar3;
        final String str2;
        s6b s6bVarH;
        b bVar4;
        f fVarC;
        String str3;
        Object objR;
        int i10;
        d dVarF = dVar2.F(234057107);
        if ((i & 48) == 0) {
            i3 = (dVarF.A(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    dVarC = dVar;
                    if (dVarF.x(dVarC)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        fVar2 = fVar;
                        if (dVarF.x(fVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            if (dVarF.x(str)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        if ((599185 & i3) != 599184) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (dVarF.g(z2, i3 & 1)) {
                            if (i11 != 0) {
                                bVar4 = b.INSTANCE;
                            } else {
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                            }
                            if (i6 != 0) {
                                fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (e.k()) {
                                e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                            }
                            int i12 = i3 >> 3;
                            Transition transitionY = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i12 & 14) | ((i3 >> 12) & 112), 0);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                                    public final Boolean a(boolean z3) {
                                        return Boolean.valueOf(z3);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return a(((Boolean) obj).booleanValue());
                                    }
                                };
                                dVarF.L(objR);
                            }
                            d dVar4 = dVarC;
                            j(transitionY, (Function1) objR, bVar4, dVar4, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i12));
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar3 = bVar4;
                            dVar3 = dVar4;
                            fVar3 = fVarC;
                        } else {
                            dVarF.q();
                            bVar3 = bVar2;
                            dVar3 = dVarC;
                            fVar3 = fVar2;
                            str2 = str;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar5, int i13) {
                                    AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                        }
                        int i13 = i3 >> 3;
                        Transition transitionY2 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i13 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                                public final Boolean a(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar5 = dVarC;
                        j(transitionY2, (Function1) objR, bVar4, dVar5, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i13));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar5;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar6, int i14) {
                                AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar6, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                fVar2 = fVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                        }
                        int i14 = i3 >> 3;
                        Transition transitionY3 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i14 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                                public final Boolean a(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar6 = dVarC;
                        j(transitionY3, (Function1) objR, bVar4, dVar6, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i14));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar6;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar7, int i15) {
                                AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar7, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i15 = i3 >> 3;
                    Transition transitionY4 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i15 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar7 = dVarC;
                    j(transitionY4, (Function1) objR, bVar4, dVar7, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i15));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar7;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar8, int i16) {
                            AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar8, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            dVarC = dVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                        }
                        int i16 = i3 >> 3;
                        Transition transitionY5 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i16 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                                public final Boolean a(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar8 = dVarC;
                        j(transitionY5, (Function1) objR, bVar4, dVar8, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i16));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar8;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar9, int i17) {
                                AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar9, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i17 = i3 >> 3;
                    Transition transitionY6 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i17 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar9 = dVarC;
                    j(transitionY6, (Function1) objR, bVar4, dVar9, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i17));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar9;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar10, int i18) {
                            AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar10, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            fVar2 = fVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i18 = i3 >> 3;
                    Transition transitionY7 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i18 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar10 = dVarC;
                    j(transitionY7, (Function1) objR, bVar4, dVar10, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i18));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar10;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar11, int i19) {
                            AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar11, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                }
                int i19 = i3 >> 3;
                Transition transitionY8 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i19 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                        public final Boolean a(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar11 = dVarC;
                j(transitionY8, (Function1) objR, bVar4, dVar11, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i19));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar11;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar12, int i110) {
                        AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar12, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                dVarC = dVar;
                if (dVarF.x(dVarC)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        if (dVarF.x(str)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    if ((599185 & i3) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVarF.g(z2, i3 & 1)) {
                        if (i11 != 0) {
                            bVar4 = b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                        }
                        int i110 = i3 >> 3;
                        Transition transitionY9 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i110 & 14) | ((i3 >> 12) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                                public final Boolean a(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        d dVar12 = dVarC;
                        j(transitionY9, (Function1) objR, bVar4, dVar12, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i110));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar3 = dVar12;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        bVar3 = bVar2;
                        dVar3 = dVarC;
                        fVar3 = fVar2;
                        str2 = str;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar13, int i111) {
                                AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar13, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i111 = i3 >> 3;
                    Transition transitionY10 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i111 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar13 = dVarC;
                    j(transitionY10, (Function1) objR, bVar4, dVar13, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i111));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar13;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar14, int i112) {
                            AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar14, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            fVar2 = fVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i112 = i3 >> 3;
                    Transition transitionY11 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i112 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar14 = dVarC;
                    j(transitionY11, (Function1) objR, bVar4, dVar14, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i112));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar14;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar15, int i113) {
                            AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar15, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                }
                int i113 = i3 >> 3;
                Transition transitionY12 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i113 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                        public final Boolean a(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar15 = dVarC;
                j(transitionY12, (Function1) objR, bVar4, dVar15, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i113));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar15;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar16, int i114) {
                        AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar16, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        dVarC = dVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                fVar2 = fVar;
                if (dVarF.x(fVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    if (dVarF.x(str)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                if ((599185 & i3) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dVarF.g(z2, i3 & 1)) {
                    if (i11 != 0) {
                        bVar4 = b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i114 = i3 >> 3;
                    Transition transitionY13 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i114 & 14) | ((i3 >> 12) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                            public final Boolean a(boolean z3) {
                                return Boolean.valueOf(z3);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    d dVar16 = dVarC;
                    j(transitionY13, (Function1) objR, bVar4, dVar16, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i114));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar3 = dVar16;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    dVar3 = dVarC;
                    fVar3 = fVar2;
                    str2 = str;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar17, int i115) {
                            AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar17, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                }
                int i115 = i3 >> 3;
                Transition transitionY14 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i115 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                        public final Boolean a(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar17 = dVarC;
                j(transitionY14, (Function1) objR, bVar4, dVar17, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i115));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar17;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar18, int i116) {
                        AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar18, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        fVar2 = fVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                if (dVarF.x(str)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            if ((599185 & i3) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (dVarF.g(z2, i3 & 1)) {
                if (i11 != 0) {
                    bVar4 = b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                }
                int i116 = i3 >> 3;
                Transition transitionY15 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i116 & 14) | ((i3 >> 12) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                        public final Boolean a(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                d dVar18 = dVarC;
                j(transitionY15, (Function1) objR, bVar4, dVar18, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i116));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar3 = dVar18;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                dVar3 = dVarC;
                fVar3 = fVar2;
                str2 = str;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar19, int i117) {
                        AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar19, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 196608;
        if ((1572864 & i) == 0) {
            if (dVarF.T(ps4Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599185 & i3) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (dVarF.g(z2, i3 & 1)) {
            if (i11 != 0) {
                bVar4 = b.INSTANCE;
            } else {
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.i(null, null, false, null, 15, null));
            }
            if (i6 != 0) {
                fVarC = EnterExitTransitionKt.q(null, 0.0f, 3, null).c(EnterExitTransitionKt.w(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (e.k()) {
                e.o(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
            }
            int i117 = i3 >> 3;
            Transition transitionY16 = TransitionKt.y(Boolean.valueOf(z), str3, dVarF, (i117 & 14) | ((i3 >> 12) & 112), 0);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                    public final Boolean a(boolean z3) {
                        return Boolean.valueOf(z3);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return a(((Boolean) obj).booleanValue());
                    }
                };
                dVarF.L(objR);
            }
            d dVar19 = dVarC;
            j(transitionY16, (Function1) objR, bVar4, dVar19, fVarC, ps4Var, dVarF, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i117));
            if (e.k()) {
                e.n();
            }
            str2 = str3;
            bVar3 = bVar4;
            dVar3 = dVar19;
            fVar3 = fVarC;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            dVar3 = dVarC;
            fVar3 = fVar2;
            str2 = str;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar110, int i118) {
                    AnimatedVisibilityKt.h(hraVar, z, bVar3, dVar3, fVar3, str2, ps4Var, dVar110, saa.a(i | 1), i2);
                }
            });
        }
    }

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
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0159  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void i(boolean z, b bVar, d dVar, f fVar, String str, final ps4<? super xq, ? super d, ? super Integer, Unit> ps4Var, d dVar2, final int i, final int i2) {
        final boolean z2;
        int i3;
        b bVar2;
        int i4;
        d dVar3;
        int i5;
        int i6;
        f fVar2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        final String str2;
        final b bVar3;
        final d dVar4;
        final f fVar3;
        s6b s6bVarH;
        int i10;
        b bVar4;
        d dVarC;
        f fVarC;
        String str3;
        Object objR;
        int i11;
        d dVarF = dVar2.F(-1448730565);
        if ((i & 6) == 0) {
            z2 = z;
            i3 = (dVarF.A(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    dVar3 = dVar;
                    if (dVarF.x(dVar3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        fVar2 = fVar;
                        if (dVarF.x(fVar2)) {
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
                        if ((196608 & i) == 0) {
                            if (dVarF.T(ps4Var)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((74899 & i3) != 74898) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dVarF.g(z3, i3 & 1)) {
                            if (i12 != 0) {
                                bVar4 = b.INSTANCE;
                                i10 = i8;
                            } else {
                                i10 = i8;
                                bVar4 = bVar2;
                            }
                            if (i4 != 0) {
                                dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                            } else {
                                dVarC = dVar3;
                            }
                            if (i6 != 0) {
                                fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i10 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (e.k()) {
                                e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                            }
                            Transition transitionY = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            objR = dVarF.R();
                            if (objR == d.INSTANCE.a()) {
                                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                                    public final Boolean a(boolean z4) {
                                        return Boolean.valueOf(z4);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return a(((Boolean) obj).booleanValue());
                                    }
                                };
                                dVarF.L(objR);
                            }
                            Function1 function1 = (Function1) objR;
                            int i13 = i3 << 3;
                            j(transitionY, function1, bVar4, dVarC, fVarC, ps4Var, dVarF, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i3 & 458752));
                            if (e.k()) {
                                e.n();
                            }
                            str2 = str3;
                            bVar3 = bVar4;
                            dVar4 = dVarC;
                            fVar3 = fVarC;
                        } else {
                            dVarF.q();
                            str2 = str;
                            bVar3 = bVar2;
                            dVar4 = dVar3;
                            fVar3 = fVar2;
                        }
                        s6bVarH = dVarF.H();
                        if (s6bVarH != null) {
                            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((d) obj, ((Number) obj2).intValue());
                                    return Unit.a;
                                }

                                public final void invoke(d dVar5, int i14) {
                                    AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 24576;
                    if ((196608 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                        } else {
                            dVarC = dVar3;
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        Transition transitionY2 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                                public final Boolean a(boolean z4) {
                                    return Boolean.valueOf(z4);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function1 function2 = (Function1) objR;
                        int i14 = i3 << 3;
                        j(transitionY2, function2, bVar4, dVarC, fVarC, ps4Var, dVarF, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar4 = dVarC;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        str2 = str;
                        bVar3 = bVar2;
                        dVar4 = dVar3;
                        fVar3 = fVar2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar5, int i15) {
                                AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                fVar2 = fVar;
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
                    if ((196608 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                        } else {
                            dVarC = dVar3;
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        Transition transitionY3 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                                public final Boolean a(boolean z4) {
                                    return Boolean.valueOf(z4);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function1 function3 = (Function1) objR;
                        int i15 = i3 << 3;
                        j(transitionY3, function3, bVar4, dVarC, fVarC, ps4Var, dVarF, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i3 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar4 = dVarC;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        str2 = str;
                        bVar3 = bVar2;
                        dVar4 = dVar3;
                        fVar3 = fVar2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar5, int i16) {
                                AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    Transition transitionY4 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                            public final Boolean a(boolean z4) {
                                return Boolean.valueOf(z4);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function4 = (Function1) objR;
                    int i16 = i3 << 3;
                    j(transitionY4, function4, bVar4, dVarC, fVarC, ps4Var, dVarF, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i17) {
                            AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            dVar3 = dVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
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
                    if ((196608 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                        } else {
                            dVarC = dVar3;
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        Transition transitionY5 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                                public final Boolean a(boolean z4) {
                                    return Boolean.valueOf(z4);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function1 function5 = (Function1) objR;
                        int i17 = i3 << 3;
                        j(transitionY5, function5, bVar4, dVarC, fVarC, ps4Var, dVarF, (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168) | (i3 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar4 = dVarC;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        str2 = str;
                        bVar3 = bVar2;
                        dVar4 = dVar3;
                        fVar3 = fVar2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar5, int i18) {
                                AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    Transition transitionY6 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                            public final Boolean a(boolean z4) {
                                return Boolean.valueOf(z4);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function6 = (Function1) objR;
                    int i18 = i3 << 3;
                    j(transitionY6, function6, bVar4, dVarC, fVarC, ps4Var, dVarF, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i19) {
                            AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            fVar2 = fVar;
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
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    Transition transitionY7 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                            public final Boolean a(boolean z4) {
                                return Boolean.valueOf(z4);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function7 = (Function1) objR;
                    int i19 = i3 << 3;
                    j(transitionY7, function7, bVar4, dVarC, fVarC, ps4Var, dVarF, (i19 & 57344) | (i19 & 896) | 48 | (i19 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i110) {
                            AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                    i10 = i8;
                } else {
                    i10 = i8;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                } else {
                    dVarC = dVar3;
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                Transition transitionY8 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                        public final Boolean a(boolean z4) {
                            return Boolean.valueOf(z4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                Function1 function8 = (Function1) objR;
                int i110 = i3 << 3;
                j(transitionY8, function8, bVar4, dVarC, fVarC, ps4Var, dVarF, (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar4 = dVarC;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                str2 = str;
                bVar3 = bVar2;
                dVar4 = dVar3;
                fVar3 = fVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar5, int i111) {
                        AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                dVar3 = dVar;
                if (dVarF.x(dVar3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    fVar2 = fVar;
                    if (dVarF.x(fVar2)) {
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
                    if ((196608 & i) == 0) {
                        if (dVarF.T(ps4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dVarF.g(z3, i3 & 1)) {
                        if (i12 != 0) {
                            bVar4 = b.INSTANCE;
                            i10 = i8;
                        } else {
                            i10 = i8;
                            bVar4 = bVar2;
                        }
                        if (i4 != 0) {
                            dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                        } else {
                            dVarC = dVar3;
                        }
                        if (i6 != 0) {
                            fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i10 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (e.k()) {
                            e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        Transition transitionY9 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objR = dVarF.R();
                        if (objR == d.INSTANCE.a()) {
                            objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                                public final Boolean a(boolean z4) {
                                    return Boolean.valueOf(z4);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return a(((Boolean) obj).booleanValue());
                                }
                            };
                            dVarF.L(objR);
                        }
                        Function1 function9 = (Function1) objR;
                        int i111 = i3 << 3;
                        j(transitionY9, function9, bVar4, dVarC, fVarC, ps4Var, dVarF, (i111 & 57344) | (i111 & 896) | 48 | (i111 & 7168) | (i3 & 458752));
                        if (e.k()) {
                            e.n();
                        }
                        str2 = str3;
                        bVar3 = bVar4;
                        dVar4 = dVarC;
                        fVar3 = fVarC;
                    } else {
                        dVarF.q();
                        str2 = str;
                        bVar3 = bVar2;
                        dVar4 = dVar3;
                        fVar3 = fVar2;
                    }
                    s6bVarH = dVarF.H();
                    if (s6bVarH != null) {
                        s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((d) obj, ((Number) obj2).intValue());
                                return Unit.a;
                            }

                            public final void invoke(d dVar5, int i112) {
                                AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    Transition transitionY10 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                            public final Boolean a(boolean z4) {
                                return Boolean.valueOf(z4);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function10 = (Function1) objR;
                    int i112 = i3 << 3;
                    j(transitionY10, function10, bVar4, dVarC, fVarC, ps4Var, dVarF, (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i113) {
                            AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            fVar2 = fVar;
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
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    Transition transitionY11 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                            public final Boolean a(boolean z4) {
                                return Boolean.valueOf(z4);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function11 = (Function1) objR;
                    int i113 = i3 << 3;
                    j(transitionY11, function11, bVar4, dVarC, fVarC, ps4Var, dVarF, (i113 & 57344) | (i113 & 896) | 48 | (i113 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i114) {
                            AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                    i10 = i8;
                } else {
                    i10 = i8;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                } else {
                    dVarC = dVar3;
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                Transition transitionY12 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                        public final Boolean a(boolean z4) {
                            return Boolean.valueOf(z4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                Function1 function12 = (Function1) objR;
                int i114 = i3 << 3;
                j(transitionY12, function12, bVar4, dVarC, fVarC, ps4Var, dVarF, (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar4 = dVarC;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                str2 = str;
                bVar3 = bVar2;
                dVar4 = dVar3;
                fVar3 = fVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar5, int i115) {
                        AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        dVar3 = dVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                fVar2 = fVar;
                if (dVarF.x(fVar2)) {
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
                if ((196608 & i) == 0) {
                    if (dVarF.T(ps4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i3 & 1)) {
                    if (i12 != 0) {
                        bVar4 = b.INSTANCE;
                        i10 = i8;
                    } else {
                        i10 = i8;
                        bVar4 = bVar2;
                    }
                    if (i4 != 0) {
                        dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                    } else {
                        dVarC = dVar3;
                    }
                    if (i6 != 0) {
                        fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i10 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (e.k()) {
                        e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    Transition transitionY13 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objR = dVarF.R();
                    if (objR == d.INSTANCE.a()) {
                        objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                            public final Boolean a(boolean z4) {
                                return Boolean.valueOf(z4);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return a(((Boolean) obj).booleanValue());
                            }
                        };
                        dVarF.L(objR);
                    }
                    Function1 function13 = (Function1) objR;
                    int i115 = i3 << 3;
                    j(transitionY13, function13, bVar4, dVarC, fVarC, ps4Var, dVarF, (i115 & 57344) | (i115 & 896) | 48 | (i115 & 7168) | (i3 & 458752));
                    if (e.k()) {
                        e.n();
                    }
                    str2 = str3;
                    bVar3 = bVar4;
                    dVar4 = dVarC;
                    fVar3 = fVarC;
                } else {
                    dVarF.q();
                    str2 = str;
                    bVar3 = bVar2;
                    dVar4 = dVar3;
                    fVar3 = fVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((d) obj, ((Number) obj2).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar5, int i116) {
                            AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                    i10 = i8;
                } else {
                    i10 = i8;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                } else {
                    dVarC = dVar3;
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                Transition transitionY14 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                        public final Boolean a(boolean z4) {
                            return Boolean.valueOf(z4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                Function1 function14 = (Function1) objR;
                int i116 = i3 << 3;
                j(transitionY14, function14, bVar4, dVarC, fVarC, ps4Var, dVarF, (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar4 = dVarC;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                str2 = str;
                bVar3 = bVar2;
                dVar4 = dVar3;
                fVar3 = fVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar5, int i117) {
                        AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        fVar2 = fVar;
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
            if ((196608 & i) == 0) {
                if (dVarF.T(ps4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i3 & 1)) {
                if (i12 != 0) {
                    bVar4 = b.INSTANCE;
                    i10 = i8;
                } else {
                    i10 = i8;
                    bVar4 = bVar2;
                }
                if (i4 != 0) {
                    dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
                } else {
                    dVarC = dVar3;
                }
                if (i6 != 0) {
                    fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i10 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (e.k()) {
                    e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                Transition transitionY15 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
                objR = dVarF.R();
                if (objR == d.INSTANCE.a()) {
                    objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                        public final Boolean a(boolean z4) {
                            return Boolean.valueOf(z4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return a(((Boolean) obj).booleanValue());
                        }
                    };
                    dVarF.L(objR);
                }
                Function1 function15 = (Function1) objR;
                int i117 = i3 << 3;
                j(transitionY15, function15, bVar4, dVarC, fVarC, ps4Var, dVarF, (i117 & 57344) | (i117 & 896) | 48 | (i117 & 7168) | (i3 & 458752));
                if (e.k()) {
                    e.n();
                }
                str2 = str3;
                bVar3 = bVar4;
                dVar4 = dVarC;
                fVar3 = fVarC;
            } else {
                dVarF.q();
                str2 = str;
                bVar3 = bVar2;
                dVar4 = dVar3;
                fVar3 = fVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar5, int i118) {
                        AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        if ((196608 & i) == 0) {
            if (dVarF.T(ps4Var)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i3 & 1)) {
            if (i12 != 0) {
                bVar4 = b.INSTANCE;
                i10 = i8;
            } else {
                i10 = i8;
                bVar4 = bVar2;
            }
            if (i4 != 0) {
                dVarC = EnterExitTransitionKt.o(null, 0.0f, 3, null).c(EnterExitTransitionKt.k(null, null, false, null, 15, null));
            } else {
                dVarC = dVar3;
            }
            if (i6 != 0) {
                fVarC = EnterExitTransitionKt.y(null, null, false, null, 15, null).c(EnterExitTransitionKt.q(null, 0.0f, 3, null));
            } else {
                fVarC = fVar2;
            }
            if (i10 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (e.k()) {
                e.o(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
            }
            Transition transitionY16 = TransitionKt.y(Boolean.valueOf(z2), str3, dVarF, (i3 & 14) | ((i3 >> 9) & 112), 0);
            objR = dVarF.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                    public final Boolean a(boolean z4) {
                        return Boolean.valueOf(z4);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return a(((Boolean) obj).booleanValue());
                    }
                };
                dVarF.L(objR);
            }
            Function1 function16 = (Function1) objR;
            int i118 = i3 << 3;
            j(transitionY16, function16, bVar4, dVarC, fVarC, ps4Var, dVarF, (i118 & 57344) | (i118 & 896) | 48 | (i118 & 7168) | (i3 & 458752));
            if (e.k()) {
                e.n();
            }
            str2 = str3;
            bVar3 = bVar4;
            dVar4 = dVarC;
            fVar3 = fVarC;
        } else {
            dVarF.q();
            str2 = str;
            bVar3 = bVar2;
            dVar4 = dVar3;
            fVar3 = fVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar5, int i119) {
                    AnimatedVisibilityKt.i(z2, bVar3, dVar4, fVar3, str2, ps4Var, dVar5, saa.a(i | 1), i2);
                }
            });
        }
    }

    public static final <T> void j(final Transition<T> transition, final Function1<? super T, Boolean> function1, final b bVar, final d dVar, final f fVar, final ps4<? super xq, ? super d, ? super Integer, Unit> ps4Var, d dVar2, final int i) {
        int i2;
        f fVar2;
        d dVarF = dVar2.F(1706321816);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.x(bVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= dVarF.x(dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            fVar2 = fVar;
            i2 |= dVarF.x(fVar2) ? 16384 : 8192;
        } else {
            fVar2 = fVar;
        }
        if ((i & 196608) == 0) {
            i2 |= dVarF.T(ps4Var) ? 131072 : 65536;
        }
        if (dVarF.g((74899 & i2) != 74898, i2 & 1)) {
            if (e.k()) {
                e.o(1706321816, i2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:678)");
            }
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objR = dVarF.R();
            if (z || objR == d.INSTANCE.a()) {
                objR = new ps4<j, dj7, kx1, fj7>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    public final fj7 a(j jVar, dj7 dj7Var, long j) {
                        long jC;
                        final o oVarR0 = dj7Var.r0(j);
                        if (!jVar.G1() || ((Boolean) function1.invoke(transition.w())).booleanValue()) {
                            jC = q16.c((((long) oVarR0.getWidth()) << 32) | (((long) oVarR0.getHeight()) & 4294967295L));
                        } else {
                            jC = q16.INSTANCE.a();
                        }
                        return j.Q1(jVar, (int) (jC >> 32), (int) (jC & 4294967295L), null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((o.a) obj);
                                return Unit.a;
                            }

                            public final void invoke(o.a aVar) {
                                o.a.z(aVar, oVarR0, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return a((j) obj, (dj7) obj2, ((kx1) obj3).getValue());
                    }
                };
                dVarF.L(objR);
            }
            b bVarA = zn6.a(bVar, (ps4) objR);
            Object objR2 = dVarF.R();
            if (objR2 == d.INSTANCE.a()) {
                objR2 = new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                        return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
                    }
                };
                dVarF.L(objR2);
            }
            a(transition, function1, bVarA, dVar, fVar2, (Function2) objR2, null, ps4Var, dVarF, i3 | 196608 | i4 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar3, int i5) {
                    AnimatedVisibilityKt.j(transition, function1, bVar, dVar, fVar, ps4Var, dVar3, saa.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(Transition<EnterExitState> transition) {
        EnterExitState enterExitStateP = transition.p();
        EnterExitState enterExitState = EnterExitState.PostExit;
        return enterExitStateP == enterExitState && transition.w() == enterExitState;
    }

    private static final <T> EnterExitState n(Transition<T> transition, Function1<? super T, Boolean> function1, T t, d dVar, int i) {
        EnterExitState enterExitState;
        if (e.k()) {
            e.o(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:848)");
        }
        dVar.V(-422486745, transition);
        if (transition.B()) {
            dVar.y(-212166497);
            dVar.u();
            if (((Boolean) function1.invoke(t)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) function1.invoke(transition.p())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
        } else {
            dVar.y(-211892364);
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = s0.e(Boolean.FALSE, null, 2, null);
                dVar.L(objR);
            }
            o58 o58Var = (o58) objR;
            if (((Boolean) function1.invoke(transition.p())).booleanValue()) {
                o58Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(t)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) o58Var.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
            dVar.u();
        }
        dVar.Z();
        if (e.k()) {
            e.n();
        }
        return enterExitState;
    }
}
