package com.google.inputmethod;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/google/android/qh;", "Lcom/google/android/ga0;", "Landroid/view/View;", "view", "Lcom/google/android/qa0;", "autofillTree", "<init>", "(Landroid/view/View;Lcom/google/android/qa0;)V", "a", "Landroid/view/View;", "d", "()Landroid/view/View;", "b", "Lcom/google/android/qa0;", "()Lcom/google/android/qa0;", "Landroid/view/autofill/AutofillManager;", "c", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "()Landroid/view/autofill/AutofillId;", "setRootAutofillId", "(Landroid/view/autofill/AutofillId;)V", "rootAutofillId", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qh implements ga0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final qa0 autofillTree;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AutofillManager autofillManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private AutofillId rootAutofillId;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public qh(View view, qa0 qa0Var) throws KotlinNothingValueException {
        this.view = view;
        this.autofillTree = qa0Var;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = autofillManager;
        view.setImportantForAutofill(1);
        oa0 oa0VarA = l7e.a(view);
        AutofillId autofillIdA = oa0VarA != null ? oa0VarA.a() : null;
        if (autofillIdA != null) {
            this.rootAutofillId = autofillIdA;
        } else {
            zw5.d("Required value was null.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final qa0 getAutofillTree() {
        return this.autofillTree;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final View getView() {
        return this.view;
    }
}
