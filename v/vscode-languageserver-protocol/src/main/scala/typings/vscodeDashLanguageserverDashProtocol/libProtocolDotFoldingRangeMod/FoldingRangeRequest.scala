package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotFoldingRangeMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.foldingRange", "FoldingRangeRequest")
@js.native
object FoldingRangeRequest extends js.Object {
  val `type`: RequestType[FoldingRangeParams, js.Array[FoldingRange] | Null, js.Any, js.Any] = js.native
}

