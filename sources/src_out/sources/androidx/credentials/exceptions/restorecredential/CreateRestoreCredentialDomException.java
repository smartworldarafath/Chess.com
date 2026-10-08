package androidx.credentials.exceptions.restorecredential;

import androidx.credentials.exceptions.CreateCredentialException;
import com.google.inputmethod.ne3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/credentials/exceptions/restorecredential/CreateRestoreCredentialDomException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/google/android/ne3;", "domError", "", "errorMessage", "<init>", "(Lcom/google/android/ne3;Ljava/lang/CharSequence;)V", "Lcom/google/android/ne3;", "getDomError", "()Lcom/google/android/ne3;", "b", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CreateRestoreCredentialDomException extends CreateCredentialException {
    private final ne3 domError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialDomException(ne3 ne3Var, CharSequence charSequence) {
        super("androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/" + ne3Var.getType(), charSequence);
        Intrinsics.checkNotNullParameter(ne3Var, "domError");
        Intrinsics.checkNotNullParameter(charSequence, "errorMessage");
        this.domError = ne3Var;
    }
}
