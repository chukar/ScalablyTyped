package typings.expressDashBruteDashRedis.expressDashBruteDashRedisMod

import typings.redis.redisMod.ClientOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Redis store for Express Brute
  */
@JSImport("express-brute-redis", JSImport.Namespace)
@js.native
/**
  * @summary constructor
  * @param options Options to configure the Redis client.
  */
class ^ () extends express_brute_redis {
  def this(options: ClientOpts, args: js.Any*) = this()
}

@JSImport("express-brute-redis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Default options for the Redis client
    */
  var defaults: ClientOpts = js.native
}

