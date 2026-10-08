package androidx.p008glance;

import android.graphics.Bitmap;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.p008glance.semantics.SemanticsConfiguration;
import androidx.p008glance.semantics.SemanticsProperties;
import com.google.inputmethod.AndroidResourceImageProvider;
import com.google.inputmethod.BitmapImageProvider;
import com.google.inputmethod.SemanticsModifier;
import com.google.inputmethod.dud;
import com.google.inputmethod.dz;
import com.google.inputmethod.e02;
import com.google.inputmethod.gi1;
import com.google.inputmethod.jfb;
import com.google.inputmethod.ko5;
import com.google.inputmethod.mfb;
import com.google.inputmethod.pp1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.zeb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aD\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"", "resId", "Lcom/google/android/ko5;", "b", "(I)Lcom/google/android/ko5;", "Landroid/graphics/Bitmap;", "bitmap", "c", "(Landroid/graphics/Bitmap;)Lcom/google/android/ko5;", "Landroidx/glance/e;", "", "d", "(Landroidx/glance/e;)Z", "provider", "", "contentDescription", "Landroidx/glance/g;", "modifier", "Lcom/google/android/e02;", "contentScale", "Lcom/google/android/gi1;", "colorFilter", "", "a", "(Lcom/google/android/ko5;Ljava/lang/String;Landroidx/glance/g;ILcom/google/android/gi1;Landroidx/compose/runtime/d;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ImageKt {
    public static final void a(final ko5 ko5Var, final String str, g gVar, int i, gi1 gi1Var, d dVar, final int i2, final int i3) {
        int i4;
        g gVarA;
        final g gVar2;
        final int i5;
        gi1 gi1Var2 = gi1Var;
        d dVarF = dVar.F(491792371);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i6 = i2 & 8;
            i4 = (dVarF.x(ko5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dVarF.x(str) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= dVarF.x(gVar) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= dVarF.C(i) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            int i10 = 32768 & i2;
            i4 |= dVarF.x(gi1Var2) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && dVarF.c()) {
            dVarF.q();
            gVar2 = gVar;
            i5 = i;
        } else {
            g gVar3 = i7 != 0 ? g.INSTANCE : gVar;
            int iC = i8 != 0 ? e02.INSTANCE.c() : i;
            if (i9 != 0) {
                gi1Var2 = null;
            }
            if (e.k()) {
                e.o(491792371, i4, -1, "androidx.glance.Image (Image.kt:153)");
            }
            dVarF.Q(135631275);
            if (str != null) {
                dVarF.Q(135633130);
                boolean zX = dVarF.x(str);
                Object objR = dVarF.R();
                if (zX || objR == d.INSTANCE.a()) {
                    objR = new Function1<mfb, Unit>() { // from class: androidx.glance.ImageKt$Image$finalModifier$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(mfb mfbVar) {
                            jfb.a(mfbVar, str);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            a((mfb) obj);
                            return Unit.a;
                        }
                    };
                    dVarF.L(objR);
                }
                dVarF.a0();
                gVarA = zeb.a(gVar3, (Function1) objR);
            } else {
                gVarA = gVar3;
            }
            dVarF.a0();
            ImageKt$Image$1 imageKt$Image$1 = ImageKt$Image$1.a;
            dVarF.Q(-1115894518);
            dVarF.Q(1886828752);
            if (!(dVarF.G() instanceof dz)) {
                pp1.d();
            }
            dVarF.J();
            if (dVarF.getInserting()) {
                dVarF.W(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(imageKt$Image$1));
            } else {
                dVarF.k();
            }
            d dVarC = dud.c(dVarF);
            dud.i(dVarC, ko5Var, new Function2<EmittableImage, ko5, Unit>() { // from class: androidx.glance.ImageKt$Image$2$1
                public final void a(EmittableImage emittableImage, ko5 ko5Var2) {
                    emittableImage.h(ko5Var2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableImage) obj, (ko5) obj2);
                    return Unit.a;
                }
            });
            dud.i(dVarC, gVarA, new Function2<EmittableImage, g, Unit>() { // from class: androidx.glance.ImageKt$Image$2$2
                public final void a(EmittableImage emittableImage, g gVar4) {
                    emittableImage.b(gVar4);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableImage) obj, (g) obj2);
                    return Unit.a;
                }
            });
            dud.i(dVarC, e02.d(iC), new Function2<EmittableImage, e02, Unit>() { // from class: androidx.glance.ImageKt$Image$2$3
                public final void a(EmittableImage emittableImage, int i11) {
                    emittableImage.g(i11);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableImage) obj, ((e02) obj2).getValue());
                    return Unit.a;
                }
            });
            dud.i(dVarC, gi1Var2, new Function2<EmittableImage, gi1, Unit>() { // from class: androidx.glance.ImageKt$Image$2$4
                public final void a(EmittableImage emittableImage, gi1 gi1Var3) {
                    emittableImage.f(gi1Var3 != null ? gi1Var3.getColorFilterParams() : null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((EmittableImage) obj, (gi1) obj2);
                    return Unit.a;
                }
            });
            dVarF.m();
            dVarF.a0();
            dVarF.a0();
            if (e.k()) {
                e.n();
            }
            gVar2 = gVar3;
            i5 = iC;
        }
        final gi1 gi1Var3 = gi1Var2;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.glance.ImageKt$Image$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i11) {
                    ImageKt.a(ko5Var, str, gVar2, i5, gi1Var3, dVar2, i2 | 1, i3);
                }
            });
        }
    }

    public static final ko5 b(int i) {
        return new AndroidResourceImageProvider(i);
    }

    public static final ko5 c(Bitmap bitmap) {
        return new BitmapImageProvider(bitmap);
    }

    public static final boolean d(EmittableImage emittableImage) {
        List list;
        String str = null;
        SemanticsModifier semanticsModifier = (SemanticsModifier) emittableImage.getModifier().foldIn(null, new Function2<SemanticsModifier, g.b, SemanticsModifier>() { // from class: androidx.glance.ImageKt$isDecorative$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SemanticsModifier invoke(SemanticsModifier semanticsModifier2, g.b bVar) {
                return bVar instanceof SemanticsModifier ? bVar : semanticsModifier2;
            }
        });
        SemanticsConfiguration configuration = semanticsModifier != null ? semanticsModifier.getConfiguration() : null;
        if (configuration != null && (list = (List) configuration.c(SemanticsProperties.a.a())) != null) {
            str = (String) list.get(0);
        }
        return str == null || str.length() == 0;
    }
}
