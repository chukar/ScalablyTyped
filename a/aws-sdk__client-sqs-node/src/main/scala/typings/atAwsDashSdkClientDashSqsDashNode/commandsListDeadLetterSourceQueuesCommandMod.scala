package typings.atAwsDashSdkClientDashSqsDashNode

import typings.atAwsDashSdkClientDashSqsDashNode.sQSConfigurationMod.SQSResolvedConfiguration
import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput
import typings.atAwsDashSdkClientDashSqsDashNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput
import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ListDeadLetterSourceQueuesCommand", JSImport.Namespace)
@js.native
object commandsListDeadLetterSourceQueuesCommandMod extends js.Object {
  @js.native
  class ListDeadLetterSourceQueuesCommand protected () extends Command[
          InputTypesUnion, 
          ListDeadLetterSourceQueuesInput, 
          OutputTypesUnion, 
          ListDeadLetterSourceQueuesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListDeadLetterSourceQueuesInput) = this()
    /* CompleteClass */
    override val input: ListDeadLetterSourceQueuesInput = js.native
    val middlewareStack: MiddlewareStack[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
  }
  
}

