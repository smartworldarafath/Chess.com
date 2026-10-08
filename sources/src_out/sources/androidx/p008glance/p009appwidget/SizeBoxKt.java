package androidx.p008glance.p009appwidget;

import android.os.Build;
import android.os.Bundle;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.p008glance.CompositionLocalsKt;
import com.google.inputmethod.dud;
import com.google.inputmethod.dz;
import com.google.inputmethod.fs1;
import com.google.inputmethod.jf3;
import com.google.inputmethod.ko1;
import com.google.inputmethod.os9;
import com.google.inputmethod.pp1;
import com.google.inputmethod.s6b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a0\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lcom/google/android/jf3;", "size", "Landroidx/glance/appwidget/m;", "sizeMode", "Lkotlin/Function0;", "", "content", "b", "(JLandroidx/glance/appwidget/m;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "minSize", "a", "(Landroidx/glance/appwidget/m;JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SizeBoxKt {
    public static final void a(final m mVar, final long j, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        Function2<? super d, ? super Integer, Unit> function3;
        Set<jf3> setA;
        m mVar2 = mVar;
        d dVarF = dVar.F(1526030150);
        if ((i & 6) == 0) {
            int i3 = i & 8;
            i2 = (dVarF.x(mVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.D(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function2;
            i2 |= dVarF.x(function3) ? 256 : 128;
        } else {
            function3 = function2;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && dVarF.c()) {
            dVarF.q();
        } else {
            if (e.k()) {
                e.o(1526030150, i4, -1, "androidx.glance.appwidget.ForEachSize (SizeBox.kt:94)");
            }
            if (mVar2 instanceof m.c) {
                dVarF.Q(-1173540356);
                dVarF.a0();
                setA = m.e(jf3.c(j));
            } else if (mVar2 instanceof m.a) {
                dVarF.Q(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    dVarF.Q(-2019914396);
                    Bundle bundle = (Bundle) dVarF.v(CompositionLocalsKt.a());
                    dVarF.Q(-1173535336);
                    boolean zD = dVarF.D(j);
                    Object objR = dVarF.R();
                    if (zD || objR == d.INSTANCE.a()) {
                        objR = new Function0<jf3>() { // from class: androidx.glance.appwidget.SizeBoxKt$ForEachSize$sizes$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            public final long b() {
                                return j;
                            }

                            public /* bridge */ /* synthetic */ Object invoke() {
                                return jf3.c(b());
                            }
                        };
                        dVarF.L(objR);
                    }
                    dVarF.a0();
                    setA = AppWidgetUtilsKt.d(bundle, (Function0) objR);
                    dVarF.a0();
                } else {
                    dVarF.Q(-2019826759);
                    setA = AppWidgetUtilsKt.f((Bundle) dVarF.v(CompositionLocalsKt.a()));
                    if (setA.isEmpty()) {
                        setA = m.e(jf3.c(j));
                    }
                    dVarF.a0();
                }
                dVarF.a0();
            } else {
                if (!(mVar2 instanceof m.b)) {
                    dVarF.Q(-1173645715);
                    dVarF.a0();
                    throw new NoWhenBranchMatchedException();
                }
                dVarF.Q(-2019661188);
                if (Build.VERSION.SDK_INT >= 31) {
                    setA = ((m.b) mVar2).a();
                } else {
                    m.b bVar = (m.b) mVar2;
                    long packedValue = AppWidgetUtilsKt.o(bVar.a()).get(0).getPackedValue();
                    List<jf3> listF = AppWidgetUtilsKt.f((Bundle) dVarF.v(CompositionLocalsKt.a()));
                    Collection arrayList = new ArrayList(m.A(listF, 10));
                    Iterator<T> it = listF.iterator();
                    while (it.hasNext()) {
                        jf3 jf3VarH = AppWidgetUtilsKt.h(((jf3) it.next()).getPackedValue(), bVar.a());
                        arrayList.add(jf3.c(jf3VarH != null ? jf3VarH.getPackedValue() : packedValue));
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = m.s(new jf3[]{jf3.c(packedValue), jf3.c(packedValue)});
                    }
                    setA = arrayList;
                }
                dVarF.a0();
            }
            List listP0 = m.p0(setA);
            ArrayList arrayList2 = new ArrayList(m.A(listP0, 10));
            Iterator it2 = listP0.iterator();
            while (it2.hasNext()) {
                b(((jf3) it2.next()).getPackedValue(), mVar2, function3, dVarF, ((i4 << 3) & 112) | (i4 & 896));
                arrayList2.add(Unit.a);
                mVar2 = mVar;
                function3 = function2;
            }
            if (e.k()) {
                e.n();
            }
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$ForEachSize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i5) {
                    SizeBoxKt.a(mVar, j, function2, dVar2, i | 1);
                }
            });
        }
    }

    public static final void b(final long j, final m mVar, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(-53921383);
        if ((i & 6) == 0) {
            i2 = (dVarF.D(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i3 = i & 64;
            i2 |= dVarF.x(mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.x(function2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && dVarF.c()) {
            dVarF.q();
        } else {
            if (e.k()) {
                e.o(-53921383, i2, -1, "androidx.glance.appwidget.SizeBox (SizeBox.kt:72)");
            }
            fs1.d(new os9[]{CompositionLocalsKt.c().d(jf3.c(j))}, ko1.b(dVarF, -1209815847, true, new Function2<d, Integer, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$1

                /* JADX INFO: renamed from: androidx.glance.appwidget.SizeBoxKt$SizeBox$1$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<EmittableSizeBox> {
                    public static final AnonymousClass1 a = new AnonymousClass1();

                    AnonymousClass1() {
                        super(0, EmittableSizeBox.class, "<init>", "<init>()V", 0);
                    }

                    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                    public final EmittableSizeBox invoke() {
                        return new EmittableSizeBox();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i4) {
                    if ((i4 & 3) == 2 && dVar2.c()) {
                        dVar2.q();
                        return;
                    }
                    if (e.k()) {
                        e.o(-1209815847, i4, -1, "androidx.glance.appwidget.SizeBox.<anonymous> (SizeBox.kt:74)");
                    }
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.a;
                    long j2 = j;
                    m mVar2 = mVar;
                    Function2<d, Integer, Unit> function3 = function2;
                    dVar2.Q(578571862);
                    dVar2.Q(-548224868);
                    if (!(dVar2.G() instanceof dz)) {
                        pp1.d();
                    }
                    dVar2.J();
                    if (dVar2.getInserting()) {
                        dVar2.W(anonymousClass1);
                    } else {
                        dVar2.k();
                    }
                    d dVarC = dud.c(dVar2);
                    dud.i(dVarC, jf3.c(j2), new Function2<EmittableSizeBox, jf3, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$1$2$1
                        public final void a(EmittableSizeBox emittableSizeBox, long j3) {
                            emittableSizeBox.j(j3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((EmittableSizeBox) obj, ((jf3) obj2).getPackedValue());
                            return Unit.a;
                        }
                    });
                    dud.i(dVarC, mVar2, new Function2<EmittableSizeBox, m, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$1$2$2
                        public final void a(EmittableSizeBox emittableSizeBox, m mVar3) {
                            emittableSizeBox.k(mVar3);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((EmittableSizeBox) obj, (m) obj2);
                            return Unit.a;
                        }
                    });
                    function3.invoke(dVar2, 0);
                    dVar2.m();
                    dVar2.a0();
                    dVar2.a0();
                    if (e.k()) {
                        e.n();
                    }
                }
            }), dVarF, 48);
            if (e.k()) {
                e.n();
            }
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i4) {
                    SizeBoxKt.b(j, mVar, function2, dVar2, i | 1);
                }
            });
        }
    }
}
