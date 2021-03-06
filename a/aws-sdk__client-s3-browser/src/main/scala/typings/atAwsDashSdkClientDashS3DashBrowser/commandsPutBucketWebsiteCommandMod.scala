package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketWebsiteCommand", JSImport.Namespace)
@js.native
object commandsPutBucketWebsiteCommandMod extends js.Object {
  @js.native
  class PutBucketWebsiteCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketWebsiteInput, 
          OutputTypesUnion, 
          PutBucketWebsiteOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketWebsiteInput) = this()
    /* CompleteClass */
    override val input: PutBucketWebsiteInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketWebsiteInput, PutBucketWebsiteOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
  }
  
}

