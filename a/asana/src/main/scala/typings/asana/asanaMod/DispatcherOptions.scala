package typings.asana.asanaMod

import typings.asana.asanaMod.auth.Authenticator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherOptions extends js.Object {
  var authenticator: js.UndefOr[Authenticator] = js.undefined
  var handleUnauthorized: js.UndefOr[js.Function0[Boolean | typings.bluebird.bluebirdMod.^[Boolean]]] = js.undefined
  var requestTimeout: js.UndefOr[String] = js.undefined
  var retryOnRateLimit: js.UndefOr[Boolean] = js.undefined
}

object DispatcherOptions {
  @scala.inline
  def apply(
    authenticator: Authenticator = null,
    handleUnauthorized: () => Boolean | typings.bluebird.bluebirdMod.^[Boolean] = null,
    requestTimeout: String = null,
    retryOnRateLimit: js.UndefOr[Boolean] = js.undefined
  ): DispatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator.asInstanceOf[js.Any])
    if (handleUnauthorized != null) __obj.updateDynamic("handleUnauthorized")(js.Any.fromFunction0(handleUnauthorized))
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(retryOnRateLimit)) __obj.updateDynamic("retryOnRateLimit")(retryOnRateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatcherOptions]
  }
}

