package androidx.compose.ui.modifier;

import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import com.google.inputmethod.my7;
import com.google.inputmethod.r58;
import com.google.inputmethod.y23;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Landroidx/compose/ui/node/m;", "owner", "<init>", "(Landroidx/compose/ui/node/m;)V", "Landroidx/compose/ui/b$c;", "node", "Lcom/google/android/my7;", "key", "", "Landroidx/compose/ui/node/BackwardsCompatNode;", "set", "", "c", "(Landroidx/compose/ui/b$c;Lcom/google/android/my7;Ljava/util/Set;)V", "b", "()V", "e", "f", "(Landroidx/compose/ui/node/BackwardsCompatNode;Lcom/google/android/my7;)V", "a", "d", "Landroidx/compose/ui/node/m;", "getOwner", "()Landroidx/compose/ui/node/m;", "Lcom/google/android/r58;", "Lcom/google/android/r58;", "inserted", "insertedLocal", "Landroidx/compose/ui/node/LayoutNode;", "removed", "removedLocal", "", "Z", "invalidated", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModifierLocalManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final m owner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final r58<BackwardsCompatNode> inserted = new r58<>(new BackwardsCompatNode[16], 0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final r58<my7<?>> insertedLocal = new r58<>(new my7[16], 0);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final r58<LayoutNode> removed = new r58<>(new LayoutNode[16], 0);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final r58<my7<?>> removedLocal = new r58<>(new my7[16], 0);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean invalidated;

    public ModifierLocalManager(m mVar) {
        this.owner = mVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    private final void c(androidx.compose.ui.b.c r13, com.google.inputmethod.my7<?> r14, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode> r15) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.modifier.ModifierLocalManager.c(androidx.compose.ui.b$c, com.google.android.my7, java.util.Set):void");
    }

    public final void a(BackwardsCompatNode node, my7<?> key) {
        this.inserted.c(node);
        this.insertedLocal.c(key);
        b();
    }

    public final void b() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.M(new Function0<Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke() throws KotlinNothingValueException {
                m18invoke();
                return Unit.a;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m18invoke() throws KotlinNothingValueException {
                this.this$0.e();
            }
        });
    }

    public final void d(BackwardsCompatNode node, my7<?> key) {
        this.removed.c(y23.q(node));
        this.removedLocal.c(key);
        b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void e() throws KotlinNothingValueException {
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        r58<LayoutNode> r58Var = this.removed;
        LayoutNode[] layoutNodeArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            my7<?> my7Var = this.removedLocal.content[i];
            if (layoutNode.getNodes().getHead().getIsAttached()) {
                c(layoutNode.getNodes().getHead(), my7Var, hashSet);
            }
        }
        this.removed.j();
        this.removedLocal.j();
        r58<BackwardsCompatNode> r58Var2 = this.inserted;
        BackwardsCompatNode[] backwardsCompatNodeArr = r58Var2.content;
        int size2 = r58Var2.getSize();
        for (int i2 = 0; i2 < size2; i2++) {
            BackwardsCompatNode backwardsCompatNode = backwardsCompatNodeArr[i2];
            my7<?> my7Var2 = this.insertedLocal.content[i2];
            if (backwardsCompatNode.getIsAttached()) {
                c(backwardsCompatNode, my7Var2, hashSet);
            }
        }
        this.inserted.j();
        this.insertedLocal.j();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).u3();
        }
    }

    public final void f(BackwardsCompatNode node, my7<?> key) {
        this.inserted.c(node);
        this.insertedLocal.c(key);
        b();
    }
}
