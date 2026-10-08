package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.focus.g;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import com.google.android.rs4;
import com.google.inputmethod.AccessibilityAction;
import com.google.inputmethod.am8;
import com.google.inputmethod.e58;
import com.google.inputmethod.ha0;
import com.google.inputmethod.hfb;
import com.google.inputmethod.l7e;
import com.google.inputmethod.la9;
import com.google.inputmethod.nk4;
import com.google.inputmethod.oa0;
import com.google.inputmethod.p48;
import com.google.inputmethod.rh;
import com.google.inputmethod.seb;
import com.google.inputmethod.sk;
import com.google.inputmethod.t94;
import com.google.inputmethod.teb;
import com.google.inputmethod.web;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b'\u0010&J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b,\u0010&J\u0017\u0010-\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b-\u0010&J\u000f\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010/R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010:R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010E¨\u0006G"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofillManager;", "Landroidx/compose/ui/autofill/b;", "Lcom/google/android/web;", "Lcom/google/android/nk4;", "Lcom/google/android/la9;", "platformAutofillManager", "Lcom/google/android/hfb;", "semanticsOwner", "Landroid/view/View;", "view", "Landroidx/compose/ui/spatial/RectManager;", "rectManager", "", "packageName", "<init>", "(Lcom/google/android/la9;Lcom/google/android/hfb;Landroid/view/View;Landroidx/compose/ui/spatial/RectManager;Ljava/lang/String;)V", "Landroidx/compose/ui/focus/g;", "previous", "current", "", "w", "(Landroidx/compose/ui/focus/g;Landroidx/compose/ui/focus/g;)V", "Lcom/google/android/teb;", "semanticsInfo", "Lcom/google/android/seb;", "previousSemanticsConfiguration", "a", "(Lcom/google/android/teb;Lcom/google/android/seb;)V", "Landroid/view/ViewStructure;", "rootViewStructure", "k", "(Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "j", "(Landroid/util/SparseArray;)V", "l", "(Lcom/google/android/teb;)V", "h", "", "previousSemanticsId", "i", "(Lcom/google/android/teb;I)V", "g", "e", "f", "()V", "Lcom/google/android/la9;", "d", "()Lcom/google/android/la9;", "setPlatformAutofillManager", "(Lcom/google/android/la9;)V", "b", "Lcom/google/android/hfb;", "c", "Landroid/view/View;", "Landroidx/compose/ui/spatial/RectManager;", "Ljava/lang/String;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "reusableRect", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "Lcom/google/android/p48;", "Lcom/google/android/p48;", "currentlyDisplayedIDs", "", "Z", "pendingAutofillCommit", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidAutofillManager extends b implements web, nk4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private la9 platformAutofillManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final hfb semanticsOwner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final RectManager rectManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Rect reusableRect = new Rect();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private AutofillId rootAutofillId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private p48 currentlyDisplayedIDs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean pendingAutofillCommit;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public AndroidAutofillManager(la9 la9Var, hfb hfbVar, View view, RectManager rectManager, String str) throws KotlinNothingValueException {
        this.platformAutofillManager = la9Var;
        this.semanticsOwner = hfbVar;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = str;
        view.setImportantForAutofill(1);
        oa0 oa0VarA = l7e.a(view);
        AutofillId autofillIdA = oa0VarA != null ? oa0VarA.a() : null;
        if (autofillIdA == null) {
            zw5.d("Required value was null.");
            throw new KotlinNothingValueException();
        }
        this.rootAutofillId = autofillIdA;
        this.currentlyDisplayedIDs = new p48(0, 1, null);
    }

    @Override // com.google.inputmethod.web
    public void a(teb semanticsInfo, seb previousSemanticsConfiguration) {
        Boolean bool;
        androidx.compose.ui.text.b bVar;
        androidx.compose.ui.text.b bVar2;
        seb sebVarG = semanticsInfo.g();
        int semanticsId = semanticsInfo.getSemanticsId();
        String text = (previousSemanticsConfiguration == null || (bVar2 = (androidx.compose.ui.text.b) SemanticsConfigurationKt.a(previousSemanticsConfiguration, SemanticsProperties.a.p())) == null) ? null : bVar2.getText();
        String text2 = (sebVarG == null || (bVar = (androidx.compose.ui.text.b) SemanticsConfigurationKt.a(sebVarG, SemanticsProperties.a.p())) == null) ? null : bVar.getText();
        boolean z = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.e(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.e(this.view, semanticsId, false);
            } else if (Intrinsics.e((c) SemanticsConfigurationKt.a(sebVarG, SemanticsProperties.a.c()), c.INSTANCE.a())) {
                this.platformAutofillManager.a(this.view, semanticsId, ha0.a.b(text2));
            }
        }
        ToggleableState toggleableState = previousSemanticsConfiguration != null ? (ToggleableState) SemanticsConfigurationKt.a(previousSemanticsConfiguration, SemanticsProperties.a.Q()) : null;
        ToggleableState toggleableState2 = sebVarG != null ? (ToggleableState) SemanticsConfigurationKt.a(sebVarG, SemanticsProperties.a.Q()) : null;
        if (toggleableState != toggleableState2) {
            if (toggleableState == null) {
                this.platformAutofillManager.e(this.view, semanticsId, true);
            } else if (toggleableState2 == null) {
                this.platformAutofillManager.e(this.view, semanticsId, false);
            } else if (Intrinsics.e((c) SemanticsConfigurationKt.a(sebVarG, SemanticsProperties.a.c()), c.INSTANCE.b())) {
                int i = a.$EnumSwitchMapping$0[toggleableState2.ordinal()];
                if (i != 1) {
                    bool = i != 2 ? null : Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
                if (bool != null) {
                    this.platformAutofillManager.a(this.view, semanticsId, ha0.a.c(bool.booleanValue()));
                }
            }
        }
        t94 t94Var = previousSemanticsConfiguration != null ? (t94) SemanticsConfigurationKt.a(previousSemanticsConfiguration, SemanticsProperties.a.i()) : null;
        t94 t94Var2 = sebVarG != null ? (t94) SemanticsConfigurationKt.a(sebVarG, SemanticsProperties.a.i()) : null;
        if (!Intrinsics.e(t94Var, t94Var2)) {
            if (t94Var == null) {
                this.platformAutofillManager.e(this.view, semanticsId, true);
            } else if (t94Var2 == null) {
                this.platformAutofillManager.e(this.view, semanticsId, false);
            } else {
                this.platformAutofillManager.a(this.view, semanticsId, ((sk) t94Var2).getAutofillValue());
            }
        }
        boolean z2 = previousSemanticsConfiguration != null && rh.e(previousSemanticsConfiguration);
        if (sebVarG != null && rh.e(sebVarG)) {
            z = true;
        }
        if (z2 != z) {
            if (z) {
                this.currentlyDisplayedIDs.g(semanticsId);
            } else {
                this.currentlyDisplayedIDs.s(semanticsId);
            }
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final la9 getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void e(teb semanticsInfo) {
        if (this.currentlyDisplayedIDs.s(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.e(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void f() {
        if (this.currentlyDisplayedIDs.c() && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.d()) {
            this.pendingAutofillCommit = true;
        }
    }

    public final void g(teb semanticsInfo) {
        if (this.currentlyDisplayedIDs.s(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.e(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void h(teb semanticsInfo) {
        seb sebVarG = semanticsInfo.g();
        if (sebVarG == null || !rh.e(sebVarG)) {
            return;
        }
        this.currentlyDisplayedIDs.g(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.e(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void i(teb semanticsInfo, int previousSemanticsId) {
        if (this.currentlyDisplayedIDs.s(previousSemanticsId)) {
            this.platformAutofillManager.e(this.view, previousSemanticsId, false);
        }
        seb sebVarG = semanticsInfo.g();
        if (sebVarG == null || !rh.e(sebVarG)) {
            return;
        }
        this.currentlyDisplayedIDs.g(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.e(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void j(SparseArray<AutofillValue> values) {
        seb sebVarG;
        Function1 function1A;
        Function1 function1A2;
        int size = values.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = values.keyAt(i);
            AutofillValue autofillValue = values.get(iKeyAt);
            teb tebVarA = this.semanticsOwner.a(iKeyAt);
            if (tebVarA != null && (sebVarG = tebVarA.g()) != null) {
                SemanticsActions semanticsActions = SemanticsActions.a;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(sebVarG, semanticsActions.k());
                if (accessibilityAction != null && (function1A2 = accessibilityAction.a()) != null) {
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(sebVarG, semanticsActions.m());
                if (accessibilityAction2 != null && (function1A = accessibilityAction2.a()) != null) {
                }
            }
        }
    }

    public final void k(ViewStructure rootViewStructure) {
        ha0 ha0Var = ha0.a;
        teb tebVarC = this.semanticsOwner.c();
        PopulateViewStructure_androidKt.a(rootViewStructure, tebVarC, this.rootAutofillId, this.packageName, this.rectManager);
        e58 e58VarH = am8.h(tebVarC, rootViewStructure);
        while (e58VarH.h()) {
            Object objB = e58VarH.B(e58VarH._size - 1);
            Intrinsics.h(objB, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure = (ViewStructure) objB;
            Object objB2 = e58VarH.B(e58VarH._size - 1);
            Intrinsics.h(objB2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List<teb> listK = ((teb) objB2).k();
            int size = listK.size();
            for (int i = 0; i < size; i++) {
                teb tebVar = listK.get(i);
                if (!tebVar.getIsDeactivated() && tebVar.b() && tebVar.x()) {
                    seb sebVarG = tebVar.g();
                    if (sebVarG == null || !rh.f(sebVarG)) {
                        e58VarH.n(tebVar);
                        e58VarH.n(viewStructure);
                    } else {
                        ViewStructure viewStructureH = ha0Var.h(viewStructure, ha0Var.a(viewStructure, 1));
                        PopulateViewStructure_androidKt.a(viewStructureH, tebVar, this.rootAutofillId, this.packageName, this.rectManager);
                        e58VarH.n(tebVar);
                        e58VarH.n(viewStructureH);
                    }
                }
            }
        }
    }

    public final void l(final teb semanticsInfo) {
        this.rectManager.getRects().q(semanticsInfo.getSemanticsId(), new rs4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void a(int i, int i2, int i3, int i4) {
                this.this$0.reusableRect.set(i, i2, i3, i4);
                this.this$0.getPlatformAutofillManager().d(this.this$0.view, semanticsInfo.getSemanticsId(), this.this$0.reusableRect);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return Unit.a;
            }
        });
    }

    @Override // com.google.inputmethod.nk4
    public void w(g previous, g current) {
        teb tebVarS;
        seb sebVarG;
        teb tebVarS2;
        seb sebVarG2;
        if (previous != null && (tebVarS2 = y23.s(previous)) != null && (sebVarG2 = tebVarS2.g()) != null && rh.d(sebVarG2)) {
            this.platformAutofillManager.c(this.view, tebVarS2.getSemanticsId());
        }
        if (current == null || (tebVarS = y23.s(current)) == null || (sebVarG = tebVarS.g()) == null || !rh.d(sebVarG)) {
            return;
        }
        final int semanticsId = tebVarS.getSemanticsId();
        this.rectManager.getRects().q(semanticsId, new rs4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void a(int i, int i2, int i3, int i4) {
                this.this$0.getPlatformAutofillManager().b(this.this$0.view, semanticsId, new Rect(i, i2, i3, i4));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                a(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return Unit.a;
            }
        });
    }
}
