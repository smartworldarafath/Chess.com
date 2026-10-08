package com.google.inputmethod;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class f9c extends xz7 {
    private g9c a;
    private x2c b;
    private e9c c;

    public f9c() {
        g9c g9cVar = new g9c();
        this.a = g9cVar;
        this.c = g9cVar;
    }

    @Override // com.google.inputmethod.xz7
    public float a() {
        return this.c.a();
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        g9c g9cVar = this.a;
        this.c = g9cVar;
        g9cVar.c(f, f2, f3, f4, f5, f6);
    }

    public boolean c() {
        return this.c.isStopped();
    }

    public void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.b == null) {
            this.b = new x2c();
        }
        x2c x2cVar = this.b;
        this.c = x2cVar;
        x2cVar.c(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
