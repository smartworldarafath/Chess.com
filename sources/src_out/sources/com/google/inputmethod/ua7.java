package com.google.inputmethod;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.i;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010(R\u0016\u00102\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00107\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006:"}, d2 = {"Lcom/google/android/ua7;", "Lcom/google/android/kn6;", "Landroidx/compose/ui/node/i;", "lookaheadDelegate", "<init>", "(Landroidx/compose/ui/node/i;)V", "Lcom/google/android/rn8;", "relativeToScreen", "i", "(J)J", "relativeToLocal", "m", "relativeToWindow", "b0", "D", "N", "sourceCoordinates", "relativeToSource", "Q", "(Lcom/google/android/kn6;J)J", "", "includeMotionFrameOfReference", "f0", "(Lcom/google/android/kn6;JZ)J", "clipBounds", "Lcom/google/android/gba;", "R", "(Lcom/google/android/kn6;Z)Lcom/google/android/gba;", "Lcom/google/android/zh7;", "matrix", "", "j0", "(Lcom/google/android/kn6;[F)V", "k0", "([F)V", "a", "Landroidx/compose/ui/node/i;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/i;", "d", "()J", "lookaheadOffset", "Landroidx/compose/ui/node/NodeCoordinator;", "c", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lcom/google/android/q16;", "size", "L", "()Lcom/google/android/kn6;", "parentLayoutCoordinates", "Z", "parentCoordinates", "b", "()Z", "isAttached", "t", "introducesMotionFrameOfReference", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ua7 implements kn6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final i lookaheadDelegate;

    public ua7(i iVar) {
        this.lookaheadDelegate = iVar;
    }

    private final long d() {
        i iVarA = va7.a(this.lookaheadDelegate);
        kn6 kn6VarV = iVarA.v();
        rn8.Companion companion = rn8.INSTANCE;
        return rn8.p(Q(kn6VarV, companion.c()), c().Q(iVarA.getCoordinator(), companion.c()));
    }

    @Override // com.google.inputmethod.kn6
    public long D(long relativeToLocal) {
        return c().D(rn8.q(relativeToLocal, d()));
    }

    @Override // com.google.inputmethod.kn6
    public kn6 L() {
        i iVarF3;
        if (!b()) {
            zw5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = c().getLayoutNode().x0().getWrappedBy();
        if (wrappedBy == null || (iVarF3 = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return iVarF3.v();
    }

    @Override // com.google.inputmethod.kn6
    public long N(long relativeToLocal) {
        return c().N(rn8.q(relativeToLocal, d()));
    }

    @Override // com.google.inputmethod.kn6
    public long Q(kn6 sourceCoordinates, long relativeToSource) {
        return f0(sourceCoordinates, relativeToSource, true);
    }

    @Override // com.google.inputmethod.kn6
    public gba R(kn6 sourceCoordinates, boolean clipBounds) {
        return c().R(sourceCoordinates, clipBounds);
    }

    @Override // com.google.inputmethod.kn6
    public kn6 Z() {
        i iVarF3;
        if (!b()) {
            zw5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator wrappedBy = c().getWrappedBy();
        if (wrappedBy == null || (iVarF3 = wrappedBy.getLookaheadDelegate()) == null) {
            return null;
        }
        return iVarF3.v();
    }

    @Override // com.google.inputmethod.kn6
    public long a() {
        i iVar = this.lookaheadDelegate;
        return q16.c((((long) iVar.getWidth()) << 32) | (((long) iVar.getHeight()) & 4294967295L));
    }

    @Override // com.google.inputmethod.kn6
    public boolean b() {
        return c().b();
    }

    @Override // com.google.inputmethod.kn6
    public long b0(long relativeToWindow) {
        return rn8.q(c().b0(relativeToWindow), d());
    }

    public final NodeCoordinator c() {
        return this.lookaheadDelegate.getCoordinator();
    }

    @Override // com.google.inputmethod.kn6
    public long f0(kn6 sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (!(sourceCoordinates instanceof ua7)) {
            i iVarA = va7.a(this.lookaheadDelegate);
            long jF0 = f0(iVarA.getLookaheadLayoutCoordinates(), relativeToSource, includeMotionFrameOfReference);
            long position = iVarA.getPosition();
            float fK = g16.k(position);
            long jP = rn8.p(jF0, rn8.e((4294967295L & ((long) Float.floatToRawIntBits(g16.l(position)))) | (Float.floatToRawIntBits(fK) << 32)));
            kn6 kn6VarZ = iVarA.getCoordinator().Z();
            if (kn6VarZ == null) {
                kn6VarZ = iVarA.getCoordinator().v();
            }
            return rn8.q(jP, kn6VarZ.f0(sourceCoordinates, rn8.INSTANCE.c(), includeMotionFrameOfReference));
        }
        i iVar = ((ua7) sourceCoordinates).lookaheadDelegate;
        iVar.getCoordinator().A3();
        i iVarF3 = c().T2(iVar.getCoordinator()).getLookaheadDelegate();
        if (iVarF3 != null) {
            long jN = g16.n(g16.o(iVar.I2(iVarF3, !includeMotionFrameOfReference), h16.d(relativeToSource)), this.lookaheadDelegate.I2(iVarF3, !includeMotionFrameOfReference));
            return rn8.e((((long) Float.floatToRawIntBits(g16.k(jN))) << 32) | (((long) Float.floatToRawIntBits(g16.l(jN))) & 4294967295L));
        }
        i iVarA2 = va7.a(iVar);
        long jO = g16.o(g16.o(iVar.I2(iVarA2, !includeMotionFrameOfReference), iVarA2.getPosition()), h16.d(relativeToSource));
        i iVarA3 = va7.a(this.lookaheadDelegate);
        long jN2 = g16.n(jO, g16.o(this.lookaheadDelegate.I2(iVarA3, !includeMotionFrameOfReference), iVarA3.getPosition()));
        float fK2 = g16.k(jN2);
        long jE = rn8.e((((long) Float.floatToRawIntBits(g16.l(jN2))) & 4294967295L) | (Float.floatToRawIntBits(fK2) << 32));
        NodeCoordinator wrappedBy = iVarA3.getCoordinator().getWrappedBy();
        Intrinsics.g(wrappedBy);
        NodeCoordinator wrappedBy2 = iVarA2.getCoordinator().getWrappedBy();
        Intrinsics.g(wrappedBy2);
        return wrappedBy.f0(wrappedBy2, jE, includeMotionFrameOfReference);
    }

    @Override // com.google.inputmethod.kn6
    public long i(long relativeToScreen) {
        return rn8.q(c().i(relativeToScreen), d());
    }

    @Override // com.google.inputmethod.kn6
    public void j0(kn6 sourceCoordinates, float[] matrix) {
        c().j0(sourceCoordinates, matrix);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.kn6
    public void k0(float[] matrix) throws KotlinNothingValueException {
        c().k0(matrix);
    }

    @Override // com.google.inputmethod.kn6
    public long m(long relativeToLocal) {
        return c().m(rn8.q(relativeToLocal, d()));
    }

    @Override // com.google.inputmethod.kn6
    public boolean t() {
        return this.lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference();
    }
}
