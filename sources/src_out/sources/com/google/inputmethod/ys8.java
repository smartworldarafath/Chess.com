package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\u00020\u0010*\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017*\f\b\u0000\u0010\u0018\"\u00020\u00052\u00020\u0005¨\u0006\u0019"}, d2 = {"Lcom/google/android/wub;", "slots", "Lcom/google/android/ez;", "", "applier", "", "index", "", "j", "(Lcom/google/android/wub;Lcom/google/android/ez;I)V", "h", "(Lcom/google/android/wub;)I", "Lcom/google/android/ku4;", "anchor", "i", "(Lcom/google/android/wub;Lcom/google/android/ku4;Lcom/google/android/ez;)I", "", "Lcom/google/android/ts8;", "errorContext", "writer", "f", "(Ljava/lang/Throwable;Lcom/google/android/ts8;Lcom/google/android/wub;Lcom/google/android/ku4;)Ljava/lang/Throwable;", "k", "(Lcom/google/android/ts8;Lcom/google/android/wub;)Lcom/google/android/ts8;", "IntParameter", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ys8 {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/google/android/ys8$a", "Lcom/google/android/ts8;", "", "currentOffset", "", "Lcom/google/android/iq1;", "e", "(Ljava/lang/Integer;)Ljava/util/List;", "", "c", "()Z", "sourceInformationEnabled", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ts8 {
        final /* synthetic */ ts8 a;
        final /* synthetic */ SlotWriter b;

        a(ts8 ts8Var, SlotWriter slotWriter) {
            this.a = ts8Var;
            this.b = slotWriter;
        }

        @Override // com.google.inputmethod.ts8
        public boolean c() {
            return this.a.c();
        }

        @Override // com.google.inputmethod.ts8
        public List<ComposeStackTraceFrame> e(Integer currentOffset) {
            List<ComposeStackTraceFrame> listE = this.a.e(null);
            int parent = this.b.getParent();
            if (parent < 0) {
                return listE;
            }
            SlotWriter slotWriter = this.b;
            return m.a1(hq1.b(slotWriter, currentOffset, parent, Integer.valueOf(slotWriter.L0(parent))), listE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(Throwable th, final ts8 ts8Var, final SlotWriter slotWriter, final ku4 ku4Var) {
        return ts8Var == null ? th : jq1.b(th, new Function0() { // from class: com.google.android.ws8
            public final Object invoke() {
                return ys8.g(ku4Var, slotWriter, ts8Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fq1 g(ku4 ku4Var, SlotWriter slotWriter, ts8 ts8Var) {
        if (ku4Var != null) {
            slotWriter.Y0(ku4Var);
        }
        List listC = hq1.c(slotWriter, null, 0, null, 7, null);
        ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) m.N0(listC);
        Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        List<ComposeStackTraceFrame> listE = ts8Var.e(groupOffset);
        if (groupOffset != null && !listE.isEmpty()) {
            listE = m.a1(m.e(ComposeStackTraceFrame.b((ComposeStackTraceFrame) m.z0(listE), 0, null, groupOffset, 3, null)), m.q0(listE, 1));
        }
        return new fq1(m.a1(listC, listE), ts8Var.c());
    }

    private static final int h(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.w0(parent)) {
            parent = slotWriter.L0(parent);
        }
        int iL0 = parent + 1;
        int iJ0 = 0;
        while (iL0 < currentGroup) {
            if (slotWriter.q0(currentGroup, iL0)) {
                if (slotWriter.w0(iL0)) {
                    iJ0 = 0;
                }
                iL0++;
            } else {
                iJ0 += slotWriter.w0(iL0) ? 1 : slotWriter.J0(iL0);
                iL0 += slotWriter.l0(iL0);
            }
        }
        return iJ0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(SlotWriter slotWriter, ku4 ku4Var, ez<Object> ezVar) {
        int iC = slotWriter.C(ku4Var);
        if (!(slotWriter.getCurrentGroup() < iC)) {
            e.b("Check failed");
        }
        j(slotWriter, ezVar, iC);
        int iH = h(slotWriter);
        while (slotWriter.getCurrentGroup() < iC) {
            if (slotWriter.p0(iC)) {
                if (slotWriter.v0()) {
                    ezVar.j(slotWriter.H0(slotWriter.getCurrentGroup()));
                    iH = 0;
                }
                slotWriter.m1();
            } else {
                iH += slotWriter.c1();
            }
        }
        if (!(slotWriter.getCurrentGroup() == iC)) {
            e.b("Check failed");
        }
        return iH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SlotWriter slotWriter, ez<Object> ezVar, int i) {
        while (!slotWriter.r0(i)) {
            slotWriter.d1();
            if (slotWriter.w0(slotWriter.getParent())) {
                ezVar.k();
            }
            slotWriter.S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ts8 k(ts8 ts8Var, SlotWriter slotWriter) {
        return new a(ts8Var, slotWriter);
    }
}
