package androidx.compose.p000animation;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.h66;
import com.google.inputmethod.q16;
import com.google.inputmethod.yq;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000f\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;", "Lcom/google/android/ej7;", "Lcom/google/android/yq;", "scope", "<init>", "(Lcom/google/android/yq;)V", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "minIntrinsicWidth", "(Lcom/google/android/h66;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "a", "Lcom/google/android/yq;", "getScope", "()Lcom/google/android/yq;", "", "b", "Z", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "hasLookaheadOccurred", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class AnimatedEnterExitMeasurePolicy implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final yq scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean hasLookaheadOccurred;

    public AnimatedEnterExitMeasurePolicy(yq yqVar) {
        this.scope = yqVar;
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iW = list.get(0).W(i);
        int iR = m.r(list);
        int i2 = 1;
        if (1 <= iR) {
            while (true) {
                int iW2 = list.get(i2).W(i);
                if (iW2 > iW) {
                    iW = iW2;
                }
                if (i2 == iR) {
                    break;
                }
                i2++;
            }
        }
        return iW;
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iQ0 = list.get(0).q0(i);
        int iR = m.r(list);
        int i2 = 1;
        if (1 <= iR) {
            while (true) {
                int iQ1 = list.get(i2).q0(i);
                if (iQ1 > iQ0) {
                    iQ0 = iQ1;
                }
                if (i2 == iR) {
                    break;
                }
                i2++;
            }
        }
        return iQ0;
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            o oVarR0 = list.get(i).r0(j);
            iMax = Math.max(iMax, oVarR0.getWidth());
            iMax2 = Math.max(iMax2, oVarR0.getHeight());
            arrayList.add(oVarR0);
        }
        if (jVar.G1()) {
            this.hasLookaheadOccurred = true;
            this.scope.b().setValue(q16.b(q16.c((4294967295L & ((long) iMax2)) | (((long) iMax) << 32))));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.b().setValue(q16.b(q16.c((4294967295L & ((long) iMax2)) | (((long) iMax) << 32))));
        }
        return j.Q1(jVar, iMax, iMax2, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o.a) obj);
                return Unit.a;
            }

            public final void invoke(o.a aVar) {
                List<o> list2 = arrayList;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    o.a.z(aVar, list2.get(i2), 0, 0, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD0 = list.get(0).d0(i);
        int iR = m.r(list);
        int i2 = 1;
        if (1 <= iR) {
            while (true) {
                int iD1 = list.get(i2).d0(i);
                if (iD1 > iD0) {
                    iD0 = iD1;
                }
                if (i2 == iR) {
                    break;
                }
                i2++;
            }
        }
        return iD0;
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO0 = list.get(0).o0(i);
        int iR = m.r(list);
        int i2 = 1;
        if (1 <= iR) {
            while (true) {
                int iO1 = list.get(i2).o0(i);
                if (iO1 > iO0) {
                    iO0 = iO1;
                }
                if (i2 == iR) {
                    break;
                }
                i2++;
            }
        }
        return iO0;
    }
}
