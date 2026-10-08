package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import com.google.android.r43;
import com.google.inputmethod.dm;
import com.google.inputmethod.f39;
import com.google.inputmethod.q09;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\u0005R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0015\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010&\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010$\"\u0004\b\u0013\u0010%R$\u0010(\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u00020,2\u0006\u0010-\u001a\u00020,8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b\u001c\u00103R$\u00108\u001a\u0002052\u0006\u0010\u001b\u001a\u0002058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u00102\"\u0004\b7\u00103R$\u0010;\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010$\"\u0004\b:\u0010%R$\u0010?\u001a\u00020<2\u0006\u0010\u001b\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u00102\"\u0004\b>\u00103R$\u0010C\u001a\u00020@2\u0006\u0010\u001b\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u00102\"\u0004\bB\u00103R$\u0010F\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010$\"\u0004\bE\u0010%R$\u0010J\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020G8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u00102\"\u0004\bI\u00103R4\u0010O\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u000e\u0010\u001b\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010S\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010P\"\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Landroidx/compose/ui/graphics/b;", "Lcom/google/android/q09;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "v", "()Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "g", "setInternalPaint$ui_graphics", "Landroidx/compose/ui/graphics/e;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "Landroid/graphics/Shader;", "internalShader", "Landroidx/compose/ui/graphics/h;", "d", "Landroidx/compose/ui/graphics/h;", "internalColorFilter", "Lcom/google/android/f39;", "value", "e", "Lcom/google/android/f39;", "C", "()Lcom/google/android/f39;", "B", "(Lcom/google/android/f39;)V", "pathEffect", "", "()F", "(F)V", "alpha", "", "isAntiAlias", "()Z", "o", "(Z)V", "Lcom/google/android/ei1;", "color", "()J", "n", "(J)V", "f", "()I", "(I)V", "blendMode", "Lcom/google/android/w09;", "getStyle-TiuSbCo", "y", "style", "A", "z", "strokeWidth", "Lcom/google/android/wbc;", "r", "p", "strokeCap", "Lcom/google/android/ybc;", "t", "s", "strokeJoin", "u", "x", "strokeMiterLimit", "Lcom/google/android/ca4;", "E", "q", "filterQuality", "w", "()Landroid/graphics/Shader;", "D", "(Landroid/graphics/Shader;)V", "shader", "()Landroidx/compose/ui/graphics/h;", "h", "(Landroidx/compose/ui/graphics/h;)V", "colorFilter", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements q09 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Paint internalPaint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int _blendMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Shader internalShader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private h internalColorFilter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private f39 pathEffect;

    public b(Paint paint) {
        this.internalPaint = paint;
        this._blendMode = e.INSTANCE.B();
    }

    @Override // com.google.inputmethod.q09
    public float A() {
        return dm.j(this.internalPaint);
    }

    @Override // com.google.inputmethod.q09
    public void B(f39 f39Var) {
        dm.r(this.internalPaint, f39Var);
        this.pathEffect = f39Var;
    }

    @Override // com.google.inputmethod.q09
    /* JADX INFO: renamed from: C, reason: from getter */
    public f39 getPathEffect() {
        return this.pathEffect;
    }

    @Override // com.google.inputmethod.q09
    public void D(Shader shader) {
        this.internalShader = shader;
        dm.s(this.internalPaint, shader);
    }

    @Override // com.google.inputmethod.q09
    public int E() {
        return dm.e(this.internalPaint);
    }

    @Override // com.google.inputmethod.q09
    public float a() {
        return dm.c(this.internalPaint);
    }

    @Override // com.google.inputmethod.q09
    /* JADX INFO: renamed from: b, reason: from getter */
    public h getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // com.google.inputmethod.q09
    public void c(float f) {
        dm.l(this.internalPaint, f);
    }

    @Override // com.google.inputmethod.q09
    public long d() {
        return dm.d(this.internalPaint);
    }

    @Override // com.google.inputmethod.q09
    public void e(int i) {
        if (e.E(this._blendMode, i)) {
            return;
        }
        this._blendMode = i;
        dm.n(this.internalPaint, i);
    }

    @Override // com.google.inputmethod.q09
    /* JADX INFO: renamed from: f, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // com.google.inputmethod.q09
    public void h(h hVar) {
        this.internalColorFilter = hVar;
        dm.p(this.internalPaint, hVar);
    }

    @Override // com.google.inputmethod.q09
    public void n(long j) {
        dm.o(this.internalPaint, j);
    }

    @Override // com.google.inputmethod.q09
    public void o(boolean z) {
        dm.m(this.internalPaint, z);
    }

    @Override // com.google.inputmethod.q09
    public void p(int i) {
        dm.t(this.internalPaint, i);
    }

    @Override // com.google.inputmethod.q09
    public void q(int i) {
        dm.q(this.internalPaint, i);
    }

    @Override // com.google.inputmethod.q09
    public int r() {
        return dm.g(this.internalPaint);
    }

    @Override // com.google.inputmethod.q09
    public void s(int i) {
        dm.u(this.internalPaint, i);
    }

    @Override // com.google.inputmethod.q09
    public int t() {
        return dm.h(this.internalPaint);
    }

    @Override // com.google.inputmethod.q09
    public float u() {
        return dm.i(this.internalPaint);
    }

    @Override // com.google.inputmethod.q09
    @r43
    public Paint v() {
        return this.internalPaint;
    }

    @Override // com.google.inputmethod.q09
    /* JADX INFO: renamed from: w, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // com.google.inputmethod.q09
    public void x(float f) {
        dm.v(this.internalPaint, f);
    }

    @Override // com.google.inputmethod.q09
    public void y(int i) {
        dm.x(this.internalPaint, i);
    }

    @Override // com.google.inputmethod.q09
    public void z(float f) {
        dm.w(this.internalPaint, f);
    }

    public b() {
        this(dm.k());
    }
}
