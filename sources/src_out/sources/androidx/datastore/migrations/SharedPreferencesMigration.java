package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.migrations.SharedPreferencesMigration;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.inputmethod.dmb;
import com.google.inputmethod.fmb;
import com.google.inputmethod.gm2;
import com.google.inputmethod.t04;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.c;
import kotlin.collections.m;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001 B\u0089\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0010\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010)R\u001c\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", "T", "Lcom/google/android/gm2;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "Lcom/google/android/fmb;", "migrate", "Landroid/content/Context;", "context", "name", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lcom/google/android/ps4;Landroid/content/Context;Ljava/lang/String;)V", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lcom/google/android/ps4;)V", "", "c", "(Landroid/content/Context;Ljava/lang/String;)V", "currentData", "shouldMigrate", "(Ljava/lang/Object;Lcom/google/android/q22;)Ljava/lang/Object;", "cleanUp", "(Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function2;", "b", "Lcom/google/android/ps4;", "Landroid/content/Context;", "d", "Ljava/lang/String;", "e", "Lkotlin/Lazy;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "f", "Ljava/util/Set;", "keySet", "datastore"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SharedPreferencesMigration<T> implements gm2<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function2<T, q22<? super Boolean>, Object> shouldRunMigration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ps4<fmb, T, q22<? super T>, Object> migrate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy sharedPrefs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Set<String> keySet;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @lq2(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<T, q22<? super Boolean>, Object> {
        int label;

        AnonymousClass3(q22<? super AnonymousClass3> q22Var) {
            super(2, q22Var);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t, q22<? super Boolean> q22Var) {
            return create(t, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass3(q22Var);
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return ut0.a(true);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final boolean a(Context context, String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @lq2(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {145}, m = "shouldMigrate", v = 1)
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SharedPreferencesMigration<T> sharedPreferencesMigration, q22<? super AnonymousClass1> q22Var) {
            super(q22Var);
            this.this$0 = sharedPreferencesMigration;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= t04.INVALID_ID;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SharedPreferencesMigration(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super q22<? super Boolean>, ? extends Object> function2, ps4<? super fmb, ? super T, ? super q22<? super T>, ? extends Object> ps4Var, Context context, String str) {
        this.shouldRunMigration = function2;
        this.migrate = ps4Var;
        this.context = context;
        this.name = str;
        this.sharedPrefs = c.b(function0);
        this.keySet = set == dmb.a() ? null : m.C1(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    private final void c(Context context, String name) {
        a.a(context, name);
    }

    private final SharedPreferences d() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    @Override // com.google.inputmethod.gm2
    public Object cleanUp(q22<? super Unit> q22Var) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = d().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (d().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            c(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.gm2
    public Object migrate(T t, q22<? super T> q22Var) {
        return this.migrate.invoke(new fmb(d(), this.keySet), t, q22Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.gm2
    public Object shouldMigrate(T t, q22<? super Boolean> q22Var) {
        AnonymousClass1 anonymousClass1;
        if (q22Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q22Var;
            int i = anonymousClass1.label;
            if ((i & t04.INVALID_ID) != 0) {
                anonymousClass1.label = i - t04.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(this, q22Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, q22Var);
        }
        Object objInvoke = anonymousClass1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = anonymousClass1.label;
        boolean z = true;
        if (i2 == 0) {
            f.b(objInvoke);
            Function2<T, q22<? super Boolean>, Object> function2 = this.shouldRunMigration;
            anonymousClass1.label = 1;
            objInvoke = function2.invoke(t, anonymousClass1);
            if (objInvoke == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return ut0.a(false);
        }
        Set<String> set = this.keySet;
        if (set == null) {
            Map<String, ?> all = d().getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set<String> set2 = set;
            SharedPreferences sharedPreferencesD = d();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesD.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return ut0.a(z);
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, Function2 function2, ps4 ps4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? dmb.a() : set, (i & 8) != 0 ? new AnonymousClass3(null) : function2, ps4Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(final Context context, final String str, Set<String> set, Function2<? super T, ? super q22<? super Boolean>, ? extends Object> function2, ps4<? super fmb, ? super T, ? super q22<? super T>, ? extends Object> ps4Var) {
        this(new Function0() { // from class: com.google.android.cmb
            public final Object invoke() {
                return SharedPreferencesMigration.b(context, str);
            }
        }, set, function2, ps4Var, context, str);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(set, "keysToMigrate");
        Intrinsics.checkNotNullParameter(function2, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(ps4Var, "migrate");
    }
}
