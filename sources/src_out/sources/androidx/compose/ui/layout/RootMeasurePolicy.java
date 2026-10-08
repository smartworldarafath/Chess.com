package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$d;", "<init>", "()V", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RootMeasurePolicy extends LayoutNode.d {
    public static final RootMeasurePolicy b = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
        int size = list.size();
        if (size == 0) {
            return j.Q1(jVar, kx1.n(j), kx1.m(j), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                public final void invoke(o.a aVar) {
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((o.a) obj);
                    return Unit.a;
                }
            }, 4, null);
        }
        if (size == 1) {
            final o oVarR0 = list.get(0).r0(j);
            return j.Q1(jVar, nx1.g(j, oVarR0.getWidth()), nx1.f(j, oVarR0.getHeight()), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((o.a) obj);
                    return Unit.a;
                }

                public final void invoke(o.a aVar) {
                    o.a.T(aVar, oVarR0, 0, 0, 0.0f, null, 12, null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            o oVarR1 = list.get(i).r0(j);
            iMax = Math.max(oVarR1.getWidth(), iMax);
            iMax2 = Math.max(oVarR1.getHeight(), iMax2);
            arrayList.add(oVarR1);
        }
        return j.Q1(jVar, nx1.g(j, iMax), nx1.f(j, iMax2), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
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
                int size3 = list2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    o.a.T(aVar, list2.get(i2), 0, 0, 0.0f, null, 12, null);
                }
            }
        }, 4, null);
    }
}
