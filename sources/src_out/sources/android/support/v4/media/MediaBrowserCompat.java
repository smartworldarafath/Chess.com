package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.tj7;
import com.google.inputmethod.b10;
import com.google.inputmethod.mx0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class MediaBrowserCompat {
    static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    private final d a;

    private static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.b(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        protected void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.b(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    private static class a {
        static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    private static class b extends Handler {
        private final WeakReference<h> a;
        private WeakReference<Messenger> b;

        b(h hVar) {
            this.a = new WeakReference<>(hVar);
        }

        void a(Messenger messenger) {
            this.b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null || this.a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            h hVar = this.a.get();
            Messenger messenger = this.b.get();
            try {
                int i = message.what;
                if (i == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    hVar.f(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else {
                    if (i == 2) {
                        hVar.c(messenger);
                        return;
                    }
                    if (i != 3) {
                        message.toString();
                        return;
                    }
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle3);
                    hVar.d(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                if (message.what == 1) {
                    hVar.c(messenger);
                }
            }
        }
    }

    public static class c {
        final MediaBrowser.ConnectionCallback a = new a();
        b b;

        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.onConnected();
                }
                c.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.e();
                }
                c.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = c.this.b;
                if (bVar != null) {
                    bVar.b();
                }
                c.this.c();
            }
        }

        interface b {
            void b();

            void e();

            void onConnected();
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }

        void d(b bVar) {
            this.b = bVar;
        }
    }

    interface d {
        MediaSessionCompat.Token a();

        void connect();

        void disconnect();
    }

    static class e implements d, h, c.b {
        final Context a;
        protected final MediaBrowser b;
        protected final Bundle c;
        protected final b d = new b(this);
        private final b10<String, j> e = new b10<>();
        protected int f;
        protected i g;
        protected Messenger h;
        private MediaSessionCompat.Token i;
        private Bundle j;

        e(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            this.a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            cVar.d(this);
            this.b = new MediaBrowser(context, componentName, cVar.a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public MediaSessionCompat.Token a() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.a(this.b.getSessionToken());
            }
            return this.i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void b() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public void c(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void connect() {
            this.b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public void d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.h != messenger) {
                return;
            }
            j jVar = this.e.get(str);
            if (jVar == null) {
                boolean z = MediaBrowserCompat.b;
                return;
            }
            k kVarA = jVar.a(bundle);
            if (kVarA != null) {
                if (bundle == null) {
                    if (list == null) {
                        kVarA.c(str);
                        return;
                    }
                    this.j = bundle2;
                    kVarA.a(str, list);
                    this.j = null;
                    return;
                }
                if (list == null) {
                    kVarA.d(str, bundle);
                    return;
                }
                this.j = bundle2;
                kVarA.b(str, list, bundle);
                this.j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void disconnect() {
            Messenger messenger;
            i iVar = this.g;
            if (iVar != null && (messenger = this.h) != null) {
                try {
                    iVar.c(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void e() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public void f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void onConnected() {
            try {
                Bundle extras = this.b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f = extras.getInt("extra_service_version", 0);
                IBinder iBinderA = mx0.a(extras, "extra_messenger");
                if (iBinderA != null) {
                    this.g = new i(iBinderA, this.c);
                    Messenger messenger = new Messenger(this.d);
                    this.h = messenger;
                    this.d.a(messenger);
                    try {
                        this.g.a(this.a, this.h);
                    } catch (RemoteException unused) {
                    }
                }
                android.support.v4.media.session.b bVarV1 = android.support.v4.media.session.b.a.V1(mx0.a(extras, "extra_session_binder"));
                if (bVarV1 != null) {
                    this.i = MediaSessionCompat.Token.b(this.b.getSessionToken(), bVarV1);
                }
            } catch (IllegalStateException unused2) {
            }
        }
    }

    static class f extends e {
        f(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    interface h {
        void c(Messenger messenger);

        void d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    private static class i {
        private Messenger a;
        private Bundle b;

        public i(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }

        private void b(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.a.send(messageObtain);
        }

        void a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            b(6, bundle, messenger);
        }

        void c(Messenger messenger) throws RemoteException {
            b(7, null, messenger);
        }
    }

    private static class j {
        private final List<k> a = new ArrayList();
        private final List<Bundle> b = new ArrayList();

        public k a(Bundle bundle) {
            for (int i = 0; i < this.b.size(); i++) {
                if (tj7.a(this.b.get(i), bundle)) {
                    return this.a.get(i);
                }
            }
            return null;
        }

        public List<k> b() {
            return this.a;
        }

        public List<Bundle> c() {
            return this.b;
        }
    }

    public static abstract class k {
        WeakReference<j> c;
        final IBinder b = new Binder();
        final MediaBrowser.SubscriptionCallback a = new b();

        private class a extends MediaBrowser.SubscriptionCallback {
            a() {
            }

            List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int size = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<j> weakReference = k.this.c;
                j jVar = weakReference == null ? null : weakReference.get();
                if (jVar == null) {
                    k.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> listB = MediaItem.b(list);
                List<k> listB2 = jVar.b();
                List<Bundle> listC = jVar.c();
                for (int i = 0; i < listB2.size(); i++) {
                    Bundle bundle = listC.get(i);
                    if (bundle == null) {
                        k.this.a(str, listB);
                    } else {
                        k.this.b(str, a(listB, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                k.this.c(str);
            }
        }

        private class b extends a {
            b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                k.this.b(str, MediaItem.b(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                k.this.d(str, bundle);
            }
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        this.a = new g(context, componentName, cVar, bundle);
    }

    public void a() {
        this.a.connect();
    }

    public void b() {
        this.a.disconnect();
    }

    public MediaSessionCompat.Token c() {
        return this.a.a();
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        private final int a;
        private final MediaDescriptionCompat b;

        class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.d())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.a = i;
            this.b = mediaDescriptionCompat;
        }

        public static MediaItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem)), a.b(mediaItem));
        }

        public static List<MediaItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
