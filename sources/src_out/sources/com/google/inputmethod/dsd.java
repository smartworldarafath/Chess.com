package com.google.inputmethod;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/google/android/dsd;", "Lcom/google/android/z0;", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "index", "instance", "", "r", "(ILandroidx/compose/ui/node/LayoutNode;)V", "q", "count", "b", "(II)V", "from", "to", "f", "(III)V", "n", "()V", "c", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dsd extends z0<LayoutNode> {
    public static final int e = z0.d;

    public dsd(LayoutNode layoutNode) {
        super(layoutNode);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.ez
    public void b(int index, int count) throws KotlinNothingValueException {
        a().A1(index, count);
    }

    @Override // com.google.inputmethod.ez
    public void c() {
        super.c();
        m owner = l().getOwner();
        if (owner != null) {
            owner.v();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.ez
    public void d() throws KotlinNothingValueException {
        a().p();
    }

    @Override // com.google.inputmethod.ez
    public void f(int from, int to, int count) {
        a().q1(from, to, count);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.z0
    protected void n() throws KotlinNothingValueException {
        l().z1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.ez
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void i(int index, LayoutNode instance) throws KotlinNothingValueException {
        a().Q0(index, instance);
    }

    @Override // com.google.inputmethod.ez
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void h(int index, LayoutNode instance) {
    }
}
