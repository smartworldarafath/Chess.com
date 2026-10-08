package com.google.inputmethod;

import android.content.ComponentName;
import android.content.Context;
import androidx.p008glance.p009appwidget.LayoutConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.bgd, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b*\b\u0080\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0000¢\u0006\u0004\b/\u00100J¯\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010\u001dJ\u001a\u00108\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\bF\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010@\u001a\u0004\bG\u0010BR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\bV\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\bW\u0010\u001dR\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bF\u0010@\u001a\u0004\bX\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bW\u0010Y\u001a\u0004\bR\u0010ZR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bV\u0010[\u001a\u0004\bN\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Lcom/google/android/bgd;", "", "Landroid/content/Context;", "context", "", "appWidgetId", "", "isRtl", "Landroidx/glance/appwidget/LayoutConfiguration;", "layoutConfiguration", "itemPosition", "isLazyCollectionDescendant", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastViewId", "Lcom/google/android/sy5;", "parentContext", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isBackgroundSpecified", "Lcom/google/android/jf3;", "layoutSize", "layoutCollectionViewId", "layoutCollectionItemId", "canUseSelectableGroup", "actionTargetId", "Landroid/content/ComponentName;", "actionBroadcastReceiver", "<init>", "(Landroid/content/Context;IZLandroidx/glance/appwidget/LayoutConfiguration;IZLjava/util/concurrent/atomic/AtomicInteger;Lcom/google/android/sy5;Ljava/util/concurrent/atomic/AtomicBoolean;JIIZLjava/lang/Integer;Landroid/content/ComponentName;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "v", "()I", "parent", "pos", "d", "(Lcom/google/android/sy5;I)Lcom/google/android/bgd;", "Lcom/google/android/aga;", "root", "g", "(Lcom/google/android/aga;)Lcom/google/android/bgd;", "h", "(Lcom/google/android/aga;J)Lcom/google/android/bgd;", "viewId", "e", "(I)Lcom/google/android/bgd;", "itemId", "newViewId", "f", "(II)Lcom/google/android/bgd;", "a", "()Lcom/google/android/bgd;", "b", "(Landroid/content/Context;IZLandroidx/glance/appwidget/LayoutConfiguration;IZLjava/util/concurrent/atomic/AtomicInteger;Lcom/google/android/sy5;Ljava/util/concurrent/atomic/AtomicBoolean;JIIZLjava/lang/Integer;Landroid/content/ComponentName;)Lcom/google/android/bgd;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "I", "k", "c", "Z", "u", "()Z", "Landroidx/glance/appwidget/LayoutConfiguration;", "p", "()Landroidx/glance/appwidget/LayoutConfiguration;", "m", "t", "Ljava/util/concurrent/atomic/AtomicInteger;", "getLastViewId", "()Ljava/util/concurrent/atomic/AtomicInteger;", "Lcom/google/android/sy5;", "r", "()Lcom/google/android/sy5;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "s", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "J", "q", "()J", "o", "n", "getCanUseSelectableGroup", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TranslationContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int appWidgetId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isRtl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final LayoutConfiguration layoutConfiguration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int itemPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean isLazyCollectionDescendant;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final AtomicInteger lastViewId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final InsertedViewInfo parentContext;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final AtomicBoolean isBackgroundSpecified;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final long layoutSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int layoutCollectionViewId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final int layoutCollectionItemId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final boolean canUseSelectableGroup;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private final Integer actionTargetId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private final ComponentName actionBroadcastReceiver;

    public /* synthetic */ TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, ComponentName componentName, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, z, layoutConfiguration, i2, z2, atomicInteger, insertedViewInfo, atomicBoolean, j, i3, i4, z3, num, componentName);
    }

    public static /* synthetic */ TranslationContext c(TranslationContext translationContext, Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, ComponentName componentName, int i5, Object obj) {
        return translationContext.b((i5 & 1) != 0 ? translationContext.context : context, (i5 & 2) != 0 ? translationContext.appWidgetId : i, (i5 & 4) != 0 ? translationContext.isRtl : z, (i5 & 8) != 0 ? translationContext.layoutConfiguration : layoutConfiguration, (i5 & 16) != 0 ? translationContext.itemPosition : i2, (i5 & 32) != 0 ? translationContext.isLazyCollectionDescendant : z2, (i5 & 64) != 0 ? translationContext.lastViewId : atomicInteger, (i5 & 128) != 0 ? translationContext.parentContext : insertedViewInfo, (i5 & 256) != 0 ? translationContext.isBackgroundSpecified : atomicBoolean, (i5 & 512) != 0 ? translationContext.layoutSize : j, (i5 & 1024) != 0 ? translationContext.layoutCollectionViewId : i3, (i5 & 2048) != 0 ? translationContext.layoutCollectionItemId : i4, (i5 & 4096) != 0 ? translationContext.canUseSelectableGroup : z3, (i5 & 8192) != 0 ? translationContext.actionTargetId : num, (i5 & 16384) != 0 ? translationContext.actionBroadcastReceiver : componentName);
    }

    public final TranslationContext a() {
        return c(this, null, 0, false, null, 0, false, null, null, null, 0L, 0, 0, true, null, null, 28671, null);
    }

    public final TranslationContext b(Context context, int appWidgetId, boolean isRtl, LayoutConfiguration layoutConfiguration, int itemPosition, boolean isLazyCollectionDescendant, AtomicInteger lastViewId, InsertedViewInfo parentContext, AtomicBoolean isBackgroundSpecified, long layoutSize, int layoutCollectionViewId, int layoutCollectionItemId, boolean canUseSelectableGroup, Integer actionTargetId, ComponentName actionBroadcastReceiver) {
        return new TranslationContext(context, appWidgetId, isRtl, layoutConfiguration, itemPosition, isLazyCollectionDescendant, lastViewId, parentContext, isBackgroundSpecified, layoutSize, layoutCollectionViewId, layoutCollectionItemId, canUseSelectableGroup, actionTargetId, actionBroadcastReceiver, null);
    }

    public final TranslationContext d(InsertedViewInfo parent, int pos) {
        return c(this, null, 0, false, null, pos, false, null, parent, null, 0L, 0, 0, false, null, null, 32623, null);
    }

    public final TranslationContext e(int viewId) {
        return c(this, null, 0, false, null, 0, true, null, null, null, 0L, viewId, 0, false, null, null, 31711, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslationContext)) {
            return false;
        }
        TranslationContext translationContext = (TranslationContext) other;
        return Intrinsics.e(this.context, translationContext.context) && this.appWidgetId == translationContext.appWidgetId && this.isRtl == translationContext.isRtl && Intrinsics.e(this.layoutConfiguration, translationContext.layoutConfiguration) && this.itemPosition == translationContext.itemPosition && this.isLazyCollectionDescendant == translationContext.isLazyCollectionDescendant && Intrinsics.e(this.lastViewId, translationContext.lastViewId) && Intrinsics.e(this.parentContext, translationContext.parentContext) && Intrinsics.e(this.isBackgroundSpecified, translationContext.isBackgroundSpecified) && jf3.f(this.layoutSize, translationContext.layoutSize) && this.layoutCollectionViewId == translationContext.layoutCollectionViewId && this.layoutCollectionItemId == translationContext.layoutCollectionItemId && this.canUseSelectableGroup == translationContext.canUseSelectableGroup && Intrinsics.e(this.actionTargetId, translationContext.actionTargetId) && Intrinsics.e(this.actionBroadcastReceiver, translationContext.actionBroadcastReceiver);
    }

    public final TranslationContext f(int itemId, int newViewId) {
        return c(this, null, 0, false, null, 0, false, new AtomicInteger(newViewId), null, null, 0L, itemId, 0, false, null, null, 31679, null);
    }

    public final TranslationContext g(RemoteViewsInfo root) {
        return c(d(root.getView(), 0), null, 0, false, null, 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, 0, 0, false, null, null, 32447, null);
    }

    public final TranslationContext h(RemoteViewsInfo root, long layoutSize) {
        return c(d(root.getView(), 0), null, 0, false, null, 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), layoutSize, 0, 0, false, null, null, 31935, null);
    }

    public int hashCode() {
        int iHashCode = ((((this.context.hashCode() * 31) + Integer.hashCode(this.appWidgetId)) * 31) + Boolean.hashCode(this.isRtl)) * 31;
        LayoutConfiguration layoutConfiguration = this.layoutConfiguration;
        int iHashCode2 = (((((((((((((((((((iHashCode + (layoutConfiguration == null ? 0 : layoutConfiguration.hashCode())) * 31) + Integer.hashCode(this.itemPosition)) * 31) + Boolean.hashCode(this.isLazyCollectionDescendant)) * 31) + this.lastViewId.hashCode()) * 31) + this.parentContext.hashCode()) * 31) + this.isBackgroundSpecified.hashCode()) * 31) + jf3.i(this.layoutSize)) * 31) + Integer.hashCode(this.layoutCollectionViewId)) * 31) + Integer.hashCode(this.layoutCollectionItemId)) * 31) + Boolean.hashCode(this.canUseSelectableGroup)) * 31;
        Integer num = this.actionTargetId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.actionBroadcastReceiver;
        return iHashCode3 + (componentName != null ? componentName.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ComponentName getActionBroadcastReceiver() {
        return this.actionBroadcastReceiver;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getActionTargetId() {
        return this.actionTargetId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getAppWidgetId() {
        return this.appWidgetId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getItemPosition() {
        return this.itemPosition;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getLayoutCollectionItemId() {
        return this.layoutCollectionItemId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getLayoutCollectionViewId() {
        return this.layoutCollectionViewId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final LayoutConfiguration getLayoutConfiguration() {
        return this.layoutConfiguration;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final InsertedViewInfo getParentContext() {
        return this.parentContext;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final AtomicBoolean getIsBackgroundSpecified() {
        return this.isBackgroundSpecified;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsLazyCollectionDescendant() {
        return this.isLazyCollectionDescendant;
    }

    public String toString() {
        return "TranslationContext(context=" + this.context + ", appWidgetId=" + this.appWidgetId + ", isRtl=" + this.isRtl + ", layoutConfiguration=" + this.layoutConfiguration + ", itemPosition=" + this.itemPosition + ", isLazyCollectionDescendant=" + this.isLazyCollectionDescendant + ", lastViewId=" + this.lastViewId + ", parentContext=" + this.parentContext + ", isBackgroundSpecified=" + this.isBackgroundSpecified + ", layoutSize=" + ((Object) jf3.j(this.layoutSize)) + ", layoutCollectionViewId=" + this.layoutCollectionViewId + ", layoutCollectionItemId=" + this.layoutCollectionItemId + ", canUseSelectableGroup=" + this.canUseSelectableGroup + ", actionTargetId=" + this.actionTargetId + ", actionBroadcastReceiver=" + this.actionBroadcastReceiver + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsRtl() {
        return this.isRtl;
    }

    public final int v() {
        return this.lastViewId.incrementAndGet();
    }

    private TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, ComponentName componentName) {
        this.context = context;
        this.appWidgetId = i;
        this.isRtl = z;
        this.layoutConfiguration = layoutConfiguration;
        this.itemPosition = i2;
        this.isLazyCollectionDescendant = z2;
        this.lastViewId = atomicInteger;
        this.parentContext = insertedViewInfo;
        this.isBackgroundSpecified = atomicBoolean;
        this.layoutSize = j;
        this.layoutCollectionViewId = i3;
        this.layoutCollectionItemId = i4;
        this.canUseSelectableGroup = z3;
        this.actionTargetId = num;
        this.actionBroadcastReceiver = componentName;
    }

    public /* synthetic */ TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z2, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, Integer num, ComponentName componentName, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, z, layoutConfiguration, i2, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? new AtomicInteger(1) : atomicInteger, (i5 & 128) != 0 ? new InsertedViewInfo(0, 0, null, 7, null) : insertedViewInfo, (i5 & 256) != 0 ? new AtomicBoolean(false) : atomicBoolean, (i5 & 512) != 0 ? jf3.INSTANCE.b() : j, (i5 & 1024) != 0 ? -1 : i3, (i5 & 2048) != 0 ? -1 : i4, (i5 & 4096) != 0 ? false : z3, (i5 & 8192) != 0 ? null : num, (i5 & 16384) != 0 ? null : componentName, null);
    }
}
