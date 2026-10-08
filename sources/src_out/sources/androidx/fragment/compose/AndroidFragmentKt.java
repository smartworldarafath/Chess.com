package androidx.fragment.compose;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.v;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.n17;
import com.google.inputmethod.pp1;
import com.google.inputmethod.q6c;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.ux2;
import com.google.inputmethod.vn3;
import com.google.inputmethod.vp4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a[\u0010\r\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/Fragment;", "T", "Ljava/lang/Class;", "clazz", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/vp4;", "fragmentState", "Landroid/os/Bundle;", "arguments", "Lkotlin/Function1;", "", "onUpdate", "a", "(Ljava/lang/Class;Landroidx/compose/ui/b;Lcom/google/android/vp4;Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)V", "fragment-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidFragmentKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0159  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0082  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0096  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX WARN: Code duplicated, block: B:97:0x0131  */
    public static final <T extends Fragment> void a(final Class<T> cls, b bVar, vp4 vp4Var, Bundle bundle, Function1<? super T, Unit> function1, d dVar, final int i, final int i2) {
        int i3;
        b bVar2;
        final vp4 vp4Var2;
        final Bundle bundle2;
        int i4;
        Function1<? super T, Unit> function2;
        int i5;
        b bVar3;
        vp4 vp4VarB;
        Bundle bundle3;
        int i6;
        vp4 vp4Var3;
        Function1<? super T, Unit> function3;
        Bundle bundle4;
        final q6c q6cVarR;
        final int iA;
        View view;
        boolean zX;
        Object objR;
        final FragmentManager fragmentManager;
        final Context context;
        Object objR2;
        d.Companion companion;
        final a aVar;
        boolean zT;
        Object obj;
        d dVar2;
        final Function1<? super T, Unit> function4;
        final b bVar4;
        final vp4 vp4Var4;
        final Bundle bundle5;
        s6b s6bVarH;
        d dVarF = dVar.F(-1012439764);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dVarF.T(cls) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                bVar2 = bVar;
                i3 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    vp4Var2 = vp4Var;
                    int i8 = dVarF.x(vp4Var2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    vp4Var2 = vp4Var;
                }
                i3 |= i8;
            } else {
                vp4Var2 = vp4Var;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    bundle2 = bundle;
                    int i9 = dVarF.T(bundle2) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    bundle2 = bundle;
                }
                i3 |= i9;
            } else {
                bundle2 = bundle;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function2 = function1;
                    if (dVarF.T(function2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) == 9362 || !dVarF.c()) {
                    dVarF.U();
                    if ((i & 1) != 0 || dVarF.t()) {
                        if (i7 != 0) {
                            bVar3 = b.INSTANCE;
                        } else {
                            bVar3 = bVar2;
                        }
                        if ((i2 & 4) != 0) {
                            vp4VarB = FragmentStateKt.b(dVarF, 0);
                            i3 &= -897;
                        } else {
                            vp4VarB = vp4Var2;
                        }
                        if ((i2 & 8) != 0) {
                            bundle3 = Bundle.EMPTY;
                            i3 &= -7169;
                        } else {
                            bundle3 = bundle2;
                        }
                        if (i4 != 0) {
                            i6 = i3;
                            vp4Var3 = vp4VarB;
                            bundle4 = bundle3;
                            function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                                /* JADX WARN: Incorrect types in method signature: (TT;)V */
                                public final void a(Fragment fragment) {
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    a((Fragment) obj2);
                                    return Unit.a;
                                }
                            };
                        } else {
                            i6 = i3;
                            vp4Var3 = vp4VarB;
                            function3 = function2;
                            bundle4 = bundle3;
                        }
                    } else {
                        dVarF.q();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i6 = i3;
                        bVar3 = bVar2;
                        vp4Var3 = vp4Var2;
                        function3 = function2;
                        bundle4 = bundle2;
                    }
                    dVarF.M();
                    if (e.k()) {
                        e.o(-1012439764, i6, -1, "androidx.fragment.compose.AndroidFragment (AndroidFragment.kt:84)");
                    }
                    q6cVarR = p0.r(function3, dVarF, (i6 >> 12) & 14);
                    iA = pp1.a(dVarF, 0);
                    view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                    dVarF.Q(485393906);
                    zX = dVarF.x(view);
                    objR = dVarF.R();
                    if (zX || objR == d.INSTANCE.a()) {
                        objR = FragmentManager.s0(view);
                        dVarF.L(objR);
                    }
                    fragmentManager = (FragmentManager) objR;
                    dVarF.a0();
                    context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                    dVarF.Q(485398332);
                    objR2 = dVarF.R();
                    companion = d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = new a(iA);
                        dVarF.L(objR2);
                    }
                    aVar = (a) objR2;
                    dVarF.a0();
                    AndroidView_androidKt.a(aVar, bVar3, null, dVarF, i6 & 112, 4);
                    b bVar5 = bVar3;
                    Object[] objArr = {fragmentManager, aVar, cls, vp4Var3};
                    dVarF.Q(485406992);
                    zT = dVarF.T(fragmentManager) | dVarF.T(aVar) | dVarF.T(context) | dVarF.T(cls) | ((((i6 & 896) ^ 384) <= 256 && dVarF.x(vp4Var3)) || (i6 & 384) == 256) | dVarF.T(bundle4) | dVarF.C(iA) | dVarF.x(q6cVarR);
                    Object objR3 = dVarF.R();
                    if (!zT || objR3 == companion.a()) {
                        vp4Var2 = vp4Var3;
                        bundle2 = bundle4;
                        dVar2 = dVarF;
                        obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                            public static final class a implements ux2 {
                                final /* synthetic */ Ref.BooleanRef a;
                                final /* synthetic */ Fragment b;

                                a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                    this.a = booleanRef;
                                    this.b = fragment;
                                }

                                @Override // com.google.inputmethod.ux2
                                public void onStart(n17 owner) {
                                    this.a.element = false;
                                    this.b.getLifecycle().g(this);
                                }
                            }

                            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                            public static final class b implements jd3 {
                                final /* synthetic */ FragmentManager a;
                                final /* synthetic */ Fragment b;
                                final /* synthetic */ vp4 c;
                                final /* synthetic */ Ref.BooleanRef d;

                                public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                    this.a = fragmentManager;
                                    this.b = fragment;
                                    this.c = vp4Var;
                                    this.d = booleanRef;
                                }

                                @Override // com.google.inputmethod.jd3
                                public void dispose() {
                                    this.c.a().setValue(this.a.z1(this.b));
                                    if (this.d.element) {
                                        v vVarS = this.a.s();
                                        vVarS.q(this.b);
                                        vVarS.l();
                                    } else {
                                        if (this.a.Y0()) {
                                            return;
                                        }
                                        v vVarS2 = this.a.s();
                                        vVarS2.q(this.b);
                                        vVarS2.k();
                                    }
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final jd3 invoke(kd3 kd3Var) {
                                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                                Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                                if (fragmentP0 == null) {
                                    fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                    vp4 vp4Var5 = vp4Var2;
                                    Bundle bundle6 = bundle2;
                                    FragmentManager fragmentManager2 = fragmentManager;
                                    androidx.fragment.compose.a aVar2 = aVar;
                                    int i10 = iA;
                                    fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                    fragmentP0.setArguments(bundle6);
                                    v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                    if (fragmentManager2.Y0()) {
                                        booleanRef.element = true;
                                        fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                        vVarD.l();
                                    } else {
                                        vVarD.k();
                                    }
                                }
                                fragmentManager.e1(aVar.a());
                                Function1 function5 = (Function1) q6cVarR.getValue();
                                Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                                function5.invoke(fragmentP0);
                                return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                            }
                        };
                        dVar2.L(obj);
                    } else {
                        obj = objR3;
                        vp4Var2 = vp4Var3;
                        bundle2 = bundle4;
                        dVar2 = dVarF;
                    }
                    dVar2.a0();
                    vn3.d(objArr, (Function1) obj, dVar2, 0);
                    if (e.k()) {
                        e.n();
                    }
                    function4 = function3;
                    bVar4 = bVar5;
                } else {
                    dVarF.q();
                    bVar4 = bVar2;
                    dVar2 = dVarF;
                    function4 = function2;
                }
                vp4Var4 = vp4Var2;
                bundle5 = bundle2;
                s6bVarH = dVar2.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((d) obj2, ((Number) obj3).intValue());
                            return Unit.a;
                        }

                        public final void invoke(d dVar3, int i10) {
                            AndroidFragmentKt.a(cls, bVar4, vp4Var4, bundle5, function4, dVar3, saa.a(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function2 = function1;
            if ((i3 & 9363) == 9362) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 4) != 0) {
                        vp4VarB = FragmentStateKt.b(dVarF, 0);
                        i3 &= -897;
                    } else {
                        vp4VarB = vp4Var2;
                    }
                    if ((i2 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i3 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        bundle4 = bundle3;
                        function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                            /* JADX WARN: Incorrect types in method signature: (TT;)V */
                            public final void a(Fragment fragment) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                a((Fragment) obj2);
                                return Unit.a;
                            }
                        };
                    } else {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        function3 = function2;
                        bundle4 = bundle3;
                    }
                } else {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 4) != 0) {
                        vp4VarB = FragmentStateKt.b(dVarF, 0);
                        i3 &= -897;
                    } else {
                        vp4VarB = vp4Var2;
                    }
                    if ((i2 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i3 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        bundle4 = bundle3;
                        function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                            /* JADX WARN: Incorrect types in method signature: (TT;)V */
                            public final void a(Fragment fragment) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                a((Fragment) obj2);
                                return Unit.a;
                            }
                        };
                    } else {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        function3 = function2;
                        bundle4 = bundle3;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1012439764, i6, -1, "androidx.fragment.compose.AndroidFragment (AndroidFragment.kt:84)");
                }
                q6cVarR = p0.r(function3, dVarF, (i6 >> 12) & 14);
                iA = pp1.a(dVarF, 0);
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                dVarF.Q(485393906);
                zX = dVarF.x(view);
                objR = dVarF.R();
                if (zX) {
                    objR = FragmentManager.s0(view);
                    dVarF.L(objR);
                } else {
                    objR = FragmentManager.s0(view);
                    dVarF.L(objR);
                }
                fragmentManager = (FragmentManager) objR;
                dVarF.a0();
                context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                dVarF.Q(485398332);
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = new a(iA);
                    dVarF.L(objR2);
                }
                aVar = (a) objR2;
                dVarF.a0();
                AndroidView_androidKt.a(aVar, bVar3, null, dVarF, i6 & 112, 4);
                b bVar6 = bVar3;
                Object[] objArr2 = {fragmentManager, aVar, cls, vp4Var3};
                dVarF.Q(485406992);
                zT = dVarF.T(fragmentManager) | dVarF.T(aVar) | dVarF.T(context) | dVarF.T(cls) | ((((i6 & 896) ^ 384) <= 256 && dVarF.x(vp4Var3)) || (i6 & 384) == 256) | dVarF.T(bundle4) | dVarF.C(iA) | dVarF.x(q6cVarR);
                Object objR4 = dVarF.R();
                if (zT) {
                    vp4Var2 = vp4Var3;
                    bundle2 = bundle4;
                    dVar2 = dVarF;
                    obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class a implements ux2 {
                            final /* synthetic */ Ref.BooleanRef a;
                            final /* synthetic */ Fragment b;

                            a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                this.a = booleanRef;
                                this.b = fragment;
                            }

                            @Override // com.google.inputmethod.ux2
                            public void onStart(n17 owner) {
                                this.a.element = false;
                                this.b.getLifecycle().g(this);
                            }
                        }

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class b implements jd3 {
                            final /* synthetic */ FragmentManager a;
                            final /* synthetic */ Fragment b;
                            final /* synthetic */ vp4 c;
                            final /* synthetic */ Ref.BooleanRef d;

                            public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                this.a = fragmentManager;
                                this.b = fragment;
                                this.c = vp4Var;
                                this.d = booleanRef;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.c.a().setValue(this.a.z1(this.b));
                                if (this.d.element) {
                                    v vVarS = this.a.s();
                                    vVarS.q(this.b);
                                    vVarS.l();
                                } else {
                                    if (this.a.Y0()) {
                                        return;
                                    }
                                    v vVarS2 = this.a.s();
                                    vVarS2.q(this.b);
                                    vVarS2.k();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                            if (fragmentP0 == null) {
                                fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                vp4 vp4Var5 = vp4Var2;
                                Bundle bundle6 = bundle2;
                                FragmentManager fragmentManager2 = fragmentManager;
                                androidx.fragment.compose.a aVar2 = aVar;
                                int i10 = iA;
                                fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                fragmentP0.setArguments(bundle6);
                                v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                if (fragmentManager2.Y0()) {
                                    booleanRef.element = true;
                                    fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                    vVarD.l();
                                } else {
                                    vVarD.k();
                                }
                            }
                            fragmentManager.e1(aVar.a());
                            Function1 function5 = (Function1) q6cVarR.getValue();
                            Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                            function5.invoke(fragmentP0);
                            return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                        }
                    };
                    dVar2.L(obj);
                } else {
                    vp4Var2 = vp4Var3;
                    bundle2 = bundle4;
                    dVar2 = dVarF;
                    obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class a implements ux2 {
                            final /* synthetic */ Ref.BooleanRef a;
                            final /* synthetic */ Fragment b;

                            a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                this.a = booleanRef;
                                this.b = fragment;
                            }

                            @Override // com.google.inputmethod.ux2
                            public void onStart(n17 owner) {
                                this.a.element = false;
                                this.b.getLifecycle().g(this);
                            }
                        }

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class b implements jd3 {
                            final /* synthetic */ FragmentManager a;
                            final /* synthetic */ Fragment b;
                            final /* synthetic */ vp4 c;
                            final /* synthetic */ Ref.BooleanRef d;

                            public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                this.a = fragmentManager;
                                this.b = fragment;
                                this.c = vp4Var;
                                this.d = booleanRef;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.c.a().setValue(this.a.z1(this.b));
                                if (this.d.element) {
                                    v vVarS = this.a.s();
                                    vVarS.q(this.b);
                                    vVarS.l();
                                } else {
                                    if (this.a.Y0()) {
                                        return;
                                    }
                                    v vVarS2 = this.a.s();
                                    vVarS2.q(this.b);
                                    vVarS2.k();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                            if (fragmentP0 == null) {
                                fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                vp4 vp4Var5 = vp4Var2;
                                Bundle bundle6 = bundle2;
                                FragmentManager fragmentManager2 = fragmentManager;
                                androidx.fragment.compose.a aVar2 = aVar;
                                int i10 = iA;
                                fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                fragmentP0.setArguments(bundle6);
                                v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                if (fragmentManager2.Y0()) {
                                    booleanRef.element = true;
                                    fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                    vVarD.l();
                                } else {
                                    vVarD.k();
                                }
                            }
                            fragmentManager.e1(aVar.a());
                            Function1 function5 = (Function1) q6cVarR.getValue();
                            Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                            function5.invoke(fragmentP0);
                            return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                        }
                    };
                    dVar2.L(obj);
                }
                dVar2.a0();
                vn3.d(objArr2, (Function1) obj, dVar2, 0);
                if (e.k()) {
                    e.n();
                }
                function4 = function3;
                bVar4 = bVar6;
            } else {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 4) != 0) {
                        vp4VarB = FragmentStateKt.b(dVarF, 0);
                        i3 &= -897;
                    } else {
                        vp4VarB = vp4Var2;
                    }
                    if ((i2 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i3 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        bundle4 = bundle3;
                        function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                            /* JADX WARN: Incorrect types in method signature: (TT;)V */
                            public final void a(Fragment fragment) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                a((Fragment) obj2);
                                return Unit.a;
                            }
                        };
                    } else {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        function3 = function2;
                        bundle4 = bundle3;
                    }
                } else {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 4) != 0) {
                        vp4VarB = FragmentStateKt.b(dVarF, 0);
                        i3 &= -897;
                    } else {
                        vp4VarB = vp4Var2;
                    }
                    if ((i2 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i3 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        bundle4 = bundle3;
                        function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                            /* JADX WARN: Incorrect types in method signature: (TT;)V */
                            public final void a(Fragment fragment) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                a((Fragment) obj2);
                                return Unit.a;
                            }
                        };
                    } else {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        function3 = function2;
                        bundle4 = bundle3;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1012439764, i6, -1, "androidx.fragment.compose.AndroidFragment (AndroidFragment.kt:84)");
                }
                q6cVarR = p0.r(function3, dVarF, (i6 >> 12) & 14);
                iA = pp1.a(dVarF, 0);
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                dVarF.Q(485393906);
                zX = dVarF.x(view);
                objR = dVarF.R();
                if (zX) {
                    objR = FragmentManager.s0(view);
                    dVarF.L(objR);
                } else {
                    objR = FragmentManager.s0(view);
                    dVarF.L(objR);
                }
                fragmentManager = (FragmentManager) objR;
                dVarF.a0();
                context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                dVarF.Q(485398332);
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = new a(iA);
                    dVarF.L(objR2);
                }
                aVar = (a) objR2;
                dVarF.a0();
                AndroidView_androidKt.a(aVar, bVar3, null, dVarF, i6 & 112, 4);
                b bVar7 = bVar3;
                Object[] objArr3 = {fragmentManager, aVar, cls, vp4Var3};
                dVarF.Q(485406992);
                zT = dVarF.T(fragmentManager) | dVarF.T(aVar) | dVarF.T(context) | dVarF.T(cls) | ((((i6 & 896) ^ 384) <= 256 && dVarF.x(vp4Var3)) || (i6 & 384) == 256) | dVarF.T(bundle4) | dVarF.C(iA) | dVarF.x(q6cVarR);
                Object objR5 = dVarF.R();
                if (zT) {
                    vp4Var2 = vp4Var3;
                    bundle2 = bundle4;
                    dVar2 = dVarF;
                    obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class a implements ux2 {
                            final /* synthetic */ Ref.BooleanRef a;
                            final /* synthetic */ Fragment b;

                            a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                this.a = booleanRef;
                                this.b = fragment;
                            }

                            @Override // com.google.inputmethod.ux2
                            public void onStart(n17 owner) {
                                this.a.element = false;
                                this.b.getLifecycle().g(this);
                            }
                        }

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class b implements jd3 {
                            final /* synthetic */ FragmentManager a;
                            final /* synthetic */ Fragment b;
                            final /* synthetic */ vp4 c;
                            final /* synthetic */ Ref.BooleanRef d;

                            public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                this.a = fragmentManager;
                                this.b = fragment;
                                this.c = vp4Var;
                                this.d = booleanRef;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.c.a().setValue(this.a.z1(this.b));
                                if (this.d.element) {
                                    v vVarS = this.a.s();
                                    vVarS.q(this.b);
                                    vVarS.l();
                                } else {
                                    if (this.a.Y0()) {
                                        return;
                                    }
                                    v vVarS2 = this.a.s();
                                    vVarS2.q(this.b);
                                    vVarS2.k();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                            if (fragmentP0 == null) {
                                fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                vp4 vp4Var5 = vp4Var2;
                                Bundle bundle6 = bundle2;
                                FragmentManager fragmentManager2 = fragmentManager;
                                androidx.fragment.compose.a aVar2 = aVar;
                                int i10 = iA;
                                fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                fragmentP0.setArguments(bundle6);
                                v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                if (fragmentManager2.Y0()) {
                                    booleanRef.element = true;
                                    fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                    vVarD.l();
                                } else {
                                    vVarD.k();
                                }
                            }
                            fragmentManager.e1(aVar.a());
                            Function1 function5 = (Function1) q6cVarR.getValue();
                            Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                            function5.invoke(fragmentP0);
                            return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                        }
                    };
                    dVar2.L(obj);
                } else {
                    vp4Var2 = vp4Var3;
                    bundle2 = bundle4;
                    dVar2 = dVarF;
                    obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class a implements ux2 {
                            final /* synthetic */ Ref.BooleanRef a;
                            final /* synthetic */ Fragment b;

                            a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                this.a = booleanRef;
                                this.b = fragment;
                            }

                            @Override // com.google.inputmethod.ux2
                            public void onStart(n17 owner) {
                                this.a.element = false;
                                this.b.getLifecycle().g(this);
                            }
                        }

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class b implements jd3 {
                            final /* synthetic */ FragmentManager a;
                            final /* synthetic */ Fragment b;
                            final /* synthetic */ vp4 c;
                            final /* synthetic */ Ref.BooleanRef d;

                            public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                this.a = fragmentManager;
                                this.b = fragment;
                                this.c = vp4Var;
                                this.d = booleanRef;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.c.a().setValue(this.a.z1(this.b));
                                if (this.d.element) {
                                    v vVarS = this.a.s();
                                    vVarS.q(this.b);
                                    vVarS.l();
                                } else {
                                    if (this.a.Y0()) {
                                        return;
                                    }
                                    v vVarS2 = this.a.s();
                                    vVarS2.q(this.b);
                                    vVarS2.k();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                            if (fragmentP0 == null) {
                                fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                vp4 vp4Var5 = vp4Var2;
                                Bundle bundle6 = bundle2;
                                FragmentManager fragmentManager2 = fragmentManager;
                                androidx.fragment.compose.a aVar2 = aVar;
                                int i10 = iA;
                                fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                fragmentP0.setArguments(bundle6);
                                v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                if (fragmentManager2.Y0()) {
                                    booleanRef.element = true;
                                    fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                    vVarD.l();
                                } else {
                                    vVarD.k();
                                }
                            }
                            fragmentManager.e1(aVar.a());
                            Function1 function5 = (Function1) q6cVarR.getValue();
                            Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                            function5.invoke(fragmentP0);
                            return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                        }
                    };
                    dVar2.L(obj);
                }
                dVar2.a0();
                vn3.d(objArr3, (Function1) obj, dVar2, 0);
                if (e.k()) {
                    e.n();
                }
                function4 = function3;
                bVar4 = bVar7;
            }
            vp4Var4 = vp4Var2;
            bundle5 = bundle2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((d) obj2, ((Number) obj3).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar3, int i10) {
                        AndroidFragmentKt.a(cls, bVar4, vp4Var4, bundle5, function4, dVar3, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        bVar2 = bVar;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                vp4Var2 = vp4Var;
                if (dVarF.x(vp4Var2)) {
                }
                i3 |= i8;
            } else {
                vp4Var2 = vp4Var;
            }
            i3 |= i8;
        } else {
            vp4Var2 = vp4Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                bundle2 = bundle;
                if (dVarF.T(bundle2)) {
                }
                i3 |= i9;
            } else {
                bundle2 = bundle;
            }
            i3 |= i9;
        } else {
            bundle2 = bundle;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function2 = function1;
                if (dVarF.T(function2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) == 9362) {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 4) != 0) {
                        vp4VarB = FragmentStateKt.b(dVarF, 0);
                        i3 &= -897;
                    } else {
                        vp4VarB = vp4Var2;
                    }
                    if ((i2 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i3 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        bundle4 = bundle3;
                        function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                            /* JADX WARN: Incorrect types in method signature: (TT;)V */
                            public final void a(Fragment fragment) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                a((Fragment) obj2);
                                return Unit.a;
                            }
                        };
                    } else {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        function3 = function2;
                        bundle4 = bundle3;
                    }
                } else {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 4) != 0) {
                        vp4VarB = FragmentStateKt.b(dVarF, 0);
                        i3 &= -897;
                    } else {
                        vp4VarB = vp4Var2;
                    }
                    if ((i2 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i3 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        bundle4 = bundle3;
                        function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                            /* JADX WARN: Incorrect types in method signature: (TT;)V */
                            public final void a(Fragment fragment) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                a((Fragment) obj2);
                                return Unit.a;
                            }
                        };
                    } else {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        function3 = function2;
                        bundle4 = bundle3;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1012439764, i6, -1, "androidx.fragment.compose.AndroidFragment (AndroidFragment.kt:84)");
                }
                q6cVarR = p0.r(function3, dVarF, (i6 >> 12) & 14);
                iA = pp1.a(dVarF, 0);
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                dVarF.Q(485393906);
                zX = dVarF.x(view);
                objR = dVarF.R();
                if (zX) {
                    objR = FragmentManager.s0(view);
                    dVarF.L(objR);
                } else {
                    objR = FragmentManager.s0(view);
                    dVarF.L(objR);
                }
                fragmentManager = (FragmentManager) objR;
                dVarF.a0();
                context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                dVarF.Q(485398332);
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = new a(iA);
                    dVarF.L(objR2);
                }
                aVar = (a) objR2;
                dVarF.a0();
                AndroidView_androidKt.a(aVar, bVar3, null, dVarF, i6 & 112, 4);
                b bVar8 = bVar3;
                Object[] objArr4 = {fragmentManager, aVar, cls, vp4Var3};
                dVarF.Q(485406992);
                zT = dVarF.T(fragmentManager) | dVarF.T(aVar) | dVarF.T(context) | dVarF.T(cls) | ((((i6 & 896) ^ 384) <= 256 && dVarF.x(vp4Var3)) || (i6 & 384) == 256) | dVarF.T(bundle4) | dVarF.C(iA) | dVarF.x(q6cVarR);
                Object objR6 = dVarF.R();
                if (zT) {
                    vp4Var2 = vp4Var3;
                    bundle2 = bundle4;
                    dVar2 = dVarF;
                    obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class a implements ux2 {
                            final /* synthetic */ Ref.BooleanRef a;
                            final /* synthetic */ Fragment b;

                            a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                this.a = booleanRef;
                                this.b = fragment;
                            }

                            @Override // com.google.inputmethod.ux2
                            public void onStart(n17 owner) {
                                this.a.element = false;
                                this.b.getLifecycle().g(this);
                            }
                        }

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class b implements jd3 {
                            final /* synthetic */ FragmentManager a;
                            final /* synthetic */ Fragment b;
                            final /* synthetic */ vp4 c;
                            final /* synthetic */ Ref.BooleanRef d;

                            public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                this.a = fragmentManager;
                                this.b = fragment;
                                this.c = vp4Var;
                                this.d = booleanRef;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.c.a().setValue(this.a.z1(this.b));
                                if (this.d.element) {
                                    v vVarS = this.a.s();
                                    vVarS.q(this.b);
                                    vVarS.l();
                                } else {
                                    if (this.a.Y0()) {
                                        return;
                                    }
                                    v vVarS2 = this.a.s();
                                    vVarS2.q(this.b);
                                    vVarS2.k();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                            if (fragmentP0 == null) {
                                fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                vp4 vp4Var5 = vp4Var2;
                                Bundle bundle6 = bundle2;
                                FragmentManager fragmentManager2 = fragmentManager;
                                androidx.fragment.compose.a aVar2 = aVar;
                                int i10 = iA;
                                fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                fragmentP0.setArguments(bundle6);
                                v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                if (fragmentManager2.Y0()) {
                                    booleanRef.element = true;
                                    fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                    vVarD.l();
                                } else {
                                    vVarD.k();
                                }
                            }
                            fragmentManager.e1(aVar.a());
                            Function1 function5 = (Function1) q6cVarR.getValue();
                            Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                            function5.invoke(fragmentP0);
                            return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                        }
                    };
                    dVar2.L(obj);
                } else {
                    vp4Var2 = vp4Var3;
                    bundle2 = bundle4;
                    dVar2 = dVarF;
                    obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class a implements ux2 {
                            final /* synthetic */ Ref.BooleanRef a;
                            final /* synthetic */ Fragment b;

                            a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                this.a = booleanRef;
                                this.b = fragment;
                            }

                            @Override // com.google.inputmethod.ux2
                            public void onStart(n17 owner) {
                                this.a.element = false;
                                this.b.getLifecycle().g(this);
                            }
                        }

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class b implements jd3 {
                            final /* synthetic */ FragmentManager a;
                            final /* synthetic */ Fragment b;
                            final /* synthetic */ vp4 c;
                            final /* synthetic */ Ref.BooleanRef d;

                            public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                this.a = fragmentManager;
                                this.b = fragment;
                                this.c = vp4Var;
                                this.d = booleanRef;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.c.a().setValue(this.a.z1(this.b));
                                if (this.d.element) {
                                    v vVarS = this.a.s();
                                    vVarS.q(this.b);
                                    vVarS.l();
                                } else {
                                    if (this.a.Y0()) {
                                        return;
                                    }
                                    v vVarS2 = this.a.s();
                                    vVarS2.q(this.b);
                                    vVarS2.k();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                            if (fragmentP0 == null) {
                                fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                vp4 vp4Var5 = vp4Var2;
                                Bundle bundle6 = bundle2;
                                FragmentManager fragmentManager2 = fragmentManager;
                                androidx.fragment.compose.a aVar2 = aVar;
                                int i10 = iA;
                                fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                fragmentP0.setArguments(bundle6);
                                v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                if (fragmentManager2.Y0()) {
                                    booleanRef.element = true;
                                    fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                    vVarD.l();
                                } else {
                                    vVarD.k();
                                }
                            }
                            fragmentManager.e1(aVar.a());
                            Function1 function5 = (Function1) q6cVarR.getValue();
                            Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                            function5.invoke(fragmentP0);
                            return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                        }
                    };
                    dVar2.L(obj);
                }
                dVar2.a0();
                vn3.d(objArr4, (Function1) obj, dVar2, 0);
                if (e.k()) {
                    e.n();
                }
                function4 = function3;
                bVar4 = bVar8;
            } else {
                dVarF.U();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 4) != 0) {
                        vp4VarB = FragmentStateKt.b(dVarF, 0);
                        i3 &= -897;
                    } else {
                        vp4VarB = vp4Var2;
                    }
                    if ((i2 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i3 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        bundle4 = bundle3;
                        function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                            /* JADX WARN: Incorrect types in method signature: (TT;)V */
                            public final void a(Fragment fragment) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                a((Fragment) obj2);
                                return Unit.a;
                            }
                        };
                    } else {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        function3 = function2;
                        bundle4 = bundle3;
                    }
                } else {
                    if (i7 != 0) {
                        bVar3 = b.INSTANCE;
                    } else {
                        bVar3 = bVar2;
                    }
                    if ((i2 & 4) != 0) {
                        vp4VarB = FragmentStateKt.b(dVarF, 0);
                        i3 &= -897;
                    } else {
                        vp4VarB = vp4Var2;
                    }
                    if ((i2 & 8) != 0) {
                        bundle3 = Bundle.EMPTY;
                        i3 &= -7169;
                    } else {
                        bundle3 = bundle2;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        bundle4 = bundle3;
                        function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                            /* JADX WARN: Incorrect types in method signature: (TT;)V */
                            public final void a(Fragment fragment) {
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                a((Fragment) obj2);
                                return Unit.a;
                            }
                        };
                    } else {
                        i6 = i3;
                        vp4Var3 = vp4VarB;
                        function3 = function2;
                        bundle4 = bundle3;
                    }
                }
                dVarF.M();
                if (e.k()) {
                    e.o(-1012439764, i6, -1, "androidx.fragment.compose.AndroidFragment (AndroidFragment.kt:84)");
                }
                q6cVarR = p0.r(function3, dVarF, (i6 >> 12) & 14);
                iA = pp1.a(dVarF, 0);
                view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
                dVarF.Q(485393906);
                zX = dVarF.x(view);
                objR = dVarF.R();
                if (zX) {
                    objR = FragmentManager.s0(view);
                    dVarF.L(objR);
                } else {
                    objR = FragmentManager.s0(view);
                    dVarF.L(objR);
                }
                fragmentManager = (FragmentManager) objR;
                dVarF.a0();
                context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
                dVarF.Q(485398332);
                objR2 = dVarF.R();
                companion = d.INSTANCE;
                if (objR2 == companion.a()) {
                    objR2 = new a(iA);
                    dVarF.L(objR2);
                }
                aVar = (a) objR2;
                dVarF.a0();
                AndroidView_androidKt.a(aVar, bVar3, null, dVarF, i6 & 112, 4);
                b bVar9 = bVar3;
                Object[] objArr5 = {fragmentManager, aVar, cls, vp4Var3};
                dVarF.Q(485406992);
                zT = dVarF.T(fragmentManager) | dVarF.T(aVar) | dVarF.T(context) | dVarF.T(cls) | ((((i6 & 896) ^ 384) <= 256 && dVarF.x(vp4Var3)) || (i6 & 384) == 256) | dVarF.T(bundle4) | dVarF.C(iA) | dVarF.x(q6cVarR);
                Object objR7 = dVarF.R();
                if (zT) {
                    vp4Var2 = vp4Var3;
                    bundle2 = bundle4;
                    dVar2 = dVarF;
                    obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class a implements ux2 {
                            final /* synthetic */ Ref.BooleanRef a;
                            final /* synthetic */ Fragment b;

                            a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                this.a = booleanRef;
                                this.b = fragment;
                            }

                            @Override // com.google.inputmethod.ux2
                            public void onStart(n17 owner) {
                                this.a.element = false;
                                this.b.getLifecycle().g(this);
                            }
                        }

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class b implements jd3 {
                            final /* synthetic */ FragmentManager a;
                            final /* synthetic */ Fragment b;
                            final /* synthetic */ vp4 c;
                            final /* synthetic */ Ref.BooleanRef d;

                            public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                this.a = fragmentManager;
                                this.b = fragment;
                                this.c = vp4Var;
                                this.d = booleanRef;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.c.a().setValue(this.a.z1(this.b));
                                if (this.d.element) {
                                    v vVarS = this.a.s();
                                    vVarS.q(this.b);
                                    vVarS.l();
                                } else {
                                    if (this.a.Y0()) {
                                        return;
                                    }
                                    v vVarS2 = this.a.s();
                                    vVarS2.q(this.b);
                                    vVarS2.k();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                            if (fragmentP0 == null) {
                                fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                vp4 vp4Var5 = vp4Var2;
                                Bundle bundle6 = bundle2;
                                FragmentManager fragmentManager2 = fragmentManager;
                                androidx.fragment.compose.a aVar2 = aVar;
                                int i10 = iA;
                                fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                fragmentP0.setArguments(bundle6);
                                v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                if (fragmentManager2.Y0()) {
                                    booleanRef.element = true;
                                    fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                    vVarD.l();
                                } else {
                                    vVarD.k();
                                }
                            }
                            fragmentManager.e1(aVar.a());
                            Function1 function5 = (Function1) q6cVarR.getValue();
                            Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                            function5.invoke(fragmentP0);
                            return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                        }
                    };
                    dVar2.L(obj);
                } else {
                    vp4Var2 = vp4Var3;
                    bundle2 = bundle4;
                    dVar2 = dVarF;
                    obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class a implements ux2 {
                            final /* synthetic */ Ref.BooleanRef a;
                            final /* synthetic */ Fragment b;

                            a(Ref.BooleanRef booleanRef, Fragment fragment) {
                                this.a = booleanRef;
                                this.b = fragment;
                            }

                            @Override // com.google.inputmethod.ux2
                            public void onStart(n17 owner) {
                                this.a.element = false;
                                this.b.getLifecycle().g(this);
                            }
                        }

                        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                        public static final class b implements jd3 {
                            final /* synthetic */ FragmentManager a;
                            final /* synthetic */ Fragment b;
                            final /* synthetic */ vp4 c;
                            final /* synthetic */ Ref.BooleanRef d;

                            public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                                this.a = fragmentManager;
                                this.b = fragment;
                                this.c = vp4Var;
                                this.d = booleanRef;
                            }

                            @Override // com.google.inputmethod.jd3
                            public void dispose() {
                                this.c.a().setValue(this.a.z1(this.b));
                                if (this.d.element) {
                                    v vVarS = this.a.s();
                                    vVarS.q(this.b);
                                    vVarS.l();
                                } else {
                                    if (this.a.Y0()) {
                                        return;
                                    }
                                    v vVarS2 = this.a.s();
                                    vVarS2.q(this.b);
                                    vVarS2.k();
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final jd3 invoke(kd3 kd3Var) {
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                            if (fragmentP0 == null) {
                                fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                                vp4 vp4Var5 = vp4Var2;
                                Bundle bundle6 = bundle2;
                                FragmentManager fragmentManager2 = fragmentManager;
                                androidx.fragment.compose.a aVar2 = aVar;
                                int i10 = iA;
                                fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                                fragmentP0.setArguments(bundle6);
                                v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                                if (fragmentManager2.Y0()) {
                                    booleanRef.element = true;
                                    fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                    vVarD.l();
                                } else {
                                    vVarD.k();
                                }
                            }
                            fragmentManager.e1(aVar.a());
                            Function1 function5 = (Function1) q6cVarR.getValue();
                            Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                            function5.invoke(fragmentP0);
                            return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                        }
                    };
                    dVar2.L(obj);
                }
                dVar2.a0();
                vn3.d(objArr5, (Function1) obj, dVar2, 0);
                if (e.k()) {
                    e.n();
                }
                function4 = function3;
                bVar4 = bVar9;
            }
            vp4Var4 = vp4Var2;
            bundle5 = bundle2;
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((d) obj2, ((Number) obj3).intValue());
                        return Unit.a;
                    }

                    public final void invoke(d dVar3, int i10) {
                        AndroidFragmentKt.a(cls, bVar4, vp4Var4, bundle5, function4, dVar3, saa.a(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        function2 = function1;
        if ((i3 & 9363) == 9362) {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if ((i2 & 4) != 0) {
                    vp4VarB = FragmentStateKt.b(dVarF, 0);
                    i3 &= -897;
                } else {
                    vp4VarB = vp4Var2;
                }
                if ((i2 & 8) != 0) {
                    bundle3 = Bundle.EMPTY;
                    i3 &= -7169;
                } else {
                    bundle3 = bundle2;
                }
                if (i4 != 0) {
                    i6 = i3;
                    vp4Var3 = vp4VarB;
                    bundle4 = bundle3;
                    function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                        /* JADX WARN: Incorrect types in method signature: (TT;)V */
                        public final void a(Fragment fragment) {
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            a((Fragment) obj2);
                            return Unit.a;
                        }
                    };
                } else {
                    i6 = i3;
                    vp4Var3 = vp4VarB;
                    function3 = function2;
                    bundle4 = bundle3;
                }
            } else {
                if (i7 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if ((i2 & 4) != 0) {
                    vp4VarB = FragmentStateKt.b(dVarF, 0);
                    i3 &= -897;
                } else {
                    vp4VarB = vp4Var2;
                }
                if ((i2 & 8) != 0) {
                    bundle3 = Bundle.EMPTY;
                    i3 &= -7169;
                } else {
                    bundle3 = bundle2;
                }
                if (i4 != 0) {
                    i6 = i3;
                    vp4Var3 = vp4VarB;
                    bundle4 = bundle3;
                    function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                        /* JADX WARN: Incorrect types in method signature: (TT;)V */
                        public final void a(Fragment fragment) {
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            a((Fragment) obj2);
                            return Unit.a;
                        }
                    };
                } else {
                    i6 = i3;
                    vp4Var3 = vp4VarB;
                    function3 = function2;
                    bundle4 = bundle3;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-1012439764, i6, -1, "androidx.fragment.compose.AndroidFragment (AndroidFragment.kt:84)");
            }
            q6cVarR = p0.r(function3, dVarF, (i6 >> 12) & 14);
            iA = pp1.a(dVarF, 0);
            view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
            dVarF.Q(485393906);
            zX = dVarF.x(view);
            objR = dVarF.R();
            if (zX) {
                objR = FragmentManager.s0(view);
                dVarF.L(objR);
            } else {
                objR = FragmentManager.s0(view);
                dVarF.L(objR);
            }
            fragmentManager = (FragmentManager) objR;
            dVarF.a0();
            context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
            dVarF.Q(485398332);
            objR2 = dVarF.R();
            companion = d.INSTANCE;
            if (objR2 == companion.a()) {
                objR2 = new a(iA);
                dVarF.L(objR2);
            }
            aVar = (a) objR2;
            dVarF.a0();
            AndroidView_androidKt.a(aVar, bVar3, null, dVarF, i6 & 112, 4);
            b bVar10 = bVar3;
            Object[] objArr6 = {fragmentManager, aVar, cls, vp4Var3};
            dVarF.Q(485406992);
            zT = dVarF.T(fragmentManager) | dVarF.T(aVar) | dVarF.T(context) | dVarF.T(cls) | ((((i6 & 896) ^ 384) <= 256 && dVarF.x(vp4Var3)) || (i6 & 384) == 256) | dVarF.T(bundle4) | dVarF.C(iA) | dVarF.x(q6cVarR);
            Object objR8 = dVarF.R();
            if (zT) {
                vp4Var2 = vp4Var3;
                bundle2 = bundle4;
                dVar2 = dVarF;
                obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class a implements ux2 {
                        final /* synthetic */ Ref.BooleanRef a;
                        final /* synthetic */ Fragment b;

                        a(Ref.BooleanRef booleanRef, Fragment fragment) {
                            this.a = booleanRef;
                            this.b = fragment;
                        }

                        @Override // com.google.inputmethod.ux2
                        public void onStart(n17 owner) {
                            this.a.element = false;
                            this.b.getLifecycle().g(this);
                        }
                    }

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class b implements jd3 {
                        final /* synthetic */ FragmentManager a;
                        final /* synthetic */ Fragment b;
                        final /* synthetic */ vp4 c;
                        final /* synthetic */ Ref.BooleanRef d;

                        public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                            this.a = fragmentManager;
                            this.b = fragment;
                            this.c = vp4Var;
                            this.d = booleanRef;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.c.a().setValue(this.a.z1(this.b));
                            if (this.d.element) {
                                v vVarS = this.a.s();
                                vVarS.q(this.b);
                                vVarS.l();
                            } else {
                                if (this.a.Y0()) {
                                    return;
                                }
                                v vVarS2 = this.a.s();
                                vVarS2.q(this.b);
                                vVarS2.k();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                        if (fragmentP0 == null) {
                            fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                            vp4 vp4Var5 = vp4Var2;
                            Bundle bundle6 = bundle2;
                            FragmentManager fragmentManager2 = fragmentManager;
                            androidx.fragment.compose.a aVar2 = aVar;
                            int i10 = iA;
                            fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                            fragmentP0.setArguments(bundle6);
                            v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                            if (fragmentManager2.Y0()) {
                                booleanRef.element = true;
                                fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                vVarD.l();
                            } else {
                                vVarD.k();
                            }
                        }
                        fragmentManager.e1(aVar.a());
                        Function1 function5 = (Function1) q6cVarR.getValue();
                        Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                        function5.invoke(fragmentP0);
                        return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                    }
                };
                dVar2.L(obj);
            } else {
                vp4Var2 = vp4Var3;
                bundle2 = bundle4;
                dVar2 = dVarF;
                obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class a implements ux2 {
                        final /* synthetic */ Ref.BooleanRef a;
                        final /* synthetic */ Fragment b;

                        a(Ref.BooleanRef booleanRef, Fragment fragment) {
                            this.a = booleanRef;
                            this.b = fragment;
                        }

                        @Override // com.google.inputmethod.ux2
                        public void onStart(n17 owner) {
                            this.a.element = false;
                            this.b.getLifecycle().g(this);
                        }
                    }

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class b implements jd3 {
                        final /* synthetic */ FragmentManager a;
                        final /* synthetic */ Fragment b;
                        final /* synthetic */ vp4 c;
                        final /* synthetic */ Ref.BooleanRef d;

                        public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                            this.a = fragmentManager;
                            this.b = fragment;
                            this.c = vp4Var;
                            this.d = booleanRef;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.c.a().setValue(this.a.z1(this.b));
                            if (this.d.element) {
                                v vVarS = this.a.s();
                                vVarS.q(this.b);
                                vVarS.l();
                            } else {
                                if (this.a.Y0()) {
                                    return;
                                }
                                v vVarS2 = this.a.s();
                                vVarS2.q(this.b);
                                vVarS2.k();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                        if (fragmentP0 == null) {
                            fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                            vp4 vp4Var5 = vp4Var2;
                            Bundle bundle6 = bundle2;
                            FragmentManager fragmentManager2 = fragmentManager;
                            androidx.fragment.compose.a aVar2 = aVar;
                            int i10 = iA;
                            fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                            fragmentP0.setArguments(bundle6);
                            v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                            if (fragmentManager2.Y0()) {
                                booleanRef.element = true;
                                fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                vVarD.l();
                            } else {
                                vVarD.k();
                            }
                        }
                        fragmentManager.e1(aVar.a());
                        Function1 function5 = (Function1) q6cVarR.getValue();
                        Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                        function5.invoke(fragmentP0);
                        return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                    }
                };
                dVar2.L(obj);
            }
            dVar2.a0();
            vn3.d(objArr6, (Function1) obj, dVar2, 0);
            if (e.k()) {
                e.n();
            }
            function4 = function3;
            bVar4 = bVar10;
        } else {
            dVarF.U();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if ((i2 & 4) != 0) {
                    vp4VarB = FragmentStateKt.b(dVarF, 0);
                    i3 &= -897;
                } else {
                    vp4VarB = vp4Var2;
                }
                if ((i2 & 8) != 0) {
                    bundle3 = Bundle.EMPTY;
                    i3 &= -7169;
                } else {
                    bundle3 = bundle2;
                }
                if (i4 != 0) {
                    i6 = i3;
                    vp4Var3 = vp4VarB;
                    bundle4 = bundle3;
                    function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                        /* JADX WARN: Incorrect types in method signature: (TT;)V */
                        public final void a(Fragment fragment) {
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            a((Fragment) obj2);
                            return Unit.a;
                        }
                    };
                } else {
                    i6 = i3;
                    vp4Var3 = vp4VarB;
                    function3 = function2;
                    bundle4 = bundle3;
                }
            } else {
                if (i7 != 0) {
                    bVar3 = b.INSTANCE;
                } else {
                    bVar3 = bVar2;
                }
                if ((i2 & 4) != 0) {
                    vp4VarB = FragmentStateKt.b(dVarF, 0);
                    i3 &= -897;
                } else {
                    vp4VarB = vp4Var2;
                }
                if ((i2 & 8) != 0) {
                    bundle3 = Bundle.EMPTY;
                    i3 &= -7169;
                } else {
                    bundle3 = bundle2;
                }
                if (i4 != 0) {
                    i6 = i3;
                    vp4Var3 = vp4VarB;
                    bundle4 = bundle3;
                    function3 = new Function1<T, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$2
                        /* JADX WARN: Incorrect types in method signature: (TT;)V */
                        public final void a(Fragment fragment) {
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            a((Fragment) obj2);
                            return Unit.a;
                        }
                    };
                } else {
                    i6 = i3;
                    vp4Var3 = vp4VarB;
                    function3 = function2;
                    bundle4 = bundle3;
                }
            }
            dVarF.M();
            if (e.k()) {
                e.o(-1012439764, i6, -1, "androidx.fragment.compose.AndroidFragment (AndroidFragment.kt:84)");
            }
            q6cVarR = p0.r(function3, dVarF, (i6 >> 12) & 14);
            iA = pp1.a(dVarF, 0);
            view = (View) dVarF.v(AndroidCompositionLocals_androidKt.g());
            dVarF.Q(485393906);
            zX = dVarF.x(view);
            objR = dVarF.R();
            if (zX) {
                objR = FragmentManager.s0(view);
                dVarF.L(objR);
            } else {
                objR = FragmentManager.s0(view);
                dVarF.L(objR);
            }
            fragmentManager = (FragmentManager) objR;
            dVarF.a0();
            context = (Context) dVarF.v(AndroidCompositionLocals_androidKt.c());
            dVarF.Q(485398332);
            objR2 = dVarF.R();
            companion = d.INSTANCE;
            if (objR2 == companion.a()) {
                objR2 = new a(iA);
                dVarF.L(objR2);
            }
            aVar = (a) objR2;
            dVarF.a0();
            AndroidView_androidKt.a(aVar, bVar3, null, dVarF, i6 & 112, 4);
            b bVar11 = bVar3;
            Object[] objArr7 = {fragmentManager, aVar, cls, vp4Var3};
            dVarF.Q(485406992);
            zT = dVarF.T(fragmentManager) | dVarF.T(aVar) | dVarF.T(context) | dVarF.T(cls) | ((((i6 & 896) ^ 384) <= 256 && dVarF.x(vp4Var3)) || (i6 & 384) == 256) | dVarF.T(bundle4) | dVarF.C(iA) | dVarF.x(q6cVarR);
            Object objR9 = dVarF.R();
            if (zT) {
                vp4Var2 = vp4Var3;
                bundle2 = bundle4;
                dVar2 = dVarF;
                obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class a implements ux2 {
                        final /* synthetic */ Ref.BooleanRef a;
                        final /* synthetic */ Fragment b;

                        a(Ref.BooleanRef booleanRef, Fragment fragment) {
                            this.a = booleanRef;
                            this.b = fragment;
                        }

                        @Override // com.google.inputmethod.ux2
                        public void onStart(n17 owner) {
                            this.a.element = false;
                            this.b.getLifecycle().g(this);
                        }
                    }

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class b implements jd3 {
                        final /* synthetic */ FragmentManager a;
                        final /* synthetic */ Fragment b;
                        final /* synthetic */ vp4 c;
                        final /* synthetic */ Ref.BooleanRef d;

                        public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                            this.a = fragmentManager;
                            this.b = fragment;
                            this.c = vp4Var;
                            this.d = booleanRef;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.c.a().setValue(this.a.z1(this.b));
                            if (this.d.element) {
                                v vVarS = this.a.s();
                                vVarS.q(this.b);
                                vVarS.l();
                            } else {
                                if (this.a.Y0()) {
                                    return;
                                }
                                v vVarS2 = this.a.s();
                                vVarS2.q(this.b);
                                vVarS2.k();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                        if (fragmentP0 == null) {
                            fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                            vp4 vp4Var5 = vp4Var2;
                            Bundle bundle6 = bundle2;
                            FragmentManager fragmentManager2 = fragmentManager;
                            androidx.fragment.compose.a aVar2 = aVar;
                            int i10 = iA;
                            fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                            fragmentP0.setArguments(bundle6);
                            v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                            if (fragmentManager2.Y0()) {
                                booleanRef.element = true;
                                fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                vVarD.l();
                            } else {
                                vVarD.k();
                            }
                        }
                        fragmentManager.e1(aVar.a());
                        Function1 function5 = (Function1) q6cVarR.getValue();
                        Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                        function5.invoke(fragmentP0);
                        return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                    }
                };
                dVar2.L(obj);
            } else {
                vp4Var2 = vp4Var3;
                bundle2 = bundle4;
                dVar2 = dVarF;
                obj = new Function1<kd3, jd3>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$3$1

                    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$a", "Lcom/google/android/ux2;", "Lcom/google/android/n17;", "owner", "", "onStart", "(Lcom/google/android/n17;)V", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class a implements ux2 {
                        final /* synthetic */ Ref.BooleanRef a;
                        final /* synthetic */ Fragment b;

                        a(Ref.BooleanRef booleanRef, Fragment fragment) {
                            this.a = booleanRef;
                            this.b = fragment;
                        }

                        @Override // com.google.inputmethod.ux2
                        public void onStart(n17 owner) {
                            this.a.element = false;
                            this.b.getLifecycle().g(this);
                        }
                    }

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/fragment/compose/AndroidFragmentKt$AndroidFragment$3$1$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class b implements jd3 {
                        final /* synthetic */ FragmentManager a;
                        final /* synthetic */ Fragment b;
                        final /* synthetic */ vp4 c;
                        final /* synthetic */ Ref.BooleanRef d;

                        public b(FragmentManager fragmentManager, Fragment fragment, vp4 vp4Var, Ref.BooleanRef booleanRef) {
                            this.a = fragmentManager;
                            this.b = fragment;
                            this.c = vp4Var;
                            this.d = booleanRef;
                        }

                        @Override // com.google.inputmethod.jd3
                        public void dispose() {
                            this.c.a().setValue(this.a.z1(this.b));
                            if (this.d.element) {
                                v vVarS = this.a.s();
                                vVarS.q(this.b);
                                vVarS.l();
                            } else {
                                if (this.a.Y0()) {
                                    return;
                                }
                                v vVarS2 = this.a.s();
                                vVarS2.q(this.b);
                                vVarS2.k();
                            }
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final jd3 invoke(kd3 kd3Var) {
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        Fragment fragmentP0 = fragmentManager.p0(aVar.a().getId());
                        if (fragmentP0 == null) {
                            fragmentP0 = fragmentManager.C0().a(context.getClassLoader(), cls.getName());
                            vp4 vp4Var5 = vp4Var2;
                            Bundle bundle6 = bundle2;
                            FragmentManager fragmentManager2 = fragmentManager;
                            androidx.fragment.compose.a aVar2 = aVar;
                            int i10 = iA;
                            fragmentP0.setInitialSavedState(vp4Var5.a().getValue());
                            fragmentP0.setArguments(bundle6);
                            v vVarD = fragmentManager2.s().z(true).d(aVar2.a(), fragmentP0, String.valueOf(i10));
                            if (fragmentManager2.Y0()) {
                                booleanRef.element = true;
                                fragmentP0.getLifecycle().c(new a(booleanRef, fragmentP0));
                                vVarD.l();
                            } else {
                                vVarD.k();
                            }
                        }
                        fragmentManager.e1(aVar.a());
                        Function1 function5 = (Function1) q6cVarR.getValue();
                        Intrinsics.h(fragmentP0, "null cannot be cast to non-null type T of androidx.fragment.compose.AndroidFragmentKt.AndroidFragment$lambda$2");
                        function5.invoke(fragmentP0);
                        return new b(fragmentManager, fragmentP0, vp4Var2, booleanRef);
                    }
                };
                dVar2.L(obj);
            }
            dVar2.a0();
            vn3.d(objArr7, (Function1) obj, dVar2, 0);
            if (e.k()) {
                e.n();
            }
            function4 = function3;
            bVar4 = bVar11;
        }
        vp4Var4 = vp4Var2;
        bundle5 = bundle2;
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.fragment.compose.AndroidFragmentKt$AndroidFragment$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((d) obj2, ((Number) obj3).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar3, int i10) {
                    AndroidFragmentKt.a(cls, bVar4, vp4Var4, bundle5, function4, dVar3, saa.a(i | 1), i2);
                }
            });
        }
    }
}
