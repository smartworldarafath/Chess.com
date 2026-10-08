package androidx.p008glance.p009appwidget;

import android.os.Build;
import androidx.p008glance.EmittableButton;
import androidx.p008glance.EmittableImage;
import androidx.p008glance.ImageKt;
import androidx.p008glance.b;
import androidx.p008glance.c;
import androidx.p008glance.g;
import androidx.p008glance.layout.Alignment;
import androidx.p008glance.layout.EmittableBox;
import com.google.android.qjd;
import com.google.inputmethod.ActionModifier;
import com.google.inputmethod.CornerRadiusModifier;
import com.google.inputmethod.LambdaAction;
import com.google.inputmethod.PaddingModifier;
import com.google.inputmethod.RemoteViewsRoot;
import com.google.inputmethod.TintAndAlphaColorFilterParams;
import com.google.inputmethod.btb;
import com.google.inputmethod.e02;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fq3;
import com.google.inputmethod.gi1;
import com.google.inputmethod.hq3;
import com.google.inputmethod.ia3;
import com.google.inputmethod.ihe;
import com.google.inputmethod.jq3;
import com.google.inputmethod.ko5;
import com.google.inputmethod.kq3;
import com.google.inputmethod.l7;
import com.google.inputmethod.ms1;
import com.google.inputmethod.mx8;
import com.google.inputmethod.ny;
import com.google.inputmethod.rp3;
import com.google.inputmethod.ti1;
import com.google.inputmethod.tp3;
import com.google.inputmethod.vx9;
import com.google.inputmethod.wa5;
import com.google.inputmethod.yp3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\b\u001a'\u0010\r\u001a\u00020\u0002*\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f*\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00150\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u000bH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010#\u001a\u00020\"*\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010%\u001a\u00020\u0002*\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010(\u001a\u00020\u0015*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150'H\u0002¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/google/android/bga;", "root", "", "i", "(Lcom/google/android/bga;)V", "Lcom/google/android/jq3;", "container", "d", "(Lcom/google/android/jq3;)V", "k", "Lkotlin/Function1;", "Lcom/google/android/rp3;", "block", "m", "(Lcom/google/android/jq3;Lkotlin/jvm/functions/Function1;)V", "", "", "", "Lcom/google/android/tm6;", "n", "(Lcom/google/android/jq3;)Ljava/util/Map;", "Landroidx/glance/g;", "Lkotlin/Pair;", "f", "(Landroidx/glance/g;)Lkotlin/Pair;", "Lcom/google/android/yp3;", "view", "j", "(Lcom/google/android/yp3;)V", "l", "(Lcom/google/android/rp3;)Lcom/google/android/rp3;", "", "h", "(Lcom/google/android/rp3;)Z", "Landroidx/glance/appwidget/f;", "g", "(Landroidx/glance/g;)Landroidx/glance/appwidget/f;", "o", "(Landroidx/glance/g;)V", "", "e", "(Ljava/util/List;)Landroidx/glance/g;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NormalizeCompositionTreeKt {
    private static final void d(jq3 jq3Var) {
        if (!jq3Var.d().isEmpty()) {
            List<rp3> listD = jq3Var.d();
            if (listD == null || !listD.isEmpty()) {
                Iterator<T> it = listD.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((rp3) it.next()) instanceof EmittableSizeBox)) {
                        }
                    }
                }
            }
            for (rp3 rp3Var : jq3Var.d()) {
                Intrinsics.h(rp3Var, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
                EmittableSizeBox emittableSizeBox = (EmittableSizeBox) rp3Var;
                if (emittableSizeBox.d().size() != 1) {
                    EmittableBox emittableBox = new EmittableBox();
                    m.G(emittableBox.d(), emittableSizeBox.d());
                    emittableSizeBox.d().clear();
                    emittableSizeBox.d().add(emittableBox);
                }
            }
            return;
        }
        if (jq3Var.d().size() == 1) {
            return;
        }
        EmittableBox emittableBox2 = new EmittableBox();
        m.G(emittableBox2.d(), jq3Var.d());
        jq3Var.d().clear();
        jq3Var.d().add(emittableBox2);
    }

    private static final g e(List<g> list) {
        g gVarA;
        g.Companion companion = g.INSTANCE;
        for (g gVar : list) {
            if (gVar != null && (gVarA = companion.a(gVar)) != null) {
                companion = gVarA;
            }
        }
        return companion;
    }

    private static final Pair<LambdaAction, g> f(g gVar) {
        Pair pairA = gVar.any(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractLambdaAction$$inlined$extractModifier$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(g.b bVar) {
                return Boolean.valueOf(bVar instanceof ActionModifier);
            }
        }) ? (Pair) gVar.foldIn(qjd.a((Object) null, g.INSTANCE), new Function2<Pair<? extends ActionModifier, ? extends g>, g.b, Pair<? extends ActionModifier, ? extends g>>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractLambdaAction$$inlined$extractModifier$2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pair<ActionModifier, g> invoke(Pair<? extends ActionModifier, ? extends g> pair, g.b bVar) {
                return bVar instanceof ActionModifier ? qjd.a(bVar, pair.d()) : qjd.a(pair.c(), ((g) pair.d()).a(bVar));
            }
        }) : qjd.a((Object) null, gVar);
        ActionModifier actionModifier = (ActionModifier) pairA.a();
        g gVar2 = (g) pairA.b();
        l7 action = actionModifier != null ? actionModifier.getAction() : null;
        if (action instanceof LambdaAction) {
            return qjd.a(action, gVar2);
        }
        if (action instanceof ms1) {
            ms1 ms1Var = (ms1) action;
            if (ms1Var.d() instanceof LambdaAction) {
                return qjd.a(ms1Var.d(), gVar2);
            }
        }
        return qjd.a((Object) null, gVar2);
    }

    private static final ExtractedSizeModifiers g(g gVar) {
        return gVar.any(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractSizeAndCornerRadiusModifiers$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(g.b bVar) {
                return Boolean.valueOf((bVar instanceof ihe) || (bVar instanceof wa5) || (bVar instanceof CornerRadiusModifier));
            }
        }) ? (ExtractedSizeModifiers) gVar.foldIn(new ExtractedSizeModifiers(null, null, 3, null), new Function2<ExtractedSizeModifiers, g.b, ExtractedSizeModifiers>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$extractSizeAndCornerRadiusModifiers$2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExtractedSizeModifiers invoke(ExtractedSizeModifiers extractedSizeModifiers, g.b bVar) {
                return ((bVar instanceof ihe) || (bVar instanceof wa5) || (bVar instanceof CornerRadiusModifier)) ? ExtractedSizeModifiers.d(extractedSizeModifiers, extractedSizeModifiers.f().a(bVar), null, 2, null) : ExtractedSizeModifiers.d(extractedSizeModifiers, null, extractedSizeModifiers.e().a(bVar), 1, null);
            }
        }) : new ExtractedSizeModifiers(null, gVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(rp3 rp3Var) {
        if ((rp3Var instanceof hq3) || (rp3Var instanceof fq3) || (rp3Var instanceof tp3)) {
            return true;
        }
        return (rp3Var instanceof EmittableButton) && Build.VERSION.SDK_INT >= 31;
    }

    public static final void i(RemoteViewsRoot remoteViewsRoot) {
        d(remoteViewsRoot);
        k(remoteViewsRoot);
        m(remoteViewsRoot, new Function1<rp3, rp3>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeCompositionTree$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final rp3 invoke(rp3 rp3Var) {
                if (rp3Var instanceof yp3) {
                    NormalizeCompositionTreeKt.j((yp3) rp3Var);
                }
                return NormalizeCompositionTreeKt.l(rp3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(yp3 yp3Var) {
        EmittableBox emittableBox = new EmittableBox();
        m.G(emittableBox.d(), yp3Var.d());
        emittableBox.i(yp3Var.getAlignment());
        emittableBox.b(yp3Var.getModifier());
        yp3Var.d().clear();
        yp3Var.d().add(emittableBox);
        yp3Var.i(Alignment.INSTANCE.b());
    }

    private static final void k(jq3 jq3Var) {
        ia3 height;
        ia3 width;
        List<rp3> listD;
        for (rp3 rp3Var : jq3Var.d()) {
            if (rp3Var instanceof jq3) {
                k((jq3) rp3Var);
            }
        }
        wa5 wa5Var = (wa5) jq3Var.getModifier().foldIn(null, new Function2<wa5, g.b, wa5>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeSizes$$inlined$findModifier$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final wa5 invoke(wa5 wa5Var2, g.b bVar) {
                return bVar instanceof wa5 ? bVar : wa5Var2;
            }
        });
        if (wa5Var == null || (height = wa5Var.getHeight()) == null) {
            height = ia3.e.a;
        }
        if ((height instanceof ia3.e) && ((listD = jq3Var.d()) == null || !listD.isEmpty())) {
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                wa5 wa5Var2 = (wa5) ((rp3) it.next()).getModifier().foldIn(null, new Function2<wa5, g.b, wa5>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeSizes$lambda$2$$inlined$findModifier$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final wa5 invoke(wa5 wa5Var3, g.b bVar) {
                        return bVar instanceof wa5 ? bVar : wa5Var3;
                    }
                });
                if ((wa5Var2 != null ? wa5Var2.getHeight() : null) instanceof ia3.c) {
                    jq3Var.b(btb.a(jq3Var.getModifier()));
                    break;
                }
            }
        }
        ihe iheVar = (ihe) jq3Var.getModifier().foldIn(null, new Function2<ihe, g.b, ihe>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeSizes$$inlined$findModifier$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ihe invoke(ihe iheVar2, g.b bVar) {
                return bVar instanceof ihe ? bVar : iheVar2;
            }
        });
        if (iheVar == null || (width = iheVar.getWidth()) == null) {
            width = ia3.e.a;
        }
        if (width instanceof ia3.e) {
            List<rp3> listD2 = jq3Var.d();
            if (listD2 == null || !listD2.isEmpty()) {
                Iterator<T> it2 = listD2.iterator();
                while (it2.hasNext()) {
                    ihe iheVar2 = (ihe) ((rp3) it2.next()).getModifier().foldIn(null, new Function2<ihe, g.b, ihe>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$normalizeSizes$lambda$3$$inlined$findModifier$1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final ihe invoke(ihe iheVar3, g.b bVar) {
                            return bVar instanceof ihe ? bVar : iheVar3;
                        }
                    });
                    if ((iheVar2 != null ? iheVar2.getWidth() : null) instanceof ia3.c) {
                        jq3Var.b(btb.c(jq3Var.getModifier()));
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rp3 l(final rp3 rp3Var) {
        EmittableImage emittableImage;
        EmittableImage emittableImage2;
        ko5 ko5VarB;
        ti1 colorProvider;
        if ((rp3Var instanceof yp3) || (rp3Var instanceof EmittableSizeBox)) {
            return rp3Var;
        }
        final boolean z = rp3Var instanceof EmittableButton;
        if (z && Build.VERSION.SDK_INT > 30) {
            g modifier = rp3Var.getModifier();
            Pair pairA = modifier.any(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(g.b bVar) {
                    return Boolean.valueOf(bVar instanceof b.BackgroundModifier);
                }
            }) ? (Pair) modifier.foldIn(qjd.a((Object) null, g.INSTANCE), new Function2<Pair<? extends b.BackgroundModifier, ? extends g>, g.b, Pair<? extends b.BackgroundModifier, ? extends g>>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Pair<b.BackgroundModifier, g> invoke(Pair<? extends b.BackgroundModifier, ? extends g> pair, g.b bVar) {
                    return bVar instanceof b.BackgroundModifier ? qjd.a(bVar, pair.d()) : qjd.a(pair.c(), ((g) pair.d()).a(bVar));
                }
            }) : qjd.a((Object) null, modifier);
            b.BackgroundModifier backgroundModifier = (b.BackgroundModifier) pairA.a();
            g gVar = (g) pairA.b();
            if (backgroundModifier != null) {
                rp3Var.b(gVar);
            }
            g modifier2 = rp3Var.getModifier();
            Pair pairA2 = modifier2.any(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$3
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(g.b bVar) {
                    return Boolean.valueOf(bVar instanceof b.BackgroundModifier);
                }
            }) ? (Pair) modifier2.foldIn(qjd.a((Object) null, g.INSTANCE), new Function2<Pair<? extends b.BackgroundModifier, ? extends g>, g.b, Pair<? extends b.BackgroundModifier, ? extends g>>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$4
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Pair<b.BackgroundModifier, g> invoke(Pair<? extends b.BackgroundModifier, ? extends g> pair, g.b bVar) {
                    return bVar instanceof b.BackgroundModifier ? qjd.a(bVar, pair.d()) : qjd.a(pair.c(), ((g) pair.d()).a(bVar));
                }
            }) : qjd.a((Object) null, modifier2);
            b.BackgroundModifier backgroundModifier2 = (b.BackgroundModifier) pairA2.a();
            g gVar2 = (g) pairA2.b();
            if (backgroundModifier2 != null) {
                rp3Var.b(gVar2);
            }
        }
        if (!rp3Var.getModifier().any(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$shouldWrapTargetInABox$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(g.b bVar) {
                return Boolean.valueOf((bVar instanceof b.BackgroundModifier) || (z && Build.VERSION.SDK_INT <= 30) || ((bVar instanceof ActionModifier) && !NormalizeCompositionTreeKt.h(rp3Var)));
            }
        })) {
            return rp3Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        g modifier3 = rp3Var.getModifier();
        Pair pairA3 = modifier3.any(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$5
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(g.b bVar) {
                return Boolean.valueOf(bVar instanceof b);
            }
        }) ? (Pair) modifier3.foldIn(qjd.a((Object) null, g.INSTANCE), new Function2<Pair<? extends b, ? extends g>, g.b, Pair<? extends b, ? extends g>>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$6
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pair<b, g> invoke(Pair<? extends b, ? extends g> pair, g.b bVar) {
                return bVar instanceof b ? qjd.a(bVar, pair.d()) : qjd.a(pair.c(), ((g) pair.d()).a(bVar));
            }
        }) : qjd.a((Object) null, modifier3);
        b bVar = (b) pairA3.a();
        g gVar3 = (g) pairA3.b();
        if (bVar == null) {
            emittableImage = null;
        } else if (z) {
            emittableImage = new EmittableImage();
            emittableImage.b(btb.b(g.INSTANCE));
            emittableImage.h(ImageKt.b(vx9.a));
            b.BackgroundModifier backgroundModifier3 = bVar instanceof b.BackgroundModifier ? (b.BackgroundModifier) bVar : null;
            if (backgroundModifier3 != null && (colorProvider = backgroundModifier3.getColorProvider()) != null) {
                emittableImage.f(new TintAndAlphaColorFilterParams(colorProvider));
            }
            emittableImage.g(e02.INSTANCE.b());
        } else if (bVar instanceof b.BackgroundModifier) {
            emittableImage = new EmittableImage();
            emittableImage.b(btb.b(g.INSTANCE));
            b.BackgroundModifier backgroundModifier4 = (b.BackgroundModifier) bVar;
            emittableImage.h(backgroundModifier4.getImageProvider());
            emittableImage.g(backgroundModifier4.getContentScale());
            gi1 colorFilter = backgroundModifier4.getColorFilter();
            emittableImage.f(colorFilter != null ? colorFilter.getColorFilterParams() : null);
        } else {
            if (bVar instanceof b.BackgroundModifier) {
                arrayList2.add(bVar);
            }
            emittableImage = null;
        }
        o(gVar3);
        Pair pairA4 = gVar3.any(new Function1<g.b, Boolean>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$7
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(g.b bVar2) {
                return Boolean.valueOf(bVar2 instanceof ActionModifier);
            }
        }) ? (Pair) gVar3.foldIn(qjd.a((Object) null, g.INSTANCE), new Function2<Pair<? extends ActionModifier, ? extends g>, g.b, Pair<? extends ActionModifier, ? extends g>>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$extractModifier$8
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pair<ActionModifier, g> invoke(Pair<? extends ActionModifier, ? extends g> pair, g.b bVar2) {
                return bVar2 instanceof ActionModifier ? qjd.a(bVar2, pair.d()) : qjd.a(pair.c(), ((g) pair.d()).a(bVar2));
            }
        }) : qjd.a((Object) null, gVar3);
        ActionModifier actionModifier = (ActionModifier) pairA4.a();
        g gVar4 = (g) pairA4.b();
        arrayList.add(actionModifier);
        if (actionModifier == null || h(rp3Var)) {
            emittableImage2 = null;
        } else {
            int rippleOverride = actionModifier.getRippleOverride();
            if (rippleOverride != 0) {
                ko5VarB = ImageKt.b(rippleOverride);
            } else {
                ko5VarB = z ? ImageKt.b(vx9.b) : ImageKt.b(vx9.c);
            }
            emittableImage2 = new EmittableImage();
            emittableImage2.b(btb.b(g.INSTANCE));
            emittableImage2.h(ko5VarB);
        }
        ExtractedSizeModifiers extractedSizeModifiersG = g(gVar4);
        g sizeModifiers = extractedSizeModifiersG.getSizeModifiers();
        g nonSizeModifiers = extractedSizeModifiersG.getNonSizeModifiers();
        arrayList.add(sizeModifiers);
        arrayList2.add(btb.b(nonSizeModifiers));
        if (rp3Var instanceof EmittableButton) {
            g.Companion companion = g.INSTANCE;
            EmittableButton emittableButton = (EmittableButton) rp3Var;
            arrayList.add(ny.a(companion, emittableButton.getEnabled()));
            rp3Var = c.a(emittableButton);
            if (rp3Var.getModifier().foldIn(null, new Function2<PaddingModifier, g.b, PaddingModifier>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$transformBackgroundImageAndActionRipple$$inlined$findModifier$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaddingModifier invoke(PaddingModifier paddingModifier, g.b bVar2) {
                    return bVar2 instanceof PaddingModifier ? bVar2 : paddingModifier;
                }
            }) == null) {
                arrayList2.add(mx8.b(companion, ff3.i(16), ff3.i(8)));
            }
        }
        EmittableBox emittableBox = new EmittableBox();
        emittableBox.b(e(arrayList));
        rp3Var.b(e(arrayList2));
        if (z) {
            emittableBox.i(Alignment.INSTANCE.a());
        }
        kq3.b(emittableBox, emittableImage);
        kq3.a(emittableBox, rp3Var);
        kq3.b(emittableBox, emittableImage2);
        return emittableBox;
    }

    private static final void m(jq3 jq3Var, Function1<? super rp3, ? extends rp3> function1) {
        int i = 0;
        for (Object obj : jq3Var.d()) {
            int i2 = i + 1;
            if (i < 0) {
                m.z();
            }
            rp3 rp3Var = (rp3) function1.invoke((rp3) obj);
            jq3Var.d().set(i, rp3Var);
            if (rp3Var instanceof jq3) {
                m((jq3) rp3Var, function1);
            }
            i = i2;
        }
    }

    public static final Map<String, List<LambdaAction>> n(jq3 jq3Var) {
        List<rp3> listD = jq3Var.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : listD) {
            int i2 = i + 1;
            if (i < 0) {
                m.z();
            }
            rp3 rp3Var = (rp3) obj;
            Pair<LambdaAction, g> pairF = f(rp3Var.getModifier());
            LambdaAction lambdaAction = (LambdaAction) pairF.a();
            g gVar = (g) pairF.b();
            if (lambdaAction != null && !(rp3Var instanceof EmittableSizeBox) && !(rp3Var instanceof yp3)) {
                String str = lambdaAction.getKey() + '+' + i;
                LambdaAction lambdaAction2 = new LambdaAction(str, lambdaAction.c());
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(lambdaAction2);
                rp3Var.b(gVar.a(new ActionModifier(lambdaAction2, 0, 2, null)));
            }
            if (rp3Var instanceof jq3) {
                for (Map.Entry<String, List<LambdaAction>> entry : n((jq3) rp3Var).entrySet()) {
                    String key = entry.getKey();
                    List<LambdaAction> value = entry.getValue();
                    Object arrayList2 = linkedHashMap.get(key);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(key, arrayList2);
                    }
                    ((List) arrayList2).addAll(value);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    private static final void o(g gVar) {
        ((Number) gVar.foldIn(0, new Function2<Integer, g.b, Integer>() { // from class: androidx.glance.appwidget.NormalizeCompositionTreeKt$warnIfMultipleClickableActions$actionCount$1
            public final Integer a(int i2, g.b bVar) {
                if (bVar instanceof ActionModifier) {
                    i2++;
                }
                return Integer.valueOf(i2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), (g.b) obj2);
            }
        })).intValue();
    }
}
