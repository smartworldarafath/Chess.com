package androidx.core.widget;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.google.inputmethod.iz9;
import com.google.inputmethod.vw8;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0003\t\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "onGetViewFactory", "(Landroid/content/Intent;)Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "a", "RemoteViewsCompatServiceData", "b", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteViewsCompatService extends RemoteViewsService {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService$RemoteViewsCompatServiceData;", "", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "", "a", "[B", "mItemsBytes", "", "b", "Ljava/lang/String;", "mBuildVersion", "", "c", "J", "mAppVersion", "d", "Companion", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class RemoteViewsCompatServiceData {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final byte[] mItemsBytes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String mBuildVersion;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long mAppVersion;

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion;", "", "<init>", "()V", "", "appWidgetId", "viewId", "", "c", "(II)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "d", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Landroidx/core/widget/a$b;", "f", "(Landroid/content/Context;II)Landroidx/core/widget/a$b;", "", "e", "(Landroid/content/Context;)Ljava/lang/Long;", "P", "hexString", "Lkotlin/Function1;", "Landroid/os/Parcel;", "creator", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "bytes", "a", "([BLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "PREFS_FILENAME", "Ljava/lang/String;", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <P> P a(byte[] bytes, Function1<? super Parcel, ? extends P> creator) {
                Intrinsics.checkNotNullParameter(bytes, "bytes");
                Intrinsics.checkNotNullParameter(creator, "creator");
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                try {
                    parcelObtain.unmarshall(bytes, 0, bytes.length);
                    parcelObtain.setDataPosition(0);
                    return (P) creator.invoke(parcelObtain);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public final <P> P b(String hexString, Function1<? super Parcel, ? extends P> creator) {
                Intrinsics.checkNotNullParameter(hexString, "hexString");
                Intrinsics.checkNotNullParameter(creator, "creator");
                byte[] bArrDecode = Base64.decode(hexString, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(hexString, Base64.DEFAULT)");
                return (P) a(bArrDecode, creator);
            }

            public final String c(int appWidgetId, int viewId) {
                StringBuilder sb = new StringBuilder();
                sb.append(appWidgetId);
                sb.append(':');
                sb.append(viewId);
                return sb.toString();
            }

            public final SharedPreferences d(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
                return sharedPreferences;
            }

            public final Long e(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                try {
                    return Long.valueOf(vw8.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    Objects.toString(context.getPackageManager());
                    return null;
                }
            }

            public final a.b f(Context context, int appWidgetId, int viewId) {
                Long lE;
                Intrinsics.checkNotNullParameter(context, "context");
                String string = d(context).getString(c(appWidgetId, viewId), null);
                if (string == null) {
                    return null;
                }
                RemoteViewsCompatServiceData remoteViewsCompatServiceData = (RemoteViewsCompatServiceData) b(string, new Function1<Parcel, RemoteViewsCompatServiceData>() { // from class: androidx.core.widget.RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$load$data$1
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final RemoteViewsCompatService.RemoteViewsCompatServiceData invoke(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "it");
                        return new RemoteViewsCompatService.RemoteViewsCompatServiceData(parcel);
                    }
                });
                if (!Intrinsics.e(Build.VERSION.INCREMENTAL, remoteViewsCompatServiceData.mBuildVersion) || (lE = e(context)) == null) {
                    return null;
                }
                if (lE.longValue() != remoteViewsCompatServiceData.mAppVersion) {
                    return null;
                }
                try {
                    return (a.b) a(remoteViewsCompatServiceData.mItemsBytes, new Function1<Parcel, a.b>() { // from class: androidx.core.widget.RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$load$1
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final a.b invoke(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "it");
                            return new a.b(parcel);
                        }
                    });
                } catch (Throwable unused) {
                    return null;
                }
            }

            private Companion() {
            }
        }

        public RemoteViewsCompatServiceData(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            byte[] bArr = new byte[parcel.readInt()];
            this.mItemsBytes = bArr;
            parcel.readByteArray(bArr);
            String string = parcel.readString();
            Intrinsics.g(string);
            this.mBuildVersion = string;
            this.mAppVersion = parcel.readLong();
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService$b;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "Landroid/content/Context;", "mContext", "", "mAppWidgetId", "mViewId", "<init>", "(Landroid/content/Context;II)V", "", "b", "()V", "onCreate", "onDataSetChanged", "onDestroy", "getCount", "()I", "position", "Landroid/widget/RemoteViews;", "getViewAt", "(I)Landroid/widget/RemoteViews;", "", "a", "()Ljava/lang/Void;", "getViewTypeCount", "", "getItemId", "(I)J", "", "hasStableIds", "()Z", "Landroid/content/Context;", "I", "c", "Landroidx/core/widget/a$b;", "d", "Landroidx/core/widget/a$b;", "mItems", "e", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements RemoteViewsService.RemoteViewsFactory {
        private static final a.b f = new a.b(new long[0], new RemoteViews[0], false, 1);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context mContext;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int mAppWidgetId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int mViewId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private a.b mItems;

        public b(Context context, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "mContext");
            this.mContext = context;
            this.mAppWidgetId = i;
            this.mViewId = i2;
            this.mItems = f;
        }

        private final void b() {
            a.b bVarF = RemoteViewsCompatServiceData.INSTANCE.f(this.mContext, this.mAppWidgetId, this.mViewId);
            if (bVarF == null) {
                bVarF = f;
            }
            this.mItems = bVarF;
        }

        public Void a() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getCount() {
            return this.mItems.a();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public long getItemId(int position) {
            try {
                return this.mItems.b(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return (RemoteViews) a();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public RemoteViews getViewAt(int position) {
            try {
                return this.mItems.c(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.mContext.getPackageName(), iz9.a);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getViewTypeCount() {
            return this.mItems.getMViewTypeCount();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public boolean hasStableIds() {
            return this.mItems.getMHasStableIds();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onCreate() {
            b();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDataSetChanged() {
            b();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDestroy() {
        }
    }

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new b(this, intExtra, intExtra2);
        }
        throw new IllegalStateException("No view id was present in the intent");
    }
}
