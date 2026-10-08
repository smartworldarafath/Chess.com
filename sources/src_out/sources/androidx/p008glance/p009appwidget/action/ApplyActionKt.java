package androidx.p008glance.p009appwidget.action;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.android.qjd;
import com.google.inputmethod.LambdaAction;
import com.google.inputmethod.TranslationContext;
import com.google.inputmethod.d9d;
import com.google.inputmethod.e6c;
import com.google.inputmethod.f48;
import com.google.inputmethod.f6c;
import com.google.inputmethod.g6c;
import com.google.inputmethod.h6c;
import com.google.inputmethod.l7;
import com.google.inputmethod.ms1;
import com.google.inputmethod.nx0;
import com.google.inputmethod.r5c;
import com.google.inputmethod.s5c;
import com.google.inputmethod.t5c;
import com.google.inputmethod.u5c;
import com.google.inputmethod.ufb;
import com.google.inputmethod.um6;
import com.google.inputmethod.v7;
import com.google.inputmethod.vfb;
import com.google.inputmethod.w7;
import com.google.inputmethod.wfb;
import com.google.inputmethod.xfb;
import com.google.inputmethod.yfb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010 \u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/google/android/bgd;", "translationContext", "Landroid/widget/RemoteViews;", "rv", "Lcom/google/android/l7;", "action", "", "viewId", "", "a", "(Lcom/google/android/bgd;Landroid/widget/RemoteViews;Lcom/google/android/l7;I)V", "Lkotlin/Function1;", "Lcom/google/android/v7;", "editParams", "mutability", "Landroid/app/PendingIntent;", "f", "(Lcom/google/android/l7;Lcom/google/android/bgd;ILkotlin/jvm/functions/Function1;I)Landroid/app/PendingIntent;", "Landroid/content/Intent;", "d", "(Lcom/google/android/l7;Lcom/google/android/bgd;ILkotlin/jvm/functions/Function1;)Landroid/content/Intent;", "Lcom/google/android/ms1;", "b", "(Lcom/google/android/ms1;)Lkotlin/jvm/functions/Function1;", "Lcom/google/android/ufb;", "c", "(Lcom/google/android/ufb;Lcom/google/android/bgd;)Landroid/content/Intent;", "Lcom/google/android/e6c;", "h", "(Lcom/google/android/e6c;Lcom/google/android/bgd;)Landroid/content/Intent;", "Lcom/google/android/r5c;", "params", "i", "(Lcom/google/android/r5c;Lcom/google/android/bgd;Lcom/google/android/v7;)Landroid/content/Intent;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ApplyActionKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(TranslationContext translationContext, RemoteViews remoteViews, l7 l7Var, int i) {
        Object actionTargetId = translationContext.getActionTargetId();
        if (actionTargetId != 0) {
            i = actionTargetId.intValue();
        }
        int i2 = i;
        try {
            try {
                if (translationContext.getIsLazyCollectionDescendant()) {
                    Intent intentE = e(l7Var, translationContext, i2, null, 8, null);
                    if (!(l7Var instanceof ms1) || Build.VERSION.SDK_INT < 31) {
                        remoteViews.setOnClickFillInIntent(i2, intentE);
                        return;
                    } else {
                        b.a.b(remoteViews, i2, intentE);
                        return;
                    }
                }
                PendingIntent pendingIntentG = g(l7Var, translationContext, i2, null, 0, 24, null);
                if (!(l7Var instanceof ms1) || Build.VERSION.SDK_INT < 31) {
                    remoteViews.setOnClickPendingIntent(i2, pendingIntentG);
                } else {
                    b.a.a(remoteViews, i2, pendingIntentG);
                }
            } catch (Throwable unused) {
                Objects.toString(actionTargetId);
            }
        } catch (Throwable unused2) {
            actionTargetId = l7Var;
        }
    }

    private static final Function1<v7, v7> b(final ms1 ms1Var) {
        return new Function1<v7, v7>() { // from class: androidx.glance.appwidget.action.ApplyActionKt$getActionParameters$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v7 invoke(v7 v7Var) {
                if (Build.VERSION.SDK_INT >= 31) {
                    return v7Var;
                }
                f48 f48VarC = w7.c(v7Var);
                f48VarC.d(d9d.a(), Boolean.valueOf(!ms1Var.c()));
                return f48VarC;
            }
        };
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Intent c(ufb ufbVar, TranslationContext translationContext) throws NoWhenBranchMatchedException {
        if (ufbVar instanceof xfb) {
            return new Intent().setComponent(((xfb) ufbVar).c());
        }
        if (ufbVar instanceof wfb) {
            return new Intent(translationContext.getContext(), ((wfb) ufbVar).c());
        }
        if (ufbVar instanceof yfb) {
            return ((yfb) ufbVar).c();
        }
        if (!(ufbVar instanceof vfb)) {
            throw new NoWhenBranchMatchedException();
        }
        vfb vfbVar = (vfb) ufbVar;
        return new Intent(vfbVar.c()).setComponent(vfbVar.d());
    }

    private static final Intent d(l7 l7Var, TranslationContext translationContext, int i, Function1<? super v7, ? extends v7> function1) {
        if (l7Var instanceof r5c) {
            r5c r5cVar = (r5c) l7Var;
            Intent intentI = i(r5cVar, translationContext, (v7) function1.invoke(r5cVar.getParameters()));
            if (intentI.getData() == null) {
                intentI.setData(ActionTrampolineKt.e(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            return intentI;
        }
        if (l7Var instanceof e6c) {
            e6c e6cVar = (e6c) l7Var;
            return ActionTrampolineKt.c(h(e6cVar, translationContext), translationContext, i, e6cVar.b() ? ActionTrampolineType.FOREGROUND_SERVICE : ActionTrampolineType.SERVICE, null, 8, null);
        }
        if (l7Var instanceof ufb) {
            return ActionTrampolineKt.c(c((ufb) l7Var, translationContext), translationContext, i, ActionTrampolineType.BROADCAST, null, 8, null);
        }
        if (l7Var instanceof d) {
            d dVar = (d) l7Var;
            return ActionTrampolineKt.c(ActionCallbackBroadcastReceiver.INSTANCE.a(translationContext.getContext(), dVar.c(), translationContext.getAppWidgetId(), (v7) function1.invoke(dVar.getParameters())), translationContext, i, ActionTrampolineType.BROADCAST, null, 8, null);
        }
        if (l7Var instanceof LambdaAction) {
            if (translationContext.getActionBroadcastReceiver() != null) {
                return ActionTrampolineKt.c(um6.a.a(translationContext.getActionBroadcastReceiver(), ((LambdaAction) l7Var).getKey(), translationContext.getAppWidgetId()), translationContext, i, ActionTrampolineType.BROADCAST, null, 8, null);
            }
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        if (l7Var instanceof ms1) {
            ms1 ms1Var = (ms1) l7Var;
            return d(ms1Var.d(), translationContext, i, b(ms1Var));
        }
        throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + l7Var).toString());
    }

    static /* synthetic */ Intent e(l7 l7Var, TranslationContext translationContext, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = new Function1<v7, v7>() { // from class: androidx.glance.appwidget.action.ApplyActionKt$getFillInIntentForAction$1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final v7 invoke(v7 v7Var) {
                    return v7Var;
                }
            };
        }
        return d(l7Var, translationContext, i, function1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final PendingIntent f(l7 l7Var, TranslationContext translationContext, int i, Function1<? super v7, ? extends v7> function1, int i2) throws NoWhenBranchMatchedException {
        if (l7Var instanceof r5c) {
            r5c r5cVar = (r5c) l7Var;
            v7 v7Var = (v7) function1.invoke(r5cVar.getParameters());
            Context context = translationContext.getContext();
            Intent intentI = i(r5cVar, translationContext, v7Var);
            if (intentI.getData() == null) {
                intentI.setData(ActionTrampolineKt.e(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            Unit unit = Unit.a;
            return PendingIntent.getActivity(context, 0, intentI, i2 | 134217728, r5cVar.getActivityOptions());
        }
        if (l7Var instanceof e6c) {
            e6c e6cVar = (e6c) l7Var;
            Intent intentH = h(e6cVar, translationContext);
            if (intentH.getData() == null) {
                intentH.setData(ActionTrampolineKt.e(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            return e6cVar.b() ? a.a.a(translationContext.getContext(), intentH) : PendingIntent.getService(translationContext.getContext(), 0, intentH, i2 | 134217728);
        }
        if (l7Var instanceof ufb) {
            Context context2 = translationContext.getContext();
            Intent intentC = c((ufb) l7Var, translationContext);
            if (intentC.getData() == null) {
                intentC.setData(ActionTrampolineKt.e(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            Unit unit2 = Unit.a;
            return PendingIntent.getBroadcast(context2, 0, intentC, i2 | 134217728);
        }
        if (l7Var instanceof d) {
            Context context3 = translationContext.getContext();
            d dVar = (d) l7Var;
            Intent intentA = ActionCallbackBroadcastReceiver.INSTANCE.a(translationContext.getContext(), dVar.c(), translationContext.getAppWidgetId(), (v7) function1.invoke(dVar.getParameters()));
            intentA.setData(ActionTrampolineKt.e(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            Unit unit3 = Unit.a;
            return PendingIntent.getBroadcast(context3, 0, intentA, i2 | 134217728);
        }
        if (l7Var instanceof LambdaAction) {
            if (translationContext.getActionBroadcastReceiver() == null) {
                throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            }
            Context context4 = translationContext.getContext();
            LambdaAction lambdaAction = (LambdaAction) l7Var;
            Intent intentA2 = um6.a.a(translationContext.getActionBroadcastReceiver(), lambdaAction.getKey(), translationContext.getAppWidgetId());
            intentA2.setData(ActionTrampolineKt.d(translationContext, i, ActionTrampolineType.CALLBACK, lambdaAction.getKey()));
            Unit unit4 = Unit.a;
            return PendingIntent.getBroadcast(context4, 0, intentA2, i2 | 134217728);
        }
        if (!(l7Var instanceof ms1)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + l7Var).toString());
        }
        ms1 ms1Var = (ms1) l7Var;
        l7 l7VarD = ms1Var.d();
        Function1<v7, v7> function1B = b(ms1Var);
        if (Build.VERSION.SDK_INT >= 31 && !(ms1Var.d() instanceof LambdaAction)) {
            i2 = 33554432;
        }
        return f(l7VarD, translationContext, i, function1B, i2);
    }

    static /* synthetic */ PendingIntent g(l7 l7Var, TranslationContext translationContext, int i, Function1 function1, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            function1 = new Function1<v7, v7>() { // from class: androidx.glance.appwidget.action.ApplyActionKt$getPendingIntentForAction$1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final v7 invoke(v7 v7Var) {
                    return v7Var;
                }
            };
        }
        if ((i3 & 16) != 0) {
            i2 = 67108864;
        }
        return f(l7Var, translationContext, i, function1, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Intent h(e6c e6cVar, TranslationContext translationContext) throws NoWhenBranchMatchedException {
        if (e6cVar instanceof g6c) {
            return new Intent().setComponent(((g6c) e6cVar).c());
        }
        if (e6cVar instanceof f6c) {
            return new Intent(translationContext.getContext(), ((f6c) e6cVar).c());
        }
        if (e6cVar instanceof h6c) {
            return ((h6c) e6cVar).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Intent i(r5c r5cVar, TranslationContext translationContext, v7 v7Var) {
        Intent intent;
        if (r5cVar instanceof t5c) {
            intent = new Intent().setComponent(((t5c) r5cVar).c());
        } else if (r5cVar instanceof s5c) {
            intent = new Intent(translationContext.getContext(), ((s5c) r5cVar).c());
        } else {
            if (!(r5cVar instanceof u5c)) {
                throw new IllegalStateException(("Action type not defined in app widget package: " + r5cVar).toString());
            }
            intent = ((u5c) r5cVar).getIntent();
        }
        Map<v7.a<? extends Object>, Object> mapA = v7Var.a();
        ArrayList arrayList = new ArrayList(mapA.size());
        for (Map.Entry<v7.a<? extends Object>, Object> entry : mapA.entrySet()) {
            arrayList.add(qjd.a(entry.getKey().getName(), entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        intent.putExtras(nx0.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return intent;
    }
}
