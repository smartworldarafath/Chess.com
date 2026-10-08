package com.google.inputmethod;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.ps4;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lcom/google/android/pk;", "Landroid/view/View$OnDragListener;", "Lcom/google/android/mf3;", "Lkotlin/Function3;", "Lcom/google/android/pf3;", "Lcom/google/android/tsb;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "", "startDrag", "<init>", "(Lcom/google/android/ps4;)V", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", "event", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Lcom/google/android/of3;", "target", "b", "(Lcom/google/android/of3;)V", "a", "(Lcom/google/android/of3;)Z", "Lcom/google/android/ps4;", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "rootDragAndDropNode", "Lcom/google/android/g10;", "c", "Lcom/google/android/g10;", "interestedTargets", "Landroidx/compose/ui/b;", "d", "Landroidx/compose/ui/b;", "()Landroidx/compose/ui/b;", "modifier", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pk implements View.OnDragListener, mf3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ps4<pf3, tsb, Function1<? super DrawScope, Unit>, Boolean> startDrag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(null, null, 3, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final g10<of3> interestedTargets = new g10<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final b modifier = new a();

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/google/android/pk$a", "Lcom/google/android/uy7;", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "d", "()Landroidx/compose/ui/draganddrop/DragAndDropNode;", "node", "", "e", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends uy7<DragAndDropNode> {
        a() {
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DragAndDropNode a() {
            return pk.this.rootDragAndDropNode;
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(DragAndDropNode node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return pk.this.rootDragAndDropNode.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pk(ps4<? super pf3, ? super tsb, ? super Function1<? super DrawScope, Unit>, Boolean> ps4Var) {
        this.startDrag = ps4Var;
    }

    @Override // com.google.inputmethod.mf3
    public boolean a(of3 target) {
        return this.interestedTargets.contains(target);
    }

    @Override // com.google.inputmethod.mf3
    public void b(of3 target) {
        this.interestedTargets.add(target);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public b getModifier() {
        return this.modifier;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) throws KotlinNothingValueException {
        lf3 lf3Var = new lf3(event);
        switch (event.getAction()) {
            case 1:
                boolean zM3 = this.rootDragAndDropNode.m3(lf3Var);
                Iterator<of3> it = this.interestedTargets.iterator();
                while (it.hasNext()) {
                    it.next().d0(lf3Var);
                }
                return zM3;
            case 2:
                this.rootDragAndDropNode.F1(lf3Var);
                return false;
            case 3:
                return this.rootDragAndDropNode.N1(lf3Var);
            case 4:
                this.rootDragAndDropNode.v0(lf3Var);
                this.interestedTargets.clear();
                return false;
            case 5:
                this.rootDragAndDropNode.f1(lf3Var);
                return false;
            case 6:
                this.rootDragAndDropNode.d1(lf3Var);
                return false;
            default:
                return false;
        }
    }
}
