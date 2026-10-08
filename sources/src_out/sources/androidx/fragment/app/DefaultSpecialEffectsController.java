package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.DefaultSpecialEffectsController;
import com.google.android.qjd;
import com.google.inputmethod.BackEventCompat;
import com.google.inputmethod.b10;
import com.google.inputmethod.hs8;
import com.google.inputmethod.k7e;
import com.google.inputmethod.p41;
import com.google.inputmethod.xlb;
import com.google.inputmethod.z7e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\b%&'#()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006,"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "", "K", "(Ljava/util/List;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "animationInfos", "F", "Landroidx/fragment/app/DefaultSpecialEffectsController$g;", "transitionInfos", "", "isPop", "firstOut", "lastIn", "H", "(Ljava/util/List;ZLandroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "Lcom/google/android/b10;", "", "Landroid/view/View;", "", "names", "J", "(Lcom/google/android/b10;Ljava/util/Collection;)V", "", "namedViews", "view", "I", "(Ljava/util/Map;Landroid/view/View;)V", "d", "(Ljava/util/List;Z)V", "a", "b", "c", "e", "f", "TransitionEffect", "g", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0019\u0010TR\u001d\u0010\\\u001a\u00020U8\u0006¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010S\u001a\u0004\bb\u0010T\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010TR\u0011\u0010i\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bh\u0010T¨\u0006j"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$b;", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$g;", "transitionInfos", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "firstOut", "lastIn", "Landroidx/fragment/app/y;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Lcom/google/android/b10;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/y;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/google/android/b10;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/google/android/b10;Lcom/google/android/b10;Z)V", "Landroid/view/ViewGroup;", "container", "Lkotlin/Pair;", "o", "(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;)Lkotlin/Pair;", "enteringViews", "Lkotlin/Function0;", "", "executeTransition", "B", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "transitioningViews", "view", "n", "(Ljava/util/ArrayList;Landroid/view/View;)V", "f", "(Landroid/view/ViewGroup;)V", "Lcom/google/android/tc0;", "backEvent", "e", "(Lcom/google/android/tc0;Landroid/view/ViewGroup;)V", "d", "c", "Ljava/util/List;", "w", "()Ljava/util/List;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "t", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "u", "g", "Landroidx/fragment/app/y;", "v", "()Landroidx/fragment/app/y;", "h", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "i", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "j", "getSharedElementLastInViews", "k", "Lcom/google/android/b10;", "getSharedElementNameMapping", "()Lcom/google/android/b10;", "l", "getEnteringNames", "m", "getExitingNames", "getFirstOutViews", "getLastInViews", "p", "Z", "()Z", "Lcom/google/android/p41;", "q", "Lcom/google/android/p41;", "getTransitionSignal", "()Lcom/google/android/p41;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "s", "C", "(Ljava/lang/Object;)V", "controller", "getNoControllerReturned", "D", "(Z)V", "noControllerReturned", "b", "isSeekingSupported", "x", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class TransitionEffect extends SpecialEffectsController.b {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<g> transitionInfos;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final SpecialEffectsController.Operation firstOut;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final SpecialEffectsController.Operation lastIn;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final y transitionImpl;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Object sharedElementTransition;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final ArrayList<View> sharedElementFirstOutViews;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final ArrayList<View> sharedElementLastInViews;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final b10<String, String> sharedElementNameMapping;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final ArrayList<String> enteringNames;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final ArrayList<String> exitingNames;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final b10<String, View> firstOutViews;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final b10<String, View> lastInViews;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final boolean isPop;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final p41 transitionSignal;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private Object controller;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private boolean noControllerReturned;

        public TransitionEffect(List<g> list, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, y yVar, Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2, b10<String, String> b10Var, ArrayList<String> arrayList3, ArrayList<String> arrayList4, b10<String, View> b10Var2, b10<String, View> b10Var3, boolean z) {
            Intrinsics.checkNotNullParameter(list, "transitionInfos");
            Intrinsics.checkNotNullParameter(yVar, "transitionImpl");
            Intrinsics.checkNotNullParameter(arrayList, "sharedElementFirstOutViews");
            Intrinsics.checkNotNullParameter(arrayList2, "sharedElementLastInViews");
            Intrinsics.checkNotNullParameter(b10Var, "sharedElementNameMapping");
            Intrinsics.checkNotNullParameter(arrayList3, "enteringNames");
            Intrinsics.checkNotNullParameter(arrayList4, "exitingNames");
            Intrinsics.checkNotNullParameter(b10Var2, "firstOutViews");
            Intrinsics.checkNotNullParameter(b10Var3, "lastInViews");
            this.transitionInfos = list;
            this.firstOut = operation;
            this.lastIn = operation2;
            this.transitionImpl = yVar;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = arrayList;
            this.sharedElementLastInViews = arrayList2;
            this.sharedElementNameMapping = b10Var;
            this.enteringNames = arrayList3;
            this.exitingNames = arrayList4;
            this.firstOutViews = b10Var2;
            this.lastInViews = b10Var3;
            this.isPop = z;
            this.transitionSignal = new p41();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(SpecialEffectsController.Operation operation, TransitionEffect transitionEffect) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(transitionEffect, "this$0");
            if (FragmentManager.R0(2)) {
                Objects.toString(operation);
            }
            operation.e(transitionEffect);
        }

        private final void B(ArrayList<View> enteringViews, ViewGroup container, Function0<Unit> executeTransition) {
            w.e(enteringViews, 4);
            ArrayList<String> arrayListQ = this.transitionImpl.q(this.sharedElementLastInViews);
            if (FragmentManager.R0(2)) {
                for (View view : this.sharedElementFirstOutViews) {
                    Intrinsics.checkNotNullExpressionValue(view, "sharedElementFirstOutViews");
                    View view2 = view;
                    Objects.toString(view2);
                    k7e.H(view2);
                }
                for (View view3 : this.sharedElementLastInViews) {
                    Intrinsics.checkNotNullExpressionValue(view3, "sharedElementLastInViews");
                    View view4 = view3;
                    Objects.toString(view4);
                    k7e.H(view4);
                }
            }
            executeTransition.invoke();
            this.transitionImpl.y(container, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListQ, this.sharedElementNameMapping);
            w.e(enteringViews, 0);
            this.transitionImpl.A(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        private final void n(ArrayList<View> transitioningViews, View view) {
            if (!(view instanceof ViewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (z7e.c(viewGroup)) {
                if (transitioningViews.contains(view)) {
                    return;
                }
                transitioningViews.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(childAt, "child");
                    n(transitioningViews, childAt);
                }
            }
        }

        private final Pair<ArrayList<View>, Object> o(ViewGroup container, final SpecialEffectsController.Operation lastIn, final SpecialEffectsController.Operation firstOut) {
            lastIn = lastIn;
            View view = new View(container.getContext());
            final Rect rect = new Rect();
            Iterator<g> it = this.transitionInfos.iterator();
            boolean z = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().g() && firstOut != null && lastIn != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    w.a(lastIn.getFragment(), firstOut.getFragment(), this.isPop, this.firstOutViews, true);
                    hs8.a(container, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.p(lastIn, firstOut, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.v(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final y yVar = this.transitionImpl;
                            hs8.a(container, new Runnable() { // from class: androidx.fragment.app.g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.q(yVar, view3, rect);
                                }
                            });
                            z = true;
                        }
                    }
                    this.transitionImpl.z(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    y yVar2 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    yVar2.s(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<g> it2 = this.transitionInfos.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                g next = it2.next();
                SpecialEffectsController.Operation operation = next.getOperation();
                Object objH = this.transitionImpl.h(next.getTransition());
                if (objH != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    boolean z2 = z;
                    View view4 = operation.getFragment().mView;
                    Iterator<g> it3 = it2;
                    Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation == firstOut || operation == lastIn)) {
                        if (operation == firstOut) {
                            arrayList2.removeAll(kotlin.collections.m.D1(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(kotlin.collections.m.D1(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.a(objH, view);
                    } else {
                        this.transitionImpl.b(objH, arrayList2);
                        this.transitionImpl.s(objH, objH, arrayList2, null, null, null, null);
                        if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation.q(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation.getFragment().mView);
                            this.transitionImpl.r(objH, operation.getFragment().mView, arrayList3);
                            hs8.a(container, new Runnable() { // from class: androidx.fragment.app.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z2) {
                            this.transitionImpl.u(objH, rect);
                        }
                        if (FragmentManager.R0(2)) {
                            objH.toString();
                            for (View view5 : arrayList2) {
                                Intrinsics.checkNotNullExpressionValue(view5, "transitioningViews");
                                Objects.toString(view5);
                            }
                        }
                    } else {
                        this.transitionImpl.v(objH, view2);
                        if (FragmentManager.R0(2)) {
                            objH.toString();
                            for (View view6 : arrayList2) {
                                Intrinsics.checkNotNullExpressionValue(view6, "transitioningViews");
                                Objects.toString(view6);
                            }
                        }
                    }
                    if (next.getIsOverlapAllowed()) {
                        objP = this.transitionImpl.p(objP, objH, null);
                    } else {
                        objP2 = this.transitionImpl.p(objP2, objH, null);
                    }
                    z = z2;
                    it2 = it3;
                }
            }
            Object objO = this.transitionImpl.o(objP, objP2, this.sharedElementTransition);
            if (FragmentManager.R0(2)) {
                Objects.toString(objO);
                container.toString();
            }
            return new Pair<>(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect transitionEffect) {
            Intrinsics.checkNotNullParameter(transitionEffect, "this$0");
            w.a(operation.getFragment(), operation2.getFragment(), transitionEffect.isPop, transitionEffect.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(y yVar, View view, Rect rect) {
            Intrinsics.checkNotNullParameter(yVar, "$impl");
            Intrinsics.checkNotNullParameter(rect, "$lastInEpicenterRect");
            yVar.k(view, rect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "$transitioningViews");
            w.e(arrayList, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(SpecialEffectsController.Operation operation, TransitionEffect transitionEffect) {
            Intrinsics.checkNotNullParameter(operation, "$operation");
            Intrinsics.checkNotNullParameter(transitionEffect, "this$0");
            if (FragmentManager.R0(2)) {
                Objects.toString(operation);
            }
            operation.e(transitionEffect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(Ref.ObjectRef objectRef) {
            Intrinsics.checkNotNullParameter(objectRef, "$seekCancelLambda");
            Function0 function0 = (Function0) objectRef.element;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void C(Object obj) {
            this.controller = obj;
        }

        public final void D(boolean z) {
            this.noControllerReturned = z;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.b
        /* JADX INFO: renamed from: b */
        public boolean getIsSeekingSupported() {
            if (!this.transitionImpl.m()) {
                return false;
            }
            List<g> list = this.transitionInfos;
            if (list == null || !list.isEmpty()) {
                for (g gVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || gVar.getTransition() == null || !this.transitionImpl.n(gVar.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.n(obj);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.b
        public void c(ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.transitionSignal.a();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.b
        public void d(final ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut() || this.noControllerReturned) {
                for (g gVar : this.transitionInfos) {
                    SpecialEffectsController.Operation operation = gVar.getOperation();
                    if (FragmentManager.R0(2)) {
                        if (this.noControllerReturned) {
                            Objects.toString(operation);
                        } else {
                            container.toString();
                            Objects.toString(operation);
                        }
                    }
                    gVar.getOperation().e(this);
                }
                this.noControllerReturned = false;
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                y yVar = this.transitionImpl;
                Intrinsics.g(obj);
                yVar.c(obj);
                if (FragmentManager.R0(2)) {
                    Objects.toString(this.firstOut);
                    Objects.toString(this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> pairO = o(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayList = (ArrayList) pairO.a();
            final Object objB = pairO.b();
            List<g> list = this.transitionInfos;
            ArrayList<SpecialEffectsController.Operation> arrayList2 = new ArrayList(kotlin.collections.m.A(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g) it.next()).getOperation());
            }
            for (final SpecialEffectsController.Operation operation2 : arrayList2) {
                this.transitionImpl.w(operation2.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.TransitionEffect.y(operation2, this);
                    }
                });
            }
            B(arrayList, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m152invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m152invoke() {
                    this.this$0.getTransitionImpl().e(container, objB);
                }
            });
            if (FragmentManager.R0(2)) {
                Objects.toString(this.firstOut);
                Objects.toString(this.lastIn);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.b
        public void e(BackEventCompat backEvent, ViewGroup container) {
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            Intrinsics.checkNotNullParameter(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.t(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.b
        public void f(final ViewGroup container) {
            Intrinsics.checkNotNullParameter(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((g) it.next()).getOperation();
                    if (FragmentManager.R0(2)) {
                        container.toString();
                        Objects.toString(operation);
                    }
                }
                return;
            }
            if (x() && this.sharedElementTransition != null && !getIsSeekingSupported()) {
                Objects.toString(this.sharedElementTransition);
                Objects.toString(this.firstOut);
                Objects.toString(this.lastIn);
            }
            if (getIsSeekingSupported() && x()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Pair<ArrayList<View>, Object> pairO = o(container, this.lastIn, this.firstOut);
                ArrayList<View> arrayList = (ArrayList) pairO.a();
                final Object objB = pairO.b();
                List<g> list = this.transitionInfos;
                ArrayList<SpecialEffectsController.Operation> arrayList2 = new ArrayList(kotlin.collections.m.A(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((g) it2.next()).getOperation());
                }
                for (final SpecialEffectsController.Operation operation2 : arrayList2) {
                    this.transitionImpl.x(operation2.getFragment(), objB, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.z(objectRef);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.A(operation2, this);
                        }
                    });
                }
                B(arrayList, container, new Function0<Unit>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4

                    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                        final /* synthetic */ ViewGroup $container;
                        final /* synthetic */ Object $mergedTransition;
                        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
                            super(0);
                            this.this$0 = transitionEffect;
                            this.$mergedTransition = obj;
                            this.$container = viewGroup;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void c(DefaultSpecialEffectsController.TransitionEffect transitionEffect, ViewGroup viewGroup) {
                            Intrinsics.checkNotNullParameter(transitionEffect, "this$0");
                            Intrinsics.checkNotNullParameter(viewGroup, "$container");
                            Iterator<T> it = transitionEffect.w().iterator();
                            while (it.hasNext()) {
                                SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.g) it.next()).getOperation();
                                View view = operation.getFragment().getView();
                                if (view != null) {
                                    operation.getFinalState().c(view, viewGroup);
                                }
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void d(DefaultSpecialEffectsController.TransitionEffect transitionEffect) {
                            Intrinsics.checkNotNullParameter(transitionEffect, "this$0");
                            FragmentManager.R0(2);
                            Iterator<T> it = transitionEffect.w().iterator();
                            while (it.hasNext()) {
                                ((DefaultSpecialEffectsController.g) it.next()).getOperation().e(transitionEffect);
                            }
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m154invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m154invoke() {
                            List<DefaultSpecialEffectsController.g> listW = this.this$0.w();
                            if (listW == null || !listW.isEmpty()) {
                                Iterator<T> it = listW.iterator();
                                while (it.hasNext()) {
                                    if (!((DefaultSpecialEffectsController.g) it.next()).getOperation().getIsSeeking()) {
                                        FragmentManager.R0(2);
                                        p41 p41Var = new p41();
                                        y transitionImpl = this.this$0.getTransitionImpl();
                                        Fragment fragment = this.this$0.w().get(0).getOperation().getFragment();
                                        Object obj = this.$mergedTransition;
                                        final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                                        transitionImpl.w(fragment, obj, p41Var, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0056: INVOKE 
                                              (r1v2 'transitionImpl' androidx.fragment.app.y)
                                              (r2v10 'fragment' androidx.fragment.app.Fragment)
                                              (r3v1 'obj' java.lang.Object)
                                              (r0v3 'p41Var' com.google.android.p41)
                                              (wrap java.lang.Runnable:0x0053: CONSTRUCTOR (r4v0 'transitionEffect' androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect A[DONT_INLINE]) A[MD:(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void (m), WRAPPED] call: androidx.fragment.app.j.<init>(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void type: CONSTRUCTOR)
                                             VIRTUAL call: androidx.fragment.app.y.w(androidx.fragment.app.Fragment, java.lang.Object, com.google.android.p41, java.lang.Runnable):void A[MD:(androidx.fragment.app.Fragment, java.lang.Object, com.google.android.p41, java.lang.Runnable):void (m)] in method: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1.invoke():void, file: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.fragment.app.j, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 35 more
                                            */
                                        /*
                                            this = this;
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            java.util.List r0 = r0.w()
                                            r1 = 2
                                            if (r0 == 0) goto L10
                                            boolean r2 = r0.isEmpty()
                                            if (r2 == 0) goto L10
                                            goto L5d
                                        L10:
                                            java.util.Iterator r0 = r0.iterator()
                                        L14:
                                            boolean r2 = r0.hasNext()
                                            if (r2 == 0) goto L5d
                                            java.lang.Object r2 = r0.next()
                                            androidx.fragment.app.DefaultSpecialEffectsController$g r2 = (androidx.fragment.app.DefaultSpecialEffectsController.g) r2
                                            androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                                            boolean r2 = r2.getIsSeeking()
                                            if (r2 != 0) goto L14
                                            androidx.fragment.app.FragmentManager.R0(r1)
                                            com.google.android.p41 r0 = new com.google.android.p41
                                            r0.<init>()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            androidx.fragment.app.y r1 = r1.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            java.util.List r2 = r2.w()
                                            r3 = 0
                                            java.lang.Object r2 = r2.get(r3)
                                            androidx.fragment.app.DefaultSpecialEffectsController$g r2 = (androidx.fragment.app.DefaultSpecialEffectsController.g) r2
                                            androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                                            androidx.fragment.app.Fragment r2 = r2.getFragment()
                                            java.lang.Object r3 = r6.$mergedTransition
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r4 = r6.this$0
                                            androidx.fragment.app.j r5 = new androidx.fragment.app.j
                                            r5.<init>(r4)
                                            r1.w(r2, r3, r0, r5)
                                            r0.a()
                                            return
                                        L5d:
                                            androidx.fragment.app.FragmentManager.R0(r1)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            androidx.fragment.app.y r0 = r0.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            java.lang.Object r1 = r1.getController()
                                            kotlin.jvm.internal.Intrinsics.g(r1)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            android.view.ViewGroup r3 = r6.$container
                                            androidx.fragment.app.i r4 = new androidx.fragment.app.i
                                            r4.<init>(r2, r3)
                                            r0.d(r1, r4)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass1.m154invoke():void");
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m153invoke();
                                    return Unit.a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                public final void m153invoke() {
                                    FragmentManager.R0(2);
                                    DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                                    transitionEffect.C(transitionEffect.getTransitionImpl().j(container, objB));
                                    if (this.this$0.getController() == null) {
                                        FragmentManager.R0(2);
                                        this.this$0.D(true);
                                        return;
                                    }
                                    objectRef.element = new AnonymousClass1(this.this$0, objB, container);
                                    if (FragmentManager.R0(2)) {
                                        Objects.toString(this.this$0.getFirstOut());
                                        Objects.toString(this.this$0.getLastIn());
                                    }
                                }
                            });
                        }
                    }

                    /* JADX INFO: renamed from: s, reason: from getter */
                    public final Object getController() {
                        return this.controller;
                    }

                    /* JADX INFO: renamed from: t, reason: from getter */
                    public final SpecialEffectsController.Operation getFirstOut() {
                        return this.firstOut;
                    }

                    /* JADX INFO: renamed from: u, reason: from getter */
                    public final SpecialEffectsController.Operation getLastIn() {
                        return this.lastIn;
                    }

                    /* JADX INFO: renamed from: v, reason: from getter */
                    public final y getTransitionImpl() {
                        return this.transitionImpl;
                    }

                    public final List<g> w() {
                        return this.transitionInfos;
                    }

                    public final boolean x() {
                        List<g> list = this.transitionInfos;
                        if (list != null && list.isEmpty()) {
                            return true;
                        }
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (!((g) it.next()).getOperation().getFragment().mTransitioning) {
                                return false;
                            }
                        }
                        return true;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$a;", "Landroidx/fragment/app/SpecialEffectsController$b;", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$b;)V", "Landroid/view/ViewGroup;", "container", "", "d", "(Landroid/view/ViewGroup;)V", "c", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "h", "()Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                static final class a extends SpecialEffectsController.b {

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    private final b animationInfo;

                    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$a$a, reason: collision with other inner class name */
                    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$a$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class AnimationAnimationListenerC0084a implements Animation.AnimationListener {
                        final /* synthetic */ SpecialEffectsController.Operation a;
                        final /* synthetic */ ViewGroup b;
                        final /* synthetic */ View c;
                        final /* synthetic */ a d;

                        AnimationAnimationListenerC0084a(SpecialEffectsController.Operation operation, ViewGroup viewGroup, View view, a aVar) {
                            this.a = operation;
                            this.b = viewGroup;
                            this.c = view;
                            this.d = aVar;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void b(ViewGroup viewGroup, View view, a aVar) {
                            Intrinsics.checkNotNullParameter(viewGroup, "$container");
                            Intrinsics.checkNotNullParameter(aVar, "this$0");
                            viewGroup.endViewTransition(view);
                            aVar.getAnimationInfo().getOperation().e(aVar);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            final ViewGroup viewGroup = this.b;
                            final View view = this.c;
                            final a aVar = this.d;
                            viewGroup.post(new Runnable() { // from class: androidx.fragment.app.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.a.AnimationAnimationListenerC0084a.b(viewGroup, view, aVar);
                                }
                            });
                            if (FragmentManager.R0(2)) {
                                Objects.toString(this.a);
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                            Intrinsics.checkNotNullParameter(animation, "animation");
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            Intrinsics.checkNotNullParameter(animation, "animation");
                            if (FragmentManager.R0(2)) {
                                Objects.toString(this.a);
                            }
                        }
                    }

                    public a(b bVar) {
                        Intrinsics.checkNotNullParameter(bVar, "animationInfo");
                        this.animationInfo = bVar;
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.b
                    public void c(ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
                        View view = operation.getFragment().mView;
                        view.clearAnimation();
                        container.endViewTransition(view);
                        this.animationInfo.getOperation().e(this);
                        if (FragmentManager.R0(2)) {
                            operation.toString();
                        }
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.b
                    public void d(ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        if (this.animationInfo.b()) {
                            this.animationInfo.getOperation().e(this);
                            return;
                        }
                        Context context = container.getContext();
                        SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
                        View view = operation.getFragment().mView;
                        b bVar = this.animationInfo;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        l.a aVarC = bVar.c(context);
                        if (aVarC == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        Animation animation = aVarC.a;
                        if (animation == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (operation.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                            view.startAnimation(animation);
                            this.animationInfo.getOperation().e(this);
                            return;
                        }
                        container.startViewTransition(view);
                        l.b bVar2 = new l.b(animation, container, view);
                        bVar2.setAnimationListener(new AnimationAnimationListenerC0084a(operation, container, view, this));
                        view.startAnimation(bVar2);
                        if (FragmentManager.R0(2)) {
                            operation.toString();
                        }
                    }

                    /* JADX INFO: renamed from: h, reason: from getter */
                    public final b getAnimationInfo() {
                        return this.animationInfo;
                    }
                }

                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "Landroidx/fragment/app/DefaultSpecialEffectsController$f;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/l$a;", "c", "(Landroid/content/Context;)Landroidx/fragment/app/l$a;", "b", "Z", "isAnimLoaded", "d", "Landroidx/fragment/app/l$a;", "animation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                private static final class b extends f {

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    private final boolean isPop;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    private boolean isAnimLoaded;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    private l.a animation;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(SpecialEffectsController.Operation operation, boolean z) {
                        super(operation);
                        Intrinsics.checkNotNullParameter(operation, "operation");
                        this.isPop = z;
                    }

                    public final l.a c(Context context) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        if (this.isAnimLoaded) {
                            return this.animation;
                        }
                        l.a aVarB = l.b(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
                        this.animation = aVarB;
                        this.isAnimLoaded = true;
                        return aVarB;
                    }
                }

                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$c;", "Landroidx/fragment/app/SpecialEffectsController$b;", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$b;)V", "Landroid/view/ViewGroup;", "container", "", "f", "(Landroid/view/ViewGroup;)V", "Lcom/google/android/tc0;", "backEvent", "e", "(Lcom/google/android/tc0;Landroid/view/ViewGroup;)V", "d", "c", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "h", "()Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", "b", "()Z", "isSeekingSupported", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                private static final class c extends SpecialEffectsController.b {

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    private final b animatorInfo;

                    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                    private AnimatorSet animator;

                    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$c$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class a extends AnimatorListenerAdapter {
                        final /* synthetic */ ViewGroup a;
                        final /* synthetic */ View b;
                        final /* synthetic */ boolean c;
                        final /* synthetic */ SpecialEffectsController.Operation d;
                        final /* synthetic */ c e;

                        a(ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.Operation operation, c cVar) {
                            this.a = viewGroup;
                            this.b = view;
                            this.c = z;
                            this.d = operation;
                            this.e = cVar;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator anim) {
                            Intrinsics.checkNotNullParameter(anim, "anim");
                            this.a.endViewTransition(this.b);
                            if (this.c || this.d.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                SpecialEffectsController.Operation.State finalState = this.d.getFinalState();
                                View view = this.b;
                                Intrinsics.checkNotNullExpressionValue(view, "viewToAnimate");
                                finalState.c(view, this.a);
                            }
                            this.e.getAnimatorInfo().getOperation().e(this.e);
                            if (FragmentManager.R0(2)) {
                                Objects.toString(this.d);
                            }
                        }
                    }

                    public c(b bVar) {
                        Intrinsics.checkNotNullParameter(bVar, "animatorInfo");
                        this.animatorInfo = bVar;
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.b
                    /* JADX INFO: renamed from: b */
                    public boolean getIsSeekingSupported() {
                        return true;
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.b
                    public void c(ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        AnimatorSet animatorSet = this.animator;
                        if (animatorSet == null) {
                            this.animatorInfo.getOperation().e(this);
                            return;
                        }
                        SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
                        if (operation.getIsSeeking()) {
                            e.a.a(animatorSet);
                        } else {
                            animatorSet.end();
                        }
                        if (FragmentManager.R0(2)) {
                            operation.toString();
                            operation.getIsSeeking();
                        }
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.b
                    public void d(ViewGroup container) {
                        Intrinsics.checkNotNullParameter(container, "container");
                        SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
                        AnimatorSet animatorSet = this.animator;
                        if (animatorSet == null) {
                            this.animatorInfo.getOperation().e(this);
                            return;
                        }
                        animatorSet.start();
                        if (FragmentManager.R0(2)) {
                            Objects.toString(operation);
                        }
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.b
                    public void e(BackEventCompat backEvent, ViewGroup container) {
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        Intrinsics.checkNotNullParameter(container, "container");
                        SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
                        AnimatorSet animatorSet = this.animator;
                        if (animatorSet == null) {
                            this.animatorInfo.getOperation().e(this);
                            return;
                        }
                        if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                            return;
                        }
                        if (FragmentManager.R0(2)) {
                            operation.toString();
                        }
                        long jA = d.a.a(animatorSet);
                        long progress = (long) (backEvent.getProgress() * jA);
                        if (progress == 0) {
                            progress = 1;
                        }
                        if (progress == jA) {
                            progress = jA - 1;
                        }
                        if (FragmentManager.R0(2)) {
                            animatorSet.toString();
                            operation.toString();
                        }
                        e.a.b(animatorSet, progress);
                    }

                    @Override // androidx.fragment.app.SpecialEffectsController.b
                    public void f(ViewGroup container) {
                        c cVar;
                        Intrinsics.checkNotNullParameter(container, "container");
                        if (this.animatorInfo.b()) {
                            return;
                        }
                        Context context = container.getContext();
                        b bVar = this.animatorInfo;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        l.a aVarC = bVar.c(context);
                        this.animator = aVarC != null ? aVarC.b : null;
                        SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        boolean z = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                        View view = fragment.mView;
                        container.startViewTransition(view);
                        AnimatorSet animatorSet = this.animator;
                        if (animatorSet != null) {
                            cVar = this;
                            animatorSet.addListener(new a(container, view, z, operation, cVar));
                        } else {
                            cVar = this;
                        }
                        AnimatorSet animatorSet2 = cVar.animator;
                        if (animatorSet2 != null) {
                            animatorSet2.setTarget(view);
                        }
                    }

                    /* JADX INFO: renamed from: h, reason: from getter */
                    public final b getAnimatorInfo() {
                        return this.animatorInfo;
                    }
                }

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class d {
                    public static final d a = new d();

                    private d() {
                    }

                    public final long a(AnimatorSet animatorSet) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        return animatorSet.getTotalDuration();
                    }
                }

                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class e {
                    public static final e a = new e();

                    private e() {
                    }

                    public final void a(AnimatorSet animatorSet) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        animatorSet.reverse();
                    }

                    public final void b(AnimatorSet animatorSet, long time) {
                        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
                        animatorSet.setCurrentPlayTime(time);
                    }
                }

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$f;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "a", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "b", "()Z", "isVisibilityUnchanged", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static class f {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    private final SpecialEffectsController.Operation operation;

                    public f(SpecialEffectsController.Operation operation) {
                        Intrinsics.checkNotNullParameter(operation, "operation");
                        this.operation = operation;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final SpecialEffectsController.Operation getOperation() {
                        return this.operation;
                    }

                    public final boolean b() {
                        View view = this.operation.getFragment().mView;
                        SpecialEffectsController.Operation.State stateA = view != null ? SpecialEffectsController.Operation.State.INSTANCE.a(view) : null;
                        SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
                        if (stateA == finalState) {
                            return true;
                        }
                        SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                        return (stateA == state || finalState == state) ? false : true;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$g;", "Landroidx/fragment/app/DefaultSpecialEffectsController$f;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "", "transition", "Landroidx/fragment/app/y;", "d", "(Ljava/lang/Object;)Landroidx/fragment/app/y;", "g", "()Z", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "c", "Z", "h", "isOverlapAllowed", "e", "sharedElementTransition", "()Landroidx/fragment/app/y;", "handlingImpl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                static final class g extends f {

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    private final Object transition;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    private final boolean isOverlapAllowed;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    private final Object sharedElementTransition;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(SpecialEffectsController.Operation operation, boolean z, boolean z2) {
                        Object returnTransition;
                        super(operation);
                        Intrinsics.checkNotNullParameter(operation, "operation");
                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                        SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                        if (finalState == state) {
                            Fragment fragment = operation.getFragment();
                            returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
                        } else {
                            Fragment fragment2 = operation.getFragment();
                            returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
                        }
                        this.transition = returnTransition;
                        this.isOverlapAllowed = operation.getFinalState() == state ? z ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
                        this.sharedElementTransition = z2 ? z ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
                    }

                    private final y d(Object transition) {
                        if (transition == null) {
                            return null;
                        }
                        y yVar = w.PLATFORM_IMPL;
                        if (yVar != null && yVar.g(transition)) {
                            return yVar;
                        }
                        y yVar2 = w.SUPPORT_IMPL;
                        if (yVar2 != null && yVar2.g(transition)) {
                            return yVar2;
                        }
                        throw new IllegalArgumentException("Transition " + transition + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
                    }

                    public final y c() {
                        y yVarD = d(this.transition);
                        y yVarD2 = d(this.sharedElementTransition);
                        if (yVarD == null || yVarD2 == null || yVarD == yVarD2) {
                            return yVarD == null ? yVarD2 : yVarD;
                        }
                        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final Object getSharedElementTransition() {
                        return this.sharedElementTransition;
                    }

                    /* JADX INFO: renamed from: f, reason: from getter */
                    public final Object getTransition() {
                        return this.transition;
                    }

                    public final boolean g() {
                        return this.sharedElementTransition != null;
                    }

                    /* JADX INFO: renamed from: h, reason: from getter */
                    public final boolean getIsOverlapAllowed() {
                        return this.isOverlapAllowed;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DefaultSpecialEffectsController(ViewGroup viewGroup) {
                    super(viewGroup);
                    Intrinsics.checkNotNullParameter(viewGroup, "container");
                }

                private final void F(List<b> animationInfos) {
                    ArrayList<b> arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = animationInfos.iterator();
                    while (it.hasNext()) {
                        kotlin.collections.m.G(arrayList2, ((b) it.next()).getOperation().f());
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    boolean z = false;
                    for (b bVar : animationInfos) {
                        Context context = getContainer().getContext();
                        SpecialEffectsController.Operation operation = bVar.getOperation();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        l.a aVarC = bVar.c(context);
                        if (aVarC != null) {
                            if (aVarC.b == null) {
                                arrayList.add(bVar);
                            } else {
                                Fragment fragment = operation.getFragment();
                                if (operation.f().isEmpty()) {
                                    if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                        operation.q(false);
                                    }
                                    operation.b(new c(bVar));
                                    z = true;
                                } else if (FragmentManager.R0(2)) {
                                    Objects.toString(fragment);
                                }
                            }
                        }
                    }
                    for (b bVar2 : arrayList) {
                        SpecialEffectsController.Operation operation2 = bVar2.getOperation();
                        Fragment fragment2 = operation2.getFragment();
                        if (zIsEmpty) {
                            if (!z) {
                                operation2.b(new a(bVar2));
                            } else if (FragmentManager.R0(2)) {
                                Objects.toString(fragment2);
                            }
                        } else if (FragmentManager.R0(2)) {
                            Objects.toString(fragment2);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void G(DefaultSpecialEffectsController defaultSpecialEffectsController, SpecialEffectsController.Operation operation) {
                    Intrinsics.checkNotNullParameter(defaultSpecialEffectsController, "this$0");
                    Intrinsics.checkNotNullParameter(operation, "$operation");
                    defaultSpecialEffectsController.c(operation);
                }

                private final void H(List<g> transitionInfos, boolean isPop, SpecialEffectsController.Operation firstOut, SpecialEffectsController.Operation lastIn) {
                    Object objB;
                    ArrayList arrayList;
                    Iterator it;
                    ArrayList<String> sharedElementTargetNames;
                    String strB;
                    int i;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : transitionInfos) {
                        if (!((g) obj).b()) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList<g> arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (((g) obj2).c() != null) {
                            arrayList3.add(obj2);
                        }
                    }
                    y yVar = null;
                    for (g gVar : arrayList3) {
                        y yVarC = gVar.c();
                        if (yVar != null && yVarC != yVar) {
                            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + gVar.getOperation().getFragment() + " returned Transition " + gVar.getTransition() + " which uses a different Transition type than other Fragments.").toString());
                        }
                        yVar = yVarC;
                    }
                    if (yVar == null) {
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    b10 b10Var = new b10();
                    ArrayList<String> arrayList6 = new ArrayList<>();
                    ArrayList<String> arrayList7 = new ArrayList<>();
                    b10<String, View> b10Var2 = new b10<>();
                    b10<String, View> b10Var3 = new b10<>();
                    Iterator it2 = arrayList3.iterator();
                    ArrayList<String> arrayList8 = arrayList6;
                    ArrayList<String> sharedElementSourceNames = arrayList7;
                    loop3: while (true) {
                        objB = null;
                        while (true) {
                            if (!it2.hasNext()) {
                                break loop3;
                            }
                            g gVar2 = (g) it2.next();
                            if (!gVar2.g() || firstOut == null || lastIn == null) {
                                arrayList = arrayList3;
                                it = it2;
                            } else {
                                objB = yVar.B(yVar.h(gVar2.getSharedElementTransition()));
                                sharedElementSourceNames = lastIn.getFragment().getSharedElementSourceNames();
                                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                                ArrayList<String> sharedElementSourceNames2 = firstOut.getFragment().getSharedElementSourceNames();
                                Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                                ArrayList<String> sharedElementTargetNames2 = firstOut.getFragment().getSharedElementTargetNames();
                                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                                int size = sharedElementTargetNames2.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    ArrayList arrayList9 = arrayList3;
                                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i2));
                                    if (iIndexOf != -1) {
                                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                                    }
                                    i2++;
                                    arrayList3 = arrayList9;
                                }
                                arrayList = arrayList3;
                                sharedElementTargetNames = lastIn.getFragment().getSharedElementTargetNames();
                                Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                                Pair pairA = !isPop ? qjd.a(firstOut.getFragment().getExitTransitionCallback(), lastIn.getFragment().getEnterTransitionCallback()) : qjd.a(firstOut.getFragment().getEnterTransitionCallback(), lastIn.getFragment().getExitTransitionCallback());
                                xlb xlbVar = (xlb) pairA.a();
                                xlb xlbVar2 = (xlb) pairA.b();
                                int size2 = sharedElementSourceNames.size();
                                int i3 = 0;
                                while (true) {
                                    it = it2;
                                    if (i3 >= size2) {
                                        break;
                                    }
                                    int i4 = size2;
                                    String str = sharedElementSourceNames.get(i3);
                                    Intrinsics.checkNotNullExpressionValue(str, "exitingNames[i]");
                                    String str2 = sharedElementTargetNames.get(i3);
                                    Intrinsics.checkNotNullExpressionValue(str2, "enteringNames[i]");
                                    b10Var.put(str, str2);
                                    i3++;
                                    it2 = it;
                                    size2 = i4;
                                }
                                if (FragmentManager.R0(2)) {
                                    for (String str3 : sharedElementTargetNames) {
                                    }
                                    for (String str4 : sharedElementSourceNames) {
                                    }
                                }
                                View view = firstOut.getFragment().mView;
                                Intrinsics.checkNotNullExpressionValue(view, "firstOut.fragment.mView");
                                I(b10Var2, view);
                                b10Var2.n(sharedElementSourceNames);
                                if (xlbVar != null) {
                                    if (FragmentManager.R0(2)) {
                                        firstOut.toString();
                                    }
                                    xlbVar.d(sharedElementSourceNames, b10Var2);
                                    int size3 = sharedElementSourceNames.size() - 1;
                                    if (size3 >= 0) {
                                        while (true) {
                                            int i5 = size3 - 1;
                                            String str5 = sharedElementSourceNames.get(size3);
                                            Intrinsics.checkNotNullExpressionValue(str5, "exitingNames[i]");
                                            String str6 = str5;
                                            View view2 = b10Var2.get(str6);
                                            if (view2 == null) {
                                                b10Var.remove(str6);
                                                i = i5;
                                            } else {
                                                i = i5;
                                                if (!Intrinsics.e(str6, k7e.H(view2))) {
                                                    b10Var.put(k7e.H(view2), (String) b10Var.remove(str6));
                                                }
                                            }
                                            if (i < 0) {
                                                break;
                                            } else {
                                                size3 = i;
                                            }
                                        }
                                    }
                                } else {
                                    b10Var.n(b10Var2.keySet());
                                }
                                View view3 = lastIn.getFragment().mView;
                                Intrinsics.checkNotNullExpressionValue(view3, "lastIn.fragment.mView");
                                I(b10Var3, view3);
                                b10Var3.n(sharedElementTargetNames);
                                b10Var3.n(b10Var.values());
                                if (xlbVar2 != null) {
                                    if (FragmentManager.R0(2)) {
                                        lastIn.toString();
                                    }
                                    xlbVar2.d(sharedElementTargetNames, b10Var3);
                                    int size4 = sharedElementTargetNames.size() - 1;
                                    if (size4 >= 0) {
                                        while (true) {
                                            int i6 = size4 - 1;
                                            String str7 = sharedElementTargetNames.get(size4);
                                            Intrinsics.checkNotNullExpressionValue(str7, "enteringNames[i]");
                                            String str8 = str7;
                                            View view4 = b10Var3.get(str8);
                                            if (view4 == null) {
                                                String strB2 = w.b(b10Var, str8);
                                                if (strB2 != null) {
                                                    b10Var.remove(strB2);
                                                }
                                            } else if (!Intrinsics.e(str8, k7e.H(view4)) && (strB = w.b(b10Var, str8)) != null) {
                                                b10Var.put(strB, k7e.H(view4));
                                            }
                                            if (i6 < 0) {
                                                break;
                                            } else {
                                                size4 = i6;
                                            }
                                        }
                                    }
                                } else {
                                    w.d(b10Var, b10Var3);
                                }
                                Collection<String> collectionKeySet = b10Var.keySet();
                                Intrinsics.checkNotNullExpressionValue(collectionKeySet, "sharedElementNameMapping.keys");
                                J(b10Var2, collectionKeySet);
                                Collection<String> collectionValues = b10Var.values();
                                Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                                J(b10Var3, collectionValues);
                                if (b10Var.isEmpty()) {
                                    break;
                                } else {
                                    arrayList8 = sharedElementTargetNames;
                                }
                            }
                            arrayList3 = arrayList;
                            it2 = it;
                        }
                        Objects.toString(objB);
                        firstOut.toString();
                        lastIn.toString();
                        arrayList4.clear();
                        arrayList5.clear();
                        arrayList8 = sharedElementTargetNames;
                        arrayList3 = arrayList;
                        it2 = it;
                    }
                    ArrayList arrayList10 = arrayList3;
                    if (objB == null) {
                        if (arrayList10.isEmpty()) {
                            return;
                        }
                        Iterator it3 = arrayList10.iterator();
                        while (it3.hasNext()) {
                            if (((g) it3.next()).getTransition() == null) {
                            }
                        }
                        return;
                    }
                    TransitionEffect transitionEffect = new TransitionEffect(arrayList10, firstOut, lastIn, yVar, objB, arrayList4, arrayList5, b10Var, arrayList8, sharedElementSourceNames, b10Var2, b10Var3, isPop);
                    Iterator it4 = arrayList10.iterator();
                    while (it4.hasNext()) {
                        ((g) it4.next()).getOperation().b(transitionEffect);
                    }
                }

                private final void I(Map<String, View> namedViews, View view) {
                    String strH = k7e.H(view);
                    if (strH != null) {
                        namedViews.put(strH, view);
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt.getVisibility() == 0) {
                                Intrinsics.checkNotNullExpressionValue(childAt, "child");
                                I(namedViews, childAt);
                            }
                        }
                    }
                }

                private final void J(b10<String, View> b10Var, final Collection<String> collection) {
                    Set<Map.Entry<String, View>> setEntrySet = b10Var.entrySet();
                    Intrinsics.checkNotNullExpressionValue(setEntrySet, "entries");
                    kotlin.collections.m.T(setEntrySet, new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final Boolean invoke(Map.Entry<String, View> entry) {
                            Intrinsics.checkNotNullParameter(entry, "entry");
                            return Boolean.valueOf(kotlin.collections.m.n0(collection, k7e.H(entry.getValue())));
                        }
                    });
                }

                private final void K(List<? extends SpecialEffectsController.Operation> operations) {
                    Fragment fragment = ((SpecialEffectsController.Operation) kotlin.collections.m.L0(operations)).getFragment();
                    for (SpecialEffectsController.Operation operation : operations) {
                        operation.getFragment().mAnimationInfo.c = fragment.mAnimationInfo.c;
                        operation.getFragment().mAnimationInfo.d = fragment.mAnimationInfo.d;
                        operation.getFragment().mAnimationInfo.e = fragment.mAnimationInfo.e;
                        operation.getFragment().mAnimationInfo.f = fragment.mAnimationInfo.f;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
                @Override // androidx.fragment.app.SpecialEffectsController
                public void d(List<? extends SpecialEffectsController.Operation> operations, boolean isPop) {
                    SpecialEffectsController.Operation operation;
                    Object next;
                    Intrinsics.checkNotNullParameter(operations, "operations");
                    FragmentManager.R0(2);
                    Iterator<T> it = operations.iterator();
                    while (true) {
                        operation = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
                        SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
                        View view = operation2.getFragment().mView;
                        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                        SpecialEffectsController.Operation.State stateA = companion.a(view);
                        SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                        if (stateA == state && operation2.getFinalState() != state) {
                            break;
                        }
                    }
                    SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) next;
                    ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
                    while (listIterator.hasPrevious()) {
                        SpecialEffectsController.Operation operationPrevious = listIterator.previous();
                        SpecialEffectsController.Operation operation4 = operationPrevious;
                        SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.INSTANCE;
                        View view2 = operation4.getFragment().mView;
                        Intrinsics.checkNotNullExpressionValue(view2, "operation.fragment.mView");
                        SpecialEffectsController.Operation.State stateA2 = companion2.a(view2);
                        SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
                        if (stateA2 != state2 && operation4.getFinalState() == state2) {
                            operation = operationPrevious;
                            break;
                        }
                    }
                    SpecialEffectsController.Operation operation5 = operation;
                    if (FragmentManager.R0(2)) {
                        Objects.toString(operation3);
                        Objects.toString(operation5);
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    K(operations);
                    for (final SpecialEffectsController.Operation operation6 : operations) {
                        arrayList.add(new b(operation6, isPop));
                        boolean z = false;
                        if (isPop) {
                            if (operation6 == operation3) {
                                z = true;
                            }
                        } else if (operation6 == operation5) {
                            z = true;
                        }
                        arrayList2.add(new g(operation6, isPop, z));
                        operation6.a(new Runnable() { // from class: com.google.android.nz2
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.G(this.a, operation6);
                            }
                        });
                    }
                    H(arrayList2, isPop, operation3, operation5);
                    F(arrayList);
                }
            }
