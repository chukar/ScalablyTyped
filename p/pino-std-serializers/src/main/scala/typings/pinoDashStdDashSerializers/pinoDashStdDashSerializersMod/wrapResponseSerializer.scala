package typings.pinoDashStdDashSerializers.pinoDashStdDashSerializersMod

import typings.node.httpMod.ServerResponse
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-std-serializers", "wrapResponseSerializer")
@js.native
object wrapResponseSerializer extends js.Object {
  def apply(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse, Record[String, _]] = js.native
}

