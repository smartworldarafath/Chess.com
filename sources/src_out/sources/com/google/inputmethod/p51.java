package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/vg3;", "Lcom/google/android/eh3;", "b", "(Lcom/google/android/vg3;)Lcom/google/android/eh3;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p51 {

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006'"}, d2 = {"com/google/android/p51$a", "Lcom/google/android/eh3;", "", "left", "top", "right", "bottom", "", "k", "(FFFF)V", "Lcom/google/android/gf1;", "clipOp", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", "path", "e", "(Landroidx/compose/ui/graphics/Path;I)V", "c", "(FF)V", "degrees", "Lcom/google/android/rn8;", "pivot", "h", "(FJ)V", "scaleX", "scaleY", "g", "(FFJ)V", "Lcom/google/android/zh7;", "matrix", "a", "([F)V", "Lcom/google/android/tsb;", "d", "()J", "size", "A", "center", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements eh3 {
        final /* synthetic */ vg3 a;

        a(vg3 vg3Var) {
            this.a = vg3Var;
        }

        @Override // com.google.inputmethod.eh3
        public long A() {
            return atb.b(d());
        }

        @Override // com.google.inputmethod.eh3
        public void a(float[] matrix) {
            this.a.b().x(matrix);
        }

        @Override // com.google.inputmethod.eh3
        public void b(float left, float top, float right, float bottom, int clipOp) {
            this.a.b().b(left, top, right, bottom, clipOp);
        }

        @Override // com.google.inputmethod.eh3
        public void c(float left, float top) {
            this.a.b().c(left, top);
        }

        @Override // com.google.inputmethod.eh3
        public long d() {
            return this.a.d();
        }

        @Override // com.google.inputmethod.eh3
        public void e(Path path, int clipOp) {
            this.a.b().e(path, clipOp);
        }

        @Override // com.google.inputmethod.eh3
        public void g(float scaleX, float scaleY, long pivot) {
            w41 w41VarB = this.a.b();
            int i = (int) (pivot >> 32);
            int i2 = (int) (pivot & 4294967295L);
            w41VarB.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            w41VarB.l(scaleX, scaleY);
            w41VarB.c(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        }

        @Override // com.google.inputmethod.eh3
        public void h(float degrees, long pivot) {
            w41 w41VarB = this.a.b();
            int i = (int) (pivot >> 32);
            int i2 = (int) (pivot & 4294967295L);
            w41VarB.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            w41VarB.t(degrees);
            w41VarB.c(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        }

        @Override // com.google.inputmethod.eh3
        public void k(float left, float top, float right, float bottom) {
            w41 w41VarB = this.a.b();
            vg3 vg3Var = this.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (d() >> 32)) - (right + left);
            long jD = tsb.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (d() & 4294967295L)) - (bottom + top))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
            if (!(Float.intBitsToFloat((int) (jD >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jD & 4294967295L)) >= 0.0f)) {
                yw5.a("Width and height must be greater than or equal to zero");
            }
            vg3Var.c(jD);
            w41VarB.c(left, top);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eh3 b(vg3 vg3Var) {
        return new a(vg3Var);
    }
}
