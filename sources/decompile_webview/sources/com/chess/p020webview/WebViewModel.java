package com.chess.p020webview;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.chess.logging.o;
import com.chess.navigationinterface.NavigationDirections;
import com.chess.net.g;
import com.chess.net.v1.users.OAuthTokens;
import com.chess.net.v1.users.p0;
import com.chess.p017useractivity.g0;
import com.chess.utils.android.coroutines.CoroutineContextProvider;
import com.chess.web.ChessComWebConfig;
import com.chess.web.WebUrl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.bolts.AppLinks;
import com.google.android.ai4;
import com.google.android.bge;
import com.google.android.c9e;
import com.google.android.l58;
import com.google.android.p58;
import com.google.android.pee;
import com.google.android.rw0;
import com.google.android.w8e;
import com.google.android.zlb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.p;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 S2\u00020\u0001:\u0003%\u001f#B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020.028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001a088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001a028\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u00106R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00100R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u0018028\u0006¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u00106R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00100R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u0018028\u0006¢\u0006\f\n\u0004\bF\u00104\u001a\u0004\bG\u00106R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00100R\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020I028\u0006¢\u0006\f\n\u0004\bL\u00104\u001a\u0004\bM\u00106R\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/chess/webview/WebViewModel;", "Lcom/google/android/w8e;", "Lcom/chess/webview/WebViewExtras;", AppLinks.KEY_NAME_EXTRAS, "Lcom/chess/web/c;", "web", "Lcom/chess/net/v1/users/p0;", "reloginManager", "Lcom/chess/utils/android/coroutines/CoroutineContextProvider;", "contextProvider", "Lcom/chess/useractivity/g0;", "productSessionIdProvider", "Lcom/chess/web/b;", "webConfig", "<init>", "(Lcom/chess/webview/WebViewExtras;Lcom/chess/web/c;Lcom/chess/net/v1/users/p0;Lcom/chess/utils/android/coroutines/CoroutineContextProvider;Lcom/chess/useractivity/g0;Lcom/chess/web/b;)V", "", "X6", "()V", "a7", "Landroid/webkit/WebView;", "webView", "O6", "(Landroid/webkit/WebView;)V", "", "origin", "", "W6", "(Ljava/lang/String;)Z", "Z6", "Y6", "a", "Lcom/chess/webview/WebViewExtras;", "Q6", "()Lcom/chess/webview/WebViewExtras;", "b", "Lcom/chess/web/c;", "c", "Lcom/chess/net/v1/users/p0;", "d", "Lcom/chess/utils/android/coroutines/CoroutineContextProvider;", "e", "Lcom/chess/useractivity/g0;", "f", "Lcom/chess/web/b;", "Lcom/google/android/l58;", "Lcom/chess/web/WebUrl;", "g", "Lcom/google/android/l58;", "_refreshFlow", "Lcom/google/android/ai4;", "h", "Lcom/google/android/ai4;", "U6", "()Lcom/google/android/ai4;", "refresh", "Lcom/google/android/p58;", "i", "Lcom/google/android/p58;", "_loading", "j", "R6", "loading", "k", "_share", "l", "V6", "share", "m", "_redirectToBrowser", "n", "S6", "redirectToBrowser", "Lcom/chess/navigationinterface/NavigationDirections;", "o", "_redirectToPayments", "p", "T6", "redirectToPayments", "Lcom/chess/webview/WebViewModel$c;", "q", "Lcom/chess/webview/WebViewModel$c;", "webViewState", "r", "webview_release"}, k = ViewHierarchyConstants.IMAGEVIEW_BITMASK, mv = {ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.TEXTVIEW_BITMASK}, xi = 48)
public final class WebViewModel extends w8e {
    private static final b r = new b(null);
    private static final Regex s = new Regex("(?i)youtube\\.com|youtu\\.be");
    private static final Regex t = new Regex("chess(-\\d\\d?)?\\.com");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WebViewExtras extras;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.chess.web.c web;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final p0 reloginManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CoroutineContextProvider contextProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final g0 productSessionIdProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ChessComWebConfig webConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final l58<WebUrl> _refreshFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ai4<WebUrl> refresh;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final p58<Boolean> _loading;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final ai4<Boolean> loading;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final l58<String> _share;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final ai4<String> share;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final l58<String> _redirectToBrowser;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final ai4<String> redirectToBrowser;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final l58<NavigationDirections> _redirectToPayments;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final ai4<NavigationDirections> redirectToPayments;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private c webViewState;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010 \u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\n¨\u0006#"}, d2 = {"Lcom/chess/webview/WebViewModel$a;", "Landroid/webkit/WebViewClient;", "<init>", "(Lcom/chess/webview/WebViewModel;)V", "Landroid/webkit/WebView;", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebResourceRequest;", "request", "", "d", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "c", "(Landroid/webkit/WebResourceRequest;)Z", "", "host", "e", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", "Lcom/chess/navigationinterface/NavigationDirections;", "b", "(Landroid/net/Uri;)Lcom/chess/navigationinterface/NavigationDirections;", "", "a", "()Ljava/util/Map;", "url", "", "onPageCommitVisible", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/HttpAuthHandler;", "handler", "realm", "onReceivedHttpAuthRequest", "(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V", "shouldOverrideUrlLoading", "webview_release"}, k = ViewHierarchyConstants.IMAGEVIEW_BITMASK, mv = {ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.TEXTVIEW_BITMASK}, xi = 48)
    private final class a extends WebViewClient {
        public a() {
        }

        private final Map<String, String> a() {
            Map mapC = b0.c();
            mapC.put("X-Chesscom-Client", "Chesscom-Android");
            String strH = com.chess.internal.utils.b.a.h();
            if (strH == null) {
                strH = "unknown";
            }
            mapC.put("X-Chesscom-Client-Version", strH);
            return b0.b(mapC);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            if (r4.equals("/no-ads") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            if (r4.equals("/offer") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        
            if (r4.equals("/membership") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        
            if (r4.equals("/payment") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        
            return new com.chess.navigationinterface.NavigationDirections.p1(com.chess.analytics.api.AnalyticsEnums.Source.r0, (com.chess.entities.GameAnalysisPermissions.QuotaType) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        
            if (r4.equals("/membership/no-ads") == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        
            return new com.chess.navigationinterface.NavigationDirections.q1(com.chess.analytics.api.AnalyticsEnums.Source.r0);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.chess.navigationinterface.NavigationDirections b(android.net.Uri r4) {
            /*
                r3 = this;
                java.lang.String r0 = r4.getHost()
                r1 = 0
                if (r0 == 0) goto L5e
                kotlin.text.Regex r2 = com.chess.p020webview.WebViewModel.D6()
                boolean r0 = r2.b(r0)
                if (r0 != 0) goto L12
                return r1
            L12:
                java.lang.String r4 = r4.getPath()
                if (r4 == 0) goto L5e
                int r0 = r4.hashCode()
                switch(r0) {
                    case -1994607954: goto L4d;
                    case -478974217: goto L3b;
                    case 102390085: goto L32;
                    case 1451220877: goto L29;
                    case 2016154515: goto L20;
                    default: goto L1f;
                }
            L1f:
                goto L5e
            L20:
                java.lang.String r0 = "/no-ads"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L56
                goto L5e
            L29:
                java.lang.String r0 = "/offer"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L44
                goto L5e
            L32:
                java.lang.String r0 = "/membership"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L44
                goto L5e
            L3b:
                java.lang.String r0 = "/payment"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L44
                goto L5e
            L44:
                com.chess.navigationinterface.NavigationDirections$p1 r4 = new com.chess.navigationinterface.NavigationDirections$p1
                com.chess.analytics.api.AnalyticsEnums$Source r0 = com.chess.analytics.api.AnalyticsEnums.Source.r0
                r2 = 2
                r4.<init>(r0, r1, r2, r1)
                return r4
            L4d:
                java.lang.String r0 = "/membership/no-ads"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L56
                goto L5e
            L56:
                com.chess.navigationinterface.NavigationDirections$q1 r4 = new com.chess.navigationinterface.NavigationDirections$q1
                com.chess.analytics.api.AnalyticsEnums$Source r0 = com.chess.analytics.api.AnalyticsEnums.Source.r0
                r4.<init>(r0)
                return r4
            L5e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chess.webview.WebViewModel.a.b(android.net.Uri):com.chess.navigationinterface.NavigationDirections");
        }

        private final boolean c(WebResourceRequest request) {
            if (bge.a("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
                return pee.b(request);
            }
            return false;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        private final boolean d(WebView view, WebResourceRequest request) throws NoWhenBranchMatchedException {
            String plainUrl;
            WebUrl url = WebViewModel.this.getExtras().getUrl();
            if (url instanceof WebUrl.Get) {
                plainUrl = ((WebUrl.Get) url).e();
            } else {
                if (!(url instanceof WebUrl.Post)) {
                    throw new NoWhenBranchMatchedException();
                }
                plainUrl = ((WebUrl.Post) url).getPlainUrl();
            }
            return Intrinsics.e(view.getUrl(), plainUrl) && Intrinsics.e(request.getUrl().toString(), WebViewModel.this.web.I().e()) && c(request);
        }

        private final boolean e(String host) {
            if (host != null) {
                return WebViewModel.s.b(host);
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
            WebViewModel.this._loading.setValue(Boolean.FALSE);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
            Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
            Intrinsics.checkNotNullParameter(handler, "handler");
            Pair pairA = g.a();
            handler.proceed((String) pairA.a(), (String) pairA.b());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
            Intrinsics.checkNotNullParameter(request, "request");
            if (d(view, request)) {
                WebViewModel.this.X6();
                return true;
            }
            if (e(request.getUrl().getHost())) {
                l58 l58Var = WebViewModel.this._redirectToBrowser;
                String string = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                l58Var.g(string);
                return true;
            }
            Uri url = request.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
            NavigationDirections navigationDirectionsB = b(url);
            if (navigationDirectionsB != null) {
                WebViewModel.this._redirectToPayments.g(navigationDirectionsB);
                return true;
            }
            if (!WebViewModel.this.getExtras().getHideChrome()) {
                return false;
            }
            Map<String, String> requestHeaders = request.getRequestHeaders();
            if (requestHeaders == null) {
                requestHeaders = b0.j();
            }
            if (requestHeaders.containsKey("X-Chesscom-Client") && requestHeaders.containsKey("X-Chesscom-Client-Version")) {
                return false;
            }
            view.loadUrl(request.getUrl().toString(), b0.t(a(), requestHeaders));
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/chess/webview/WebViewModel$b;", "", "<init>", "()V", "", "HEADER_CHESSCOM_CLIENT", "Ljava/lang/String;", "HEADER_CHESSCOM_CLIENT_VERSION", "Lkotlin/text/Regex;", "YOUTUBE_REGEX", "Lkotlin/text/Regex;", "CHESS_COM_REGEX", "webview_release"}, k = ViewHierarchyConstants.IMAGEVIEW_BITMASK, mv = {ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.TEXTVIEW_BITMASK}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/chess/webview/WebViewModel$c;", "", "Landroid/os/Bundle;", "bundle", "", "scrollPosition", "<init>", "(Landroid/os/Bundle;I)V", "a", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "b", "I", "()I", "webview_release"}, k = ViewHierarchyConstants.IMAGEVIEW_BITMASK, mv = {ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.TEXTVIEW_BITMASK}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Bundle bundle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int scrollPosition;

        public c(Bundle bundle, int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.bundle = bundle;
            this.scrollPosition = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bundle getBundle() {
            return this.bundle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getScrollPosition() {
            return this.scrollPosition;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/chess/webview/WebViewModel$d", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = ViewHierarchyConstants.IMAGEVIEW_BITMASK, mv = {ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.BUTTON_BITMASK, ViewHierarchyConstants.TEXTVIEW_BITMASK}, xi = 48)
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public d(CoroutineExceptionHandler.b bVar) {
            super(bVar);
        }

        public void handleException(CoroutineContext context, Throwable exception) {
            o.b().c("Error while refreshing the auth token for WebView");
        }
    }

    public WebViewModel(WebViewExtras webViewExtras, com.chess.web.c cVar, p0 p0Var, CoroutineContextProvider coroutineContextProvider, g0 g0Var, ChessComWebConfig chessComWebConfig) {
        Intrinsics.checkNotNullParameter(webViewExtras, AppLinks.KEY_NAME_EXTRAS);
        Intrinsics.checkNotNullParameter(cVar, "web");
        Intrinsics.checkNotNullParameter(p0Var, "reloginManager");
        Intrinsics.checkNotNullParameter(coroutineContextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(g0Var, "productSessionIdProvider");
        Intrinsics.checkNotNullParameter(chessComWebConfig, "webConfig");
        this.extras = webViewExtras;
        this.web = cVar;
        this.reloginManager = p0Var;
        this.contextProvider = coroutineContextProvider;
        this.productSessionIdProvider = g0Var;
        this.webConfig = chessComWebConfig;
        l58<WebUrl> l58VarB = zlb.b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this._refreshFlow = l58VarB;
        this.refresh = l58VarB;
        p58<Boolean> p58VarA = p.a(Boolean.TRUE);
        this._loading = p58VarA;
        this.loading = p58VarA;
        l58<String> l58VarB2 = zlb.b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this._share = l58VarB2;
        this.share = l58VarB2;
        l58<String> l58VarB3 = zlb.b(0, 1, (BufferOverflow) null, 5, (Object) null);
        this._redirectToBrowser = l58VarB3;
        this.redirectToBrowser = l58VarB3;
        l58<NavigationDirections> l58VarB4 = zlb.b(0, 1, (BufferOverflow) null, 5, (Object) null);
        this._redirectToPayments = l58VarB4;
        this.redirectToPayments = l58VarB4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P6(WebViewModel webViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "stringToShare");
        rw0.d(c9e.a(webViewModel), webViewModel.contextProvider.g(), (CoroutineStart) null, new ta2(webViewModel, str, null), 2, (Object) null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X6() {
        OAuthTokens token = this.extras.getUrl().getToken();
        o.b().c("Refreshing the token for WebView...");
        rw0.d(c9e.a(this), this.contextProvider.f().plus(new d(CoroutineExceptionHandler.t2)), (CoroutineStart) null, new C0330WebViewModel$refreshToken$1(this, token, null), 2, (Object) null);
    }

    private final void a7() {
        String str = (String) rw0.f((CoroutineContext) null, new C0331WebViewModel$setProductSessionIdCookie$productSessionId$1(this, null), 1, (Object) null);
        CookieManager.getInstance().setCookie("https://www." + this.webConfig.getHost(), "psid=" + str);
    }

    public final void O6(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        a7();
        webView.setWebViewClient(new a());
        if (this.extras.getAllowSharing()) {
            webView.addJavascriptInterface(new com.chess.p020webview.a(new Function1() { // from class: com.chess.webview.t
                public final Object invoke(Object obj) {
                    return WebViewModel.P6(this.a, (String) obj);
                }
            }), "ChessComAndroid");
        }
    }

    /* JADX INFO: renamed from: Q6, reason: from getter */
    public final WebViewExtras getExtras() {
        return this.extras;
    }

    public final ai4<Boolean> R6() {
        return this.loading;
    }

    public final ai4<String> S6() {
        return this.redirectToBrowser;
    }

    public final ai4<NavigationDirections> T6() {
        return this.redirectToPayments;
    }

    public final ai4<WebUrl> U6() {
        return this.refresh;
    }

    public final ai4<String> V6() {
        return this.share;
    }

    public final boolean W6(String origin) {
        String host;
        if (origin == null || (host = Uri.parse(origin).getHost()) == null) {
            return false;
        }
        if (Intrinsics.e(host, this.webConfig.getHost())) {
            return true;
        }
        String host2 = this.webConfig.getHost();
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(host2);
        return h.J(host, sb.toString(), false, 2, (Object) null);
    }

    public final void Y6(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        c cVar = this.webViewState;
        if (cVar != null) {
            webView.restoreState(cVar.getBundle());
            webView.setScrollY(cVar.getScrollPosition());
        }
        this.webViewState = null;
    }

    public final void Z6(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Bundle bundle = new Bundle();
        webView.saveState(bundle);
        this.webViewState = new c(bundle, webView.getScrollY());
    }
}
