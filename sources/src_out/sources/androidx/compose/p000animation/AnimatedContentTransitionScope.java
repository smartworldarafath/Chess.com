package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import com.google.inputmethod.g16;
import com.google.inputmethod.h02;
import com.google.inputmethod.jtb;
import com.google.inputmethod.kce;
import com.google.inputmethod.lr;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0017J\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope;", "S", "Landroidx/compose/animation/core/Transition$b;", "Lcom/google/android/h02;", "Lcom/google/android/jtb;", "sizeTransform", "b", "(Lcom/google/android/h02;Lcom/google/android/jtb;)Lcom/google/android/h02;", "Landroidx/compose/animation/AnimatedContentTransitionScope$a;", "towards", "Lcom/google/android/xa4;", "Lcom/google/android/g16;", "animationSpec", "Lkotlin/Function1;", "", "initialOffset", "Landroidx/compose/animation/d;", "h", "(ILcom/google/android/xa4;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/d;", "targetOffset", "Landroidx/compose/animation/f;", "e", "(ILcom/google/android/xa4;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/f;", "a", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AnimatedContentTransitionScope<S> extends Transition.b<S> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$a;", "", "", "value", "g", "(I)I", "a", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int b = g(0);
        private static final int c = g(1);
        private static final int d = g(2);
        private static final int e = g(3);
        private static final int f = g(4);
        private static final int g = g(5);

        /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentTransitionScope$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$a$a;", "", "<init>", "()V", "Landroidx/compose/animation/AnimatedContentTransitionScope$a;", "Left", "I", "c", "()I", "Right", "d", "Up", "f", "Down", "a", "Start", "e", "End", "b", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.e;
            }

            public final int b() {
                return a.g;
            }

            public final int c() {
                return a.b;
            }

            public final int d() {
                return a.c;
            }

            public final int e() {
                return a.f;
            }

            public final int f() {
                return a.d;
            }

            private Companion() {
            }
        }

        public static int g(int i) {
            return i;
        }

        public static final boolean h(int i, int i2) {
            return i == i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ f a(AnimatedContentTransitionScope animatedContentTransitionScope, int i, xa4 xa4Var, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i2 & 2) != 0) {
            xa4Var = lr.j(0.0f, 0.0f, g16.c(kce.c(g16.INSTANCE)), 3, null);
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1
                public final Integer a(int i3) {
                    return Integer.valueOf(i3);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentTransitionScope.e(i, xa4Var, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ d f(AnimatedContentTransitionScope animatedContentTransitionScope, int i, xa4 xa4Var, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i2 & 2) != 0) {
            xa4Var = lr.j(0.0f, 0.0f, g16.c(kce.c(g16.INSTANCE)), 3, null);
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1
                public final Integer a(int i3) {
                    return Integer.valueOf(i3);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return a(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentTransitionScope.h(i, xa4Var, function1);
    }

    h02 b(h02 h02Var, jtb jtbVar);

    f e(int towards, xa4<g16> animationSpec, Function1<? super Integer, Integer> targetOffset);

    d h(int towards, xa4<g16> animationSpec, Function1<? super Integer, Integer> initialOffset);
}
