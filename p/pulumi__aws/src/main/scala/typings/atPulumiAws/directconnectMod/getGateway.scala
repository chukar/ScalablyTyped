package typings.atPulumiAws.directconnectMod

import typings.atPulumiAws.directconnectGetGatewayMod.GetGatewayArgs
import typings.atPulumiAws.directconnectGetGatewayMod.GetGatewayResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "getGateway")
@js.native
object getGateway extends js.Object {
  def apply(args: GetGatewayArgs): js.Promise[GetGatewayResult] with GetGatewayResult = js.native
  def apply(args: GetGatewayArgs, opts: InvokeOptions): js.Promise[GetGatewayResult] with GetGatewayResult = js.native
}

