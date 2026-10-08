package androidx.databinding;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class a implements d {
    private transient e a;

    public void a() {
        synchronized (this) {
            try {
                e eVar = this.a;
                if (eVar == null) {
                    return;
                }
                eVar.d(this, 0, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.d
    public void a0(d.a aVar) {
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.a(aVar);
    }

    @Override // androidx.databinding.d
    public void a3(d.a aVar) {
        synchronized (this) {
            try {
                e eVar = this.a;
                if (eVar == null) {
                    return;
                }
                eVar.i(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
