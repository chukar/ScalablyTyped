package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless/plugins/aws/provider/awsProvider", JSImport.Namespace)
@js.native
class ^ protected () extends Aws {
  def this(serverless: typings.serverless.serverlessMod.^, options: Options) = this()
  /* CompleteClass */
  override var naming: StringDictionary[js.Function0[String]] = js.native
  /* CompleteClass */
  override def getProviderName(): String = js.native
  /* CompleteClass */
  override def getRegion(): String = js.native
  /* CompleteClass */
  override def getServerlessDeploymentBucketName(): String = js.native
  /* CompleteClass */
  override def getStage(): String = js.native
}

