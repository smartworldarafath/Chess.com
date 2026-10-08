package com.chess.p019features.connect.invite.contacts.viewmodel;

import chesscom.phone_number.v1.AddPhoneNumberImpression;
import chesscom.phone_number.v1.AddPhoneNumberInterface;
import chesscom.phone_number.v1.AddPhoneNumberTextEntry;
import chesscom.phone_number.v1.AddPhoneNumberTextInput;
import com.chess.entities.Color;
import com.chess.features.friends.api.e;
import com.chess.features.friends.api.g;
import com.chess.features.friends.api.h;
import com.chess.features.friends.api.k;
import com.chess.net.v1.users.SessionStore;
import com.chess.net.v1.users.d1;
import com.chess.p015errorhandler.e0;
import com.chess.snackbar.SnackbarManager;
import com.chess.utils.android.misc.StringOrResource;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.ai4;
import com.google.android.c9e;
import com.google.android.h81;
import com.google.android.lq2;
import com.google.android.oda;
import com.google.android.p81;
import com.google.android.q1c;
import com.google.android.q22;
import com.google.android.r6c;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.android.w8e;
import com.squareup.wire.Message;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.s;
import okio.ByteString;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 H2\u00020\u0001:\u0001%B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00020\u0010*\u00020\u0010H\u0082@¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0012038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0010078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010>\u001a\b\u0012\u0004\u0012\u00020:078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00105R \u0010G\u001a\b\u0012\u0004\u0012\u00020?0B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/chess/features/connect/friends/contacts/viewmodel/SyncContactsViewModel;", "Lcom/google/android/w8e;", "Lcom/chess/features/friends/api/e;", "matcher", "Lcom/chess/features/friends/api/h;", "friendsManager", "Lcom/chess/net/v1/users/d1;", "usersService", "Lcom/chess/net/v1/users/SessionStore;", "sessionStore", "Lcom/chess/errorhandler/e0;", "errorProcessor", "Lcom/chess/snackbar/SnackbarManager;", "snackbarManager", "<init>", "(Lcom/chess/features/friends/api/e;Lcom/chess/features/friends/api/h;Lcom/chess/net/v1/users/d1;Lcom/chess/net/v1/users/SessionStore;Lcom/chess/errorhandler/e0;Lcom/chess/snackbar/SnackbarManager;)V", "Lcom/chess/features/connect/friends/contacts/viewmodel/k;", "state", "Lcom/chess/features/connect/friends/contacts/viewmodel/b;", "event", "Q6", "(Lcom/chess/features/connect/friends/contacts/viewmodel/k;Lcom/chess/features/connect/friends/contacts/viewmodel/b;Lcom/google/android/q22;)Ljava/lang/Object;", "", "S6", "()V", "Lkotlinx/coroutines/s;", "R6", "(Lcom/chess/features/connect/friends/contacts/viewmodel/k;)Lkotlinx/coroutines/s;", "", "phoneNumber", "email", "O6", "(Ljava/lang/String;Ljava/lang/String;)V", "K6", "(Lcom/chess/features/connect/friends/contacts/viewmodel/k;Lcom/google/android/q22;)Ljava/lang/Object;", "P6", "(Lcom/chess/features/connect/friends/contacts/viewmodel/b;)V", "a", "Lcom/chess/features/friends/api/e;", "b", "Lcom/chess/features/friends/api/h;", "c", "Lcom/chess/net/v1/users/d1;", "d", "Lcom/chess/net/v1/users/SessionStore;", "e", "Lcom/chess/errorhandler/e0;", "L6", "()Lcom/chess/errorhandler/e0;", "f", "Lcom/chess/snackbar/SnackbarManager;", "Lcom/google/android/h81;", "g", "Lcom/google/android/h81;", "events", "Lcom/google/android/r6c;", "h", "Lcom/google/android/r6c;", "Lcom/chess/features/connect/friends/contacts/viewmodel/l;", ContextChain.TAG_INFRA, "N6", "()Lcom/google/android/r6c;", "uiState", "Lcom/chess/features/connect/friends/contacts/viewmodel/c;", "j", "_sideEffects", "Lcom/google/android/ai4;", "k", "Lcom/google/android/ai4;", "M6", "()Lcom/google/android/ai4;", "sideEffects", "l", "impl_release"}, k = 1, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
public final class SyncContactsViewModel extends w8e {
    private static final a l = new a(null);
    public static final int m = 8;
    private static final String n;
    private static final SyncContactsState o;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final e matcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final h friendsManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d1 usersService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final SessionStore sessionStore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final e0 errorProcessor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final SnackbarManager snackbarManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final h81<com.chess.p019features.connect.invite.contacts.viewmodel.b> events;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final r6c<SyncContactsState> state;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final r6c<SyncContactsUiState> uiState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final h81<com.chess.p019features.connect.invite.contacts.viewmodel.c> _sideEffects;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final ai4<com.chess.p019features.connect.invite.contacts.viewmodel.c> sideEffects;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chess/features/connect/friends/contacts/viewmodel/SyncContactsViewModel$a;", "", "<init>", "()V", "impl_release"}, k = 1, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/chess/features/connect/friends/contacts/viewmodel/SyncContactsViewModel$b", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        final /* synthetic */ SyncContactsViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.b bVar, SyncContactsViewModel syncContactsViewModel) {
            super(bVar);
            this.b = syncContactsViewModel;
        }

        public void handleException(CoroutineContext context, Throwable exception) {
            e0.b(this.b.getErrorProcessor(), exception, SyncContactsViewModel.n, "Failed to send invite", true, null, null, 48, null);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/chess/features/connect/friends/contacts/viewmodel/SyncContactsViewModel$c", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        final /* synthetic */ SyncContactsViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.b bVar, SyncContactsViewModel syncContactsViewModel) {
            super(bVar);
            this.b = syncContactsViewModel;
        }

        public void handleException(CoroutineContext context, Throwable exception) {
            e0.b(this.b.getErrorProcessor(), exception, SyncContactsViewModel.n, "Failed to send friends request", true, null, null, 48, null);
            this.b.P6(com.chess.features.connect.friends.contacts.viewmodel.b.i.a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/chess/features/connect/friends/contacts/viewmodel/SyncContactsViewModel$d", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        final /* synthetic */ SyncContactsViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.b bVar, SyncContactsViewModel syncContactsViewModel) {
            super(bVar);
            this.b = syncContactsViewModel;
        }

        public void handleException(CoroutineContext context, Throwable exception) {
            e0.b(this.b.getErrorProcessor(), exception, SyncContactsViewModel.n, "Failed to retrieve contacts", true, null, null, 48, null);
            this.b.P6(com.chess.features.connect.friends.contacts.viewmodel.b.i.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002b  */
    static {
        String str;
        String strT = oda.b(SyncContactsViewModel.class).t();
        if (strT != null) {
            str = "" + strT;
            if (str == null) {
                str = "anonymous";
            }
        } else {
            str = "anonymous";
        }
        n = str;
        o = new SyncContactsState(null, null, null, false, 15, null);
    }

    public SyncContactsViewModel(e eVar, h hVar, d1 d1Var, SessionStore sessionStore, e0 e0Var, SnackbarManager snackbarManager) {
        Intrinsics.checkNotNullParameter(eVar, "matcher");
        Intrinsics.checkNotNullParameter(hVar, "friendsManager");
        Intrinsics.checkNotNullParameter(d1Var, "usersService");
        Intrinsics.checkNotNullParameter(sessionStore, "sessionStore");
        Intrinsics.checkNotNullParameter(e0Var, "errorProcessor");
        Intrinsics.checkNotNullParameter(snackbarManager, "snackbarManager");
        this.matcher = eVar;
        this.friendsManager = hVar;
        this.usersService = d1Var;
        this.sessionStore = sessionStore;
        this.errorProcessor = e0Var;
        this.snackbarManager = snackbarManager;
        h81<com.chess.p019features.connect.invite.contacts.viewmodel.b> h81VarB = p81.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        this.events = h81VarB;
        ai4 ai4VarB0 = kotlinx.coroutines.flow.d.b0(h81VarB);
        SyncContactsState syncContactsState = o;
        ai4 ai4VarH0 = kotlinx.coroutines.flow.d.h0(ai4VarB0, syncContactsState, new SyncContactsViewModel$state$1(this));
        ta2 ta2VarA = c9e.a(this);
        n.a aVar = n.a;
        final r6c<SyncContactsState> r6cVarL0 = kotlinx.coroutines.flow.d.l0(ai4VarH0, ta2VarA, aVar.c(), syncContactsState);
        this.state = r6cVarL0;
        this.uiState = kotlinx.coroutines.flow.d.l0(new ai4<SyncContactsUiState>() { // from class: com.chess.features.connect.friends.contacts.viewmodel.SyncContactsViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.chess.features.connect.friends.contacts.viewmodel.SyncContactsViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(k = 3, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
            public static final class AnonymousClass2<T> implements ui4 {
                final /* synthetic */ ui4 a;

                /* JADX INFO: renamed from: com.chess.features.connect.friends.contacts.viewmodel.SyncContactsViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {Color.BLACK_INT, Color.BLACK_INT, Color.NONE_INT}, xi = 48)
                @lq2(c = "com.chess.features.connect.friends.contacts.viewmodel.SyncContactsViewModel$special$$inlined$map$1$2", f = "SyncContactsViewModel.kt", l = {50}, m = "emit", v = 1)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(q22 q22Var) {
                        super(q22Var);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ui4 ui4Var) {
                    this.a = ui4Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object emit(Object obj, q22 q22Var) {
                    AnonymousClass1 anonymousClass1;
                    if (q22Var instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) q22Var;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(q22Var);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(q22Var);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objG = a.g();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        f.b(obj2);
                        ui4 ui4Var = this.a;
                        SyncContactsUiState syncContactsUiStateE = ((SyncContactsState) obj).e();
                        anonymousClass1.L$0 = q1c.a(obj);
                        anonymousClass1.L$1 = q1c.a(anonymousClass1);
                        anonymousClass1.L$2 = q1c.a(obj);
                        anonymousClass1.L$3 = q1c.a(ui4Var);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (ui4Var.emit(syncContactsUiStateE, anonymousClass1) == objG) {
                            return objG;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj2);
                    }
                    return Unit.a;
                }
            }

            public Object collect(ui4 ui4Var, q22 q22Var) {
                Object objCollect = r6cVarL0.collect(new AnonymousClass2(ui4Var), q22Var);
                return objCollect == a.g() ? objCollect : Unit.a;
            }
        }, c9e.a(this), aVar.c(), syncContactsState.e());
        h81<com.chess.p019features.connect.invite.contacts.viewmodel.c> h81VarB2 = p81.b(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);
        this._sideEffects = h81VarB2;
        this.sideEffects = kotlinx.coroutines.flow.d.b0(h81VarB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K6(SyncContactsState syncContactsState, q22<? super SyncContactsState> q22Var) {
        SyncContactsViewModel$finishFlow$1 syncContactsViewModel$finishFlow$1;
        if (q22Var instanceof SyncContactsViewModel$finishFlow$1) {
            syncContactsViewModel$finishFlow$1 = (SyncContactsViewModel$finishFlow$1) q22Var;
            int i = syncContactsViewModel$finishFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncContactsViewModel$finishFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                syncContactsViewModel$finishFlow$1 = new SyncContactsViewModel$finishFlow$1(this, q22Var);
            }
        } else {
            syncContactsViewModel$finishFlow$1 = new SyncContactsViewModel$finishFlow$1(this, q22Var);
        }
        Object obj = syncContactsViewModel$finishFlow$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = syncContactsViewModel$finishFlow$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SyncContactsState syncContactsState2 = (SyncContactsState) syncContactsViewModel$finishFlow$1.L$1;
            f.b(obj);
            return syncContactsState2;
        }
        f.b(obj);
        h81<com.chess.p019features.connect.invite.contacts.viewmodel.c> h81Var = this._sideEffects;
        com.chess.features.connect.friends.contacts.viewmodel.c.a aVar = com.chess.features.connect.friends.contacts.viewmodel.c.a.a;
        syncContactsViewModel$finishFlow$1.L$0 = q1c.a(syncContactsState);
        syncContactsViewModel$finishFlow$1.L$1 = syncContactsState;
        syncContactsViewModel$finishFlow$1.L$2 = q1c.a(syncContactsState);
        syncContactsViewModel$finishFlow$1.I$0 = 0;
        syncContactsViewModel$finishFlow$1.label = 1;
        return h81Var.x(aVar, syncContactsViewModel$finishFlow$1) == objG ? objG : syncContactsState;
    }

    private final void O6(String phoneNumber, String email) {
        rw0.d(c9e.a(this), new b(CoroutineExceptionHandler.t2, this), (CoroutineStart) null, new SyncContactsViewModel$inviteContact$2(this, phoneNumber, email, null), 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object Q6(SyncContactsState syncContactsState, com.chess.p019features.connect.invite.contacts.viewmodel.b bVar, q22<? super SyncContactsState> q22Var) throws NoWhenBranchMatchedException {
        if (bVar instanceof com.chess.p019features.connect.invite.contacts.viewmodel.b.C0180b) {
            SyncContactsState syncContactsStateB = SyncContactsState.b(syncContactsState, null, null, null, true, 7, null);
            S6();
            return syncContactsStateB;
        }
        if (bVar instanceof com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendsListAvailable) {
            com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendsListAvailable friendsListAvailable = (com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendsListAvailable) bVar;
            boolean zIsEmpty = friendsListAvailable.getContactsMatchingResult().a().isEmpty();
            boolean zIsEmpty2 = friendsListAvailable.getContactsMatchingResult().b().isEmpty();
            if (zIsEmpty) {
                if (zIsEmpty2) {
                    return K6(syncContactsState, q22Var);
                }
                com.chess.android.b.a().J(new AddPhoneNumberImpression(AddPhoneNumberInterface.ADD_PHONE_NUMBER_INTERFACE_INVITE_CONTACTS, (ByteString) null, 2, (DefaultConstructorMarker) null), new Message[0]);
                return SyncContactsState.b(syncContactsState, null, friendsListAvailable.getContactsMatchingResult().b(), null, false, 5, null);
            }
            com.chess.android.b.a().J(new AddPhoneNumberImpression(AddPhoneNumberInterface.ADD_PHONE_NUMBER_INTERFACE_CONTACTS_FOUND, (ByteString) null, 2, (DefaultConstructorMarker) null), new Message[0]);
            List<k> listA = friendsListAvailable.getContactsMatchingResult().a();
            ArrayList arrayList = new ArrayList(m.A(listA, 10));
            for (k kVar : listA) {
                arrayList.add(new MatchedContactState(kVar, true, kVar.h()));
            }
            return SyncContactsState.b(syncContactsState, arrayList, null, null, false, 6, null);
        }
        if (bVar instanceof com.chess.features.connect.friends.contacts.viewmodel.b.a) {
            SyncContactsState syncContactsStateB2 = SyncContactsState.b(syncContactsState, null, null, null, true, 7, null);
            R6(syncContactsState);
            return syncContactsStateB2;
        }
        if (bVar instanceof com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendsSelectAll) {
            List<MatchedContactState> listC = syncContactsState.c();
            ArrayList arrayList2 = new ArrayList(m.A(listC, 10));
            for (MatchedContactState matchedContactStateB : listC) {
                com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendsSelectAll friendsSelectAll = (com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendsSelectAll) bVar;
                if (matchedContactStateB.getIsSelected() != friendsSelectAll.getSelectAll()) {
                    matchedContactStateB = MatchedContactState.b(matchedContactStateB, null, friendsSelectAll.getSelectAll(), false, 5, null);
                }
                arrayList2.add(matchedContactStateB);
            }
            return SyncContactsState.b(syncContactsState, arrayList2, null, null, false, 14, null);
        }
        if (bVar instanceof com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendToggled) {
            List<MatchedContactState> listC2 = syncContactsState.c();
            ArrayList arrayList3 = new ArrayList(m.A(listC2, 10));
            for (MatchedContactState matchedContactStateB2 : listC2) {
                if (matchedContactStateB2.getContact().i() == ((com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendToggled) bVar).getUserId()) {
                    matchedContactStateB2 = MatchedContactState.b(matchedContactStateB2, null, !matchedContactStateB2.getIsSelected(), false, 5, null);
                }
                arrayList3.add(matchedContactStateB2);
            }
            return SyncContactsState.b(syncContactsState, arrayList3, null, null, false, 14, null);
        }
        if (bVar instanceof com.chess.p019features.connect.invite.contacts.viewmodel.b.InviteContactsQueryChanged) {
            if (syncContactsState.getOtherContactsSearchQuery().length() == 0 && ((com.chess.p019features.connect.invite.contacts.viewmodel.b.InviteContactsQueryChanged) bVar).getNewQuery().length() > 0) {
                com.chess.android.b.a().J(new AddPhoneNumberTextEntry(AddPhoneNumberInterface.ADD_PHONE_NUMBER_INTERFACE_INVITE_CONTACTS, AddPhoneNumberTextInput.ADD_PHONE_NUMBER_TEXT_INPUT_SEARCH_CONTACTS, (ByteString) null, 4, (DefaultConstructorMarker) null), new Message[0]);
            }
            return SyncContactsState.b(syncContactsState, null, null, ((com.chess.p019features.connect.invite.contacts.viewmodel.b.InviteContactsQueryChanged) bVar).getNewQuery(), false, 11, null);
        }
        if (bVar instanceof com.chess.p019features.connect.invite.contacts.viewmodel.b.InviteContact) {
            com.chess.p019features.connect.invite.contacts.viewmodel.b.InviteContact inviteContact = (com.chess.p019features.connect.invite.contacts.viewmodel.b.InviteContact) bVar;
            O6(inviteContact.getPhoneNumber(), inviteContact.getEmail());
            return syncContactsState;
        }
        if (bVar instanceof com.chess.features.connect.friends.contacts.viewmodel.b.i) {
            return SyncContactsState.b(syncContactsState, null, null, null, false, 7, null);
        }
        if (bVar instanceof com.chess.features.connect.friends.contacts.viewmodel.b.j) {
            return K6(syncContactsState, q22Var);
        }
        if (!(bVar instanceof com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendsAddSuccess)) {
            throw new NoWhenBranchMatchedException();
        }
        StringOrResource stringOrResourceA = g.a(((com.chess.p019features.connect.invite.contacts.viewmodel.b.FriendsAddSuccess) bVar).getAddedCount());
        if (stringOrResourceA != null) {
            this.snackbarManager.e(stringOrResourceA);
        }
        return K6(syncContactsState, q22Var);
    }

    private final s R6(SyncContactsState state) {
        return rw0.d(c9e.a(this), new c(CoroutineExceptionHandler.t2, this), (CoroutineStart) null, new SyncContactsViewModel$sendFriendsRequest$2(state, this, null), 2, (Object) null);
    }

    private final void S6() {
        rw0.d(c9e.a(this), new d(CoroutineExceptionHandler.t2, this), (CoroutineStart) null, new SyncContactsViewModel$uploadContacts$2(this, null), 2, (Object) null);
    }

    /* JADX INFO: renamed from: L6, reason: from getter */
    public final e0 getErrorProcessor() {
        return this.errorProcessor;
    }

    public final ai4<com.chess.p019features.connect.invite.contacts.viewmodel.c> M6() {
        return this.sideEffects;
    }

    public final r6c<SyncContactsUiState> N6() {
        return this.uiState;
    }

    public final void P6(com.chess.p019features.connect.invite.contacts.viewmodel.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.events.e(event);
    }
}
