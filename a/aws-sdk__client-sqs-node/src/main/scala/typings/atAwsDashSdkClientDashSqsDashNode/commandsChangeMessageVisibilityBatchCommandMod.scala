package typings.atAwsDashSdkClientDashSqsDashNode

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ChangeMessageVisibilityBatchCommand", JSImport.Namespace)
@js.native
object commandsChangeMessageVisibilityBatchCommandMod extends js.Object {
  @js.native
  class ChangeMessageVisibilityBatchCommand protected () extends Command[
          InputTypesUnion, 
          ChangeMessageVisibilityBatchInput, 
          OutputTypesUnion, 
          ChangeMessageVisibilityBatchOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ChangeMessageVisibilityBatchInput) = this()
    /* CompleteClass */
    override val input: ChangeMessageVisibilityBatchInput = js.native
    val middlewareStack: MiddlewareStack[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
  }
  
}

