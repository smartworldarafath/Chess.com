package androidx.compose.ui.autofill;

import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import com.google.inputmethod.ez1;
import com.google.inputmethod.gba;
import com.google.inputmethod.ha0;
import com.google.inputmethod.pa0;
import com.google.inputmethod.qh;
import com.google.inputmethod.sh;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/qh;", "Landroid/view/ViewStructure;", "root", "", "b", "(Lcom/google/android/qh;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "(Lcom/google/android/qh;Landroid/util/SparseArray;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final void a(qh qhVar, SparseArray<AutofillValue> sparseArray) {
        if (qhVar.getAutofillTree().a().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            ha0 ha0Var = ha0.a;
            if (ha0Var.f(autofillValue)) {
                qhVar.getAutofillTree().b(iKeyAt, ha0Var.C(autofillValue).toString());
            } else {
                if (ha0Var.d(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (ha0Var.e(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (ha0Var.g(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(qh qhVar, ViewStructure viewStructure) {
        if (qhVar.getAutofillTree().a().isEmpty()) {
            return;
        }
        int iA = ha0.a.a(viewStructure, qhVar.getAutofillTree().a().size());
        for (Map.Entry<Integer, pa0> entry : qhVar.getAutofillTree().a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            pa0 value = entry.getValue();
            ha0 ha0Var = ha0.a;
            ViewStructure viewStructureH = ha0Var.h(viewStructure, iA);
            ha0Var.j(viewStructureH, qhVar.getRootAutofillId(), iIntValue);
            ha0Var.w(viewStructureH, iIntValue, qhVar.getView().getContext().getPackageName(), null, null);
            ha0Var.k(viewStructureH, ez1.b(c.INSTANCE.a()));
            List<AutofillType> listA = value.a();
            ArrayList arrayList = new ArrayList(listA.size());
            int size = listA.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(sh.a(listA.get(i)));
            }
            ha0Var.i(viewStructureH, (String[]) arrayList.toArray(new String[0]));
            gba boundingBox = value.getBoundingBox();
            if (boundingBox != null) {
                int iRound = Math.round(boundingBox.getLeft());
                int iRound2 = Math.round(boundingBox.getTop());
                int iRound3 = Math.round(boundingBox.getRight());
                ha0.a.s(viewStructureH, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
            }
            iA++;
        }
    }
}
