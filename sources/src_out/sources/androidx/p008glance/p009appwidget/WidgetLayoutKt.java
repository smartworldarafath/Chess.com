package androidx.p008glance.p009appwidget;

import android.content.Context;
import android.os.Build;
import androidx.p008glance.EmittableButton;
import androidx.p008glance.EmittableImage;
import androidx.p008glance.ImageKt;
import androidx.p008glance.g;
import androidx.p008glance.layout.Alignment;
import androidx.p008glance.layout.EmittableBox;
import androidx.p008glance.layout.EmittableColumn;
import androidx.p008glance.layout.EmittableRow;
import androidx.p008glance.p009appwidget.proto.LayoutProto$ContentScale;
import androidx.p008glance.p009appwidget.proto.LayoutProto$DimensionType;
import androidx.p008glance.p009appwidget.proto.LayoutProto$HorizontalAlignment;
import androidx.p008glance.p009appwidget.proto.LayoutProto$LayoutType;
import androidx.p008glance.p009appwidget.proto.LayoutProto$NodeIdentity;
import androidx.p008glance.p009appwidget.proto.LayoutProto$VerticalAlignment;
import com.google.inputmethod.ActionModifier;
import com.google.inputmethod.EmittableCircularProgressIndicator;
import com.google.inputmethod.EmittableLazyList;
import com.google.inputmethod.EmittableLazyListItem;
import com.google.inputmethod.EmittableLazyVerticalGridListItem;
import com.google.inputmethod.EmittableText;
import com.google.inputmethod.RemoteViewsRoot;
import com.google.inputmethod.bq3;
import com.google.inputmethod.e02;
import com.google.inputmethod.eq3;
import com.google.inputmethod.fq3;
import com.google.inputmethod.gq3;
import com.google.inputmethod.hq3;
import com.google.inputmethod.ia3;
import com.google.inputmethod.ihe;
import com.google.inputmethod.jq3;
import com.google.inputmethod.lo6;
import com.google.inputmethod.rp3;
import com.google.inputmethod.sp3;
import com.google.inputmethod.tp3;
import com.google.inputmethod.wa5;
import com.google.inputmethod.xp3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0016\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0016\u0010#\u001a\u00020\"*\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010*\u001a\u00020)*\u00020(2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b*\u0010+\"\u0018\u0010/\u001a\u00020(*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u0018\u00101\u001a\u00020(*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Landroid/content/Context;", "context", "Lcom/google/android/rp3;", "element", "Lcom/google/android/lo6;", "b", "(Landroid/content/Context;Lcom/google/android/rp3;)Lcom/google/android/lo6;", "Lcom/google/android/lo6$a;", "Landroidx/glance/e;", "", "i", "(Lcom/google/android/lo6$a;Landroidx/glance/e;)V", "Landroidx/glance/layout/c;", "h", "(Lcom/google/android/lo6$a;Landroidx/glance/layout/c;)V", "Lcom/google/android/xp3;", "j", "(Lcom/google/android/lo6$a;Lcom/google/android/xp3;)V", "Landroidx/glance/layout/d;", "k", "(Lcom/google/android/lo6$a;Landroidx/glance/layout/d;)V", "Landroidx/glance/layout/b;", "g", "(Lcom/google/android/lo6$a;Landroidx/glance/layout/b;)V", "", "appWidgetId", "", "f", "(I)Ljava/lang/String;", "Landroidx/glance/layout/a$c;", "Landroidx/glance/appwidget/proto/LayoutProto$VerticalAlignment;", "m", "(I)Landroidx/glance/appwidget/proto/LayoutProto$VerticalAlignment;", "Landroidx/glance/layout/a$b;", "Landroidx/glance/appwidget/proto/LayoutProto$HorizontalAlignment;", "n", "(I)Landroidx/glance/appwidget/proto/LayoutProto$HorizontalAlignment;", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutType;", "d", "(Lcom/google/android/rp3;)Landroidx/glance/appwidget/proto/LayoutProto$LayoutType;", "Lcom/google/android/ia3;", "Landroidx/glance/appwidget/proto/LayoutProto$DimensionType;", "l", "(Lcom/google/android/ia3;Landroid/content/Context;)Landroidx/glance/appwidget/proto/LayoutProto$DimensionType;", "Landroidx/glance/g;", "e", "(Landroidx/glance/g;)Lcom/google/android/ia3;", "widthModifier", "c", "heightModifier", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WidgetLayoutKt {
    public static final lo6 b(Context context, rp3 rp3Var) {
        lo6.a aVarA0 = lo6.a0();
        aVarA0.z(d(rp3Var));
        aVarA0.C(l(e(rp3Var.getModifier()), context));
        aVarA0.v(l(c(rp3Var.getModifier()), context));
        aVarA0.s(rp3Var.getModifier().foldIn(null, new Function2<ActionModifier, g.b, ActionModifier>() { // from class: androidx.glance.appwidget.WidgetLayoutKt$createNode$lambda$1$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ActionModifier invoke(ActionModifier actionModifier, g.b bVar) {
                return bVar instanceof ActionModifier ? bVar : actionModifier;
            }
        }) != null);
        if (rp3Var.getModifier().foldIn(null, new Function2<Object, g.b, Object>() { // from class: androidx.glance.appwidget.WidgetLayoutKt$createNode$lambda$1$$inlined$findModifier$2
            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Object;Landroidx/glance/g$b;)V */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, g.b bVar) {
                return obj;
            }
        }) != null) {
            aVarA0.x(LayoutProto$NodeIdentity.BACKGROUND_NODE);
        }
        if (rp3Var instanceof EmittableImage) {
            i(aVarA0, (EmittableImage) rp3Var);
        } else if (rp3Var instanceof EmittableColumn) {
            h(aVarA0, (EmittableColumn) rp3Var);
        } else if (rp3Var instanceof EmittableRow) {
            k(aVarA0, (EmittableRow) rp3Var);
        } else if (rp3Var instanceof EmittableBox) {
            g(aVarA0, (EmittableBox) rp3Var);
        } else if (rp3Var instanceof xp3) {
            j(aVarA0, (xp3) rp3Var);
        }
        if ((rp3Var instanceof jq3) && !(rp3Var instanceof EmittableLazyList)) {
            List<rp3> listD = ((jq3) rp3Var).d();
            ArrayList arrayList = new ArrayList(m.A(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(b(context, (rp3) it.next()));
            }
            aVarA0.r(arrayList);
        }
        return (lo6) aVarA0.build();
    }

    private static final ia3 c(g gVar) {
        ia3 height;
        wa5 wa5Var = (wa5) gVar.foldIn(null, new Function2<wa5, g.b, wa5>() { // from class: androidx.glance.appwidget.WidgetLayoutKt$special$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final wa5 invoke(wa5 wa5Var2, g.b bVar) {
                return bVar instanceof wa5 ? bVar : wa5Var2;
            }
        });
        return (wa5Var == null || (height = wa5Var.getHeight()) == null) ? ia3.e.a : height;
    }

    private static final LayoutProto$LayoutType d(rp3 rp3Var) {
        if (rp3Var instanceof EmittableBox) {
            return LayoutProto$LayoutType.BOX;
        }
        if (rp3Var instanceof EmittableButton) {
            return LayoutProto$LayoutType.BUTTON;
        }
        if (rp3Var instanceof EmittableRow) {
            return RadioButtonKt.a(rp3Var.getModifier()) ? LayoutProto$LayoutType.RADIO_ROW : LayoutProto$LayoutType.ROW;
        }
        if (rp3Var instanceof EmittableColumn) {
            return RadioButtonKt.a(rp3Var.getModifier()) ? LayoutProto$LayoutType.RADIO_COLUMN : LayoutProto$LayoutType.COLUMN;
        }
        if (rp3Var instanceof EmittableText) {
            return LayoutProto$LayoutType.TEXT;
        }
        if (rp3Var instanceof EmittableLazyListItem) {
            return LayoutProto$LayoutType.LIST_ITEM;
        }
        if (rp3Var instanceof xp3) {
            return LayoutProto$LayoutType.LAZY_COLUMN;
        }
        if (rp3Var instanceof sp3) {
            return LayoutProto$LayoutType.ANDROID_REMOTE_VIEWS;
        }
        if (rp3Var instanceof tp3) {
            return LayoutProto$LayoutType.CHECK_BOX;
        }
        if (rp3Var instanceof gq3) {
            return LayoutProto$LayoutType.SPACER;
        }
        if (rp3Var instanceof hq3) {
            return LayoutProto$LayoutType.SWITCH;
        }
        if (rp3Var instanceof EmittableImage) {
            return LayoutProto$LayoutType.IMAGE;
        }
        if (rp3Var instanceof eq3) {
            return LayoutProto$LayoutType.LINEAR_PROGRESS_INDICATOR;
        }
        if (rp3Var instanceof EmittableCircularProgressIndicator) {
            return LayoutProto$LayoutType.CIRCULAR_PROGRESS_INDICATOR;
        }
        if (rp3Var instanceof bq3) {
            return LayoutProto$LayoutType.LAZY_VERTICAL_GRID;
        }
        if (rp3Var instanceof EmittableLazyVerticalGridListItem) {
            return LayoutProto$LayoutType.LIST_ITEM;
        }
        if (rp3Var instanceof RemoteViewsRoot) {
            return LayoutProto$LayoutType.REMOTE_VIEWS_ROOT;
        }
        if (rp3Var instanceof fq3) {
            return LayoutProto$LayoutType.RADIO_BUTTON;
        }
        if (rp3Var instanceof EmittableSizeBox) {
            return LayoutProto$LayoutType.SIZE_BOX;
        }
        throw new IllegalArgumentException("Unknown element type " + rp3Var.getClass().getCanonicalName());
    }

    private static final ia3 e(g gVar) {
        ia3 width;
        ihe iheVar = (ihe) gVar.foldIn(null, new Function2<ihe, g.b, ihe>() { // from class: androidx.glance.appwidget.WidgetLayoutKt$special$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ihe invoke(ihe iheVar2, g.b bVar) {
                return bVar instanceof ihe ? bVar : iheVar2;
            }
        });
        return (iheVar == null || (width = iheVar.getWidth()) == null) ? ia3.e.a : width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(int i) {
        return "appWidgetLayout-" + i;
    }

    private static final void g(lo6.a aVar, EmittableBox emittableBox) {
        aVar.w(n(emittableBox.getContentAlignment().getHorizontal()));
        aVar.A(m(emittableBox.getContentAlignment().getVertical()));
    }

    private static final void h(lo6.a aVar, EmittableColumn emittableColumn) {
        aVar.w(n(emittableColumn.getHorizontalAlignment()));
    }

    private static final void i(lo6.a aVar, EmittableImage emittableImage) {
        LayoutProto$ContentScale layoutProto$ContentScale;
        int contentScale = emittableImage.getContentScale();
        e02.Companion companion = e02.INSTANCE;
        if (e02.g(contentScale, companion.c())) {
            layoutProto$ContentScale = LayoutProto$ContentScale.FIT;
        } else if (e02.g(contentScale, companion.a())) {
            layoutProto$ContentScale = LayoutProto$ContentScale.CROP;
        } else {
            if (!e02.g(contentScale, companion.b())) {
                throw new IllegalStateException(("Unknown content scale " + ((Object) e02.i(emittableImage.getContentScale()))).toString());
            }
            layoutProto$ContentScale = LayoutProto$ContentScale.FILL_BOUNDS;
        }
        aVar.y(layoutProto$ContentScale);
        aVar.u(!ImageKt.d(emittableImage));
        aVar.t(emittableImage.getColorFilterParams() != null);
    }

    private static final void j(lo6.a aVar, xp3 xp3Var) {
        aVar.w(n(xp3Var.getHorizontalAlignment()));
    }

    private static final void k(lo6.a aVar, EmittableRow emittableRow) {
        aVar.A(m(emittableRow.getVerticalAlignment()));
    }

    private static final LayoutProto$DimensionType l(ia3 ia3Var, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return n.a.a(ia3Var);
        }
        ia3 ia3VarH = LayoutSelectionKt.h(ia3Var, context);
        if (ia3VarH instanceof ia3.a) {
            return LayoutProto$DimensionType.EXACT;
        }
        if (ia3VarH instanceof ia3.e) {
            return LayoutProto$DimensionType.WRAP;
        }
        if (ia3VarH instanceof ia3.c) {
            return LayoutProto$DimensionType.FILL;
        }
        if (ia3VarH instanceof ia3.b) {
            return LayoutProto$DimensionType.EXPAND;
        }
        throw new IllegalStateException("After resolution, no other type should be present");
    }

    private static final LayoutProto$VerticalAlignment m(int i) {
        Alignment.c.Companion companion = Alignment.c.INSTANCE;
        if (Alignment.c.g(i, companion.c())) {
            return LayoutProto$VerticalAlignment.TOP;
        }
        if (Alignment.c.g(i, companion.b())) {
            return LayoutProto$VerticalAlignment.CENTER_VERTICALLY;
        }
        if (Alignment.c.g(i, companion.a())) {
            return LayoutProto$VerticalAlignment.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) Alignment.c.i(i))).toString());
    }

    private static final LayoutProto$HorizontalAlignment n(int i) {
        Alignment.b.Companion companion = Alignment.b.INSTANCE;
        if (Alignment.b.g(i, companion.c())) {
            return LayoutProto$HorizontalAlignment.START;
        }
        if (Alignment.b.g(i, companion.a())) {
            return LayoutProto$HorizontalAlignment.CENTER_HORIZONTALLY;
        }
        if (Alignment.b.g(i, companion.b())) {
            return LayoutProto$HorizontalAlignment.END;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) Alignment.b.i(i))).toString());
    }
}
