package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.l;
import com.google.inputmethod.Shadow;
import com.google.inputmethod.ei1;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fz1;
import com.google.inputmethod.if3;
import com.google.inputmethod.kj3;
import com.google.inputmethod.nj3;
import com.google.inputmethod.on8;
import com.google.inputmethod.qu0;
import com.google.inputmethod.rkb;
import com.google.inputmethod.rn8;
import com.google.inputmethod.xkb;
import com.google.inputmethod.y23;
import com.google.inputmethod.yg3;
import com.google.inputmethod.zg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0014\u0010\u000bJ\u0013\u0010\u0016\u001a\u00020\b*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b0\u00101\"\u0004\b2\u00103R<\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010?\u001a\u0002082\u0006\u0010/\u001a\u0002088\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010C\u001a\u0002082\u0006\u0010/\u001a\u0002088\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R*\u0010K\u001a\u00020D2\u0006\u0010/\u001a\u00020D8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010P\u001a\u00020L2\u0006\u0010/\u001a\u00020L8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010F\u001a\u0004\bN\u0010H\"\u0004\bO\u0010JR.\u0010X\u001a\u0004\u0018\u00010Q2\b\u0010/\u001a\u0004\u0018\u00010Q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010\\\u001a\u0002082\u0006\u0010/\u001a\u0002088\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010<\"\u0004\b[\u0010>R*\u0010c\u001a\u00020]2\u0006\u0010/\u001a\u00020]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010 \"\u0004\ba\u0010bR\u0014\u0010e\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010<R\u0014\u0010g\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010<¨\u0006h"}, d2 = {"Landroidx/compose/ui/draw/BlockDropShadowNode;", "Lcom/google/android/yg3;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/on8;", "Lcom/google/android/nj3;", "Lcom/google/android/xkb;", "shape", "Lkotlin/Function1;", "", "block", "<init>", "(Lcom/google/android/xkb;Lkotlin/jvm/functions/Function1;)V", "y3", "()V", "Lcom/google/android/kj3;", "v3", "()Lcom/google/android/kj3;", "u3", "V2", "N", "x3", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "M1", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/f43;", "p", "Lcom/google/android/f43;", "densityObject", "Lcom/google/android/okb;", "q", "Lcom/google/android/okb;", "targetShadow", "r", "Lcom/google/android/kj3;", "shadowPainter", "s", "Z", "blockRead", "value", "t", "Lcom/google/android/xkb;", "R0", "(Lcom/google/android/xkb;)V", "u", "Lkotlin/jvm/functions/Function1;", "w3", "(Lkotlin/jvm/functions/Function1;)V", "", "v", "F", "s3", "()F", "setRadius", "(F)V", "radius", "w", "t3", "M0", "spread", "Lcom/google/android/rn8;", "x", "J", "r3", "()J", "o2", "(J)V", "offset", "Lcom/google/android/ei1;", "y", "q3", "n", "color", "Lcom/google/android/qu0;", "z", "Lcom/google/android/qu0;", "p3", "()Lcom/google/android/qu0;", "Z1", "(Lcom/google/android/qu0;)V", "brush", "A", "n3", "c", "alpha", "Landroidx/compose/ui/graphics/e;", "B", "I", "o3", "e", "(I)V", "blendMode", "getDensity", "density", "w2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlockDropShadowNode extends androidx.compose.ui.b.c implements yg3, on8, nj3 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private f43 densityObject;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Shadow targetShadow;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private kj3 shadowPainter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean blockRead;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private xkb shape;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Function1<? super nj3, Unit> block;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private float radius;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private float spread;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private qu0 brush;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long offset = rn8.INSTANCE.c();

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private long color = ei1.INSTANCE.a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float alpha = 1.0f;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int blendMode = androidx.compose.ui.graphics.e.INSTANCE.B();

    public BlockDropShadowNode(xkb xkbVar, Function1<? super nj3, Unit> function1) {
        this.shape = xkbVar;
        this.block = function1;
    }

    private final void R0(xkb xkbVar) {
        if (Intrinsics.e(this.shape, xkbVar)) {
            return;
        }
        this.shape = xkbVar;
        u3();
    }

    private final void u3() {
        this.targetShadow = null;
        this.shadowPainter = null;
        zg3.a(this);
    }

    private final kj3 v3() {
        if (!this.blockRead) {
            this.blockRead = true;
            rkb.e(this);
            l.a(this, new Function0<Unit>() { // from class: androidx.compose.ui.draw.BlockDropShadowNode$obtainPainter$1
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m6invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m6invoke() {
                    this.this$0.block.invoke(this.this$0);
                }
            });
        }
        Shadow shadow = this.targetShadow;
        kj3 kj3Var = this.shadowPainter;
        qu0 brush = getBrush();
        float fP0 = P0(getRadius());
        float fP1 = P0(getSpread());
        float fP2 = P0(Float.intBitsToFloat((int) (getOffset() >> 32)));
        long jC = if3.c((((long) Float.floatToRawIntBits(P0(Float.intBitsToFloat((int) (getOffset() & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(fP2)) << 32));
        if (kj3Var != null && shadow != null && ff3.k(shadow.getRadius(), fP0) && ff3.k(shadow.getSpread(), fP1) && ei1.r(shadow.getColor(), getColor()) && Intrinsics.e(shadow.getBrush(), brush) && shadow.getAlpha() == getAlpha() && androidx.compose.ui.graphics.e.E(shadow.getBlendMode(), getBlendMode()) && if3.e(shadow.getOffset(), jC)) {
            return kj3Var;
        }
        Shadow shadow2 = brush != null ? new Shadow(fP0, brush, fP1, jC, getAlpha(), getBlendMode(), (DefaultConstructorMarker) null) : new Shadow(fP0, getColor(), fP1, jC, getAlpha(), getBlendMode(), (DefaultConstructorMarker) null);
        this.targetShadow = shadow2;
        kj3 kj3VarD = y23.n(this).a().d(this.shape, shadow2);
        this.shadowPainter = kj3VarD;
        return kj3VarD;
    }

    private final void w3(Function1<? super nj3, Unit> function1) {
        if (this.block != function1) {
            this.block = function1;
            this.blockRead = false;
            zg3.a(this);
        }
    }

    private final void y3() {
        f43 f43VarM = y23.m(this);
        if (Intrinsics.e(this.densityObject, f43VarM)) {
            return;
        }
        this.densityObject = f43VarM;
        this.blockRead = false;
        u3();
    }

    @Override // com.google.inputmethod.ukb
    public void M0(float f) {
        if (this.spread == f) {
            return;
        }
        this.spread = f;
        u3();
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        this.blockRead = false;
        u3();
    }

    @Override // com.google.inputmethod.x23, com.google.inputmethod.bf9
    public void N() {
        if (getIsAttached()) {
            y3();
        }
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        super.V2();
        y3();
    }

    @Override // com.google.inputmethod.ukb
    public void Z1(qu0 qu0Var) {
        if (Intrinsics.e(this.brush, qu0Var)) {
            return;
        }
        this.brush = qu0Var;
        u3();
    }

    @Override // com.google.inputmethod.ukb
    public void c(float f) {
        if (this.alpha == f) {
            return;
        }
        this.alpha = f;
        u3();
    }

    @Override // com.google.inputmethod.ukb
    public void e(int i) {
        if (androidx.compose.ui.graphics.e.E(this.blendMode, i)) {
            return;
        }
        this.blendMode = i;
        u3();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof BlockDropShadowNode)) {
            BlockDropShadowNode blockDropShadowNode = (BlockDropShadowNode) other;
            return getAlpha() == blockDropShadowNode.getAlpha() && Intrinsics.e(this.shape, blockDropShadowNode.shape) && this.block == blockDropShadowNode.block && getRadius() == blockDropShadowNode.getRadius() && getSpread() == blockDropShadowNode.getSpread() && rn8.j(getOffset(), blockDropShadowNode.getOffset()) && ei1.r(getColor(), blockDropShadowNode.getColor()) && Intrinsics.e(getBrush(), blockDropShadowNode.getBrush()) && androidx.compose.ui.graphics.e.E(getBlendMode(), blockDropShadowNode.getBlendMode());
        }
        return false;
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        f43 f43Var = this.densityObject;
        if (f43Var != null) {
            return f43Var.getDensity();
        }
        return 1.0f;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Float.hashCode(getAlpha()) * 31) + this.shape.hashCode()) * 31) + this.block.hashCode()) * 31) + Float.hashCode(getRadius())) * 31) + Float.hashCode(getSpread())) * 31) + rn8.o(getOffset())) * 31) + ei1.x(getColor())) * 31;
        qu0 brush = getBrush();
        return ((iHashCode + (brush != null ? brush.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.e.F(getBlendMode());
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        Painter.k(v3(), fz1Var, fz1Var.d(), 0.0f, null, 6, null);
        fz1Var.j1();
    }

    @Override // com.google.inputmethod.ukb
    public void n(long j) {
        if (j == 16) {
            j = ei1.INSTANCE.a();
        }
        if (ei1.r(this.color, j)) {
            return;
        }
        this.color = j;
        u3();
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // com.google.inputmethod.ukb
    public void o2(long j) {
        if (rn8.j(this.offset, j)) {
            return;
        }
        this.offset = j;
        zg3.a(this);
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public qu0 getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: r3, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: s3, reason: from getter */
    public float getRadius() {
        return this.radius;
    }

    @Override // com.google.inputmethod.ukb
    public void setRadius(float f) {
        if (this.radius == f) {
            return;
        }
        this.radius = f;
        u3();
    }

    /* JADX INFO: renamed from: t3, reason: from getter */
    public float getSpread() {
        return this.spread;
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        f43 f43Var = this.densityObject;
        if (f43Var != null) {
            return f43Var.getFontScale();
        }
        return 1.0f;
    }

    public final void x3(xkb shape, Function1<? super nj3, Unit> block) {
        R0(shape);
        w3(block);
    }
}
