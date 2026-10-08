package androidx.compose.p000animation;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g16;
import com.google.inputmethod.h66;
import com.google.inputmethod.q16;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000f\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J)\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Lcom/google/android/ej7;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "rootScope", "<init>", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "minIntrinsicWidth", "(Lcom/google/android/h66;Ljava/util/List;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "a", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class AnimatedContentMeasurePolicy implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    public final AnimatedContentTransitionScopeImpl<?> a() {
        return this.rootScope;
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).W(i));
            int iR = m.r(list);
            int i2 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).W(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iR) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // com.google.inputmethod.ej7
    public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).q0(i));
            int iR = m.r(list);
            int i2 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).q0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iR) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
        o oVar;
        int i;
        o oVar2;
        final int width;
        final int height;
        int size = list.size();
        final o[] oVarArr = new o[size];
        long jA = q16.INSTANCE.a();
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            oVar = null;
            i = 1;
            if (i2 >= size2) {
                break;
            }
            dj7 dj7Var = list.get(i2);
            Object parentData = dj7Var.getParentData();
            AnimatedContentTransitionScopeImpl.a aVar = parentData instanceof AnimatedContentTransitionScopeImpl.a ? (AnimatedContentTransitionScopeImpl.a) parentData : null;
            if (aVar != null && aVar.a()) {
                o oVarR0 = dj7Var.r0(j);
                long jC = q16.c((((long) oVarR0.getWidth()) << 32) | (((long) oVarR0.getHeight()) & 4294967295L));
                Unit unit = Unit.a;
                oVarArr[i2] = oVarR0;
                jA = jC;
            }
            i2++;
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            dj7 dj7Var2 = list.get(i3);
            if (oVarArr[i3] == null) {
                oVarArr[i3] = dj7Var2.r0(j);
            }
        }
        if (jVar.G1()) {
            width = (int) (jA >> 32);
        } else {
            if (size != 0) {
                oVar2 = oVarArr[0];
                int iX0 = f.x0(oVarArr);
                if (iX0 != 0) {
                    int width2 = oVar2 != null ? oVar2.getWidth() : 0;
                    if (1 <= iX0) {
                        int i4 = 1;
                        while (true) {
                            o oVar3 = oVarArr[i4];
                            int width3 = oVar3 != null ? oVar3.getWidth() : 0;
                            if (width2 < width3) {
                                oVar2 = oVar3;
                                width2 = width3;
                            }
                            if (i4 == iX0) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            } else {
                oVar2 = null;
            }
            width = oVar2 != null ? oVar2.getWidth() : 0;
        }
        if (jVar.G1()) {
            height = (int) (jA & 4294967295L);
        } else {
            if (size != 0) {
                oVar = oVarArr[0];
                int iX1 = f.x0(oVarArr);
                if (iX1 != 0) {
                    int height2 = oVar != null ? oVar.getHeight() : 0;
                    if (1 <= iX1) {
                        while (true) {
                            o oVar4 = oVarArr[i];
                            int height3 = oVar4 != null ? oVar4.getHeight() : 0;
                            if (height2 < height3) {
                                oVar = oVar4;
                                height2 = height3;
                            }
                            if (i == iX1) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            height = oVar != null ? oVar.getHeight() : 0;
        }
        if (!jVar.G1()) {
            this.rootScope.y(q16.c((((long) width) << 32) | (((long) height) & 4294967295L)));
        }
        return j.Q1(jVar, width, height, null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o.a) obj);
                return Unit.a;
            }

            public final void invoke(o.a aVar2) {
                o[] oVarArr2 = oVarArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i5 = width;
                int i6 = height;
                int length = oVarArr2.length;
                int i7 = 0;
                while (i7 < length) {
                    o oVar5 = oVarArr2[i7];
                    if (oVar5 != null) {
                        long jA2 = animatedContentMeasurePolicy.a().getContentAlignment().a(q16.c((((long) oVar5.getWidth()) << 32) | (((long) oVar5.getHeight()) & 4294967295L)), q16.c((((long) i6) & 4294967295L) | (((long) i5) << 32)), LayoutDirection.Ltr);
                        o.a.z(aVar2, oVar5, g16.k(jA2), g16.l(jA2), 0.0f, 4, null);
                    }
                    i7++;
                    oVarArr2 = oVarArr2;
                }
            }
        }, 4, null);
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).d0(i));
            int iR = m.r(list);
            int i2 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).d0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iR) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // com.google.inputmethod.ej7
    public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).o0(i));
            int iR = m.r(list);
            int i2 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).o0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iR) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
