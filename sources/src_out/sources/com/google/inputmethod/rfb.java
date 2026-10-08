package com.google.inputmethod;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/seb;", "configuration", "Lcom/google/android/vxc;", "c", "(Lcom/google/android/seb;)Lcom/google/android/vxc;", "", "b", "(Lcom/google/android/seb;)Ljava/lang/Float;", "", "Lcom/google/android/o9b;", "", "id", "a", "(Ljava/util/List;I)Lcom/google/android/o9b;", "Lcom/google/android/hpa;", "", "e", "(I)Ljava/lang/String;", "Lcom/google/android/sp;", "Landroid/view/View;", "d", "(Lcom/google/android/sp;I)Landroid/view/View;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class rfb {
    public static final o9b a(List<o9b> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    public static final Float b(seb sebVar) {
        Function1 function1A;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(sebVar, SemanticsActions.a.h());
        if (accessibilityAction == null || (function1A = accessibilityAction.a()) == null || !((Boolean) function1A.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult c(seb sebVar) {
        Function1 function1A;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(sebVar, SemanticsActions.a.i());
        if (accessibilityAction == null || (function1A = accessibilityAction.a()) == null || !((Boolean) function1A.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final View d(sp spVar, int i) {
        Object next;
        Iterator<T> it = spVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LayoutNode) ((Map.Entry) next).getKey()).getSemanticsId() != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String e(int i) {
        hpa.Companion companion = hpa.INSTANCE;
        if (hpa.m(i, companion.a())) {
            return "android.widget.Button";
        }
        if (hpa.m(i, companion.c())) {
            return "android.widget.CheckBox";
        }
        if (hpa.m(i, companion.f())) {
            return "android.widget.RadioButton";
        }
        if (hpa.m(i, companion.e())) {
            return "android.widget.ImageView";
        }
        if (hpa.m(i, companion.d())) {
            return "android.widget.Spinner";
        }
        if (hpa.m(i, companion.i())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
