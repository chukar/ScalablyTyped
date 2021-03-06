package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClient

import typings.eurekaDashJsDashClient.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaConfig extends js.Object {
  var eureka: EurekaClientConfig
  var instance: EurekaInstanceConfig
  var logger: js.UndefOr[Anon_Args] = js.undefined
  var requestMiddleware: js.UndefOr[
    js.Function2[/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit], Unit]
  ] = js.undefined
  var shouldUseDelta: js.UndefOr[Boolean] = js.undefined
}

object EurekaConfig {
  @scala.inline
  def apply(
    eureka: EurekaClientConfig,
    instance: EurekaInstanceConfig,
    logger: Anon_Args = null,
    requestMiddleware: (/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit]) => Unit = null,
    shouldUseDelta: js.UndefOr[Boolean] = js.undefined
  ): EurekaConfig = {
    val __obj = js.Dynamic.literal(eureka = eureka.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (requestMiddleware != null) __obj.updateDynamic("requestMiddleware")(js.Any.fromFunction2(requestMiddleware))
    if (!js.isUndefined(shouldUseDelta)) __obj.updateDynamic("shouldUseDelta")(shouldUseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaConfig]
  }
}

