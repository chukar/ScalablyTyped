package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketPolicyInputMod.GetBucketPolicyInput
import typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketPolicyOutputMod.GetBucketPolicyOutput
import typings.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketPolicyCommand", JSImport.Namespace)
@js.native
object commandsGetBucketPolicyCommandMod extends js.Object {
  @js.native
  class GetBucketPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketPolicyInput, 
          OutputTypesUnion, 
          GetBucketPolicyOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketPolicyInput) = this()
    /* CompleteClass */
    override val input: GetBucketPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketPolicyInput, GetBucketPolicyOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketPolicyInput, GetBucketPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketPolicyInput, GetBucketPolicyOutput] = js.native
  }
  
}

