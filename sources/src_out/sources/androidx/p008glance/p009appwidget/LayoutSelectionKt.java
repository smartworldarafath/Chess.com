package androidx.p008glance.p009appwidget;

import android.R;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.p008glance.g;
import androidx.p008glance.layout.Alignment;
import com.google.android.qjd;
import com.google.inputmethod.BoxChildSelector;
import com.google.inputmethod.ContainerInfo;
import com.google.inputmethod.ContainerSelector;
import com.google.inputmethod.InsertedViewInfo;
import com.google.inputmethod.LayoutInfo;
import com.google.inputmethod.RemoteViewsInfo;
import com.google.inputmethod.RowColumnChildSelector;
import com.google.inputmethod.SizeSelector;
import com.google.inputmethod.TranslationContext;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fy9;
import com.google.inputmethod.gyd;
import com.google.inputmethod.ia3;
import com.google.inputmethod.ihe;
import com.google.inputmethod.jz9;
import com.google.inputmethod.mv4;
import com.google.inputmethod.wa5;
import com.google.inputmethod.xc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001d\u001a\u00020\f*\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001aJ\u0010$\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010'\u001a\u00020\u0000*\u00020&H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010+\u001a\u00020&*\u00020&2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,\" \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.\"\u0014\u00102\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u001a\u00104\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b0\u00103\"\u0018\u00108\u001a\u000205*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/glance/appwidget/LayoutSize;", "l", "(Landroidx/glance/appwidget/LayoutSize;)Landroidx/glance/appwidget/LayoutSize;", "width", "height", "Lcom/google/android/htb;", "g", "(Landroidx/glance/appwidget/LayoutSize;Landroidx/glance/appwidget/LayoutSize;)Lcom/google/android/htb;", "Lcom/google/android/bgd;", "translationContext", "Landroidx/glance/g;", "modifier", "", "aliasIndex", "Lcom/google/android/aga;", "a", "(Lcom/google/android/bgd;Landroidx/glance/g;I)Lcom/google/android/aga;", "Landroidx/glance/appwidget/LayoutType;", "type", "j", "(Landroidx/glance/appwidget/LayoutType;Landroidx/glance/g;)Ljava/lang/Integer;", "Landroid/widget/RemoteViews;", "Lcom/google/android/sy5;", "d", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Landroidx/glance/appwidget/LayoutType;Landroidx/glance/g;)Lcom/google/android/sy5;", "childLayout", "e", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;ILandroidx/glance/g;)Lcom/google/android/sy5;", "pos", "i", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;ILandroidx/glance/appwidget/LayoutSize;Landroidx/glance/appwidget/LayoutSize;)I", "numChildren", "Landroidx/glance/layout/a$b;", "horizontalAlignment", "Landroidx/glance/layout/a$c;", "verticalAlignment", "c", "(Landroid/widget/RemoteViews;Lcom/google/android/bgd;Landroidx/glance/appwidget/LayoutType;ILandroidx/glance/g;Landroidx/glance/layout/a$b;Landroidx/glance/layout/a$c;)Lcom/google/android/sy5;", "Lcom/google/android/ia3;", "k", "(Lcom/google/android/ia3;)Landroidx/glance/appwidget/LayoutSize;", "Landroid/content/Context;", "context", "h", "(Lcom/google/android/ia3;Landroid/content/Context;)Lcom/google/android/ia3;", "", "Ljava/util/Map;", "LayoutMap", "b", "I", "RootAliasTypeCount", "()I", "TopLevelLayoutsCount", "", "f", "(Lcom/google/android/sy5;)Z", "isSimple", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutSelectionKt {
    private static final Map<LayoutType, Integer> a = b0.n(new Pair[]{qjd.a(LayoutType.Text, Integer.valueOf(jz9.n6)), qjd.a(LayoutType.List, Integer.valueOf(jz9.f5)), qjd.a(LayoutType.CheckBox, Integer.valueOf(jz9.A2)), qjd.a(LayoutType.CheckBoxBackport, Integer.valueOf(jz9.B2)), qjd.a(LayoutType.Button, Integer.valueOf(jz9.o2)), qjd.a(LayoutType.Swtch, Integer.valueOf(jz9.P5)), qjd.a(LayoutType.SwtchBackport, Integer.valueOf(jz9.Q5)), qjd.a(LayoutType.Frame, Integer.valueOf(jz9.m3)), qjd.a(LayoutType.ImageCrop, Integer.valueOf(jz9.y3)), qjd.a(LayoutType.ImageCropDecorative, Integer.valueOf(jz9.C3)), qjd.a(LayoutType.ImageFit, Integer.valueOf(jz9.u4)), qjd.a(LayoutType.ImageFitDecorative, Integer.valueOf(jz9.y4)), qjd.a(LayoutType.ImageFillBounds, Integer.valueOf(jz9.W3)), qjd.a(LayoutType.ImageFillBoundsDecorative, Integer.valueOf(jz9.a4)), qjd.a(LayoutType.LinearProgressIndicator, Integer.valueOf(jz9.T4)), qjd.a(LayoutType.CircularProgressIndicator, Integer.valueOf(jz9.Y2)), qjd.a(LayoutType.VerticalGridOneColumn, Integer.valueOf(jz9.j7)), qjd.a(LayoutType.VerticalGridTwoColumns, Integer.valueOf(jz9.H7)), qjd.a(LayoutType.VerticalGridThreeColumns, Integer.valueOf(jz9.v7)), qjd.a(LayoutType.VerticalGridFourColumns, Integer.valueOf(jz9.X6)), qjd.a(LayoutType.VerticalGridFiveColumns, Integer.valueOf(jz9.L6)), qjd.a(LayoutType.VerticalGridAutoFit, Integer.valueOf(jz9.z6)), qjd.a(LayoutType.RadioButton, Integer.valueOf(jz9.r5)), qjd.a(LayoutType.RadioButtonBackport, Integer.valueOf(jz9.s5))});
    private static final int b;
    private static final int c;

    static {
        int size = mv4.f().size();
        b = size;
        c = Build.VERSION.SDK_INT >= 31 ? mv4.h() : mv4.h() / size;
    }

    public static final RemoteViewsInfo a(TranslationContext translationContext, g gVar, int i) {
        Object objH;
        Object objH2;
        ia3 height;
        ia3 width;
        Context context = translationContext.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i >= mv4.h()) {
                throw new IllegalArgumentException(("Index of the root view cannot be more than " + mv4.h() + ", currently " + i).toString());
            }
            LayoutSize layoutSize = LayoutSize.Wrap;
            SizeSelector sizeSelector = new SizeSelector(layoutSize, layoutSize);
            RemoteViews remoteViewsF = RemoteViewsTranslatorKt.f(translationContext, mv4.a() + i);
            ihe iheVar = (ihe) gVar.foldIn(null, new Function2<ihe, g.b, ihe>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$createRootView$lambda$3$$inlined$findModifier$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ihe invoke(ihe iheVar2, g.b bVar) {
                    return bVar instanceof ihe ? bVar : iheVar2;
                }
            });
            if (iheVar != null) {
                ApplyModifiersKt.h(context, remoteViewsF, iheVar, fy9.K0);
            }
            wa5 wa5Var = (wa5) gVar.foldIn(null, new Function2<wa5, g.b, wa5>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$createRootView$lambda$3$$inlined$findModifier$2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final wa5 invoke(wa5 wa5Var2, g.b bVar) {
                    return bVar instanceof wa5 ? bVar : wa5Var2;
                }
            });
            if (wa5Var != null) {
                ApplyModifiersKt.g(context, remoteViewsF, wa5Var, fy9.K0);
            }
            if (i2 >= 33) {
                remoteViewsF.removeAllViews(fy9.K0);
            }
            return new RemoteViewsInfo(remoteViewsF, new InsertedViewInfo(fy9.K0, 0, i2 >= 33 ? b0.j() : b0.f(qjd.a(0, b0.f(qjd.a(sizeSelector, Integer.valueOf(fy9.J0))))), 2, null));
        }
        int i3 = b;
        if (i3 * i >= mv4.h()) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (mv4.h() / 4) + ", currently " + i).toString());
        }
        ihe iheVar2 = (ihe) gVar.foldIn(null, new Function2<ihe, g.b, ihe>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$createRootView$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ihe invoke(ihe iheVar3, g.b bVar) {
                return bVar instanceof ihe ? bVar : iheVar3;
            }
        });
        if (iheVar2 == null || (width = iheVar2.getWidth()) == null || (objH = h(width, context)) == null) {
            objH = ia3.e.a;
        }
        wa5 wa5Var2 = (wa5) gVar.foldIn(null, new Function2<wa5, g.b, wa5>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$createRootView$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final wa5 invoke(wa5 wa5Var3, g.b bVar) {
                return bVar instanceof wa5 ? bVar : wa5Var3;
            }
        });
        if (wa5Var2 == null || (height = wa5Var2.getHeight()) == null || (objH2 = h(height, context)) == null) {
            objH2 = ia3.e.a;
        }
        ia3.c cVar = ia3.c.a;
        LayoutSize layoutSize2 = Intrinsics.e(objH, cVar) ? LayoutSize.MatchParent : LayoutSize.Wrap;
        LayoutSize layoutSize3 = Intrinsics.e(objH2, cVar) ? LayoutSize.MatchParent : LayoutSize.Wrap;
        SizeSelector sizeSelectorG = g(layoutSize2, layoutSize3);
        Integer num = mv4.f().get(sizeSelectorG);
        if (num != null) {
            return new RemoteViewsInfo(RemoteViewsTranslatorKt.f(translationContext, mv4.a() + (i3 * i) + num.intValue()), new InsertedViewInfo(0, 0, b0.f(qjd.a(0, b0.f(qjd.a(sizeSelectorG, Integer.valueOf(fy9.J0))))), 3, null));
        }
        throw new IllegalStateException("Cannot find root element for size [" + layoutSize2 + ", " + layoutSize3 + ']');
    }

    public static final int b() {
        return c;
    }

    public static final InsertedViewInfo c(RemoteViews remoteViews, TranslationContext translationContext, LayoutType layoutType, int i, g gVar, Alignment.b bVar, Alignment.c cVar) {
        LayoutType layoutType2;
        int iIntValue;
        if (i > 10) {
            Objects.toString(layoutType);
            new IllegalArgumentException(layoutType + " container cannot have more than 10 elements");
        }
        int iJ = kotlin.ranges.g.j(i, 10);
        Integer numJ = j(layoutType, gVar);
        if (numJ != null) {
            iIntValue = numJ.intValue();
            layoutType2 = layoutType;
        } else {
            layoutType2 = layoutType;
            ContainerInfo containerInfo = mv4.e().get(new ContainerSelector(layoutType2, iJ, bVar, cVar, null));
            Integer numValueOf = containerInfo != null ? Integer.valueOf(containerInfo.getLayoutId()) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + layoutType2 + " with " + i + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map<Integer, Map<SizeSelector, Integer>> map = mv4.c().get(layoutType2);
        if (map != null) {
            InsertedViewInfo insertedViewInfoB = InsertedViewInfo.b(e(remoteViews, translationContext, iIntValue, gVar), 0, 0, map, 3, null);
            if (Build.VERSION.SDK_INT >= 33) {
                remoteViews.removeAllViews(insertedViewInfoB.getMainViewId());
            }
            return insertedViewInfoB;
        }
        throw new IllegalArgumentException("Cannot find generated children for " + layoutType2);
    }

    public static final InsertedViewInfo d(RemoteViews remoteViews, TranslationContext translationContext, LayoutType layoutType, g gVar) {
        Integer numJ = j(layoutType, gVar);
        if (numJ != null || (numJ = a.get(layoutType)) != null) {
            return e(remoteViews, translationContext, numJ.intValue(), gVar);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + layoutType);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final InsertedViewInfo e(RemoteViews remoteViews, TranslationContext translationContext, int i, g gVar) throws NoWhenBranchMatchedException {
        ia3 width;
        ia3 height;
        int itemPosition = translationContext.getItemPosition();
        Integer numValueOf = null;
        ihe iheVar = (ihe) gVar.foldIn(null, new Function2<ihe, g.b, ihe>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$insertViewInternal$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ihe invoke(ihe iheVar2, g.b bVar) {
                return bVar instanceof ihe ? bVar : iheVar2;
            }
        });
        if (iheVar == null || (width = iheVar.getWidth()) == null) {
            width = ia3.e.a;
        }
        wa5 wa5Var = (wa5) gVar.foldIn(null, new Function2<wa5, g.b, wa5>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$insertViewInternal$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final wa5 invoke(wa5 wa5Var2, g.b bVar) {
                return bVar instanceof wa5 ? bVar : wa5Var2;
            }
        });
        if (wa5Var == null || (height = wa5Var.getHeight()) == null) {
            height = ia3.e.a;
        }
        if (!gVar.all(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$insertViewInternal$specifiedViewId$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(g.b bVar) {
                return true;
            }
        })) {
            if (translationContext.getIsBackgroundSpecified().getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(R.id.background);
        }
        Integer num = numValueOf;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            int iIntValue = num != null ? num.intValue() : translationContext.v();
            RemoteViewsTranslatorKt.a(remoteViews, translationContext.getParentContext().getMainViewId(), h.a.a(translationContext.getContext().getPackageName(), i, iIntValue), itemPosition);
            return new InsertedViewInfo(iIntValue, 0, null, 6, null);
        }
        if (i2 >= 31) {
            ia3.b bVar = ia3.b.a;
            return new InsertedViewInfo(gyd.a(remoteViews, translationContext, i(remoteViews, translationContext, itemPosition, Intrinsics.e(width, bVar) ? LayoutSize.Expand : LayoutSize.Wrap, Intrinsics.e(height, bVar) ? LayoutSize.Expand : LayoutSize.Wrap), i, num), 0, null, 6, null);
        }
        Context context = translationContext.getContext();
        LayoutSize layoutSizeK = k(h(width, context));
        LayoutSize layoutSizeK2 = k(h(height, context));
        int i3 = i(remoteViews, translationContext, itemPosition, layoutSizeK, layoutSizeK2);
        LayoutSize layoutSize = LayoutSize.Fixed;
        if (layoutSizeK != layoutSize && layoutSizeK2 != layoutSize) {
            return new InsertedViewInfo(gyd.a(remoteViews, translationContext, i3, i, num), 0, null, 6, null);
        }
        LayoutInfo layoutInfo = mv4.d().get(new SizeSelector(layoutSizeK, layoutSizeK2));
        if (layoutInfo != null) {
            return new InsertedViewInfo(gyd.a(remoteViews, translationContext, fy9.G0, i, num), gyd.b(remoteViews, translationContext, i3, layoutInfo.getLayoutId(), null, 8, null), null, 4, null);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + layoutSizeK + ", height=" + layoutSizeK2);
    }

    public static final boolean f(InsertedViewInfo insertedViewInfo) {
        return insertedViewInfo.getComplexViewId() == -1;
    }

    private static final SizeSelector g(LayoutSize layoutSize, LayoutSize layoutSize2) {
        return new SizeSelector(l(layoutSize), l(layoutSize2));
    }

    public static final ia3 h(ia3 ia3Var, Context context) {
        if (!(ia3Var instanceof ia3.d)) {
            return ia3Var;
        }
        float dimension = context.getResources().getDimension(((ia3.d) ia3Var).a());
        int i = (int) dimension;
        if (i != -2) {
            return i != -1 ? new ia3.a(ff3.i(dimension / context.getResources().getDisplayMetrics().density), null) : ia3.c.a;
        }
        return ia3.e.a;
    }

    private static final int i(RemoteViews remoteViews, TranslationContext translationContext, int i, LayoutSize layoutSize, LayoutSize layoutSize2) {
        SizeSelector sizeSelectorG = g(layoutSize, layoutSize2);
        Map<SizeSelector, Integer> map = translationContext.getParentContext().c().get(Integer.valueOf(i));
        if (map == null) {
            throw new IllegalStateException("Parent doesn't have child position " + i);
        }
        Integer num = map.get(sizeSelectorG);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i + " and size " + layoutSize + " x " + layoutSize2);
        }
        int iIntValue = num.intValue();
        Collection<Integer> collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gyd.a(remoteViews, translationContext, ((Number) it.next()).intValue(), jz9.k3, Integer.valueOf(fy9.F0));
        }
        return iIntValue;
    }

    private static final Integer j(LayoutType layoutType, g gVar) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        xc xcVar = (xc) gVar.foldIn(null, new Function2<xc, g.b, xc>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$selectLayout33$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final xc invoke(xc xcVar2, g.b bVar) {
                return bVar instanceof xc ? bVar : xcVar2;
            }
        });
        ihe iheVar = (ihe) gVar.foldIn(null, new Function2<ihe, g.b, ihe>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$selectLayout33$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ihe invoke(ihe iheVar2, g.b bVar) {
                return bVar instanceof ihe ? bVar : iheVar2;
            }
        });
        boolean zE = iheVar != null ? Intrinsics.e(iheVar.getWidth(), ia3.b.a) : false;
        wa5 wa5Var = (wa5) gVar.foldIn(null, new Function2<wa5, g.b, wa5>() { // from class: androidx.glance.appwidget.LayoutSelectionKt$selectLayout33$$inlined$findModifier$3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final wa5 invoke(wa5 wa5Var2, g.b bVar) {
                return bVar instanceof wa5 ? bVar : wa5Var2;
            }
        });
        boolean zE2 = wa5Var != null ? Intrinsics.e(wa5Var.getHeight(), ia3.b.a) : false;
        if (xcVar != null) {
            LayoutInfo layoutInfo = mv4.b().get(new BoxChildSelector(layoutType, xcVar.getAlignment().getHorizontal(), xcVar.getAlignment().getVertical(), null));
            if (layoutInfo != null) {
                return Integer.valueOf(layoutInfo.getLayoutId());
            }
            throw new IllegalArgumentException("Cannot find " + layoutType + " with alignment " + xcVar.getAlignment());
        }
        if (!zE && !zE2) {
            return null;
        }
        LayoutInfo layoutInfo2 = mv4.g().get(new RowColumnChildSelector(layoutType, zE, zE2));
        if (layoutInfo2 != null) {
            return Integer.valueOf(layoutInfo2.getLayoutId());
        }
        throw new IllegalArgumentException("Cannot find " + layoutType + " with defaultWeight set");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final LayoutSize k(ia3 ia3Var) throws NoWhenBranchMatchedException {
        if (ia3Var instanceof ia3.e) {
            return LayoutSize.Wrap;
        }
        if (ia3Var instanceof ia3.b) {
            return LayoutSize.Expand;
        }
        if (ia3Var instanceof ia3.c) {
            return LayoutSize.MatchParent;
        }
        if (ia3Var instanceof ia3.a ? true : ia3Var instanceof ia3.d) {
            return LayoutSize.Fixed;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final LayoutSize l(LayoutSize layoutSize) {
        return layoutSize == LayoutSize.Fixed ? LayoutSize.Wrap : layoutSize;
    }
}
