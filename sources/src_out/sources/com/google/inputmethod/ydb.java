package com.google.inputmethod;

import androidx.compose.p001foundation.text.selection.SelectionGesturesKt;
import androidx.compose.p001foundation.text.selection.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/neb;", "", "selectableId", "Lkotlin/Function0;", "Lcom/google/android/kn6;", "layoutCoordinates", "Landroidx/compose/ui/b;", "a", "(Lcom/google/android/neb;JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ydb {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {
        final /* synthetic */ c a;
        final /* synthetic */ b b;

        a(c cVar, b bVar) {
            this.a = cVar;
            this.b = bVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
            Object objI = SelectionGesturesKt.i(df9Var, this.a, this.b, q22Var);
            return objI == kotlin.coroutines.intrinsics.a.g() ? objI : Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0006R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0006R\"\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"com/google/android/ydb$b", "Lcom/google/android/gsc;", "Lcom/google/android/rn8;", "point", "", "a", "(J)V", "d", "()V", "startPoint", "Landroidx/compose/foundation/text/selection/f;", "selectionAdjustment", "c", "(JLandroidx/compose/foundation/text/selection/f;)V", "delta", "b", "g", "onCancel", "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "Landroidx/compose/foundation/text/selection/f;", "getSelectionAdjustmentMode", "()Landroidx/compose/foundation/text/selection/f;", "setSelectionAdjustmentMode", "(Landroidx/compose/foundation/text/selection/f;)V", "selectionAdjustmentMode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements gsc {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long lastPosition;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long dragTotalDistance;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private f selectionAdjustmentMode;
        final /* synthetic */ Function0<kn6> d;
        final /* synthetic */ neb e;
        final /* synthetic */ long f;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends kn6> function0, neb nebVar, long j) {
            this.d = function0;
            this.e = nebVar;
            this.f = j;
            rn8.Companion companion = rn8.INSTANCE;
            this.lastPosition = companion.c();
            this.dragTotalDistance = companion.c();
            this.selectionAdjustmentMode = f.INSTANCE.l();
        }

        @Override // com.google.inputmethod.gsc
        public void a(long point) {
        }

        @Override // com.google.inputmethod.gsc
        public void b(long delta) {
            kn6 kn6Var = (kn6) this.d.invoke();
            if (kn6Var != null) {
                neb nebVar = this.e;
                long j = this.f;
                if (kn6Var.b() && peb.d(nebVar, j)) {
                    long jQ = rn8.q(this.dragTotalDistance, delta);
                    this.dragTotalDistance = jQ;
                    long jQ2 = rn8.q(this.lastPosition, jQ);
                    if (nebVar.g(kn6Var, jQ2, this.lastPosition, false, this.selectionAdjustmentMode, true)) {
                        this.lastPosition = jQ2;
                        this.dragTotalDistance = rn8.INSTANCE.c();
                    }
                }
            }
        }

        @Override // com.google.inputmethod.gsc
        public void c(long startPoint, f selectionAdjustment) {
            this.selectionAdjustmentMode = selectionAdjustment;
            kn6 kn6Var = (kn6) this.d.invoke();
            if (kn6Var != null) {
                neb nebVar = this.e;
                if (!kn6Var.b()) {
                    return;
                }
                nebVar.a(kn6Var, startPoint, this.selectionAdjustmentMode, true);
                this.lastPosition = startPoint;
            }
            if (peb.d(this.e, this.f)) {
                this.dragTotalDistance = rn8.INSTANCE.c();
            }
        }

        @Override // com.google.inputmethod.gsc
        public void d() {
        }

        @Override // com.google.inputmethod.gsc
        public void g() {
            if (peb.d(this.e, this.f)) {
                this.e.d();
            }
        }

        @Override // com.google.inputmethod.gsc
        public void onCancel() {
            if (peb.d(this.e, this.f)) {
                this.e.d();
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"com/google/android/ydb$c", "Lcom/google/android/j08;", "Lcom/google/android/rn8;", "downPosition", "", "e", "(J)Z", "dragPosition", "d", "Landroidx/compose/foundation/text/selection/f;", "adjustment", "", "clickCount", "b", "(JLandroidx/compose/foundation/text/selection/f;I)Z", "a", "(JLandroidx/compose/foundation/text/selection/f;)Z", "", "c", "()V", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements j08 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long lastPosition = rn8.INSTANCE.c();
        final /* synthetic */ Function0<kn6> b;
        final /* synthetic */ neb c;
        final /* synthetic */ long d;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function0<? extends kn6> function0, neb nebVar, long j) {
            this.b = function0;
            this.c = nebVar;
            this.d = j;
        }

        @Override // com.google.inputmethod.j08
        public boolean a(long dragPosition, f adjustment) {
            kn6 kn6Var = (kn6) this.b.invoke();
            if (kn6Var == null) {
                return true;
            }
            neb nebVar = this.c;
            long j = this.d;
            if (!kn6Var.b() || !peb.d(nebVar, j)) {
                return false;
            }
            if (!nebVar.g(kn6Var, dragPosition, this.lastPosition, false, adjustment, false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // com.google.inputmethod.j08
        public boolean b(long downPosition, f adjustment, int clickCount) {
            kn6 kn6Var = (kn6) this.b.invoke();
            if (kn6Var == null) {
                return false;
            }
            neb nebVar = this.c;
            long j = this.d;
            if (!kn6Var.b()) {
                return false;
            }
            nebVar.a(kn6Var, downPosition, adjustment, false);
            this.lastPosition = downPosition;
            return peb.d(nebVar, j);
        }

        @Override // com.google.inputmethod.j08
        public void c() {
            this.c.d();
        }

        @Override // com.google.inputmethod.j08
        public boolean d(long dragPosition) {
            kn6 kn6Var = (kn6) this.b.invoke();
            if (kn6Var == null) {
                return true;
            }
            neb nebVar = this.c;
            long j = this.d;
            if (!kn6Var.b() || !peb.d(nebVar, j)) {
                return false;
            }
            if (!nebVar.g(kn6Var, dragPosition, this.lastPosition, false, f.INSTANCE.l(), false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // com.google.inputmethod.j08
        public boolean e(long downPosition) {
            kn6 kn6Var = (kn6) this.b.invoke();
            if (kn6Var == null) {
                return false;
            }
            neb nebVar = this.c;
            long j = this.d;
            if (!kn6Var.b()) {
                return false;
            }
            if (nebVar.g(kn6Var, downPosition, this.lastPosition, false, f.INSTANCE.l(), false)) {
                this.lastPosition = downPosition;
            }
            return peb.d(nebVar, j);
        }
    }

    public static final androidx.compose.ui.b a(neb nebVar, long j, Function0<? extends kn6> function0) {
        b bVar = new b(function0, nebVar, j);
        c cVar = new c(function0, nebVar, j);
        return ugc.d(androidx.compose.ui.b.INSTANCE, cVar, bVar, new a(cVar, bVar));
    }
}
