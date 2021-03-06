package typings.atPulumiAws.s3Mod

import typings.atPulumiAws.s3GetBucketObjectsMod.GetBucketObjectsArgs
import typings.atPulumiAws.s3GetBucketObjectsMod.GetBucketObjectsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "getBucketObjects")
@js.native
object getBucketObjects extends js.Object {
  def apply(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] with GetBucketObjectsResult = js.native
  def apply(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] with GetBucketObjectsResult = js.native
}

