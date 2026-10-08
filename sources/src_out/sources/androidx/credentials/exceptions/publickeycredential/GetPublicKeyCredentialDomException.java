package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.google.inputmethod.ci8;
import com.google.inputmethod.cm2;
import com.google.inputmethod.dj8;
import com.google.inputmethod.etd;
import com.google.inputmethod.h4e;
import com.google.inputmethod.ht8;
import com.google.inputmethod.ij8;
import com.google.inputmethod.j66;
import com.google.inputmethod.j8d;
import com.google.inputmethod.jw9;
import com.google.inputmethod.k66;
import com.google.inputmethod.l0;
import com.google.inputmethod.lf8;
import com.google.inputmethod.lic;
import com.google.inputmethod.lt5;
import com.google.inputmethod.mdd;
import com.google.inputmethod.n66;
import com.google.inputmethod.ne3;
import com.google.inputmethod.nj8;
import com.google.inputmethod.o66;
import com.google.inputmethod.oj8;
import com.google.inputmethod.ss8;
import com.google.inputmethod.tl2;
import com.google.inputmethod.u8a;
import com.google.inputmethod.us3;
import com.google.inputmethod.wc5;
import com.google.inputmethod.wne;
import com.google.inputmethod.xbb;
import com.google.inputmethod.y68;
import com.google.inputmethod.yw1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Lcom/google/android/ne3;", "domError", "", "errorMessage", "<init>", "(Lcom/google/android/ne3;Ljava/lang/CharSequence;)V", "Lcom/google/android/ne3;", "getDomError", "()Lcom/google/android/ne3;", "c", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ne3 domError;

    /* JADX INFO: renamed from: androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException$a;", "", "<init>", "()V", "", "type", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GetCredentialException a(String type, String msg) {
            Object objB;
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                a.Companion companion = a.INSTANCE;
                CharSequence charSequence = null;
                GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new etd(), charSequence, 2, charSequence);
                if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    objB = companion.b(new l0(), msg, getPublicKeyCredentialDomException);
                } else {
                    if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                        objB = companion.b(new yw1(), msg, getPublicKeyCredentialDomException);
                    } else {
                        if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                            objB = companion.b(new tl2(), msg, getPublicKeyCredentialDomException);
                        } else {
                            if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                                objB = companion.b(new cm2(), msg, getPublicKeyCredentialDomException);
                            } else {
                                if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                                    objB = companion.b(new us3(), msg, getPublicKeyCredentialDomException);
                                } else {
                                    if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                                        objB = companion.b(new wc5(), msg, getPublicKeyCredentialDomException);
                                    } else {
                                        if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                                            objB = companion.b(new lt5(), msg, getPublicKeyCredentialDomException);
                                        } else {
                                            if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                                                objB = companion.b(new j66(), msg, getPublicKeyCredentialDomException);
                                            } else {
                                                if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                                                    objB = companion.b(new k66(), msg, getPublicKeyCredentialDomException);
                                                } else {
                                                    if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                                                        objB = companion.b(new n66(), msg, getPublicKeyCredentialDomException);
                                                    } else {
                                                        if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                                                            objB = companion.b(new o66(), msg, getPublicKeyCredentialDomException);
                                                        } else {
                                                            if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                                                                objB = companion.b(new y68(), msg, getPublicKeyCredentialDomException);
                                                            } else {
                                                                if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                                                                    objB = companion.b(new lf8(), msg, getPublicKeyCredentialDomException);
                                                                } else {
                                                                    if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                                                                        objB = companion.b(new ci8(), msg, getPublicKeyCredentialDomException);
                                                                    } else {
                                                                        if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                                                                            objB = companion.b(new dj8(), msg, getPublicKeyCredentialDomException);
                                                                        } else {
                                                                            if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                                                                                objB = companion.b(new ij8(), msg, getPublicKeyCredentialDomException);
                                                                            } else {
                                                                                if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                                                                                    objB = companion.b(new nj8(), msg, getPublicKeyCredentialDomException);
                                                                                } else {
                                                                                    if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                                                                                        objB = companion.b(new oj8(), msg, getPublicKeyCredentialDomException);
                                                                                    } else {
                                                                                        if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                                                                                            objB = companion.b(new ss8(), msg, getPublicKeyCredentialDomException);
                                                                                        } else {
                                                                                            if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                                                                                                objB = companion.b(new ht8(), msg, getPublicKeyCredentialDomException);
                                                                                            } else {
                                                                                                if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                                                                                                    objB = companion.b(new jw9(), msg, getPublicKeyCredentialDomException);
                                                                                                } else {
                                                                                                    if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                                                                                                        objB = companion.b(new u8a(), msg, getPublicKeyCredentialDomException);
                                                                                                    } else {
                                                                                                        if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                                                                                                            objB = companion.b(new xbb(), msg, getPublicKeyCredentialDomException);
                                                                                                        } else {
                                                                                                            if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                                                                                                                objB = companion.b(new lic(), msg, getPublicKeyCredentialDomException);
                                                                                                            } else {
                                                                                                                if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                                                                                                                    objB = companion.b(new j8d(), msg, getPublicKeyCredentialDomException);
                                                                                                                } else {
                                                                                                                    if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                                                                                                                        objB = companion.b(new mdd(), msg, getPublicKeyCredentialDomException);
                                                                                                                    } else {
                                                                                                                        if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                                                                                                                            objB = companion.b(new etd(), msg, getPublicKeyCredentialDomException);
                                                                                                                        } else {
                                                                                                                            if (Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                                                                                                                                objB = companion.b(new h4e(), msg, getPublicKeyCredentialDomException);
                                                                                                                            } else {
                                                                                                                                if (!Intrinsics.e(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                                                                                                                                    throw new FrameworkClassParsingException();
                                                                                                                                }
                                                                                                                                objB = companion.b(new wne(), msg, getPublicKeyCredentialDomException);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return (GetCredentialException) objB;
            } catch (FrameworkClassParsingException unused) {
                return new GetCredentialCustomException(type, msg);
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ GetPublicKeyCredentialDomException(ne3 ne3Var, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ne3Var, (i & 2) != 0 ? null : charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialDomException(ne3 ne3Var, CharSequence charSequence) {
        super("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + ne3Var.getType(), charSequence);
        Intrinsics.checkNotNullParameter(ne3Var, "domError");
        this.domError = ne3Var;
    }
}
