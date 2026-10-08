package androidx.compose.ui.draw;

import androidx.compose.ui.node.l;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.ah3;
import com.google.inputmethod.f43;
import com.google.inputmethod.fz1;
import com.google.inputmethod.i05;
import com.google.inputmethod.lw0;
import com.google.inputmethod.ni8;
import com.google.inputmethod.o01;
import com.google.inputmethod.on8;
import com.google.inputmethod.r16;
import com.google.inputmethod.y23;
import com.google.inputmethod.zg3;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u0013\u0010\u0019\u001a\u00020\u0010*\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#RB\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010;\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawModifierNodeImpl;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/o01;", "Lcom/google/android/on8;", "Lcom/google/android/lw0;", "Landroidx/compose/ui/draw/CacheDrawScope;", "cacheDrawScope", "Lkotlin/Function1;", "Lcom/google/android/ah3;", "block", "<init>", "(Landroidx/compose/ui/draw/CacheDrawScope;Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/fz1;", "contentDrawScope", "o3", "(Lcom/google/android/fz1;)Lcom/google/android/ah3;", "", "W2", "()V", "X2", "N0", "M1", "b2", "N", "C1", "j", "(Lcom/google/android/fz1;)V", "p", "Landroidx/compose/ui/draw/CacheDrawScope;", "", "q", "Z", "isCacheValid", "Landroidx/compose/ui/draw/j;", "r", "Landroidx/compose/ui/draw/j;", "cachedGraphicsContext", "value", "s", "Lkotlin/jvm/functions/Function1;", "m3", "()Lkotlin/jvm/functions/Function1;", "p3", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/tsb;", "d", "()J", "size", "Lcom/google/android/i05;", "n3", "()Lcom/google/android/i05;", "graphicsContext", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class CacheDrawModifierNodeImpl extends androidx.compose.ui.b.c implements o01, on8, lw0 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final CacheDrawScope cacheDrawScope;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isCacheValid;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private j cachedGraphicsContext;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function1<? super CacheDrawScope, ah3> block;

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, Function1<? super CacheDrawScope, ah3> function1) {
        this.cacheDrawScope = cacheDrawScope;
        this.block = function1;
        cacheDrawScope.t(this);
        cacheDrawScope.D(new Function0<i05>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl.1
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i05 invoke() {
                return CacheDrawModifierNodeImpl.this.n3();
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final ah3 o3(fz1 contentDrawScope) throws KotlinNothingValueException {
        if (!this.isCacheValid) {
            final CacheDrawScope cacheDrawScope = this.cacheDrawScope;
            cacheDrawScope.z(null);
            cacheDrawScope.w(contentDrawScope);
            l.a(this, new Function0<Unit>() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m7invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m7invoke() {
                    this.this$0.m3().invoke(cacheDrawScope);
                }
            });
            if (cacheDrawScope.getDrawResult() == null) {
                zw5.d("DrawResult not defined, did you forget to call onDraw?");
                throw new KotlinNothingValueException();
            }
            this.isCacheValid = true;
        }
        ah3 drawResult = this.cacheDrawScope.getDrawResult();
        Intrinsics.g(drawResult);
        return drawResult;
    }

    @Override // com.google.inputmethod.x23
    public void C1() {
        b2();
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        b2();
    }

    @Override // com.google.inputmethod.x23, com.google.inputmethod.bf9
    public void N() {
        b2();
    }

    @Override // com.google.inputmethod.yg3
    public void N0() {
        b2();
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        super.W2();
        j jVar = this.cachedGraphicsContext;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // androidx.compose.ui.b.c
    public void X2() {
        super.X2();
        b2();
    }

    @Override // com.google.inputmethod.o01
    public void b2() {
        j jVar = this.cachedGraphicsContext;
        if (jVar != null) {
            jVar.e();
        }
        this.isCacheValid = false;
        this.cacheDrawScope.z(null);
        zg3.a(this);
    }

    @Override // com.google.inputmethod.lw0
    public long d() {
        return r16.e(y23.l(this, ni8.a(4)).a());
    }

    @Override // com.google.inputmethod.lw0
    public f43 getDensity() {
        return y23.m(this);
    }

    @Override // com.google.inputmethod.lw0
    public LayoutDirection getLayoutDirection() {
        return y23.p(this);
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        o3(fz1Var).a().invoke(fz1Var);
    }

    public final Function1<CacheDrawScope, ah3> m3() {
        return this.block;
    }

    public final i05 n3() {
        j jVar = this.cachedGraphicsContext;
        if (jVar == null) {
            jVar = new j();
            this.cachedGraphicsContext = jVar;
        }
        if (jVar.getGraphicsContext() == null) {
            jVar.f(y23.n(this));
        }
        return jVar;
    }

    public final void p3(Function1<? super CacheDrawScope, ah3> function1) {
        this.block = function1;
        b2();
    }
}
