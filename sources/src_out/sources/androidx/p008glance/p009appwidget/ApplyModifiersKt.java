package androidx.p008glance.p009appwidget;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import androidx.p008glance.Visibility;
import androidx.p008glance.b;
import androidx.p008glance.g;
import androidx.p008glance.h;
import androidx.p008glance.p009appwidget.action.ApplyActionKt;
import androidx.p008glance.semantics.SemanticsProperties;
import com.google.inputmethod.ActionModifier;
import com.google.inputmethod.AndroidResourceImageProvider;
import com.google.inputmethod.ClipToOutlineModifier;
import com.google.inputmethod.CornerRadiusModifier;
import com.google.inputmethod.EnabledModifier;
import com.google.inputmethod.FixedColorProvider;
import com.google.inputmethod.InsertedViewInfo;
import com.google.inputmethod.PaddingInDp;
import com.google.inputmethod.PaddingModifier;
import com.google.inputmethod.ResourceColorProvider;
import com.google.inputmethod.SemanticsModifier;
import com.google.inputmethod.TranslationContext;
import com.google.inputmethod.bq2;
import com.google.inputmethod.fy9;
import com.google.inputmethod.gyd;
import com.google.inputmethod.ia3;
import com.google.inputmethod.ihe;
import com.google.inputmethod.jz9;
import com.google.inputmethod.ki1;
import com.google.inputmethod.ko5;
import com.google.inputmethod.ti1;
import com.google.inputmethod.wa5;
import com.google.inputmethod.xc;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\"\u001a\u0010'\u001a\u00020$*\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/google/android/bgd;", "translationContext", "Landroid/widget/RemoteViews;", "rv", "Landroidx/glance/g;", "modifiers", "Lcom/google/android/sy5;", "viewDef", "", "e", "(Lcom/google/android/bgd;Landroid/widget/RemoteViews;Landroidx/glance/g;Lcom/google/android/sy5;)V", "Landroidx/glance/Visibility;", "", "m", "(Landroidx/glance/Visibility;)I", "Lcom/google/android/ihe;", "widthModifier", "Lcom/google/android/wa5;", "heightModifier", "i", "(Lcom/google/android/bgd;Landroid/widget/RemoteViews;Lcom/google/android/ihe;Lcom/google/android/wa5;Lcom/google/android/sy5;)V", "Landroid/content/Context;", "context", "modifier", "viewId", "h", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/google/android/ihe;I)V", "g", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/google/android/wa5;I)V", "Landroidx/glance/b;", "b", "(Landroid/content/Context;Landroid/widget/RemoteViews;Landroidx/glance/b;Lcom/google/android/sy5;)V", "Lcom/google/android/ia3;", "radius", "f", "(Landroid/widget/RemoteViews;ILcom/google/android/ia3;)V", "", "l", "(Lcom/google/android/ia3;)Z", "isFixed", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ApplyModifiersKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Visibility.values().length];
            try {
                iArr[Visibility.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Visibility.Invisible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Visibility.Gone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, RemoteViews remoteViews, b bVar, InsertedViewInfo insertedViewInfo) {
        int mainViewId = insertedViewInfo.getMainViewId();
        if (bVar instanceof b.BackgroundModifier) {
            d(remoteViews, mainViewId, (b.BackgroundModifier) bVar);
        } else if (bVar instanceof b.BackgroundModifier) {
            c(remoteViews, mainViewId, context, (b.BackgroundModifier) bVar);
        }
    }

    private static final void c(RemoteViews remoteViews, int i, Context context, b.BackgroundModifier backgroundModifier) {
        ti1 colorProvider = backgroundModifier.getColorProvider();
        if (colorProvider instanceof FixedColorProvider) {
            androidx.core.widget.a.w(remoteViews, i, ki1.j(((FixedColorProvider) colorProvider).getColor()));
            return;
        }
        if (colorProvider instanceof ResourceColorProvider) {
            androidx.core.widget.a.y(remoteViews, i, ((ResourceColorProvider) colorProvider).getResId());
            return;
        }
        if (!(colorProvider instanceof bq2)) {
            Objects.toString(colorProvider);
        } else if (Build.VERSION.SDK_INT < 31) {
            androidx.core.widget.a.w(remoteViews, i, ki1.j(colorProvider.a(context)));
        } else {
            bq2 bq2Var = (bq2) colorProvider;
            androidx.core.widget.a.x(remoteViews, i, ki1.j(bq2Var.b()), ki1.j(bq2Var.c()));
        }
    }

    private static final void d(RemoteViews remoteViews, int i, b.BackgroundModifier backgroundModifier) {
        ko5 imageProvider = backgroundModifier.getImageProvider();
        if (imageProvider instanceof AndroidResourceImageProvider) {
            androidx.core.widget.a.z(remoteViews, i, ((AndroidResourceImageProvider) imageProvider).getResId());
        }
    }

    public static final void e(final TranslationContext translationContext, final RemoteViews remoteViews, g gVar, final InsertedViewInfo insertedViewInfo) {
        List list;
        final Context context = translationContext.getContext();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        objectRef5.element = Visibility.Visible;
        final Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
        gVar.foldIn(Unit.a, new Function2<Unit, g.b, Unit>() { // from class: androidx.glance.appwidget.ApplyModifiersKt$applyModifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(Unit unit, g.b bVar) {
                PaddingModifier paddingModifierB;
                if (bVar instanceof ActionModifier) {
                    Ref.ObjectRef<ActionModifier> objectRef10 = objectRef6;
                    Object obj = objectRef10.element;
                    objectRef10.element = bVar;
                    return;
                }
                if (bVar instanceof ihe) {
                    objectRef.element = bVar;
                    return;
                }
                if (bVar instanceof wa5) {
                    objectRef2.element = bVar;
                    return;
                }
                if (bVar instanceof b) {
                    ApplyModifiersKt.b(context, remoteViews, (b) bVar, insertedViewInfo);
                    return;
                }
                if (bVar instanceof PaddingModifier) {
                    Ref.ObjectRef<PaddingModifier> objectRef11 = objectRef3;
                    PaddingModifier paddingModifier = (PaddingModifier) objectRef11.element;
                    if (paddingModifier == null || (paddingModifierB = paddingModifier.b((PaddingModifier) bVar)) == null) {
                        paddingModifierB = (PaddingModifier) bVar;
                    }
                    objectRef11.element = paddingModifierB;
                    return;
                }
                if (bVar instanceof h) {
                    objectRef5.element = ((h) bVar).b();
                    return;
                }
                if (bVar instanceof CornerRadiusModifier) {
                    objectRef4.element = ((CornerRadiusModifier) bVar).getRadius();
                    return;
                }
                if (bVar instanceof xc) {
                    return;
                }
                if (bVar instanceof ClipToOutlineModifier) {
                    objectRef8.element = bVar;
                    return;
                }
                if (bVar instanceof EnabledModifier) {
                    objectRef7.element = bVar;
                } else if (bVar instanceof SemanticsModifier) {
                    objectRef9.element = bVar;
                } else {
                    Objects.toString(bVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Unit) obj, (g.b) obj2);
                return Unit.a;
            }
        });
        i(translationContext, remoteViews, (ihe) objectRef.element, (wa5) objectRef2.element, insertedViewInfo);
        ActionModifier actionModifier = (ActionModifier) objectRef6.element;
        if (actionModifier != null) {
            ApplyActionKt.a(translationContext, remoteViews, actionModifier.getAction(), insertedViewInfo.getMainViewId());
        }
        ia3 ia3Var = (ia3) objectRef4.element;
        if (ia3Var != null) {
            f(remoteViews, insertedViewInfo.getMainViewId(), ia3Var);
        }
        PaddingModifier paddingModifier = (PaddingModifier) objectRef3.element;
        if (paddingModifier != null) {
            PaddingInDp paddingInDpE = paddingModifier.c(context.getResources()).e(translationContext.getIsRtl());
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            remoteViews.setViewPadding(insertedViewInfo.getMainViewId(), gyd.f(paddingInDpE.getLeft(), displayMetrics), gyd.f(paddingInDpE.getTop(), displayMetrics), gyd.f(paddingInDpE.getRight(), displayMetrics), gyd.f(paddingInDpE.getBottom(), displayMetrics));
        }
        ClipToOutlineModifier clipToOutlineModifier = (ClipToOutlineModifier) objectRef8.element;
        if (clipToOutlineModifier != null && Build.VERSION.SDK_INT >= 31) {
            remoteViews.setBoolean(insertedViewInfo.getMainViewId(), "setClipToOutline", clipToOutlineModifier.getClip());
        }
        EnabledModifier enabledModifier = (EnabledModifier) objectRef7.element;
        if (enabledModifier != null) {
            remoteViews.setBoolean(insertedViewInfo.getMainViewId(), "setEnabled", enabledModifier.getEnabled());
        }
        SemanticsModifier semanticsModifier = (SemanticsModifier) objectRef9.element;
        if (semanticsModifier != null && (list = (List) semanticsModifier.getConfiguration().c(SemanticsProperties.a.a())) != null) {
            remoteViews.setContentDescription(insertedViewInfo.getMainViewId(), m.J0(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        remoteViews.setViewVisibility(insertedViewInfo.getMainViewId(), m((Visibility) objectRef5.element));
    }

    private static final void f(RemoteViews remoteViews, int i, ia3 ia3Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            b.a.a(remoteViews, i, ia3Var);
        }
    }

    public static final void g(Context context, RemoteViews remoteViews, wa5 wa5Var, int i) {
        ia3 height = wa5Var.getHeight();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i2 >= 33 || !m.s(new ia3[]{ia3.e.a, ia3.b.a}).contains(height)) {
                b.a.b(remoteViews, i, height);
                return;
            }
            return;
        }
        if (m.s(new ia3[]{ia3.e.a, ia3.c.a, ia3.b.a}).contains(LayoutSelectionKt.h(height, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + height + " requires a complex layout before API 31");
    }

    public static final void h(Context context, RemoteViews remoteViews, ihe iheVar, int i) {
        ia3 width = iheVar.getWidth();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i2 >= 33 || !m.s(new ia3[]{ia3.e.a, ia3.b.a}).contains(width)) {
                b.a.c(remoteViews, i, width);
                return;
            }
            return;
        }
        if (m.s(new ia3[]{ia3.e.a, ia3.c.a, ia3.b.a}).contains(LayoutSelectionKt.h(width, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + width + " requires a complex layout before API 31");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void i(TranslationContext translationContext, RemoteViews remoteViews, ihe iheVar, wa5 wa5Var, InsertedViewInfo insertedViewInfo) throws NoWhenBranchMatchedException {
        int i;
        Context context = translationContext.getContext();
        if (LayoutSelectionKt.f(insertedViewInfo)) {
            if (iheVar != null) {
                h(context, remoteViews, iheVar, insertedViewInfo.getMainViewId());
            }
            if (wa5Var != null) {
                g(context, remoteViews, wa5Var, insertedViewInfo.getMainViewId());
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            throw new IllegalStateException("There is currently no valid use case where a complex view is used on Android S");
        }
        ia3 width = iheVar != null ? iheVar.getWidth() : null;
        ia3 height = wa5Var != null ? wa5Var.getHeight() : null;
        if (l(width) || l(height)) {
            boolean z = (width instanceof ia3.c) || (width instanceof ia3.b);
            boolean z2 = (height instanceof ia3.c) || (height instanceof ia3.b);
            if (z && z2) {
                i = jz9.xa;
            } else if (z) {
                i = jz9.ya;
            } else {
                i = z2 ? jz9.za : jz9.Aa;
            }
            int iB = gyd.b(remoteViews, translationContext, fy9.L0, i, null, 8, null);
            if (width instanceof ia3.a) {
                androidx.core.widget.a.v(remoteViews, iB, j((ia3.a) width, context));
            } else if (width instanceof ia3.d) {
                androidx.core.widget.a.v(remoteViews, iB, k((ia3.d) width, context));
            } else {
                if (!((Intrinsics.e(width, ia3.b.a) ? true : Intrinsics.e(width, ia3.c.a) ? true : Intrinsics.e(width, ia3.e.a)) || width == null)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Unit unit = Unit.a;
            if (height instanceof ia3.a) {
                androidx.core.widget.a.r(remoteViews, iB, j((ia3.a) height, context));
            } else if (height instanceof ia3.d) {
                androidx.core.widget.a.r(remoteViews, iB, k((ia3.d) height, context));
            } else {
                if (!((Intrinsics.e(height, ia3.b.a) ? true : Intrinsics.e(height, ia3.c.a) ? true : Intrinsics.e(height, ia3.e.a)) || height == null)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    private static final int j(ia3.a aVar, Context context) {
        return gyd.e(aVar.getDp(), context);
    }

    private static final int k(ia3.d dVar, Context context) {
        return context.getResources().getDimensionPixelSize(dVar.a());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean l(ia3 ia3Var) throws NoWhenBranchMatchedException {
        boolean z = true;
        if (ia3Var instanceof ia3.a ? true : ia3Var instanceof ia3.d) {
            return true;
        }
        if (!(Intrinsics.e(ia3Var, ia3.b.a) ? true : Intrinsics.e(ia3Var, ia3.c.a) ? true : Intrinsics.e(ia3Var, ia3.e.a)) && ia3Var != null) {
            z = false;
        }
        if (z) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final int m(Visibility visibility) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[visibility.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }
}
