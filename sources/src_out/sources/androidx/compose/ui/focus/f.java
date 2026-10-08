package androidx.compose.ui.focus;

import com.google.inputmethod.al4;
import com.google.inputmethod.bl4;
import com.google.inputmethod.k33;
import com.google.inputmethod.ni8;
import com.google.inputmethod.r58;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/f;", "", "<init>", "()V", "Landroidx/compose/ui/focus/b;", "focusDirection", "", "g", "(I)Z", "d", "()Z", "e", "Lcom/google/android/r58;", "Lcom/google/android/al4;", "a", "Lcom/google/android/r58;", "f", "()Lcom/google/android/r58;", "focusRequesterNodes", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final f c = new f();
    private static final f d = new f();
    private static final f e = new f();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final r58<al4> focusRequesterNodes = new r58<>(new al4[16], 0);

    /* JADX INFO: renamed from: androidx.compose.ui.focus.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/f;", "Default", "Landroidx/compose/ui/focus/f;", "b", "()Landroidx/compose/ui/focus/f;", "Cancel", "a", "Redirect", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.d;
        }

        public final f b() {
            return f.c;
        }

        public final f c() {
            return f.e;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ boolean h(f fVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = b.INSTANCE.b();
        }
        return fVar.g(i);
    }

    public final boolean d() {
        if (this.focusRequesterNodes.getSize() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        r58<al4> r58Var = this.focusRequesterNodes;
        al4[] al4VarArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            if (bl4.a(al4VarArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (this.focusRequesterNodes.getSize() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        r58<al4> r58Var = this.focusRequesterNodes;
        al4[] al4VarArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            if (bl4.b(al4VarArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final r58<al4> f() {
        return this.focusRequesterNodes;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean g(int focusDirection) throws KotlinNothingValueException {
        Companion companion = INSTANCE;
        if (this == companion.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == companion.a()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (f().getSize() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        r58<al4> r58VarF = f();
        al4[] al4VarArr = r58VarF.content;
        int size = r58VarF.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            al4 al4Var = al4VarArr[i];
            int iA = ni8.a(1024);
            if (!al4Var.getNode().getIsAttached()) {
                zw5.c("visitChildren called on an unattached node");
            }
            r58 r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
            androidx.compose.ui.b.c child = al4Var.getNode().getChild();
            if (child == null) {
                y23.c(r58Var, al4Var.getNode(), false);
            } else {
                r58Var.c(child);
            }
            while (r58Var.getSize() != 0) {
                androidx.compose.ui.b.c cVarJ = (androidx.compose.ui.b.c) r58Var.u(r58Var.getSize() - 1);
                if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                    y23.c(r58Var, cVarJ, false);
                } else {
                    while (cVarJ != null) {
                        if ((cVarJ.getKindSet() & iA) != 0) {
                            r58 r58Var2 = null;
                            while (cVarJ != null) {
                                if (cVarJ instanceof FocusTargetNode) {
                                    if (((FocusTargetNode) cVarJ).n1(focusDirection)) {
                                        z = true;
                                        break;
                                    }
                                } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate(); cVarN3 != null; cVarN3 = cVarN3.getChild()) {
                                        if ((cVarN3.getKindSet() & iA) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarJ = cVarN3;
                                            } else {
                                                if (r58Var2 == null) {
                                                    r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
                                                }
                                                if (cVarJ != null) {
                                                    r58Var2.c(cVarJ);
                                                    cVarJ = null;
                                                }
                                                r58Var2.c(cVarN3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarJ = y23.j(r58Var2);
                            }
                            break;
                        }
                        cVarJ = cVarJ.getChild();
                    }
                }
            }
        }
        return z;
    }
}
