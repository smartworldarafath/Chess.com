package com.google.inputmethod;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.text.x;
import com.google.android.ts4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n*\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R:\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRL\u0010*\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010$\u0012\u0004\b)\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/google/android/xn9;", "", "<init>", "()V", "Landroid/content/Intent;", "c", "()Landroid/content/Intent;", "Landroid/content/pm/ResolveInfo;", "Landroid/content/Context;", "context", "", "g", "(Landroid/content/pm/ResolveInfo;Landroid/content/Context;)Z", "Landroid/content/pm/ActivityInfo;", "f", "(Landroid/content/pm/ActivityInfo;Landroid/content/Context;)Z", "info", "editable", "d", "(Landroid/content/pm/ResolveInfo;Z)Landroid/content/Intent;", "", "j", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getProcessTextActivitiesQuery", "()Lkotlin/jvm/functions/Function1;", "setProcessTextActivitiesQuery", "(Lkotlin/jvm/functions/Function1;)V", "getProcessTextActivitiesQuery$annotations", "processTextActivitiesQuery", "Lkotlin/Function5;", "", "Landroidx/compose/ui/text/x;", "", "Lcom/google/android/ts4;", "e", "()Lcom/google/android/ts4;", "setOnClickProcessTextItem", "(Lcom/google/android/ts4;)V", "getOnClickProcessTextItem$annotations", "onClickProcessTextItem", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xn9 {
    public static final xn9 a = new xn9();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static Function1<? super Context, ? extends List<? extends ResolveInfo>> processTextActivitiesQuery = new Function1() { // from class: com.google.android.vn9
        public final Object invoke(Object obj) {
            return xn9.i((Context) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static ts4<? super Context, ? super ResolveInfo, ? super Boolean, ? super CharSequence, ? super x, Unit> onClickProcessTextItem = new ts4() { // from class: com.google.android.wn9
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return xn9.h((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (x) obj5);
        }
    };
    public static final int d = 8;

    private xn9() {
    }

    private final Intent c() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    private final boolean f(ActivityInfo activityInfo, Context context) {
        if (!activityInfo.exported) {
            return false;
        }
        String str = activityInfo.permission;
        return str == null || context.checkSelfPermission(str) == 0;
    }

    private final boolean g(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || f(resolveInfo.activityInfo, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, x xVar) {
        String string = charSequence.subSequence(x.l(xVar.getPackedValue()), x.k(xVar.getPackedValue())).toString();
        Intent intentD = a.d(resolveInfo, z);
        intentD.putExtra("android.intent.extra.PROCESS_TEXT", string);
        context.startActivity(intentD);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(a.c(), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
            if (a.g(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public final Intent d(ResolveInfo info, boolean editable) {
        Intent intentPutExtra = c().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", editable);
        ActivityInfo activityInfo = info.activityInfo;
        return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }

    public final ts4<Context, ResolveInfo, Boolean, CharSequence, x, Unit> e() {
        return onClickProcessTextItem;
    }

    public final List<ResolveInfo> j(Context context) {
        return (List) processTextActivitiesQuery.invoke(context);
    }
}
