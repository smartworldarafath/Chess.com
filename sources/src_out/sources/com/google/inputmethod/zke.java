package com.google.inputmethod;

import androidx.compose.p004runtime.s0;
import androidx.compose.ui.layout.p;
import androidx.compose.ui.layout.r;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010!\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001a8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010%\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0013\u0010)R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b\"\u0010)R\"\u0010/\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010-\u001a\u0004\b\b\u0010\u001e\"\u0004\b.\u0010 R\"\u00101\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010-\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b0\u0010 R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010-\u001a\u0004\b\u001b\u0010\u001e\"\u0004\b2\u0010 R\"\u00105\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010-\u001a\u0004\b'\u0010\u001e\"\u0004\b4\u0010 ¨\u00066"}, d2 = {"Lcom/google/android/zke;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "", "<set-?>", "a", "Lcom/google/android/o58;", "isVisible", "()Z", "p", "(Z)V", "b", "g", "i", "isAnimating", "", "c", "Lcom/google/android/l48;", "getFraction", "()F", "l", "(F)V", "fraction", "", "d", "Lcom/google/android/y48;", "getDurationMillis", "()J", "k", "(J)V", "durationMillis", "e", "getAlpha", "h", "alpha", "Landroidx/compose/ui/layout/p;", "f", "Landroidx/compose/ui/layout/p;", "()Landroidx/compose/ui/layout/p;", "source", "target", "Lcom/google/android/d1e;", "J", "j", "current", "m", "maximum", "n", "sourceValueInsets", "o", "targetValueInsets", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zke {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final p source;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final p target;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o58 isVisible = s0.e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 isAnimating = s0.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final l48 fraction = tm9.a(0.0f);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final y48 durationMillis = swb.a(0);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final l48 alpha = tm9.a(1.0f);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long current = f1e.a();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long maximum = f1e.a();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long sourceValueInsets = f1e.a();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long targetValueInsets = f1e.a();

    public zke(String str) {
        this.source = r.a(str + " source");
        this.target = r.a(str + " target");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public p getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSourceValueInsets() {
        return this.sourceValueInsets;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public p getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTargetValueInsets() {
        return this.targetValueInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean g() {
        return ((Boolean) this.isAnimating.getValue()).booleanValue();
    }

    public void h(float f) {
        this.alpha.p(f);
    }

    public void i(boolean z) {
        this.isAnimating.setValue(Boolean.valueOf(z));
    }

    public final void j(long j) {
        this.current = j;
    }

    public void k(long j) {
        this.durationMillis.C(j);
    }

    public void l(float f) {
        this.fraction.p(f);
    }

    public final void m(long j) {
        this.maximum = j;
    }

    public final void n(long j) {
        this.sourceValueInsets = j;
    }

    public final void o(long j) {
        this.targetValueInsets = j;
    }

    public void p(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }
}
