package com.google.inputmethod;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/Painter;", "c", "(ILandroidx/compose/runtime/d;I)Landroidx/compose/ui/graphics/painter/Painter;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "Lcom/google/android/pp5;", "b", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/d;I)Lcom/google/android/pp5;", "", "path", "Lcom/google/android/ml5;", "a", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Lcom/google/android/ml5;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v09 {
    private static final ml5 a(CharSequence charSequence, Resources resources, int i) {
        try {
            return ep5.a(ml5.INSTANCE, resources, i);
        } catch (Exception e) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
        }
    }

    private static final pp5 b(Resources.Theme theme, Resources resources, int i, int i2, d dVar, int i3) throws XmlPullParserException, IOException {
        if (e.k()) {
            e.o(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        qp5 qp5Var = (qp5) dVar.v(AndroidCompositionLocals_androidKt.d());
        qp5.Key key = new qp5.Key(theme, i);
        qp5.ImageVectorEntry imageVectorEntryB = qp5Var.b(key);
        if (imageVectorEntryB == null) {
            XmlResourceParser xml = resources.getXml(i);
            if (!Intrinsics.e(goe.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            imageVectorEntryB = e3e.a(theme, resources, xml, i2);
            qp5Var.d(key, imageVectorEntryB);
        }
        pp5 imageVector = imageVectorEntryB.getImageVector();
        if (e.k()) {
            e.n();
        }
        return imageVector;
    }

    public static final Painter c(int i, d dVar, int i2) {
        Painter painterG;
        if (e.k()) {
            e.o(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) dVar.v(AndroidCompositionLocals_androidKt.c());
        Resources resources = (Resources) dVar.v(AndroidCompositionLocals_androidKt.f());
        TypedValue typedValueB = ((cla) dVar.v(AndroidCompositionLocals_androidKt.e())).b(resources, i);
        CharSequence charSequence = typedValueB.string;
        boolean z = true;
        if (charSequence == null || !h.m0(charSequence, ".xml", false, 2, (Object) null)) {
            dVar.y(-1771643000);
            Object theme = context.getTheme();
            boolean zX = dVar.x(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !dVar.C(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean zX2 = dVar.x(theme) | zX | z;
            Object objR = dVar.R();
            if (zX2 || objR == d.INSTANCE.a()) {
                objR = a(charSequence, resources, i);
                dVar.L(objR);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((ml5) objR, 0L, 0L, 6, null);
            dVar.u();
            painterG = bitmapPainter;
        } else {
            dVar.y(-1771798434);
            painterG = c3e.g(b(context.getTheme(), resources, i, typedValueB.changingConfigurations, dVar, (i2 << 6) & 896), dVar, 0);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return painterG;
    }
}
