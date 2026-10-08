package androidx.p008glance.p009appwidget.action;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import com.google.inputmethod.TranslationContext;
import com.google.inputmethod.jf3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroid/content/Intent;", "Lcom/google/android/bgd;", "translationContext", "", "viewId", "Landroidx/glance/appwidget/action/ActionTrampolineType;", "type", "Landroid/os/Bundle;", "activityOptions", "b", "(Landroid/content/Intent;Lcom/google/android/bgd;ILandroidx/glance/appwidget/action/ActionTrampolineType;Landroid/os/Bundle;)Landroid/content/Intent;", "", "extraData", "Landroid/net/Uri;", "d", "(Lcom/google/android/bgd;ILandroidx/glance/appwidget/action/ActionTrampolineType;Ljava/lang/String;)Landroid/net/Uri;", "Landroid/app/Activity;", "intent", "", "f", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Lkotlin/Function0;", "block", "a", "(Lkotlin/jvm/functions/Function0;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActionTrampolineKt {
    public static final void a(Function0<Unit> function0) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? e.a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        function0.invoke();
        StrictMode.setVmPolicy(vmPolicy);
    }

    public static final Intent b(Intent intent, TranslationContext translationContext, int i, ActionTrampolineType actionTrampolineType, Bundle bundle) {
        Intent intent2 = new Intent(translationContext.getContext(), (Class<?>) (actionTrampolineType == ActionTrampolineType.ACTIVITY ? ActionTrampolineActivity.class : InvisibleActionTrampolineActivity.class));
        intent2.setData(e(translationContext, i, actionTrampolineType, null, 8, null));
        intent2.putExtra("ACTION_TYPE", actionTrampolineType.name());
        intent2.putExtra("ACTION_INTENT", intent);
        if (bundle != null) {
            intent2.putExtra("ACTIVITY_OPTIONS", bundle);
        }
        return intent2;
    }

    public static /* synthetic */ Intent c(Intent intent, TranslationContext translationContext, int i, ActionTrampolineType actionTrampolineType, Bundle bundle, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        return b(intent, translationContext, i, actionTrampolineType, bundle);
    }

    public static final Uri d(TranslationContext translationContext, int i, ActionTrampolineType actionTrampolineType, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(actionTrampolineType.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(translationContext.getAppWidgetId()));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", jf3.j(translationContext.getLayoutSize()));
        builder.appendQueryParameter("extraData", str);
        if (translationContext.getIsLazyCollectionDescendant()) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(translationContext.getLayoutCollectionViewId()));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(translationContext.getLayoutCollectionItemId()));
        }
        return builder.build();
    }

    public static /* synthetic */ Uri e(TranslationContext translationContext, int i, ActionTrampolineType actionTrampolineType, String str, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        return d(translationContext, i, actionTrampolineType, str);
    }

    public static final void f(final Activity activity, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        final Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        final String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        final Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        a(new Function0<Unit>() { // from class: androidx.glance.appwidget.action.ActionTrampolineKt$launchTrampolineAction$1

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ActionTrampolineType.values().length];
                    try {
                        iArr[ActionTrampolineType.ACTIVITY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ActionTrampolineType.BROADCAST.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ActionTrampolineType.CALLBACK.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ActionTrampolineType.SERVICE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ActionTrampolineType.FOREGROUND_SERVICE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m156invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m156invoke() {
                int i = a.$EnumSwitchMapping$0[ActionTrampolineType.valueOf(stringExtra).ordinal()];
                if (i == 1) {
                    activity.startActivity(intent2, bundleExtra);
                    return;
                }
                if (i == 2 || i == 3) {
                    activity.sendBroadcast(intent2);
                } else if (i == 4) {
                    activity.startService(intent2);
                } else {
                    if (i != 5) {
                        return;
                    }
                    c.a.a(activity, intent2);
                }
            }
        });
        activity.finish();
    }
}
