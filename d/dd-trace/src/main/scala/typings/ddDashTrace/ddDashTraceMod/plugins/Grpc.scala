package typings.ddDashTrace.ddDashTraceMod.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ddDashTrace.ddDashTraceMod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Grpc
  extends Integration
     with Analyzable {
  /**
    * An array of metadata entries to record. Can also be a callback that returns
    * the key/value pairs to record. For example, using
    * `variables => variables` would record all variables.
    */
  var metadata: js.UndefOr[
    js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]])
  ] = js.undefined
}

object Grpc {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]]) = null,
    service: String = null
  ): Grpc = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grpc]
  }
}

/**
  * This plugin automatically instruments the
  * [grpc](https://github.com/grpc/grpc-node) module.
  */
trait grpc extends Grpc {
  /**
    * Configuration for gRPC clients.
    */
  var client: js.UndefOr[Grpc] = js.undefined
  /**
    * Configuration for gRPC servers.
    */
  var server: js.UndefOr[Grpc] = js.undefined
}

object grpc {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    client: Grpc = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Array[String] | (js.Function1[/* variables */ StringDictionary[js.Any], StringDictionary[_]]) = null,
    server: Grpc = null,
    service: String = null
  ): grpc = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[grpc]
  }
}

