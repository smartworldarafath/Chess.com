package androidx.compose.p000animation;

import androidx.compose.p000animation.EnterExitTransitionKt;
import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.t;
import com.google.android.yg4;
import com.google.inputmethod.ChangeSize;
import com.google.inputmethod.Fade;
import com.google.inputmethod.Scale;
import com.google.inputmethod.Slide;
import com.google.inputmethod.TransitionData;
import com.google.inputmethod.ei1;
import com.google.inputmethod.g16;
import com.google.inputmethod.j05;
import com.google.inputmethod.kce;
import com.google.inputmethod.lr;
import com.google.inputmethod.o58;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.rr;
import com.google.inputmethod.tc;
import com.google.inputmethod.tjd;
import com.google.inputmethod.w2c;
import com.google.inputmethod.w2e;
import com.google.inputmethod.xa4;
import com.google.inputmethod.xdd;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0012\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0017\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010!\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b!\u0010\"\u001aI\u0010%\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b%\u0010&\u001aI\u0010*\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b*\u0010+\u001aI\u0010.\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020,2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b.\u0010/\u001aI\u00101\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b1\u00102\u001aI\u00104\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020,2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b4\u00105\u001a5\u00107\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b7\u0010\u0010\u001a5\u00109\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b9\u0010\u0010\u001a5\u0010;\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b;\u0010\u0013\u001a5\u0010=\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b=\u0010\u0013\u001a\u0013\u0010>\u001a\u00020\u001c*\u00020'H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010@\u001a\u00020\u001c*\u00020,H\u0002¢\u0006\u0004\b@\u0010A\u001aK\u0010L\u001a\u00020K*\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\b2\b\b\u0002\u0010F\u001a\u00020\u001e2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001e0G2\u0006\u0010J\u001a\u00020IH\u0001¢\u0006\u0004\bL\u0010M\u001a!\u0010N\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u0004H\u0001¢\u0006\u0004\bN\u0010O\u001a!\u0010P\u001a\u00020\b*\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010E\u001a\u00020\bH\u0001¢\u0006\u0004\bP\u0010Q\u001a1\u0010S\u001a\u00020R*\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0003¢\u0006\u0004\bS\u0010T\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X\"\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00010Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\"\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020^0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\\\"\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u000b0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\\\"\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\r0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\\¨\u0006f²\u0006\u000e\u0010d\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010e\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/google/android/xa4;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/d;", "n", "(Lcom/google/android/xa4;F)Landroidx/compose/animation/d;", "targetAlpha", "Landroidx/compose/animation/f;", "p", "(Lcom/google/android/xa4;F)Landroidx/compose/animation/f;", "Lcom/google/android/g16;", "Lkotlin/Function1;", "Lcom/google/android/q16;", "initialOffset", "B", "(Lcom/google/android/xa4;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/d;", "targetOffset", "H", "(Lcom/google/android/xa4;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/f;", "initialScale", "Landroidx/compose/ui/graphics/t;", "transformOrigin", "r", "(Lcom/google/android/xa4;FJ)Landroidx/compose/animation/d;", "targetScale", "t", "(Lcom/google/android/xa4;FJ)Landroidx/compose/animation/f;", "Lcom/google/android/tc;", "expandFrom", "", "clip", "initialSize", "j", "(Lcom/google/android/xa4;Lcom/google/android/tc;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/d;", "shrinkTowards", "targetSize", "x", "(Lcom/google/android/xa4;Lcom/google/android/tc;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/f;", "Lcom/google/android/tc$b;", "", "initialWidth", "h", "(Lcom/google/android/xa4;Lcom/google/android/tc$b;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/d;", "Lcom/google/android/tc$c;", "initialHeight", "l", "(Lcom/google/android/xa4;Lcom/google/android/tc$c;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/d;", "targetWidth", "v", "(Lcom/google/android/xa4;Lcom/google/android/tc$b;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/f;", "targetHeight", "z", "(Lcom/google/android/xa4;Lcom/google/android/tc$c;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/animation/f;", "initialOffsetX", "D", "initialOffsetY", "F", "targetOffsetX", "J", "targetOffsetY", "L", "N", "(Lcom/google/android/tc$b;)Lcom/google/android/tc;", "O", "(Lcom/google/android/tc$c;)Lcom/google/android/tc;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "trackActiveEnterExit", "Lkotlin/Function0;", "isEnabled", "", "label", "Landroidx/compose/ui/b;", "g", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/d;Landroidx/compose/animation/f;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/d;II)Landroidx/compose/ui/b;", "P", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/d;Landroidx/compose/runtime/d;I)Landroidx/compose/animation/d;", "S", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/f;Landroidx/compose/runtime/d;I)Landroidx/compose/animation/f;", "Lcom/google/android/j05;", "e", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Ljava/lang/String;Landroidx/compose/runtime/d;I)Lcom/google/android/j05;", "Lcom/google/android/tjd;", "Lcom/google/android/rr;", "a", "Lcom/google/android/tjd;", "TransformOriginVectorConverter", "Lcom/google/android/w2c;", "b", "Lcom/google/android/w2c;", "DefaultAlphaAndScaleSpring", "Lcom/google/android/ei1;", "c", "DefaultColorAnimationSpec", "d", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EnterExitTransitionKt {
    private static final tjd<t, rr> a = w2e.K(new Function1<t, rr>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        public final rr a(long j) {
            return new rr(t.f(j), t.g(j));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((t) obj).getPackedValue());
        }
    }, new Function1<rr, t>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        public final long a(rr rrVar) {
            return xdd.a(rrVar.getV1(), rrVar.getV2());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return t.b(a((rr) obj));
        }
    });
    private static final w2c<Float> b = lr.j(0.0f, 400.0f, null, 5, null);
    private static final w2c<ei1> c = lr.j(0.0f, 400.0f, null, 5, null);
    private static final w2c<g16> d = lr.j(0.0f, 400.0f, g16.c(kce.c(g16.INSTANCE)), 1, null);
    private static final w2c<q16> e = lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);

    public static /* synthetic */ f A(xa4 xa4Var, tc.c cVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            cVar = tc.INSTANCE.a();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                public final Integer a(int i2) {
                    return 0;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return z(xa4Var, cVar, z, function1);
    }

    public static final d B(xa4<g16> xa4Var, Function1<? super q16, g16> function1) {
        return new e(new TransitionData(null, new Slide(function1, xa4Var), null, null, null, false, null, 125, null));
    }

    public static /* synthetic */ d C(xa4 xa4Var, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, g16.c(kce.c(g16.INSTANCE)), 1, null);
        }
        return B(xa4Var, function1);
    }

    public static final d D(xa4<g16> xa4Var, final Function1<? super Integer, Integer> function1) {
        return B(xa4Var, new Function1<q16, g16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j) {
                return g16.f((((long) ((Number) function1.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return g16.c(a(((q16) obj).getPackedValue()));
            }
        });
    }

    public static /* synthetic */ d E(xa4 xa4Var, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, g16.c(kce.c(g16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                public final Integer a(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return D(xa4Var, function1);
    }

    public static final d F(xa4<g16> xa4Var, final Function1<? super Integer, Integer> function1) {
        return B(xa4Var, new Function1<q16, g16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j) {
                return g16.f((((long) ((Number) function1.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L) | (((long) 0) << 32));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return g16.c(a(((q16) obj).getPackedValue()));
            }
        });
    }

    public static /* synthetic */ d G(xa4 xa4Var, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, g16.c(kce.c(g16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                public final Integer a(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return F(xa4Var, function1);
    }

    public static final f H(xa4<g16> xa4Var, Function1<? super q16, g16> function1) {
        return new g(new TransitionData(null, new Slide(function1, xa4Var), null, null, null, false, null, 125, null));
    }

    public static /* synthetic */ f I(xa4 xa4Var, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, g16.c(kce.c(g16.INSTANCE)), 1, null);
        }
        return H(xa4Var, function1);
    }

    public static final f J(xa4<g16> xa4Var, final Function1<? super Integer, Integer> function1) {
        return H(xa4Var, new Function1<q16, g16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j) {
                return g16.f((((long) ((Number) function1.invoke(Integer.valueOf((int) (j >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return g16.c(a(((q16) obj).getPackedValue()));
            }
        });
    }

    public static /* synthetic */ f K(xa4 xa4Var, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, g16.c(kce.c(g16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1
                public final Integer a(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return J(xa4Var, function1);
    }

    public static final f L(xa4<g16> xa4Var, final Function1<? super Integer, Integer> function1) {
        return H(xa4Var, new Function1<q16, g16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j) {
                return g16.f((((long) ((Number) function1.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L) | (((long) 0) << 32));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return g16.c(a(((q16) obj).getPackedValue()));
            }
        });
    }

    public static /* synthetic */ f M(xa4 xa4Var, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, g16.c(kce.c(g16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                public final Integer a(int i2) {
                    return Integer.valueOf((-i2) / 2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return L(xa4Var, function1);
    }

    private static final tc N(tc.b bVar) {
        tc.Companion companion = tc.INSTANCE;
        if (Intrinsics.e(bVar, companion.k())) {
            return companion.h();
        }
        return Intrinsics.e(bVar, companion.j()) ? companion.f() : companion.e();
    }

    private static final tc O(tc.c cVar) {
        tc.Companion companion = tc.INSTANCE;
        if (Intrinsics.e(cVar, companion.l())) {
            return companion.m();
        }
        return Intrinsics.e(cVar, companion.a()) ? companion.b() : companion.e();
    }

    public static final d P(Transition<EnterExitState> transition, d dVar, d dVar2, int i) {
        if (e.k()) {
            e.o(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:1004)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && dVar2.x(transition)) || (i & 6) == 4;
        Object objR = dVar2.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = s0.e(dVar, null, 2, null);
            dVar2.L(objR);
        }
        o58 o58Var = (o58) objR;
        if (transition.p() == transition.w() && transition.p() == EnterExitState.Visible) {
            if (transition.B()) {
                R(o58Var, dVar);
            } else {
                R(o58Var, d.INSTANCE.a());
            }
        } else if (transition.w() == EnterExitState.Visible) {
            R(o58Var, Q(o58Var).c(dVar));
        }
        d dVarQ = Q(o58Var);
        if (e.k()) {
            e.n();
        }
        return dVarQ;
    }

    private static final d Q(o58<d> o58Var) {
        return o58Var.getValue();
    }

    private static final void R(o58<d> o58Var, d dVar) {
        o58Var.setValue(dVar);
    }

    public static final f S(Transition<EnterExitState> transition, f fVar, d dVar, int i) {
        if (e.k()) {
            e.o(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:1024)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && dVar.x(transition)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = s0.e(fVar, null, 2, null);
            dVar.L(objR);
        }
        o58 o58Var = (o58) objR;
        if (transition.p() == transition.w() && transition.p() == EnterExitState.Visible) {
            if (transition.B()) {
                U(o58Var, fVar);
            } else {
                U(o58Var, f.INSTANCE.a());
            }
        } else if (transition.w() != EnterExitState.Visible) {
            U(o58Var, T(o58Var).c(fVar));
        }
        f fVarT = T(o58Var);
        if (e.k()) {
            e.n();
        }
        return fVarT;
    }

    private static final f T(o58<f> o58Var) {
        return o58Var.getValue();
    }

    private static final void U(o58<f> o58Var, f fVar) {
        o58Var.setValue(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011e A[PHI: r1
  0x011e: PHI (r1v11 androidx.compose.animation.d) = (r1v9 androidx.compose.animation.d), (r1v12 androidx.compose.animation.d) binds: [B:42:0x011c, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139 A[PHI: r2
  0x0139: PHI (r2v10 androidx.compose.animation.f) = (r2v8 androidx.compose.animation.f), (r2v11 androidx.compose.animation.f) binds: [B:52:0x0137, B:48:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    private static final j05 e(final Transition<EnterExitState> transition, d dVar, f fVar, String str, d dVar2, int i) {
        final Transition.a aVar;
        final Transition.a aVar2;
        d dVar3;
        boolean z;
        f fVar2;
        boolean z2;
        boolean zT;
        Object objR;
        d dVar4 = dVar2;
        if (e.k()) {
            e.o(642253525, i, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:1052)");
        }
        boolean z3 = true;
        boolean z4 = (dVar.getData().getFade() == null && fVar.getData().getFade() == null) ? false : true;
        boolean z5 = (dVar.getData().getScale() == null && fVar.getData().getScale() == null) ? false : true;
        Transition.a aVarP = null;
        if (z4) {
            dVar4.y(-703879421);
            tjd<Float, qr> tjdVarN = w2e.N(yg4.a);
            Object objR2 = dVar4.R();
            if (objR2 == d.INSTANCE.a()) {
                objR2 = str + " alpha";
                dVar4.L(objR2);
            }
            Transition.a aVarP2 = TransitionKt.p(transition, tjdVarN, (String) objR2, dVar4, (i & 14) | 384, 0);
            dVar4 = dVar4;
            dVar4.u();
            aVar = aVarP2;
        } else {
            dVar4.y(-703709976);
            dVar4.u();
            aVar = null;
        }
        if (z5) {
            dVar4.y(-703642333);
            tjd<Float, qr> tjdVarN2 = w2e.N(yg4.a);
            Object objR3 = dVar4.R();
            if (objR3 == d.INSTANCE.a()) {
                objR3 = str + " scale";
                dVar4.L(objR3);
            }
            Transition.a aVarP3 = TransitionKt.p(transition, tjdVarN2, (String) objR3, dVar4, (i & 14) | 384, 0);
            dVar4.u();
            aVar2 = aVarP3;
        } else {
            dVar4.y(-703472888);
            dVar4.u();
            aVar2 = null;
        }
        if (z5) {
            dVar4.y(-703395232);
            aVarP = TransitionKt.p(transition, a, "TransformOriginInterruptionHandling", dVar4, (i & 14) | 384, 0);
            dVar4.u();
        } else {
            dVar4.y(-703222904);
            dVar4.u();
        }
        boolean zT2 = dVar4.T(aVar);
        if (((i & 112) ^ 48) > 32) {
            dVar3 = dVar;
            if (dVar4.x(dVar3)) {
                z = true;
            }
            boolean z6 = zT2 | z;
            if (((i & 896) ^ 384) > 256) {
                fVar2 = fVar;
                if (!dVar4.x(fVar2)) {
                    z2 = true;
                }
                boolean zT3 = z6 | z2 | dVar4.T(aVar2);
                if ((((i & 14) ^ 6) > 4 || !dVar4.x(transition)) && (i & 6) != 4) {
                }
                zT = zT3 | z3 | dVar4.T(aVarP);
                objR = dVar4.R();
                if (zT || objR == d.INSTANCE.a()) {
                    final d dVar5 = dVar3;
                    final f fVar3 = fVar2;
                    final Transition.a aVar3 = aVarP;
                    j05 j05Var = new j05() { // from class: com.google.android.kt3
                        @Override // com.google.inputmethod.j05
                        public final Function1 init() {
                            return EnterExitTransitionKt.f(aVar, aVar2, transition, dVar5, fVar3, aVar3);
                        }
                    };
                    dVar4.L(j05Var);
                    objR = j05Var;
                }
                j05 j05Var2 = (j05) objR;
                if (e.k()) {
                    e.n();
                }
                return j05Var2;
            }
            fVar2 = fVar;
            if ((i & 384) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zT4 = z6 | z2 | dVar4.T(aVar2);
            z3 = ((i & 14) ^ 6) > 4 ? false : false;
            zT = zT4 | z3 | dVar4.T(aVarP);
            objR = dVar4.R();
            if (zT) {
                final d dVar6 = dVar3;
                final f fVar4 = fVar2;
                final Transition.a aVar4 = aVarP;
                j05 j05Var3 = new j05() { // from class: com.google.android.kt3
                    @Override // com.google.inputmethod.j05
                    public final Function1 init() {
                        return EnterExitTransitionKt.f(aVar, aVar2, transition, dVar6, fVar4, aVar4);
                    }
                };
                dVar4.L(j05Var3);
                objR = j05Var3;
            } else {
                final d dVar7 = dVar3;
                final f fVar5 = fVar2;
                final Transition.a aVar5 = aVarP;
                j05 j05Var4 = new j05() { // from class: com.google.android.kt3
                    @Override // com.google.inputmethod.j05
                    public final Function1 init() {
                        return EnterExitTransitionKt.f(aVar, aVar2, transition, dVar7, fVar5, aVar5);
                    }
                };
                dVar4.L(j05Var4);
                objR = j05Var4;
            }
            j05 j05Var5 = (j05) objR;
            if (e.k()) {
                e.n();
            }
            return j05Var5;
        }
        dVar3 = dVar;
        if ((i & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean z7 = zT2 | z;
        if (((i & 896) ^ 384) > 256) {
            fVar2 = fVar;
            if (!dVar4.x(fVar2)) {
                z2 = true;
            }
            boolean zT5 = z7 | z2 | dVar4.T(aVar2);
            if (((i & 14) ^ 6) > 4) {
            }
            zT = zT5 | z3 | dVar4.T(aVarP);
            objR = dVar4.R();
            if (zT) {
                final d dVar8 = dVar3;
                final f fVar6 = fVar2;
                final Transition.a aVar6 = aVarP;
                j05 j05Var6 = new j05() { // from class: com.google.android.kt3
                    @Override // com.google.inputmethod.j05
                    public final Function1 init() {
                        return EnterExitTransitionKt.f(aVar, aVar2, transition, dVar8, fVar6, aVar6);
                    }
                };
                dVar4.L(j05Var6);
                objR = j05Var6;
            } else {
                final d dVar9 = dVar3;
                final f fVar7 = fVar2;
                final Transition.a aVar7 = aVarP;
                j05 j05Var7 = new j05() { // from class: com.google.android.kt3
                    @Override // com.google.inputmethod.j05
                    public final Function1 init() {
                        return EnterExitTransitionKt.f(aVar, aVar2, transition, dVar9, fVar7, aVar7);
                    }
                };
                dVar4.L(j05Var7);
                objR = j05Var7;
            }
            j05 j05Var8 = (j05) objR;
            if (e.k()) {
                e.n();
            }
            return j05Var8;
        }
        fVar2 = fVar;
        if ((i & 384) == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zT6 = z7 | z2 | dVar4.T(aVar2);
        if (((i & 14) ^ 6) > 4) {
        }
        zT = zT6 | z3 | dVar4.T(aVarP);
        objR = dVar4.R();
        if (zT) {
            final d dVar10 = dVar3;
            final f fVar8 = fVar2;
            final Transition.a aVar8 = aVarP;
            j05 j05Var9 = new j05() { // from class: com.google.android.kt3
                @Override // com.google.inputmethod.j05
                public final Function1 init() {
                    return EnterExitTransitionKt.f(aVar, aVar2, transition, dVar10, fVar8, aVar8);
                }
            };
            dVar4.L(j05Var9);
            objR = j05Var9;
        } else {
            final d dVar11 = dVar3;
            final f fVar9 = fVar2;
            final Transition.a aVar9 = aVarP;
            j05 j05Var10 = new j05() { // from class: com.google.android.kt3
                @Override // com.google.inputmethod.j05
                public final Function1 init() {
                    return EnterExitTransitionKt.f(aVar, aVar2, transition, dVar11, fVar9, aVar9);
                }
            };
            dVar4.L(j05Var10);
            objR = j05Var10;
        }
        j05 j05Var11 = (j05) objR;
        if (e.k()) {
            e.n();
        }
        return j05Var11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    public static final Function1 f(Transition.a aVar, Transition.a aVar2, Transition transition, final d dVar, final f fVar, Transition.a aVar3) {
        final t tVarB;
        final q6c q6cVarA = aVar != null ? aVar.a(new Function1<Transition.b<EnterExitState>, xa4<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final xa4<Float> invoke(Transition.b<EnterExitState> bVar) {
                xa4<Float> xa4VarB;
                xa4<Float> xa4VarB2;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (bVar.c(enterExitState, enterExitState2)) {
                    Fade fade = dVar.getData().getFade();
                    return (fade == null || (xa4VarB2 = fade.b()) == null) ? EnterExitTransitionKt.b : xa4VarB2;
                }
                if (!bVar.c(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.b;
                }
                Fade fade2 = fVar.getData().getFade();
                return (fade2 == null || (xa4VarB = fade2.b()) == null) ? EnterExitTransitionKt.b : xa4VarB;
            }
        }, new Function1<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke(EnterExitState enterExitState) throws NoWhenBranchMatchedException {
                int i = a.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float alpha = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        Fade fade = dVar.getData().getFade();
                        if (fade != null) {
                            alpha = fade.getAlpha();
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Fade fade2 = fVar.getData().getFade();
                        if (fade2 != null) {
                            alpha = fade2.getAlpha();
                        }
                    }
                }
                return Float.valueOf(alpha);
            }
        }) : null;
        final q6c q6cVarA2 = aVar2 != null ? aVar2.a(new Function1<Transition.b<EnterExitState>, xa4<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final xa4<Float> invoke(Transition.b<EnterExitState> bVar) {
                xa4<Float> xa4VarA;
                xa4<Float> xa4VarA2;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (bVar.c(enterExitState, enterExitState2)) {
                    Scale scale = dVar.getData().getScale();
                    return (scale == null || (xa4VarA2 = scale.a()) == null) ? EnterExitTransitionKt.b : xa4VarA2;
                }
                if (!bVar.c(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.b;
                }
                Scale scale2 = fVar.getData().getScale();
                return (scale2 == null || (xa4VarA = scale2.a()) == null) ? EnterExitTransitionKt.b : xa4VarA;
            }
        }, new Function1<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke(EnterExitState enterExitState) throws NoWhenBranchMatchedException {
                int i = a.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float scale = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        Scale scale2 = dVar.getData().getScale();
                        if (scale2 != null) {
                            scale = scale2.getScale();
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Scale scale3 = fVar.getData().getScale();
                        if (scale3 != null) {
                            scale = scale3.getScale();
                        }
                    }
                }
                return Float.valueOf(scale);
            }
        }) : null;
        if (transition.p() == EnterExitState.PreEnter) {
            Scale scale = dVar.getData().getScale();
            if (scale == null && (scale = fVar.getData().getScale()) == null) {
                tVarB = null;
            } else {
                tVarB = t.b(scale.getTransformOrigin());
            }
        } else {
            Scale scale2 = fVar.getData().getScale();
            if (scale2 == null && (scale2 = dVar.getData().getScale()) == null) {
                tVarB = null;
            } else {
                tVarB = t.b(scale2.getTransformOrigin());
            }
        }
        final q6c q6cVarA3 = aVar3 != null ? aVar3.a(new Function1<Transition.b<EnterExitState>, xa4<t>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final xa4<t> invoke(Transition.b<EnterExitState> bVar) {
                return lr.j(0.0f, 0.0f, null, 7, null);
            }
        }, new Function1<EnterExitState, t>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final long a(EnterExitState enterExitState) throws NoWhenBranchMatchedException {
                t tVarB2;
                int i = a.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i != 1) {
                    tVarB2 = null;
                    if (i == 2) {
                        Scale scale3 = dVar.getData().getScale();
                        if (scale3 != null || (scale3 = fVar.getData().getScale()) != null) {
                            tVarB2 = t.b(scale3.getTransformOrigin());
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Scale scale4 = fVar.getData().getScale();
                        if (scale4 != null || (scale4 = dVar.getData().getScale()) != null) {
                            tVarB2 = t.b(scale4.getTransformOrigin());
                        }
                    }
                } else {
                    tVarB2 = tVarB;
                }
                return tVarB2 != null ? tVarB2.getPackedValue() : t.INSTANCE.a();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return t.b(a((EnterExitState) obj));
            }
        }) : null;
        return new Function1<m, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(m mVar) {
                q6c<Float> q6cVar = q6cVarA;
                mVar.c(q6cVar != null ? q6cVar.getValue().floatValue() : 1.0f);
                q6c<Float> q6cVar2 = q6cVarA2;
                mVar.G(q6cVar2 != null ? q6cVar2.getValue().floatValue() : 1.0f);
                q6c<Float> q6cVar3 = q6cVarA2;
                mVar.M(q6cVar3 != null ? q6cVar3.getValue().floatValue() : 1.0f);
                q6c<t> q6cVar4 = q6cVarA3;
                mVar.i0(q6cVar4 != null ? q6cVar4.getValue().getPackedValue() : t.INSTANCE.a());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((m) obj);
                return Unit.a;
            }
        };
    }

    public static final b g(Transition<EnterExitState> transition, d dVar, f fVar, boolean z, Function0<Boolean> function0, String str, d dVar2, int i, int i2) {
        final Function0<Boolean> function1;
        d dVar3;
        f fVar2;
        Transition.a aVar;
        Transition.a aVar2;
        ChangeSize changeSize;
        boolean z2 = true;
        boolean z3 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            Object objR = dVar2.R();
            if (objR == d.INSTANCE.a()) {
                objR = new Function0<Boolean>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
                    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                    public final Boolean m2invoke() {
                        return Boolean.TRUE;
                    }
                };
                dVar2.L(objR);
            }
            function1 = (Function0) objR;
        } else {
            function1 = function0;
        }
        if (e.k()) {
            e.o(-1899614022, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:933)");
        }
        if (z3) {
            dVar2.y(-167965831);
            d dVarP = P(transition, dVar, dVar2, i & 126);
            dVar2.u();
            dVar3 = dVarP;
        } else {
            dVar2.y(-167964673);
            dVar2.u();
            dVar3 = dVar;
        }
        if (z3) {
            dVar2.y(-167962954);
            f fVarS = S(transition, fVar, dVar2, (i & 14) | ((i >> 3) & 112));
            dVar2.u();
            fVar2 = fVarS;
        } else {
            dVar2.y(-167961890);
            dVar2.u();
            fVar2 = fVar;
        }
        dVar3.getData().g();
        fVar2.getData().g();
        boolean z4 = (dVar3.getData().getSlide() == null && fVar2.getData().getSlide() == null) ? false : true;
        boolean z5 = (dVar3.getData().getChangeSize() == null && fVar2.getData().getChangeSize() == null) ? false : true;
        Transition.a aVarP = null;
        if (z4) {
            dVar2.y(-911488127);
            tjd<g16, rr> tjdVarP = w2e.P(g16.INSTANCE);
            Object objR2 = dVar2.R();
            if (objR2 == d.INSTANCE.a()) {
                objR2 = str + " slide";
                dVar2.L(objR2);
            }
            Transition.a aVarP2 = TransitionKt.p(transition, tjdVarP, (String) objR2, dVar2, (i & 14) | 384, 0);
            dVar2.u();
            aVar = aVarP2;
        } else {
            dVar2.y(-911382324);
            dVar2.u();
            aVar = null;
        }
        if (z5) {
            dVar2.y(-911290533);
            tjd<q16, rr> tjdVarQ = w2e.Q(q16.INSTANCE);
            Object objR3 = dVar2.R();
            if (objR3 == d.INSTANCE.a()) {
                objR3 = str + " shrink/expand";
                dVar2.L(objR3);
            }
            Transition.a aVarP3 = TransitionKt.p(transition, tjdVarQ, (String) objR3, dVar2, (i & 14) | 384, 0);
            dVar2.u();
            aVar2 = aVarP3;
        } else {
            dVar2.y(-911179709);
            dVar2.u();
            aVar2 = null;
        }
        if (z5) {
            dVar2.y(-911106083);
            tjd<g16, rr> tjdVarP2 = w2e.P(g16.INSTANCE);
            Object objR4 = dVar2.R();
            if (objR4 == d.INSTANCE.a()) {
                objR4 = str + " InterruptionHandlingOffset";
                dVar2.L(objR4);
            }
            aVarP = TransitionKt.p(transition, tjdVarP2, (String) objR4, dVar2, (i & 14) | 384, 0);
            dVar2.u();
        } else {
            dVar2.y(-910935677);
            dVar2.u();
        }
        ChangeSize changeSize2 = dVar3.getData().getChangeSize();
        final boolean z6 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = fVar2.getData().getChangeSize()) == null || changeSize.getClip()) && z5) ? false : true;
        dVar3.getData().g();
        dVar3.getData().g();
        fVar2.getData().g();
        fVar2.getData().g();
        androidx.compose.ui.graphics.colorspace.e.a.G();
        dVar2.y(-910130296);
        dVar2.u();
        b.Companion companion = b.INSTANCE;
        dVar3.getData().g();
        fVar2.getData().g();
        d dVar4 = dVar3;
        f fVar3 = fVar2;
        j05 j05VarE = e(transition, dVar4, fVar3, str, dVar2, (i & 14) | ((i >> 6) & 7168));
        b.Companion companion2 = b.INSTANCE;
        boolean zA = dVar2.A(z6);
        if ((((57344 & i) ^ 24576) <= 16384 || !dVar2.x(function1)) && (i & 24576) != 16384) {
            z2 = false;
        }
        boolean z7 = zA | z2;
        Object objR5 = dVar2.R();
        if (z7 || objR5 == d.INSTANCE.a()) {
            objR5 = new Function1<m, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(m mVar) {
                    mVar.l(!z6 && ((Boolean) function1.invoke()).booleanValue());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((m) obj);
                    return Unit.a;
                }
            };
            dVar2.L(objR5);
        }
        b bVarThen = companion2.then(l.c(companion2, (Function1) objR5)).then(new c(transition, aVar2, aVarP, aVar, dVar4, fVar3, function1, j05VarE)).then(companion);
        if (e.k()) {
            e.n();
        }
        return bVarThen;
    }

    public static final d h(xa4<q16> xa4Var, tc.b bVar, boolean z, final Function1<? super Integer, Integer> function1) {
        return j(xa4Var, N(bVar), z, new Function1<q16, q16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j) {
                int iIntValue = ((Number) function1.invoke(Integer.valueOf((int) (j >> 32)))).intValue();
                return q16.c((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iIntValue) << 32));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return q16.b(a(((q16) obj).getPackedValue()));
            }
        });
    }

    public static /* synthetic */ d i(xa4 xa4Var, tc.b bVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            bVar = tc.INSTANCE.j();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                public final Integer a(int i2) {
                    return 0;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return h(xa4Var, bVar, z, function1);
    }

    public static final d j(xa4<q16> xa4Var, tc tcVar, boolean z, Function1<? super q16, q16> function1) {
        return new e(new TransitionData(null, null, new ChangeSize(tcVar, function1, xa4Var, z), null, null, false, null, 123, null));
    }

    public static /* synthetic */ d k(xa4 xa4Var, tc tcVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            tcVar = tc.INSTANCE.c();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<q16, q16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                public final long a(long j) {
                    long j2 = 0;
                    return q16.c((j2 & 4294967295L) | (j2 << 32));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return q16.b(a(((q16) obj2).getPackedValue()));
                }
            };
        }
        return j(xa4Var, tcVar, z, function1);
    }

    public static final d l(xa4<q16> xa4Var, tc.c cVar, boolean z, final Function1<? super Integer, Integer> function1) {
        return j(xa4Var, O(cVar), z, new Function1<q16, q16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j) {
                int i = (int) (j >> 32);
                return q16.c((((long) ((Number) function1.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L) | (((long) i) << 32));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return q16.b(a(((q16) obj).getPackedValue()));
            }
        });
    }

    public static /* synthetic */ d m(xa4 xa4Var, tc.c cVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            cVar = tc.INSTANCE.a();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                public final Integer a(int i2) {
                    return 0;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return l(xa4Var, cVar, z, function1);
    }

    public static final d n(xa4<Float> xa4Var, float f) {
        return new e(new TransitionData(new Fade(f, xa4Var), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ d o(xa4 xa4Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return n(xa4Var, f);
    }

    public static final f p(xa4<Float> xa4Var, float f) {
        return new g(new TransitionData(new Fade(f, xa4Var), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ f q(xa4 xa4Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return p(xa4Var, f);
    }

    public static final d r(xa4<Float> xa4Var, float f, long j) {
        return new e(new TransitionData(null, null, null, new Scale(f, j, xa4Var, null), null, false, null, 119, null));
    }

    public static /* synthetic */ d s(xa4 xa4Var, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = t.INSTANCE.a();
        }
        return r(xa4Var, f, j);
    }

    public static final f t(xa4<Float> xa4Var, float f, long j) {
        return new g(new TransitionData(null, null, null, new Scale(f, j, xa4Var, null), null, false, null, 119, null));
    }

    public static /* synthetic */ f u(xa4 xa4Var, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = t.INSTANCE.a();
        }
        return t(xa4Var, f, j);
    }

    public static final f v(xa4<q16> xa4Var, tc.b bVar, boolean z, final Function1<? super Integer, Integer> function1) {
        return x(xa4Var, N(bVar), z, new Function1<q16, q16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j) {
                int iIntValue = ((Number) function1.invoke(Integer.valueOf((int) (j >> 32)))).intValue();
                return q16.c((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iIntValue) << 32));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return q16.b(a(((q16) obj).getPackedValue()));
            }
        });
    }

    public static /* synthetic */ f w(xa4 xa4Var, tc.b bVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            bVar = tc.INSTANCE.j();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                public final Integer a(int i2) {
                    return 0;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return v(xa4Var, bVar, z, function1);
    }

    public static final f x(xa4<q16> xa4Var, tc tcVar, boolean z, Function1<? super q16, q16> function1) {
        return new g(new TransitionData(null, null, new ChangeSize(tcVar, function1, xa4Var, z), null, null, false, null, 123, null));
    }

    public static /* synthetic */ f y(xa4 xa4Var, tc tcVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            tcVar = tc.INSTANCE.c();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = new Function1<q16, q16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                public final long a(long j) {
                    long j2 = 0;
                    return q16.c((j2 & 4294967295L) | (j2 << 32));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return q16.b(a(((q16) obj2).getPackedValue()));
                }
            };
        }
        return x(xa4Var, tcVar, z, function1);
    }

    public static final f z(xa4<q16> xa4Var, tc.c cVar, boolean z, final Function1<? super Integer, Integer> function1) {
        return x(xa4Var, O(cVar), z, new Function1<q16, q16>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j) {
                int i = (int) (j >> 32);
                return q16.c((((long) ((Number) function1.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L) | (((long) i) << 32));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return q16.b(a(((q16) obj).getPackedValue()));
            }
        });
    }
}
