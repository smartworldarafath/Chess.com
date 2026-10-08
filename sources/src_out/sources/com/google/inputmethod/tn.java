package com.google.inputmethod;

import androidx.compose.ui.graphics.r;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010\u0005R*\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010'R*\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006j\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010*¨\u0006,"}, d2 = {"Lcom/google/android/tn;", "", "Lcom/google/android/mj3;", "Lcom/google/android/sx5;", "<init>", "()V", "Lcom/google/android/k58;", "Lcom/google/android/tn$a;", "Lcom/google/android/lj3;", "Landroidx/compose/ui/graphics/shadow/DropShadowCache;", "f", "()Lcom/google/android/k58;", "Lcom/google/android/rx5;", "Landroidx/compose/ui/graphics/shadow/InnerShadowCache;", "g", "h", "()Lcom/google/android/tn$a;", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Lcom/google/android/okb;", "shadow", "e", "(Lcom/google/android/xkb;JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Lcom/google/android/okb;)Lcom/google/android/lj3;", "c", "(Lcom/google/android/xkb;JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Lcom/google/android/okb;)Lcom/google/android/rx5;", "Lcom/google/android/kj3;", "d", "(Lcom/google/android/xkb;Lcom/google/android/okb;)Lcom/google/android/kj3;", "Lcom/google/android/qx5;", "a", "(Lcom/google/android/xkb;Lcom/google/android/okb;)Lcom/google/android/qx5;", "", "b", "Lcom/google/android/k58;", "dropShadowCache", "innerShadowCache", "Lcom/google/android/tn$a;", "shadowKey", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class tn implements pkb, mj3, sx5 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private k58<ShadowKey, lj3> dropShadowCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private k58<ShadowKey, rx5> innerShadowCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ShadowKey shadowKey;

    /* JADX INFO: renamed from: com.google.android.tn$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-\"\u0004\b%\u0010.R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b/\u00103¨\u00064"}, d2 = {"Lcom/google/android/tn$a;", "", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "density", "Lcom/google/android/okb;", "shadow", "<init>", "(Lcom/google/android/xkb;JLandroidx/compose/ui/unit/LayoutDirection;FLcom/google/android/okb;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lcom/google/android/xkb;JLandroidx/compose/ui/unit/LayoutDirection;FLcom/google/android/okb;)Lcom/google/android/tn$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/xkb;", "getShape", "()Lcom/google/android/xkb;", "f", "(Lcom/google/android/xkb;)V", "b", "J", "getSize-NH-jbRc", "()J", "g", "(J)V", "c", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "d", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "F", "getDensity", "()F", "(F)V", "e", "Lcom/google/android/okb;", "getShadow", "()Lcom/google/android/okb;", "(Lcom/google/android/okb;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShadowKey {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private xkb shape;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private long size;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private LayoutDirection layoutDirection;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private float density;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        private Shadow shadow;

        public /* synthetic */ ShadowKey(xkb xkbVar, long j, LayoutDirection layoutDirection, float f, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
            this(xkbVar, j, layoutDirection, f, shadow);
        }

        public static /* synthetic */ ShadowKey b(ShadowKey shadowKey, xkb xkbVar, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, Object obj) {
            if ((i & 1) != 0) {
                xkbVar = shadowKey.shape;
            }
            if ((i & 2) != 0) {
                j = shadowKey.size;
            }
            if ((i & 4) != 0) {
                layoutDirection = shadowKey.layoutDirection;
            }
            if ((i & 8) != 0) {
                f = shadowKey.density;
            }
            if ((i & 16) != 0) {
                shadow = shadowKey.shadow;
            }
            Shadow shadow2 = shadow;
            LayoutDirection layoutDirection2 = layoutDirection;
            return shadowKey.a(xkbVar, j, layoutDirection2, f, shadow2);
        }

        public final ShadowKey a(xkb shape, long size, LayoutDirection layoutDirection, float density, Shadow shadow) {
            return new ShadowKey(shape, size, layoutDirection, density, shadow, null);
        }

        public final void c(float f) {
            this.density = f;
        }

        public final void d(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void e(Shadow shadow) {
            this.shadow = shadow;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShadowKey)) {
                return false;
            }
            ShadowKey shadowKey = (ShadowKey) other;
            return Intrinsics.e(this.shape, shadowKey.shape) && tsb.h(this.size, shadowKey.size) && this.layoutDirection == shadowKey.layoutDirection && Float.compare(this.density, shadowKey.density) == 0 && Intrinsics.e(this.shadow, shadowKey.shadow);
        }

        public final void f(xkb xkbVar) {
            this.shape = xkbVar;
        }

        public final void g(long j) {
            this.size = j;
        }

        public int hashCode() {
            int iHashCode = ((((((this.shape.hashCode() * 31) + tsb.m(this.size)) * 31) + this.layoutDirection.hashCode()) * 31) + Float.hashCode(this.density)) * 31;
            Shadow shadow = this.shadow;
            return iHashCode + (shadow == null ? 0 : shadow.hashCode());
        }

        public String toString() {
            return "ShadowKey(shape=" + this.shape + ", size=" + ((Object) tsb.p(this.size)) + ", layoutDirection=" + this.layoutDirection + ", density=" + this.density + ", shadow=" + this.shadow + ')';
        }

        private ShadowKey(xkb xkbVar, long j, LayoutDirection layoutDirection, float f, Shadow shadow) {
            this.shape = xkbVar;
            this.size = j;
            this.layoutDirection = layoutDirection;
            this.density = f;
            this.shadow = shadow;
        }

        public /* synthetic */ ShadowKey(xkb xkbVar, long j, LayoutDirection layoutDirection, float f, Shadow shadow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? r.a() : xkbVar, (i & 2) != 0 ? tsb.INSTANCE.b() : j, (i & 4) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? null : shadow, null);
        }
    }

    private final k58<ShadowKey, lj3> f() {
        k58<ShadowKey, lj3> k58Var = this.dropShadowCache;
        if (k58Var != null) {
            return k58Var;
        }
        k58<ShadowKey, lj3> k58Var2 = new k58<>(0, 1, null);
        this.dropShadowCache = k58Var2;
        return k58Var2;
    }

    private final k58<ShadowKey, rx5> g() {
        k58<ShadowKey, rx5> k58Var = this.innerShadowCache;
        if (k58Var != null) {
            return k58Var;
        }
        k58<ShadowKey, rx5> k58Var2 = new k58<>(0, 1, null);
        this.innerShadowCache = k58Var2;
        return k58Var2;
    }

    private final ShadowKey h() {
        ShadowKey shadowKey = this.shadowKey;
        if (shadowKey != null) {
            return shadowKey;
        }
        ShadowKey shadowKey2 = new ShadowKey(null, 0L, null, 0.0f, null, 31, null);
        this.shadowKey = shadowKey2;
        return shadowKey2;
    }

    @Override // com.google.inputmethod.pkb
    public qx5 a(xkb shape, Shadow shadow) {
        return new qx5(shape, shadow, this);
    }

    @Override // com.google.inputmethod.pkb
    public void b() {
        synchronized (this) {
            try {
                k58<ShadowKey, lj3> k58Var = this.dropShadowCache;
                if (k58Var != null) {
                    k58Var.k();
                }
                k58<ShadowKey, rx5> k58Var2 = this.innerShadowCache;
                if (k58Var2 != null) {
                    k58Var2.k();
                }
                this.shadowKey = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.inputmethod.sx5
    public rx5 c(xkb shape, long size, LayoutDirection layoutDirection, f43 density, Shadow shadow) {
        rx5 rx5VarE;
        synchronized (this) {
            ShadowKey shadowKeyH = h();
            shadowKeyH.f(shape);
            shadowKeyH.g(size);
            shadowKeyH.d(layoutDirection);
            shadowKeyH.c(density.getDensity());
            shadowKeyH.e(shadow);
            rx5VarE = g().e(shadowKeyH);
            if (rx5VarE == null) {
                rx5 rx5Var = new rx5(shadow, shape.mo5createOutlinePq9zytI(size, layoutDirection, density));
                g().x(ShadowKey.b(shadowKeyH, null, 0L, null, 0.0f, null, 31, null), rx5Var);
                rx5VarE = rx5Var;
            }
        }
        return rx5VarE;
    }

    @Override // com.google.inputmethod.pkb
    public kj3 d(xkb shape, Shadow shadow) {
        return new kj3(shape, shadow, this);
    }

    @Override // com.google.inputmethod.mj3
    public lj3 e(xkb shape, long size, LayoutDirection layoutDirection, f43 density, Shadow shadow) {
        lj3 lj3VarE;
        synchronized (this) {
            ShadowKey shadowKeyH = h();
            shadowKeyH.f(shape);
            shadowKeyH.g(size);
            shadowKeyH.d(layoutDirection);
            shadowKeyH.c(density.getDensity());
            shadowKeyH.e(shadow.a());
            lj3VarE = f().e(shadowKeyH);
            if (lj3VarE == null) {
                lj3 lj3Var = new lj3(shadow, shape.mo5createOutlinePq9zytI(size, layoutDirection, density));
                f().x(ShadowKey.b(shadowKeyH, null, 0L, null, 0.0f, null, 31, null), lj3Var);
                lj3VarE = lj3Var;
            }
        }
        return lj3VarE;
    }
}
