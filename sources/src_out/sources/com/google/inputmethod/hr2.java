package com.google.inputmethod;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010\"J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010\u0017J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010\u0017R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-¨\u0006/"}, d2 = {"Lcom/google/android/hr2;", "", "", "string", "<init>", "(Ljava/lang/String;)V", "Lcom/google/android/wg0;", "b", "()F", "Lcom/google/android/hwc;", "n", "()Lcom/google/android/hwc;", "Lcom/google/android/wrc;", "m", "()Lcom/google/android/wrc;", "Lcom/google/android/nkb;", "j", "()Lcom/google/android/nkb;", "", "c", "()B", "", "i", "()I", "", "e", "l", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/r;", "k", "()Landroidx/compose/ui/text/r;", "Lcom/google/android/ei1;", "d", "()J", "Lcom/google/android/b0d;", "o", "Landroidx/compose/ui/text/font/x;", "h", "()Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/t;", "f", "Landroidx/compose/ui/text/font/u;", "g", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hr2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Parcel parcel;

    public hr2(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.parcel.dataAvail();
    }

    private final float b() {
        return wg0.c(e());
    }

    private final byte c() {
        return this.parcel.readByte();
    }

    private final float e() {
        return this.parcel.readFloat();
    }

    private final int i() {
        return this.parcel.readInt();
    }

    private final Shadow j() {
        long jD = d();
        float fE = e();
        return new Shadow(jD, rn8.e((((long) Float.floatToRawIntBits(e())) & 4294967295L) | (Float.floatToRawIntBits(fE) << 32)), e(), null);
    }

    private final String l() {
        return this.parcel.readString();
    }

    private final wrc m() {
        int i = i();
        wrc.Companion companion = wrc.INSTANCE;
        boolean z = (companion.b().getMask() & i) != 0;
        boolean z2 = (i & companion.d().getMask()) != 0;
        if (z && z2) {
            return companion.a(m.s(new wrc[]{companion.b(), companion.d()}));
        }
        if (z) {
            return companion.b();
        }
        return z2 ? companion.d() : companion.c();
    }

    private final TextGeometricTransform n() {
        return new TextGeometricTransform(e(), e());
    }

    public final long d() {
        return ej.a(ei1.INSTANCE, this.parcel.readLong());
    }

    public final int f() {
        byte bC = c();
        if (bC != 0 && bC == 1) {
            return t.INSTANCE.a();
        }
        return t.INSTANCE.b();
    }

    public final int g() {
        byte bC = c();
        if (bC == 0) {
            return u.INSTANCE.b();
        }
        if (bC == 1) {
            return u.INSTANCE.a();
        }
        if (bC == 3) {
            return u.INSTANCE.c();
        }
        return bC == 2 ? u.INSTANCE.d() : u.INSTANCE.b();
    }

    public final FontWeight h() {
        return new FontWeight(i());
    }

    public final SpanStyle k() {
        n58 n58Var = new n58(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                if (bC != 2) {
                    if (bC != 3) {
                        if (bC != 4) {
                            if (bC != 5) {
                                if (bC != 6) {
                                    if (bC != 7) {
                                        if (bC != 8) {
                                            if (bC != 9) {
                                                if (bC != 10) {
                                                    if (bC != 11) {
                                                        if (bC == 12) {
                                                            if (a() < 20) {
                                                                break;
                                                            }
                                                            n58Var.j(j());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (a() < 4) {
                                                            break;
                                                        }
                                                        n58Var.k(m());
                                                    }
                                                } else {
                                                    if (a() < 8) {
                                                        break;
                                                    }
                                                    n58Var.a(d());
                                                }
                                            } else {
                                                if (a() < 8) {
                                                    break;
                                                }
                                                n58Var.l(n());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            n58Var.b(wg0.b(b()));
                                        }
                                    } else {
                                        if (a() < 5) {
                                            break;
                                        }
                                        n58Var.i(o());
                                    }
                                } else {
                                    n58Var.d(l());
                                }
                            } else {
                                if (a() < 1) {
                                    break;
                                }
                                n58Var.g(u.e(g()));
                            }
                        } else {
                            if (a() < 1) {
                                break;
                            }
                            n58Var.f(t.c(f()));
                        }
                    } else {
                        if (a() < 4) {
                            break;
                        }
                        n58Var.h(h());
                    }
                } else {
                    if (a() < 5) {
                        break;
                    }
                    n58Var.e(o());
                }
            } else {
                if (a() < 8) {
                    break;
                }
                n58Var.c(d());
            }
        }
        return n58Var.m();
    }

    public final long o() {
        long jA;
        byte bC = c();
        if (bC == 1) {
            jA = d0d.INSTANCE.b();
        } else {
            jA = bC == 2 ? d0d.INSTANCE.a() : d0d.INSTANCE.c();
        }
        return d0d.g(jA, d0d.INSTANCE.c()) ? b0d.INSTANCE.a() : c0d.a(e(), jA);
    }
}
