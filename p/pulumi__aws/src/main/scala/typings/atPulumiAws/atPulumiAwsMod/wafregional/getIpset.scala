package typings.atPulumiAws.atPulumiAwsMod.wafregional

import typings.atPulumiAws.wafregionalGetIpsetMod.GetIpsetArgs
import typings.atPulumiAws.wafregionalGetIpsetMod.GetIpsetResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional.getIpset")
@js.native
object getIpset extends js.Object {
  def apply(args: GetIpsetArgs): js.Promise[GetIpsetResult] with GetIpsetResult = js.native
  def apply(args: GetIpsetArgs, opts: InvokeOptions): js.Promise[GetIpsetResult] with GetIpsetResult = js.native
}

