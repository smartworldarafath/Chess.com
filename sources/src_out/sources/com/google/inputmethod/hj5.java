package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00020\u0004*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lcom/google/android/hj5;", "", "<init>", "()V", "Lcom/google/android/gj5;", "f", "(Landroidx/compose/runtime/d;I)Lcom/google/android/gj5;", "Lcom/google/android/ei1;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "g", "(JJJJLandroidx/compose/runtime/d;II)Lcom/google/android/gj5;", "Lcom/google/android/yi1;", "localContentColor", "a", "(Lcom/google/android/yi1;J)Lcom/google/android/gj5;", "b", "Lcom/google/android/hj5$a;", "widthOption", "Lcom/google/android/jf3;", "h", "(I)J", "c", "(Lcom/google/android/yi1;)Lcom/google/android/gj5;", "defaultFilledIconButtonColors", "Lcom/google/android/xkb;", "e", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "standardShape", "d", "filledShape", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hj5 {
    public static final hj5 a = new hj5();
    public static final int b = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/google/android/hj5$a;", "", "", "value", "d", "(I)I", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int b = d(0);
        private static final int c = d(1);
        private static final int d = d(2);

        /* JADX INFO: renamed from: com.google.android.hj5$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/google/android/hj5$a$a;", "", "<init>", "()V", "Lcom/google/android/hj5$a;", "Narrow", "I", "a", "()I", "Uniform", "b", "Wide", "c", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.b;
            }

            public final int b() {
                return a.c;
            }

            public final int c() {
                return a.d;
            }

            private Companion() {
            }
        }

        private static int d(int i) {
            return i;
        }

        public static final boolean e(int i, int i2) {
            return i == i2;
        }
    }

    private hj5() {
    }

    public static /* synthetic */ long i(hj5 hj5Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = a.INSTANCE.b();
        }
        return hj5Var.h(i);
    }

    public final gj5 a(ColorScheme colorScheme, long j) {
        gj5 defaultIconButtonColorsCached = colorScheme.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached != null) {
            return defaultIconButtonColorsCached;
        }
        ei1.Companion companion = ei1.INSTANCE;
        gj5 gj5Var = new gj5(companion.h(), j, companion.h(), ei1.p(j, g5c.a.a(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.q0(gj5Var);
        return gj5Var;
    }

    public final gj5 b(d dVar, int i) {
        if (e.k()) {
            e.o(-958304265, i, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButtonDefaults.kt:300)");
        }
        gj5 gj5VarC = c(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return gj5VarC;
    }

    public final gj5 c(ColorScheme colorScheme) {
        gj5 defaultFilledIconButtonColorsCached = colorScheme.getDefaultFilledIconButtonColorsCached();
        if (defaultFilledIconButtonColorsCached != null) {
            return defaultFilledIconButtonColorsCached;
        }
        x94 x94Var = x94.a;
        gj5 gj5Var = new gj5(bj1.j(colorScheme, x94Var.b()), bj1.j(colorScheme, x94Var.a()), ei1.p(bj1.j(colorScheme, x94Var.d()), x94Var.e(), 0.0f, 0.0f, 0.0f, 14, null), ei1.p(bj1.j(colorScheme, x94Var.c()), x94Var.f(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.p0(gj5Var);
        return gj5Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb d(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(1542796069, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButtonDefaults.kt:853)");
        }
        xkb xkbVarI = ulb.i(avb.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb e(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(-377108005, i, -1, "androidx.compose.material3.IconButtonDefaults.<get-standardShape> (IconButtonDefaults.kt:849)");
        }
        xkb xkbVarI = ulb.i(avb.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final gj5 f(d dVar, int i) {
        if (e.k()) {
            e.o(-1037266503, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:42)");
        }
        long value = ((ei1) dVar.v(cz1.a())).getValue();
        gj5 gj5VarA = a(kh7.a.a(dVar, 6), value);
        if (!ei1.r(gj5VarA.getContentColor(), value)) {
            gj5VarA = gj5.d(gj5VarA, 0L, value, 0L, ei1.p(value, g5c.a.a(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        }
        if (e.k()) {
            e.n();
        }
        return gj5VarA;
    }

    public final gj5 g(long j, long j2, long j3, long j4, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ei1.INSTANCE.i();
        }
        long value = (i2 & 2) != 0 ? ((ei1) dVar.v(cz1.a())).getValue() : j2;
        long jI = (i2 & 4) != 0 ? ei1.INSTANCE.i() : j3;
        long jP = (i2 & 8) != 0 ? ei1.p(value, g5c.a.a(), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (e.k()) {
            e.o(-1639168605, i, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:78)");
        }
        gj5 gj5VarC = a(kh7.a.a(dVar, 6), ((ei1) dVar.v(cz1.a())).getValue()).c(j, value, jI, jP);
        if (e.k()) {
            e.n();
        }
        return gj5VarC;
    }

    public final long h(int widthOption) {
        float fI;
        a.Companion companion = a.INSTANCE;
        if (a.e(widthOption, companion.a())) {
            avb avbVar = avb.a;
            fI = ff3.i(avbVar.e() + avbVar.f());
        } else if (a.e(widthOption, companion.b())) {
            avb avbVar2 = avb.a;
            fI = ff3.i(avbVar2.c() + avbVar2.c());
        } else if (a.e(widthOption, companion.c())) {
            avb avbVar3 = avb.a;
            fI = ff3.i(avbVar3.g() + avbVar3.h());
        } else {
            fI = ff3.i(0);
        }
        avb avbVar4 = avb.a;
        return hf3.a(ff3.i(avbVar4.d() + fI), avbVar4.a());
    }
}
