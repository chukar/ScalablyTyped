package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth

import typings.reactDashNativeDashFirebase.Anon_AUTOVERIFIED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStatics extends js.Object {
  var AppleAuthProvider: AuthProvider
  var EmailAuthProvider: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth.EmailAuthProvider
  var FacebookAuthProvider: AuthProvider
  var GithubAuthProvider: AuthProvider
  var GoogleAuthProvider: AuthProvider
  var OAuthProvider: AuthProvider
  var PhoneAuthProvider: AuthProvider
  var PhoneAuthState: Anon_AUTOVERIFIED
  var TwitterAuthProvider: AuthProvider
}

object AuthStatics {
  @scala.inline
  def apply(
    AppleAuthProvider: AuthProvider,
    EmailAuthProvider: EmailAuthProvider,
    FacebookAuthProvider: AuthProvider,
    GithubAuthProvider: AuthProvider,
    GoogleAuthProvider: AuthProvider,
    OAuthProvider: AuthProvider,
    PhoneAuthProvider: AuthProvider,
    PhoneAuthState: Anon_AUTOVERIFIED,
    TwitterAuthProvider: AuthProvider
  ): AuthStatics = {
    val __obj = js.Dynamic.literal(AppleAuthProvider = AppleAuthProvider.asInstanceOf[js.Any], EmailAuthProvider = EmailAuthProvider.asInstanceOf[js.Any], FacebookAuthProvider = FacebookAuthProvider.asInstanceOf[js.Any], GithubAuthProvider = GithubAuthProvider.asInstanceOf[js.Any], GoogleAuthProvider = GoogleAuthProvider.asInstanceOf[js.Any], OAuthProvider = OAuthProvider.asInstanceOf[js.Any], PhoneAuthProvider = PhoneAuthProvider.asInstanceOf[js.Any], PhoneAuthState = PhoneAuthState.asInstanceOf[js.Any], TwitterAuthProvider = TwitterAuthProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthStatics]
  }
}

